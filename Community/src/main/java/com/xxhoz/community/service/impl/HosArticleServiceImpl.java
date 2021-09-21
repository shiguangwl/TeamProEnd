package com.xxhoz.community.service.impl;

import com.xxhoz.community.dao.HosAcententDao;
import com.xxhoz.community.entity.HosAcententEntity;
import com.xxhoz.community.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.common.utils.Query;

import com.xxhoz.community.dao.HosArticleDao;
import com.xxhoz.community.entity.HosArticleEntity;
import org.springframework.transaction.annotation.Transactional;


@Service("hosArticleService")
public class HosArticleServiceImpl extends ServiceImpl<HosArticleDao, HosArticleEntity> implements HosArticleService {

    @Autowired
    HosArticleLableService ArticleLableService;
    @Autowired
    HosArticleSortService ArticleSortService;
    @Autowired
    HosAcententService hosAcententService;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {

//        IPage<HosArticleEntity> page = this.page(
//                new Query<HosArticleEntity>().getPage(params),
//                new QueryWrapper<HosArticleEntity>()
//        );
        IPage<HosArticleEntity> page = baseMapper.selectByPage(
                new Query<HosArticleEntity>().getPage(params),
                new QueryWrapper<HosArticleEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    @Transactional(rollbackFor=Exception.class)
    public void removeArtcleById(List<Long> pkArticleIds) {
        // 当删除文章时,删除对应的中间表关联字段
        ArticleSortService.removeByIds(pkArticleIds);
        ArticleLableService.removeByIds(pkArticleIds);
        this.removeByIds(pkArticleIds);
    }

    @Override
    @Transactional(rollbackFor=Exception.class)
    public void saveArticle(HosArticleEntity hosArticle, HosAcententEntity hosAcententEntity) {
        // 保存文章
        this.save(hosArticle);
        hosAcententEntity.setArticleId(hosArticle.getPkArticleId());
        this.save(hosArticle);
    }

}

package com.xxhoz.community.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.common.utils.Query;

import com.xxhoz.community.dao.HosArticleDao;
import com.xxhoz.community.entity.HosArticleEntity;
import com.xxhoz.community.service.HosArticleService;


@Service("hosArticleService")
public class HosArticleServiceImpl extends ServiceImpl<HosArticleDao, HosArticleEntity> implements HosArticleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HosArticleEntity> page = this.page(
                new Query<HosArticleEntity>().getPage(params),
                new QueryWrapper<HosArticleEntity>()
        );

        return new PageUtils(page);
    }

}
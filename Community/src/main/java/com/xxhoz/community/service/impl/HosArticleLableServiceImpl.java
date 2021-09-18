package com.xxhoz.community.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.common.utils.Query;

import com.xxhoz.community.dao.HosArticleLableDao;
import com.xxhoz.community.entity.HosArticleLableEntity;
import com.xxhoz.community.service.HosArticleLableService;


@Service("hosArticleLableService")
public class HosArticleLableServiceImpl extends ServiceImpl<HosArticleLableDao, HosArticleLableEntity> implements HosArticleLableService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HosArticleLableEntity> page = this.page(
                new Query<HosArticleLableEntity>().getPage(params),
                new QueryWrapper<HosArticleLableEntity>()
        );

        return new PageUtils(page);
    }

}
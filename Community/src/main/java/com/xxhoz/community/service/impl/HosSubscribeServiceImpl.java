package com.xxhoz.community.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.common.utils.Query;

import com.xxhoz.community.dao.HosSubscribeDao;
import com.xxhoz.community.entity.HosSubscribeEntity;
import com.xxhoz.community.service.HosSubscribeService;


@Service("hosSubscribeService")
public class HosSubscribeServiceImpl extends ServiceImpl<HosSubscribeDao, HosSubscribeEntity> implements HosSubscribeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HosSubscribeEntity> page = this.page(
                new Query<HosSubscribeEntity>().getPage(params),
                new QueryWrapper<HosSubscribeEntity>()
        );

        return new PageUtils(page);
    }

}
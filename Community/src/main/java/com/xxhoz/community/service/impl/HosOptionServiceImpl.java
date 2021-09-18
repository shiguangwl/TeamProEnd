package com.xxhoz.community.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.common.utils.Query;

import com.xxhoz.community.dao.HosOptionDao;
import com.xxhoz.community.entity.HosOptionEntity;
import com.xxhoz.community.service.HosOptionService;


@Service("hosOptionService")
public class HosOptionServiceImpl extends ServiceImpl<HosOptionDao, HosOptionEntity> implements HosOptionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HosOptionEntity> page = this.page(
                new Query<HosOptionEntity>().getPage(params),
                new QueryWrapper<HosOptionEntity>()
        );

        return new PageUtils(page);
    }

}
package com.xxhoz.community.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.common.utils.Query;

import com.xxhoz.community.dao.HosLableDao;
import com.xxhoz.community.entity.HosLableEntity;
import com.xxhoz.community.service.HosLableService;


@Service("hosLableService")
public class HosLableServiceImpl extends ServiceImpl<HosLableDao, HosLableEntity> implements HosLableService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HosLableEntity> page = this.page(
                new Query<HosLableEntity>().getPage(params),
                new QueryWrapper<HosLableEntity>()
        );

        return new PageUtils(page);
    }

}
package com.xxhoz.community.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.common.utils.Query;

import com.xxhoz.community.dao.HosUserDao;
import com.xxhoz.community.entity.HosUserEntity;
import com.xxhoz.community.service.HosUserService;


@Service("hosUserService")
public class HosUserServiceImpl extends ServiceImpl<HosUserDao, HosUserEntity> implements HosUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HosUserEntity> page = this.page(
                new Query<HosUserEntity>().getPage(params),
                new QueryWrapper<HosUserEntity>()
        );

        return new PageUtils(page);
    }

}
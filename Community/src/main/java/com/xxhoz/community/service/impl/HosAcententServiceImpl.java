package com.xxhoz.community.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.common.utils.Query;

import com.xxhoz.community.dao.HosAcententDao;
import com.xxhoz.community.entity.HosAcententEntity;
import com.xxhoz.community.service.HosAcententService;


@Service("hosAcententService")
public class HosAcententServiceImpl extends ServiceImpl<HosAcententDao, HosAcententEntity> implements HosAcententService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HosAcententEntity> page = this.page(
                new Query<HosAcententEntity>().getPage(params),
                new QueryWrapper<HosAcententEntity>()
        );

        return new PageUtils(page);
    }

}
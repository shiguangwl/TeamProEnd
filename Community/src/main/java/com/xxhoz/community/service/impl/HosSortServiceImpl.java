package com.xxhoz.community.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.common.utils.Query;

import com.xxhoz.community.dao.HosSortDao;
import com.xxhoz.community.entity.HosSortEntity;
import com.xxhoz.community.service.HosSortService;


@Service("hosSortService")
public class HosSortServiceImpl extends ServiceImpl<HosSortDao, HosSortEntity> implements HosSortService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HosSortEntity> page = this.page(
                new Query<HosSortEntity>().getPage(params),
                new QueryWrapper<HosSortEntity>()
        );

        return new PageUtils(page);
    }

}
package com.xxhoz.community.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.common.utils.Query;

import com.xxhoz.community.dao.HosArticleSortDao;
import com.xxhoz.community.entity.HosArticleSortEntity;
import com.xxhoz.community.service.HosArticleSortService;


@Service("hosArticleSortService")
public class HosArticleSortServiceImpl extends ServiceImpl<HosArticleSortDao, HosArticleSortEntity> implements HosArticleSortService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HosArticleSortEntity> page = this.page(
                new Query<HosArticleSortEntity>().getPage(params),
                new QueryWrapper<HosArticleSortEntity>()
        );

        return new PageUtils(page);
    }

}
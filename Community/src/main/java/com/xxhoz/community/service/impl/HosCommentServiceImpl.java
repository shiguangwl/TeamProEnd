package com.xxhoz.community.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.common.utils.Query;

import com.xxhoz.community.dao.HosCommentDao;
import com.xxhoz.community.entity.HosCommentEntity;
import com.xxhoz.community.service.HosCommentService;


@Service("hosCommentService")
public class HosCommentServiceImpl extends ServiceImpl<HosCommentDao, HosCommentEntity> implements HosCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HosCommentEntity> page = this.page(
                new Query<HosCommentEntity>().getPage(params),
                new QueryWrapper<HosCommentEntity>()
        );

        return new PageUtils(page);
    }

}
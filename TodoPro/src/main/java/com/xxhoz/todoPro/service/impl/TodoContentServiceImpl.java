package com.xxhoz.todoPro.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.common.utils.Query;

import com.xxhoz.todoPro.dao.TodoContentDao;
import com.xxhoz.todoPro.entity.TodoContentEntity;
import com.xxhoz.todoPro.service.TodoContentService;


@Service("todoContentService")
public class TodoContentServiceImpl extends ServiceImpl<TodoContentDao, TodoContentEntity> implements TodoContentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TodoContentEntity> page = this.page(
                new Query<TodoContentEntity>().getPage(params),
                new QueryWrapper<TodoContentEntity>()
        );

        return new PageUtils(page);
    }

}
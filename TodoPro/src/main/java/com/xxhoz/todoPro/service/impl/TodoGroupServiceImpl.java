package com.xxhoz.todoPro.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.common.utils.Query;

import com.xxhoz.todoPro.dao.TodoGroupDao;
import com.xxhoz.todoPro.entity.TodoGroupEntity;
import com.xxhoz.todoPro.service.TodoGroupService;


@Service("todoGroupService")
public class TodoGroupServiceImpl extends ServiceImpl<TodoGroupDao, TodoGroupEntity> implements TodoGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TodoGroupEntity> page = this.page(
                new Query<TodoGroupEntity>().getPage(params),
                new QueryWrapper<TodoGroupEntity>()
        );

        return new PageUtils(page);
    }

}
package com.xxhoz.todoPro.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.todoPro.entity.TodoGroupEntity;

import java.util.Map;

/**
 * 
 *
 * @author TimeHo
 * @email 2513356652@qq.com
 * @date 2021-09-21 10:53:34
 */
public interface TodoGroupService extends IService<TodoGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.xxhoz.community.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.community.entity.HosCommentEntity;

import java.util.Map;

/**
 * 
 *
 * @author TimeHo
 * @email 2513356652@qq.com
 * @date 2021-09-17 08:42:08
 */
public interface HosCommentService extends IService<HosCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


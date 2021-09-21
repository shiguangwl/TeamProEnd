package com.xxhoz.community.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.community.entity.HosAcententEntity;

import java.util.Map;

/**
 * 
 *
 * @author TimeHo
 * @email 2513356652@qq.com
 * @date 2021-09-20 11:00:19
 */
public interface HosAcententService extends IService<HosAcententEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


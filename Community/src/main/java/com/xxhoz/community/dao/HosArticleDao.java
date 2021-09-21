package com.xxhoz.community.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.xxhoz.community.entity.HosArticleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 *
 * @author TimeHo
 * @email 2513356652@qq.com
 * @date 2021-09-17 08:42:08
 */
@Mapper
public interface HosArticleDao extends BaseMapper<HosArticleEntity> {
    /**
     * 查询文章列表
     */
    IPage<HosArticleEntity> selectByPage(IPage<HosArticleEntity> userPage , @Param(Constants.WRAPPER) Wrapper<HosArticleEntity> userWrapper);
}

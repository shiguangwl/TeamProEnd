package com.xxhoz.community.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xxhoz.community.entity.HosCommentEntity;
import com.xxhoz.community.service.HosCommentService;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.common.utils.R;



/**
 * 
 *
 * @author TimeHo
 * @email 2513356652@qq.com
 * @date 2021-09-17 08:42:08
 */
@RestController
@RequestMapping("community/hoscomment")
public class HosCommentController {
    @Autowired
    private HosCommentService hosCommentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("community:hoscomment:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hosCommentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{pkId}")
    @RequiresPermissions("community:hoscomment:info")
    public R info(@PathVariable("pkId") Long pkId){
		HosCommentEntity hosComment = hosCommentService.getById(pkId);

        return R.ok().put("hosComment", hosComment);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("community:hoscomment:save")
    public R save(@RequestBody HosCommentEntity hosComment){
		hosCommentService.save(hosComment);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("community:hoscomment:update")
    public R update(@RequestBody HosCommentEntity hosComment){
		hosCommentService.updateById(hosComment);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("community:hoscomment:delete")
    public R delete(@RequestBody Long[] pkIds){
		hosCommentService.removeByIds(Arrays.asList(pkIds));

        return R.ok();
    }

}

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

import com.xxhoz.community.entity.HosUserEntity;
import com.xxhoz.community.service.HosUserService;
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
@RequestMapping("community/hosuser")
public class HosUserController {
    @Autowired
    private HosUserService hosUserService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("community:hosuser:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hosUserService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
    @RequiresPermissions("community:hosuser:info")
    public R info(@PathVariable("userId") Long userId){
		HosUserEntity hosUser = hosUserService.getById(userId);

        return R.ok().put("hosUser", hosUser);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("community:hosuser:save")
    public R save(@RequestBody HosUserEntity hosUser){
		hosUserService.save(hosUser);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("community:hosuser:update")
    public R update(@RequestBody HosUserEntity hosUser){
		hosUserService.updateById(hosUser);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("community:hosuser:delete")
    public R delete(@RequestBody Long[] userIds){
		hosUserService.removeByIds(Arrays.asList(userIds));

        return R.ok();
    }

}

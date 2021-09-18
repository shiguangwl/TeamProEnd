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

import com.xxhoz.community.entity.HosSubscribeEntity;
import com.xxhoz.community.service.HosSubscribeService;
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
@RequestMapping("community/hossubscribe")
public class HosSubscribeController {
    @Autowired
    private HosSubscribeService hosSubscribeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("community:hossubscribe:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hosSubscribeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{u1}")
    @RequiresPermissions("community:hossubscribe:info")
    public R info(@PathVariable("u1") Integer u1){
		HosSubscribeEntity hosSubscribe = hosSubscribeService.getById(u1);

        return R.ok().put("hosSubscribe", hosSubscribe);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("community:hossubscribe:save")
    public R save(@RequestBody HosSubscribeEntity hosSubscribe){
		hosSubscribeService.save(hosSubscribe);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("community:hossubscribe:update")
    public R update(@RequestBody HosSubscribeEntity hosSubscribe){
		hosSubscribeService.updateById(hosSubscribe);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("community:hossubscribe:delete")
    public R delete(@RequestBody Integer[] u1s){
		hosSubscribeService.removeByIds(Arrays.asList(u1s));

        return R.ok();
    }

}

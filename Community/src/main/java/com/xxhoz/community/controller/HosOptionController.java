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

import com.xxhoz.community.entity.HosOptionEntity;
import com.xxhoz.community.service.HosOptionService;
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
@RequestMapping("community/hosoption")
public class HosOptionController {
    @Autowired
    private HosOptionService hosOptionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("community:hosoption:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hosOptionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{optionId}")
    @RequiresPermissions("community:hosoption:info")
    public R info(@PathVariable("optionId") Integer optionId){
		HosOptionEntity hosOption = hosOptionService.getById(optionId);

        return R.ok().put("hosOption", hosOption);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("community:hosoption:save")
    public R save(@RequestBody HosOptionEntity hosOption){
		hosOptionService.save(hosOption);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("community:hosoption:update")
    public R update(@RequestBody HosOptionEntity hosOption){
		hosOptionService.updateById(hosOption);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("community:hosoption:delete")
    public R delete(@RequestBody Integer[] optionIds){
		hosOptionService.removeByIds(Arrays.asList(optionIds));

        return R.ok();
    }

}

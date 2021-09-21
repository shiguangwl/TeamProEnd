package com.xxhoz.community.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xxhoz.community.entity.HosSortEntity;
import com.xxhoz.community.service.HosSortService;
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
@RequestMapping("community/hossort")
public class HosSortController {
    @Autowired
    private HosSortService hosSortService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("community:hossort:list")
    public R list(@RequestParam Map<String, Object> params){
        // TODO 演示使用
        PageUtils page = hosSortService.queryPage(params);
//        List<HosSortEntity> sortEntityList = hosSortService.list();
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{sortId}")
    @RequiresPermissions("community:hossort:info")
    public R info(@PathVariable("sortId") Long sortId){
		HosSortEntity hosSort = hosSortService.getById(sortId);

        return R.ok().put("hosSort", hosSort);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("community:hossort:save")
    public R save(@RequestBody HosSortEntity hosSort){
		hosSortService.save(hosSort);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("community:hossort:update")
    public R update(@RequestBody HosSortEntity hosSort){
		hosSortService.updateById(hosSort);

        return R.ok();
    }

    /**
     * 删除多选
     */
    @RequestMapping("/delete")
    @RequiresPermissions("community:hossort:delete")
    public R delete(@RequestBody Long[] sortIds){
		hosSortService.removeByIds(Arrays.asList(sortIds));

        return R.ok();
    }
    /**
     * 指定ID删除
     */
    @RequestMapping("/delete/{SortId}")
    @RequiresPermissions("community:hossort:delete")
    public R deleteOne(@PathVariable("SortId") long SortId){
        hosSortService.removeById(SortId);
        return R.ok();
    }

}

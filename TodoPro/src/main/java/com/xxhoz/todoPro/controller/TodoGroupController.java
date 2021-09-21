package com.xxhoz.todoPro.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xxhoz.todoPro.entity.TodoGroupEntity;
import com.xxhoz.todoPro.service.TodoGroupService;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.common.utils.R;



/**
 * 
 *
 * @author TimeHo
 * @email 2513356652@qq.com
 * @date 2021-09-21 10:53:34
 */
@RestController
@RequestMapping("todoPro/todogroup")
public class TodoGroupController {
    @Autowired
    private TodoGroupService todoGroupService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("todoPro:todogroup:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = todoGroupService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{todoGId}")
    @RequiresPermissions("todoPro:todogroup:info")
    public R info(@PathVariable("todoGId") Integer todoGId){
		TodoGroupEntity todoGroup = todoGroupService.getById(todoGId);

        return R.ok().put("todoGroup", todoGroup);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("todoPro:todogroup:save")
    public R save(@RequestBody TodoGroupEntity todoGroup){
		todoGroupService.save(todoGroup);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("todoPro:todogroup:update")
    public R update(@RequestBody TodoGroupEntity todoGroup){
		todoGroupService.updateById(todoGroup);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("todoPro:todogroup:delete")
    public R delete(@RequestBody Integer[] todoGIds){
		todoGroupService.removeByIds(Arrays.asList(todoGIds));

        return R.ok();
    }

}

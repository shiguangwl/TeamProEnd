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

import com.xxhoz.todoPro.entity.TodoContentEntity;
import com.xxhoz.todoPro.service.TodoContentService;
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
@RequestMapping("todoPro/todocontent")
public class TodoContentController {
    @Autowired
    private TodoContentService todoContentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("todoPro:todocontent:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = todoContentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{pkId}")
    @RequiresPermissions("todoPro:todocontent:info")
    public R info(@PathVariable("pkId") Long pkId){
		TodoContentEntity todoContent = todoContentService.getById(pkId);

        return R.ok().put("todoContent", todoContent);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("todoPro:todocontent:save")
    public R save(@RequestBody TodoContentEntity todoContent){
		todoContentService.save(todoContent);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("todoPro:todocontent:update")
    public R update(@RequestBody TodoContentEntity todoContent){
		todoContentService.updateById(todoContent);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("todoPro:todocontent:delete")
    public R delete(@RequestBody Long[] pkIds){
		todoContentService.removeByIds(Arrays.asList(pkIds));

        return R.ok();
    }

}

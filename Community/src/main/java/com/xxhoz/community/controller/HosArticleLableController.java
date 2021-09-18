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

import com.xxhoz.community.entity.HosArticleLableEntity;
import com.xxhoz.community.service.HosArticleLableService;
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
@RequestMapping("community/hosarticlelable")
public class HosArticleLableController {
    @Autowired
    private HosArticleLableService hosArticleLableService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("community:hosarticlelable:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hosArticleLableService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{articleId}")
    @RequiresPermissions("community:hosarticlelable:info")
    public R info(@PathVariable("articleId") Long articleId){
		HosArticleLableEntity hosArticleLable = hosArticleLableService.getById(articleId);

        return R.ok().put("hosArticleLable", hosArticleLable);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("community:hosarticlelable:save")
    public R save(@RequestBody HosArticleLableEntity hosArticleLable){
		hosArticleLableService.save(hosArticleLable);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("community:hosarticlelable:update")
    public R update(@RequestBody HosArticleLableEntity hosArticleLable){
		hosArticleLableService.updateById(hosArticleLable);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("community:hosarticlelable:delete")
    public R delete(@RequestBody Long[] articleIds){
		hosArticleLableService.removeByIds(Arrays.asList(articleIds));

        return R.ok();
    }

}

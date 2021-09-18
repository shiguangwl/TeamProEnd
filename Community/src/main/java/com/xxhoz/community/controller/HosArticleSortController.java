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

import com.xxhoz.community.entity.HosArticleSortEntity;
import com.xxhoz.community.service.HosArticleSortService;
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
@RequestMapping("community/hosarticlesort")
public class HosArticleSortController {
    @Autowired
    private HosArticleSortService hosArticleSortService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("community:hosarticlesort:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hosArticleSortService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{articleId}")
    @RequiresPermissions("community:hosarticlesort:info")
    public R info(@PathVariable("articleId") Long articleId){
		HosArticleSortEntity hosArticleSort = hosArticleSortService.getById(articleId);

        return R.ok().put("hosArticleSort", hosArticleSort);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("community:hosarticlesort:save")
    public R save(@RequestBody HosArticleSortEntity hosArticleSort){
		hosArticleSortService.save(hosArticleSort);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("community:hosarticlesort:update")
    public R update(@RequestBody HosArticleSortEntity hosArticleSort){
		hosArticleSortService.updateById(hosArticleSort);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("community:hosarticlesort:delete")
    public R delete(@RequestBody Long[] articleIds){
		hosArticleSortService.removeByIds(Arrays.asList(articleIds));

        return R.ok();
    }

}

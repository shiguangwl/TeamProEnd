package com.xxhoz.community.controller;

import java.util.Arrays;
import java.util.Map;

import com.xxhoz.common.utils.AbstractController;
import com.xxhoz.community.entity.HosAcententEntity;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xxhoz.community.entity.HosArticleEntity;
import com.xxhoz.community.service.HosArticleService;
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
@RequestMapping("community/hosarticle")
public class HosArticleController extends AbstractController {
    @Autowired
    private HosArticleService hosArticleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("community:hosarticle:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hosArticleService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{pkArticleId}")
    @RequiresPermissions("community:hosarticle:info")
    public R info(@PathVariable("pkArticleId") Long pkArticleId){
		HosArticleEntity hosArticle = hosArticleService.getById(pkArticleId);

        return R.ok().put("hosArticle", hosArticle);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("community:hosarticle:save")
    public R save(@RequestBody HosArticleEntity hosArticle, @RequestBody HosAcententEntity hosAcententEntity){
        hosArticle.setUserId(getUserId());
        hosArticleService.saveArticle(hosArticle,hosAcententEntity);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("community:hosarticle:update")
    public R update(@RequestBody HosArticleEntity hosArticle){
		hosArticleService.updateById(hosArticle);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("community:hosarticle:delete")
    public R delete(@RequestBody Long[] pkArticleIds){
		hosArticleService.removeArtcleById(Arrays.asList(pkArticleIds));
        return R.ok();
    }

}

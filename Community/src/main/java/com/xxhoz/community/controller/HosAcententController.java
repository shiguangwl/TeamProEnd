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

import com.xxhoz.community.entity.HosAcententEntity;
import com.xxhoz.community.service.HosAcententService;
import com.xxhoz.common.utils.PageUtils;
import com.xxhoz.common.utils.R;



/**
 * 
 *
 * @author TimeHo
 * @email 2513356652@qq.com
 * @date 2021-09-20 11:00:19
 */
@RestController
@RequestMapping("community/hosacentent")
public class HosAcententController {
    @Autowired
    private HosAcententService hosAcententService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("community:hosacentent:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hosAcententService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{articleId}")
    @RequiresPermissions("community:hosacentent:info")
    public R info(@PathVariable("articleId") Integer articleId){
		HosAcententEntity hosAcentent = hosAcententService.getById(articleId);

        return R.ok().put("hosAcentent", hosAcentent);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("community:hosacentent:save")
    public R save(@RequestBody HosAcententEntity hosAcentent){
		hosAcententService.save(hosAcentent);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("community:hosacentent:update")
    public R update(@RequestBody HosAcententEntity hosAcentent){
		hosAcententService.updateById(hosAcentent);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("community:hosacentent:delete")
    public R delete(@RequestBody Integer[] articleIds){
		hosAcententService.removeByIds(Arrays.asList(articleIds));

        return R.ok();
    }

}

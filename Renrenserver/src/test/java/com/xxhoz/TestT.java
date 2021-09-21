package com.xxhoz;

import com.xxhoz.community.entity.HosArticleEntity;
import com.xxhoz.community.service.HosArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestT {
    @Autowired
    HosArticleService hosArticleService;
    @Test
    public void t1(){
        System.out.println(hosArticleService);
        List<HosArticleEntity> hosArticleEntities = hosArticleService.getBaseMapper().selectList(null);
        System.out.println(hosArticleEntities);
    }
}

package com.xxhoz.community.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author TimeHo
 * @email 2513356652@qq.com
 * @date 2021-09-17 08:42:08
 */
@Data
@TableName("hos_article_sort")
public class HosArticleSortEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 文章ID
	 */
	@TableId
	private Long articleId;
	/**
	 * 分类ID
	 */
	private Long sortId;

}

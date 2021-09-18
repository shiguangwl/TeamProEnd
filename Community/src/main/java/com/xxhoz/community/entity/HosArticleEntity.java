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
@TableName("hos_article")
public class HosArticleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 博文ID-主键
	 */
	@TableId
	private Long pkArticleId;
	/**
	 * 发表用户ID
	 */
	private Long userId;
	/**
	 * 博文标题
	 */
	private String articleTitle;
	/**
	 * 博文内容
	 */
	private String articleContent;
	/**
	 * 浏览量
	 */
	private Long articleViews;
	/**
	 * 评论数
	 */
	private Long articleCommentCount;
	/**
	 * 发表时间
	 */
	private Date articleDate;
	/**
	 * 点赞数
	 */
	private Long articleLikeCount;
	/**
	 * 文章简述
	 */
	private String articleMiniCentent;
	/**
	 * 文章密码
	 */
	private String articlePassword;
	/**
	 * 发布类型0 帖子 1 日记公开 2 不公开 3日志
	 */
	private Integer articleType;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;

}

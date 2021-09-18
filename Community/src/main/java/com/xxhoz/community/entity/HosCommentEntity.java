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
@TableName("hos_comment")
public class HosCommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 评论ID
	 */
	@TableId
	private Long pkId;
	/**
	 * 评论博文ID
	 */
	private Long articleId;
	/**
	 * 评论用户ID
	 */
	private String commentUser;
	/**
	 * 评论内容
	 */
	private String commentContent;
	/**
	 * 评论时间
	 */
	private Date commentTime;
	/**
	 * 点赞数
	 */
	private Long commentLikeCount;
	/**
	 * 父评论ID
	 */
	private Long parentCommentId;
	/**
	 * 创建时间
	 */
	private Date updateTime;
	/**
	 * 修改时间
	 */
	private Date createTime;

}

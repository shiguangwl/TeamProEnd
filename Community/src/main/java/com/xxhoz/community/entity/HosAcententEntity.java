package com.xxhoz.community.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 *
 *
 * @author TimeHo
 * @email 2513356652@qq.com
 * @date 2021-09-20 11:00:19
 */
@Data
@TableName("hos_acentent")
public class HosAcententEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Long articleId;
	/**
	 *
	 */
	private String content;

}

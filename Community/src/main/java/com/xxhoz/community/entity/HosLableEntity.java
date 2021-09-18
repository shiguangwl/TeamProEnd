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
@TableName("hos_lable")
public class HosLableEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 标签ID
	 */
	@TableId
	private Long lableId;
	/**
	 * 标签名称
	 */
	private String lableName;
	/**
	 * 标签描述
	 */
	private String labelDescription;
	/**
	 * 标签别名
	 */
	private String labelAlias;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;

}

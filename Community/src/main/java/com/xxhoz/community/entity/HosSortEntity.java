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
@TableName("hos_sort")
public class HosSortEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分类ID
	 */
	@TableId
	private Long sortId;
	/**
	 * 分类名称
	 */
	private String sortName;
	/**
	 * 分类描述
	 */
	private String sortDescription;
	/**
	 * 父分类ID
	 */
	private Long sortParentId;
	/**
	 * 分类别名
	 */
	private String sortAlias;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;

}

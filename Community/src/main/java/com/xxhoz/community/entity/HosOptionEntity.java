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
@TableName("hos_option")
public class HosOptionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 选项ID
	 */
	@TableId
	private Integer optionId;
	/**
	 * 选项名
	 */
	private String optionName;
	/**
	 * 选项值
	 */
	private String optionValues;
	/**
	 * 创建时间
	 */
	private Date updateTime;
	/**
	 * 修改时间
	 */
	private Date createTime;

}

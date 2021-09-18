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
@TableName("hos_subscribe")
public class HosSubscribeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer u1;
	/**
	 * 
	 */
	private Integer u2;
	/**
	 * 
	 */
	private Date createTime;

}

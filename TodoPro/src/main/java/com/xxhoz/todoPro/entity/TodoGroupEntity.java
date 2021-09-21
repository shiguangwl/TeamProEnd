package com.xxhoz.todoPro.entity;

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
 * @date 2021-09-21 10:53:34
 */
@Data
@TableName("todo_group")
public class TodoGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分组ID
	 */
	@TableId
	private Integer todoGId;
	/**
	 * 所属用户ID
	 */
	private Long userId;
	/**
	 * 分组名
	 */
	private String todoGName;
	/**
	 * 分组描述
	 */
	private String todoGDesc;

}

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
@TableName("todo_content")
public class TodoContentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 待办ID
	 */
	@TableId
	private Long pkId;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 所属分组ID
	 */
	private Integer todoGoupId;
	/**
	 * 待办内容
	 */
	private String todoCentent;
	/**
	 * 待办描述
	 */
	private String todoDesc;
	/**
	 * 是否星标
	 */
	private Integer todoStar;
	/**
	 * 待办类型
	 */
	private Integer todoType;
	/**
	 * 是否完成
	 */
	private Integer todoComplete;
	/**
	 * 待办周期
	 */
	private String todoTimer;
	/**
	 * 结束日期
	 */
	private Date todoFdate;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}

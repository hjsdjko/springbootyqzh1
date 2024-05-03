package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 发送记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
@TableName("fasongjilu")
public class FasongjiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FasongjiluEntity() {
		
	}
	
	public FasongjiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 书籍名称
	 */
					
	private String shujimingcheng;
	
	/**
	 * 书籍分类
	 */
					
	private String shujifenlei;
	
	/**
	 * 作者账号
	 */
					
	private String zuozhezhanghao;
	
	/**
	 * 文件信息
	 */
					
	private String wenjianxinxi;
	
	/**
	 * 注意事项
	 */
					
	private String zhuyishixiang;
	
	/**
	 * 发送日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fasongriqi;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：书籍名称
	 */
	public void setShujimingcheng(String shujimingcheng) {
		this.shujimingcheng = shujimingcheng;
	}
	/**
	 * 获取：书籍名称
	 */
	public String getShujimingcheng() {
		return shujimingcheng;
	}
	/**
	 * 设置：书籍分类
	 */
	public void setShujifenlei(String shujifenlei) {
		this.shujifenlei = shujifenlei;
	}
	/**
	 * 获取：书籍分类
	 */
	public String getShujifenlei() {
		return shujifenlei;
	}
	/**
	 * 设置：作者账号
	 */
	public void setZuozhezhanghao(String zuozhezhanghao) {
		this.zuozhezhanghao = zuozhezhanghao;
	}
	/**
	 * 获取：作者账号
	 */
	public String getZuozhezhanghao() {
		return zuozhezhanghao;
	}
	/**
	 * 设置：文件信息
	 */
	public void setWenjianxinxi(String wenjianxinxi) {
		this.wenjianxinxi = wenjianxinxi;
	}
	/**
	 * 获取：文件信息
	 */
	public String getWenjianxinxi() {
		return wenjianxinxi;
	}
	/**
	 * 设置：注意事项
	 */
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
	/**
	 * 设置：发送日期
	 */
	public void setFasongriqi(Date fasongriqi) {
		this.fasongriqi = fasongriqi;
	}
	/**
	 * 获取：发送日期
	 */
	public Date getFasongriqi() {
		return fasongriqi;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}

}

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
 * 办理会员
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
@TableName("banlihuiyuan")
public class BanlihuiyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BanlihuiyuanEntity() {
		
	}
	
	public BanlihuiyuanEntity(T t) {
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
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 会员价格
	 */
					
	private Integer huiyuanjiage;
	
	/**
	 * 会员期限
	 */
					
	private String huiyuanqixian;
	
	/**
	 * 办理日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date banliriqi;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：会员价格
	 */
	public void setHuiyuanjiage(Integer huiyuanjiage) {
		this.huiyuanjiage = huiyuanjiage;
	}
	/**
	 * 获取：会员价格
	 */
	public Integer getHuiyuanjiage() {
		return huiyuanjiage;
	}
	/**
	 * 设置：会员期限
	 */
	public void setHuiyuanqixian(String huiyuanqixian) {
		this.huiyuanqixian = huiyuanqixian;
	}
	/**
	 * 获取：会员期限
	 */
	public String getHuiyuanqixian() {
		return huiyuanqixian;
	}
	/**
	 * 设置：办理日期
	 */
	public void setBanliriqi(Date banliriqi) {
		this.banliriqi = banliriqi;
	}
	/**
	 * 获取：办理日期
	 */
	public Date getBanliriqi() {
		return banliriqi;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}

package com.entity.model;

import com.entity.BanlihuiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 办理会员
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public class BanlihuiyuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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

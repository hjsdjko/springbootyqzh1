package com.entity.model;

import com.entity.FasongjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 发送记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public class FasongjiluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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

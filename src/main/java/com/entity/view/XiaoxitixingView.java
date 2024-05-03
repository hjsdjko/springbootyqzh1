package com.entity.view;

import com.entity.XiaoxitixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 消息提醒
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
@TableName("xiaoxitixing")
public class XiaoxitixingView  extends XiaoxitixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoxitixingView(){
	}
 
 	public XiaoxitixingView(XiaoxitixingEntity xiaoxitixingEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoxitixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

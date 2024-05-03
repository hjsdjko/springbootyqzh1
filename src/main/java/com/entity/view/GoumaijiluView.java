package com.entity.view;

import com.entity.GoumaijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 购买记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
@TableName("goumaijilu")
public class GoumaijiluView  extends GoumaijiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GoumaijiluView(){
	}
 
 	public GoumaijiluView(GoumaijiluEntity goumaijiluEntity){
 	try {
			BeanUtils.copyProperties(this, goumaijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

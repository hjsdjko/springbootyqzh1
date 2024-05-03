package com.entity.view;

import com.entity.MianfeizhuanquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 免费专区
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
@TableName("mianfeizhuanqu")
public class MianfeizhuanquView  extends MianfeizhuanquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MianfeizhuanquView(){
	}
 
 	public MianfeizhuanquView(MianfeizhuanquEntity mianfeizhuanquEntity){
 	try {
			BeanUtils.copyProperties(this, mianfeizhuanquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

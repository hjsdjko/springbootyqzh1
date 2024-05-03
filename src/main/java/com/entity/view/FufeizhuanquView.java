package com.entity.view;

import com.entity.FufeizhuanquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 付费专区
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
@TableName("fufeizhuanqu")
public class FufeizhuanquView  extends FufeizhuanquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FufeizhuanquView(){
	}
 
 	public FufeizhuanquView(FufeizhuanquEntity fufeizhuanquEntity){
 	try {
			BeanUtils.copyProperties(this, fufeizhuanquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

package com.entity.view;

import com.entity.DiscussmianfeizhuanquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 免费专区评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
@TableName("discussmianfeizhuanqu")
public class DiscussmianfeizhuanquView  extends DiscussmianfeizhuanquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussmianfeizhuanquView(){
	}
 
 	public DiscussmianfeizhuanquView(DiscussmianfeizhuanquEntity discussmianfeizhuanquEntity){
 	try {
			BeanUtils.copyProperties(this, discussmianfeizhuanquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

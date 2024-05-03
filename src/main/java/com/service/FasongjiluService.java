package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FasongjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FasongjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FasongjiluView;


/**
 * 发送记录
 *
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface FasongjiluService extends IService<FasongjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FasongjiluVO> selectListVO(Wrapper<FasongjiluEntity> wrapper);
   	
   	FasongjiluVO selectVO(@Param("ew") Wrapper<FasongjiluEntity> wrapper);
   	
   	List<FasongjiluView> selectListView(Wrapper<FasongjiluEntity> wrapper);
   	
   	FasongjiluView selectView(@Param("ew") Wrapper<FasongjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FasongjiluEntity> wrapper);
   	

}


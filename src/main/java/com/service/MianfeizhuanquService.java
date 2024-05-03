package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MianfeizhuanquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MianfeizhuanquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MianfeizhuanquView;


/**
 * 免费专区
 *
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface MianfeizhuanquService extends IService<MianfeizhuanquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MianfeizhuanquVO> selectListVO(Wrapper<MianfeizhuanquEntity> wrapper);
   	
   	MianfeizhuanquVO selectVO(@Param("ew") Wrapper<MianfeizhuanquEntity> wrapper);
   	
   	List<MianfeizhuanquView> selectListView(Wrapper<MianfeizhuanquEntity> wrapper);
   	
   	MianfeizhuanquView selectView(@Param("ew") Wrapper<MianfeizhuanquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MianfeizhuanquEntity> wrapper);
   	

}


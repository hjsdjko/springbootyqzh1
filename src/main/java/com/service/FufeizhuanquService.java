package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FufeizhuanquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FufeizhuanquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FufeizhuanquView;


/**
 * 付费专区
 *
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface FufeizhuanquService extends IService<FufeizhuanquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FufeizhuanquVO> selectListVO(Wrapper<FufeizhuanquEntity> wrapper);
   	
   	FufeizhuanquVO selectVO(@Param("ew") Wrapper<FufeizhuanquEntity> wrapper);
   	
   	List<FufeizhuanquView> selectListView(Wrapper<FufeizhuanquEntity> wrapper);
   	
   	FufeizhuanquView selectView(@Param("ew") Wrapper<FufeizhuanquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FufeizhuanquEntity> wrapper);
   	

}


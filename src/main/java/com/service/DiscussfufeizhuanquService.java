package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfufeizhuanquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfufeizhuanquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfufeizhuanquView;


/**
 * 付费专区评论表
 *
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface DiscussfufeizhuanquService extends IService<DiscussfufeizhuanquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfufeizhuanquVO> selectListVO(Wrapper<DiscussfufeizhuanquEntity> wrapper);
   	
   	DiscussfufeizhuanquVO selectVO(@Param("ew") Wrapper<DiscussfufeizhuanquEntity> wrapper);
   	
   	List<DiscussfufeizhuanquView> selectListView(Wrapper<DiscussfufeizhuanquEntity> wrapper);
   	
   	DiscussfufeizhuanquView selectView(@Param("ew") Wrapper<DiscussfufeizhuanquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfufeizhuanquEntity> wrapper);
   	

}


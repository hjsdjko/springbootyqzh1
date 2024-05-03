package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmianfeizhuanquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmianfeizhuanquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmianfeizhuanquView;


/**
 * 免费专区评论表
 *
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface DiscussmianfeizhuanquService extends IService<DiscussmianfeizhuanquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmianfeizhuanquVO> selectListVO(Wrapper<DiscussmianfeizhuanquEntity> wrapper);
   	
   	DiscussmianfeizhuanquVO selectVO(@Param("ew") Wrapper<DiscussmianfeizhuanquEntity> wrapper);
   	
   	List<DiscussmianfeizhuanquView> selectListView(Wrapper<DiscussmianfeizhuanquEntity> wrapper);
   	
   	DiscussmianfeizhuanquView selectView(@Param("ew") Wrapper<DiscussmianfeizhuanquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmianfeizhuanquEntity> wrapper);
   	

}


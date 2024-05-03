package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GoumaijiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GoumaijiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GoumaijiluView;


/**
 * 购买记录
 *
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface GoumaijiluService extends IService<GoumaijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoumaijiluVO> selectListVO(Wrapper<GoumaijiluEntity> wrapper);
   	
   	GoumaijiluVO selectVO(@Param("ew") Wrapper<GoumaijiluEntity> wrapper);
   	
   	List<GoumaijiluView> selectListView(Wrapper<GoumaijiluEntity> wrapper);
   	
   	GoumaijiluView selectView(@Param("ew") Wrapper<GoumaijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoumaijiluEntity> wrapper);
   	

}


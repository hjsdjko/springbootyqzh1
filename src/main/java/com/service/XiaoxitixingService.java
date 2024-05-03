package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoxitixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoxitixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoxitixingView;


/**
 * 消息提醒
 *
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface XiaoxitixingService extends IService<XiaoxitixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoxitixingVO> selectListVO(Wrapper<XiaoxitixingEntity> wrapper);
   	
   	XiaoxitixingVO selectVO(@Param("ew") Wrapper<XiaoxitixingEntity> wrapper);
   	
   	List<XiaoxitixingView> selectListView(Wrapper<XiaoxitixingEntity> wrapper);
   	
   	XiaoxitixingView selectView(@Param("ew") Wrapper<XiaoxitixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoxitixingEntity> wrapper);
   	

}


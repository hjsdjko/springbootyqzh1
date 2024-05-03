package com.dao;

import com.entity.XiaoxitixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoxitixingVO;
import com.entity.view.XiaoxitixingView;


/**
 * 消息提醒
 * 
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface XiaoxitixingDao extends BaseMapper<XiaoxitixingEntity> {
	
	List<XiaoxitixingVO> selectListVO(@Param("ew") Wrapper<XiaoxitixingEntity> wrapper);
	
	XiaoxitixingVO selectVO(@Param("ew") Wrapper<XiaoxitixingEntity> wrapper);
	
	List<XiaoxitixingView> selectListView(@Param("ew") Wrapper<XiaoxitixingEntity> wrapper);

	List<XiaoxitixingView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoxitixingEntity> wrapper);
	
	XiaoxitixingView selectView(@Param("ew") Wrapper<XiaoxitixingEntity> wrapper);
	

}

package com.dao;

import com.entity.DiscussmianfeizhuanquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmianfeizhuanquVO;
import com.entity.view.DiscussmianfeizhuanquView;


/**
 * 免费专区评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface DiscussmianfeizhuanquDao extends BaseMapper<DiscussmianfeizhuanquEntity> {
	
	List<DiscussmianfeizhuanquVO> selectListVO(@Param("ew") Wrapper<DiscussmianfeizhuanquEntity> wrapper);
	
	DiscussmianfeizhuanquVO selectVO(@Param("ew") Wrapper<DiscussmianfeizhuanquEntity> wrapper);
	
	List<DiscussmianfeizhuanquView> selectListView(@Param("ew") Wrapper<DiscussmianfeizhuanquEntity> wrapper);

	List<DiscussmianfeizhuanquView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmianfeizhuanquEntity> wrapper);
	
	DiscussmianfeizhuanquView selectView(@Param("ew") Wrapper<DiscussmianfeizhuanquEntity> wrapper);
	

}

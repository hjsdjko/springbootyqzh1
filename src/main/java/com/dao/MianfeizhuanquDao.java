package com.dao;

import com.entity.MianfeizhuanquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MianfeizhuanquVO;
import com.entity.view.MianfeizhuanquView;


/**
 * 免费专区
 * 
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface MianfeizhuanquDao extends BaseMapper<MianfeizhuanquEntity> {
	
	List<MianfeizhuanquVO> selectListVO(@Param("ew") Wrapper<MianfeizhuanquEntity> wrapper);
	
	MianfeizhuanquVO selectVO(@Param("ew") Wrapper<MianfeizhuanquEntity> wrapper);
	
	List<MianfeizhuanquView> selectListView(@Param("ew") Wrapper<MianfeizhuanquEntity> wrapper);

	List<MianfeizhuanquView> selectListView(Pagination page,@Param("ew") Wrapper<MianfeizhuanquEntity> wrapper);
	
	MianfeizhuanquView selectView(@Param("ew") Wrapper<MianfeizhuanquEntity> wrapper);
	

}

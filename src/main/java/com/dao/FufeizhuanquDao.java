package com.dao;

import com.entity.FufeizhuanquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FufeizhuanquVO;
import com.entity.view.FufeizhuanquView;


/**
 * 付费专区
 * 
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface FufeizhuanquDao extends BaseMapper<FufeizhuanquEntity> {
	
	List<FufeizhuanquVO> selectListVO(@Param("ew") Wrapper<FufeizhuanquEntity> wrapper);
	
	FufeizhuanquVO selectVO(@Param("ew") Wrapper<FufeizhuanquEntity> wrapper);
	
	List<FufeizhuanquView> selectListView(@Param("ew") Wrapper<FufeizhuanquEntity> wrapper);

	List<FufeizhuanquView> selectListView(Pagination page,@Param("ew") Wrapper<FufeizhuanquEntity> wrapper);
	
	FufeizhuanquView selectView(@Param("ew") Wrapper<FufeizhuanquEntity> wrapper);
	

}

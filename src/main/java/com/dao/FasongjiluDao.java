package com.dao;

import com.entity.FasongjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FasongjiluVO;
import com.entity.view.FasongjiluView;


/**
 * 发送记录
 * 
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface FasongjiluDao extends BaseMapper<FasongjiluEntity> {
	
	List<FasongjiluVO> selectListVO(@Param("ew") Wrapper<FasongjiluEntity> wrapper);
	
	FasongjiluVO selectVO(@Param("ew") Wrapper<FasongjiluEntity> wrapper);
	
	List<FasongjiluView> selectListView(@Param("ew") Wrapper<FasongjiluEntity> wrapper);

	List<FasongjiluView> selectListView(Pagination page,@Param("ew") Wrapper<FasongjiluEntity> wrapper);
	
	FasongjiluView selectView(@Param("ew") Wrapper<FasongjiluEntity> wrapper);
	

}

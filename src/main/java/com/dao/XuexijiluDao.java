package com.dao;

import com.entity.XuexijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexijiluVO;
import com.entity.view.XuexijiluView;


/**
 * 学习记录
 * 
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface XuexijiluDao extends BaseMapper<XuexijiluEntity> {
	
	List<XuexijiluVO> selectListVO(@Param("ew") Wrapper<XuexijiluEntity> wrapper);
	
	XuexijiluVO selectVO(@Param("ew") Wrapper<XuexijiluEntity> wrapper);
	
	List<XuexijiluView> selectListView(@Param("ew") Wrapper<XuexijiluEntity> wrapper);

	List<XuexijiluView> selectListView(Pagination page,@Param("ew") Wrapper<XuexijiluEntity> wrapper);
	
	XuexijiluView selectView(@Param("ew") Wrapper<XuexijiluEntity> wrapper);
	

}

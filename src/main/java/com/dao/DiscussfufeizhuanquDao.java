package com.dao;

import com.entity.DiscussfufeizhuanquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfufeizhuanquVO;
import com.entity.view.DiscussfufeizhuanquView;


/**
 * 付费专区评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface DiscussfufeizhuanquDao extends BaseMapper<DiscussfufeizhuanquEntity> {
	
	List<DiscussfufeizhuanquVO> selectListVO(@Param("ew") Wrapper<DiscussfufeizhuanquEntity> wrapper);
	
	DiscussfufeizhuanquVO selectVO(@Param("ew") Wrapper<DiscussfufeizhuanquEntity> wrapper);
	
	List<DiscussfufeizhuanquView> selectListView(@Param("ew") Wrapper<DiscussfufeizhuanquEntity> wrapper);

	List<DiscussfufeizhuanquView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfufeizhuanquEntity> wrapper);
	
	DiscussfufeizhuanquView selectView(@Param("ew") Wrapper<DiscussfufeizhuanquEntity> wrapper);
	

}

package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GoumaijiluDao;
import com.entity.GoumaijiluEntity;
import com.service.GoumaijiluService;
import com.entity.vo.GoumaijiluVO;
import com.entity.view.GoumaijiluView;

@Service("goumaijiluService")
public class GoumaijiluServiceImpl extends ServiceImpl<GoumaijiluDao, GoumaijiluEntity> implements GoumaijiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GoumaijiluEntity> page = this.selectPage(
                new Query<GoumaijiluEntity>(params).getPage(),
                new EntityWrapper<GoumaijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GoumaijiluEntity> wrapper) {
		  Page<GoumaijiluView> page =new Query<GoumaijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GoumaijiluVO> selectListVO(Wrapper<GoumaijiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GoumaijiluVO selectVO(Wrapper<GoumaijiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GoumaijiluView> selectListView(Wrapper<GoumaijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GoumaijiluView selectView(Wrapper<GoumaijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

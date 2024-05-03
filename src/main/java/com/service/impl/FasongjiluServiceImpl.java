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


import com.dao.FasongjiluDao;
import com.entity.FasongjiluEntity;
import com.service.FasongjiluService;
import com.entity.vo.FasongjiluVO;
import com.entity.view.FasongjiluView;

@Service("fasongjiluService")
public class FasongjiluServiceImpl extends ServiceImpl<FasongjiluDao, FasongjiluEntity> implements FasongjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FasongjiluEntity> page = this.selectPage(
                new Query<FasongjiluEntity>(params).getPage(),
                new EntityWrapper<FasongjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FasongjiluEntity> wrapper) {
		  Page<FasongjiluView> page =new Query<FasongjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FasongjiluVO> selectListVO(Wrapper<FasongjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FasongjiluVO selectVO(Wrapper<FasongjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FasongjiluView> selectListView(Wrapper<FasongjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FasongjiluView selectView(Wrapper<FasongjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

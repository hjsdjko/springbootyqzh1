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


import com.dao.MianfeizhuanquDao;
import com.entity.MianfeizhuanquEntity;
import com.service.MianfeizhuanquService;
import com.entity.vo.MianfeizhuanquVO;
import com.entity.view.MianfeizhuanquView;

@Service("mianfeizhuanquService")
public class MianfeizhuanquServiceImpl extends ServiceImpl<MianfeizhuanquDao, MianfeizhuanquEntity> implements MianfeizhuanquService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MianfeizhuanquEntity> page = this.selectPage(
                new Query<MianfeizhuanquEntity>(params).getPage(),
                new EntityWrapper<MianfeizhuanquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MianfeizhuanquEntity> wrapper) {
		  Page<MianfeizhuanquView> page =new Query<MianfeizhuanquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MianfeizhuanquVO> selectListVO(Wrapper<MianfeizhuanquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MianfeizhuanquVO selectVO(Wrapper<MianfeizhuanquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MianfeizhuanquView> selectListView(Wrapper<MianfeizhuanquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MianfeizhuanquView selectView(Wrapper<MianfeizhuanquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

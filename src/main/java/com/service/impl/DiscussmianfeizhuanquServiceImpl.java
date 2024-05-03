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


import com.dao.DiscussmianfeizhuanquDao;
import com.entity.DiscussmianfeizhuanquEntity;
import com.service.DiscussmianfeizhuanquService;
import com.entity.vo.DiscussmianfeizhuanquVO;
import com.entity.view.DiscussmianfeizhuanquView;

@Service("discussmianfeizhuanquService")
public class DiscussmianfeizhuanquServiceImpl extends ServiceImpl<DiscussmianfeizhuanquDao, DiscussmianfeizhuanquEntity> implements DiscussmianfeizhuanquService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmianfeizhuanquEntity> page = this.selectPage(
                new Query<DiscussmianfeizhuanquEntity>(params).getPage(),
                new EntityWrapper<DiscussmianfeizhuanquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmianfeizhuanquEntity> wrapper) {
		  Page<DiscussmianfeizhuanquView> page =new Query<DiscussmianfeizhuanquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmianfeizhuanquVO> selectListVO(Wrapper<DiscussmianfeizhuanquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmianfeizhuanquVO selectVO(Wrapper<DiscussmianfeizhuanquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmianfeizhuanquView> selectListView(Wrapper<DiscussmianfeizhuanquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmianfeizhuanquView selectView(Wrapper<DiscussmianfeizhuanquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

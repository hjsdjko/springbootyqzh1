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


import com.dao.ShujifenleiDao;
import com.entity.ShujifenleiEntity;
import com.service.ShujifenleiService;
import com.entity.vo.ShujifenleiVO;
import com.entity.view.ShujifenleiView;

@Service("shujifenleiService")
public class ShujifenleiServiceImpl extends ServiceImpl<ShujifenleiDao, ShujifenleiEntity> implements ShujifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShujifenleiEntity> page = this.selectPage(
                new Query<ShujifenleiEntity>(params).getPage(),
                new EntityWrapper<ShujifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShujifenleiEntity> wrapper) {
		  Page<ShujifenleiView> page =new Query<ShujifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShujifenleiVO> selectListVO(Wrapper<ShujifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShujifenleiVO selectVO(Wrapper<ShujifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShujifenleiView> selectListView(Wrapper<ShujifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShujifenleiView selectView(Wrapper<ShujifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

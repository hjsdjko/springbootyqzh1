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


import com.dao.ZuozheDao;
import com.entity.ZuozheEntity;
import com.service.ZuozheService;
import com.entity.vo.ZuozheVO;
import com.entity.view.ZuozheView;

@Service("zuozheService")
public class ZuozheServiceImpl extends ServiceImpl<ZuozheDao, ZuozheEntity> implements ZuozheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuozheEntity> page = this.selectPage(
                new Query<ZuozheEntity>(params).getPage(),
                new EntityWrapper<ZuozheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuozheEntity> wrapper) {
		  Page<ZuozheView> page =new Query<ZuozheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuozheVO> selectListVO(Wrapper<ZuozheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuozheVO selectVO(Wrapper<ZuozheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuozheView> selectListView(Wrapper<ZuozheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuozheView selectView(Wrapper<ZuozheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

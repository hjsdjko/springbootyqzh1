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


import com.dao.XiaoxitixingDao;
import com.entity.XiaoxitixingEntity;
import com.service.XiaoxitixingService;
import com.entity.vo.XiaoxitixingVO;
import com.entity.view.XiaoxitixingView;

@Service("xiaoxitixingService")
public class XiaoxitixingServiceImpl extends ServiceImpl<XiaoxitixingDao, XiaoxitixingEntity> implements XiaoxitixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoxitixingEntity> page = this.selectPage(
                new Query<XiaoxitixingEntity>(params).getPage(),
                new EntityWrapper<XiaoxitixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoxitixingEntity> wrapper) {
		  Page<XiaoxitixingView> page =new Query<XiaoxitixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoxitixingVO> selectListVO(Wrapper<XiaoxitixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoxitixingVO selectVO(Wrapper<XiaoxitixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoxitixingView> selectListView(Wrapper<XiaoxitixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoxitixingView selectView(Wrapper<XiaoxitixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

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


import com.dao.XuexijiluDao;
import com.entity.XuexijiluEntity;
import com.service.XuexijiluService;
import com.entity.vo.XuexijiluVO;
import com.entity.view.XuexijiluView;

@Service("xuexijiluService")
public class XuexijiluServiceImpl extends ServiceImpl<XuexijiluDao, XuexijiluEntity> implements XuexijiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexijiluEntity> page = this.selectPage(
                new Query<XuexijiluEntity>(params).getPage(),
                new EntityWrapper<XuexijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexijiluEntity> wrapper) {
		  Page<XuexijiluView> page =new Query<XuexijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexijiluVO> selectListVO(Wrapper<XuexijiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexijiluVO selectVO(Wrapper<XuexijiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexijiluView> selectListView(Wrapper<XuexijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexijiluView selectView(Wrapper<XuexijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

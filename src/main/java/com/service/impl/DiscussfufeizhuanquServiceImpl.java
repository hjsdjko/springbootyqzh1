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


import com.dao.DiscussfufeizhuanquDao;
import com.entity.DiscussfufeizhuanquEntity;
import com.service.DiscussfufeizhuanquService;
import com.entity.vo.DiscussfufeizhuanquVO;
import com.entity.view.DiscussfufeizhuanquView;

@Service("discussfufeizhuanquService")
public class DiscussfufeizhuanquServiceImpl extends ServiceImpl<DiscussfufeizhuanquDao, DiscussfufeizhuanquEntity> implements DiscussfufeizhuanquService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfufeizhuanquEntity> page = this.selectPage(
                new Query<DiscussfufeizhuanquEntity>(params).getPage(),
                new EntityWrapper<DiscussfufeizhuanquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfufeizhuanquEntity> wrapper) {
		  Page<DiscussfufeizhuanquView> page =new Query<DiscussfufeizhuanquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfufeizhuanquVO> selectListVO(Wrapper<DiscussfufeizhuanquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfufeizhuanquVO selectVO(Wrapper<DiscussfufeizhuanquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfufeizhuanquView> selectListView(Wrapper<DiscussfufeizhuanquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfufeizhuanquView selectView(Wrapper<DiscussfufeizhuanquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

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


import com.dao.FufeizhuanquDao;
import com.entity.FufeizhuanquEntity;
import com.service.FufeizhuanquService;
import com.entity.vo.FufeizhuanquVO;
import com.entity.view.FufeizhuanquView;

@Service("fufeizhuanquService")
public class FufeizhuanquServiceImpl extends ServiceImpl<FufeizhuanquDao, FufeizhuanquEntity> implements FufeizhuanquService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FufeizhuanquEntity> page = this.selectPage(
                new Query<FufeizhuanquEntity>(params).getPage(),
                new EntityWrapper<FufeizhuanquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FufeizhuanquEntity> wrapper) {
		  Page<FufeizhuanquView> page =new Query<FufeizhuanquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FufeizhuanquVO> selectListVO(Wrapper<FufeizhuanquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FufeizhuanquVO selectVO(Wrapper<FufeizhuanquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FufeizhuanquView> selectListView(Wrapper<FufeizhuanquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FufeizhuanquView selectView(Wrapper<FufeizhuanquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

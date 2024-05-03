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


import com.dao.BanlihuiyuanDao;
import com.entity.BanlihuiyuanEntity;
import com.service.BanlihuiyuanService;
import com.entity.vo.BanlihuiyuanVO;
import com.entity.view.BanlihuiyuanView;

@Service("banlihuiyuanService")
public class BanlihuiyuanServiceImpl extends ServiceImpl<BanlihuiyuanDao, BanlihuiyuanEntity> implements BanlihuiyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanlihuiyuanEntity> page = this.selectPage(
                new Query<BanlihuiyuanEntity>(params).getPage(),
                new EntityWrapper<BanlihuiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanlihuiyuanEntity> wrapper) {
		  Page<BanlihuiyuanView> page =new Query<BanlihuiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanlihuiyuanVO> selectListVO(Wrapper<BanlihuiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanlihuiyuanVO selectVO(Wrapper<BanlihuiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanlihuiyuanView> selectListView(Wrapper<BanlihuiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanlihuiyuanView selectView(Wrapper<BanlihuiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

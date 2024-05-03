package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanlihuiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanlihuiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanlihuiyuanView;


/**
 * 办理会员
 *
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface BanlihuiyuanService extends IService<BanlihuiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanlihuiyuanVO> selectListVO(Wrapper<BanlihuiyuanEntity> wrapper);
   	
   	BanlihuiyuanVO selectVO(@Param("ew") Wrapper<BanlihuiyuanEntity> wrapper);
   	
   	List<BanlihuiyuanView> selectListView(Wrapper<BanlihuiyuanEntity> wrapper);
   	
   	BanlihuiyuanView selectView(@Param("ew") Wrapper<BanlihuiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanlihuiyuanEntity> wrapper);
   	

}


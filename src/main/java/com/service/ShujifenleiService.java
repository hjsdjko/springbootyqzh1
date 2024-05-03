package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShujifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShujifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShujifenleiView;


/**
 * 书籍分类
 *
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface ShujifenleiService extends IService<ShujifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShujifenleiVO> selectListVO(Wrapper<ShujifenleiEntity> wrapper);
   	
   	ShujifenleiVO selectVO(@Param("ew") Wrapper<ShujifenleiEntity> wrapper);
   	
   	List<ShujifenleiView> selectListView(Wrapper<ShujifenleiEntity> wrapper);
   	
   	ShujifenleiView selectView(@Param("ew") Wrapper<ShujifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShujifenleiEntity> wrapper);
   	

}


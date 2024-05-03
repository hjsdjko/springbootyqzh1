package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuozheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuozheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuozheView;


/**
 * 作者
 *
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
public interface ZuozheService extends IService<ZuozheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuozheVO> selectListVO(Wrapper<ZuozheEntity> wrapper);
   	
   	ZuozheVO selectVO(@Param("ew") Wrapper<ZuozheEntity> wrapper);
   	
   	List<ZuozheView> selectListView(Wrapper<ZuozheEntity> wrapper);
   	
   	ZuozheView selectView(@Param("ew") Wrapper<ZuozheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuozheEntity> wrapper);
   	

}


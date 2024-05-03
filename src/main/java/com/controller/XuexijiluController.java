package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XuexijiluEntity;
import com.entity.view.XuexijiluView;

import com.service.XuexijiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 学习记录
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
@RestController
@RequestMapping("/xuexijilu")
public class XuexijiluController {
    @Autowired
    private XuexijiluService xuexijiluService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XuexijiluEntity xuexijilu,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dengjiriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dengjiriqiend,
		HttpServletRequest request){
    	if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		xuexijilu.setUserid((Long)request.getSession().getAttribute("userId"));
    	}
        EntityWrapper<XuexijiluEntity> ew = new EntityWrapper<XuexijiluEntity>();
                if(dengjiriqistart!=null) ew.ge("dengjiriqi", dengjiriqistart);
                if(dengjiriqiend!=null) ew.le("dengjiriqi", dengjiriqiend);
		PageUtils page = xuexijiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexijilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XuexijiluEntity xuexijilu, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dengjiriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dengjiriqiend,
		HttpServletRequest request){
        EntityWrapper<XuexijiluEntity> ew = new EntityWrapper<XuexijiluEntity>();
                if(dengjiriqistart!=null) ew.ge("dengjiriqi", dengjiriqistart);
                if(dengjiriqiend!=null) ew.le("dengjiriqi", dengjiriqiend);
		PageUtils page = xuexijiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexijilu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XuexijiluEntity xuexijilu){
       	EntityWrapper<XuexijiluEntity> ew = new EntityWrapper<XuexijiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xuexijilu, "xuexijilu")); 
        return R.ok().put("data", xuexijiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XuexijiluEntity xuexijilu){
        EntityWrapper< XuexijiluEntity> ew = new EntityWrapper< XuexijiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xuexijilu, "xuexijilu")); 
		XuexijiluView xuexijiluView =  xuexijiluService.selectView(ew);
		return R.ok("查询学习记录成功").put("data", xuexijiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XuexijiluEntity xuexijilu = xuexijiluService.selectById(id);
        return R.ok().put("data", xuexijilu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XuexijiluEntity xuexijilu = xuexijiluService.selectById(id);
        return R.ok().put("data", xuexijilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XuexijiluEntity xuexijilu, HttpServletRequest request){
    	xuexijilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuexijilu);
    	xuexijilu.setUserid((Long)request.getSession().getAttribute("userId"));
        xuexijiluService.insert(xuexijilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XuexijiluEntity xuexijilu, HttpServletRequest request){
    	xuexijilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuexijilu);
        xuexijiluService.insert(xuexijilu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XuexijiluEntity xuexijilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xuexijilu);
        xuexijiluService.updateById(xuexijilu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xuexijiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XuexijiluEntity> wrapper = new EntityWrapper<XuexijiluEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}
		if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		wrapper.eq("userid", (Long)request.getSession().getAttribute("userId"));
    	}


		int count = xuexijiluService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}

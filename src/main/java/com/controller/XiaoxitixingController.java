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

import com.entity.XiaoxitixingEntity;
import com.entity.view.XiaoxitixingView;

import com.service.XiaoxitixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 消息提醒
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-05 10:07:10
 */
@RestController
@RequestMapping("/xiaoxitixing")
public class XiaoxitixingController {
    @Autowired
    private XiaoxitixingService xiaoxitixingService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XiaoxitixingEntity xiaoxitixing,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date tongzhiriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date tongzhiriqiend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			xiaoxitixing.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XiaoxitixingEntity> ew = new EntityWrapper<XiaoxitixingEntity>();
                if(tongzhiriqistart!=null) ew.ge("tongzhiriqi", tongzhiriqistart);
                if(tongzhiriqiend!=null) ew.le("tongzhiriqi", tongzhiriqiend);
		PageUtils page = xiaoxitixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaoxitixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XiaoxitixingEntity xiaoxitixing, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date tongzhiriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date tongzhiriqiend,
		HttpServletRequest request){
        EntityWrapper<XiaoxitixingEntity> ew = new EntityWrapper<XiaoxitixingEntity>();
                if(tongzhiriqistart!=null) ew.ge("tongzhiriqi", tongzhiriqistart);
                if(tongzhiriqiend!=null) ew.le("tongzhiriqi", tongzhiriqiend);
		PageUtils page = xiaoxitixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaoxitixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XiaoxitixingEntity xiaoxitixing){
       	EntityWrapper<XiaoxitixingEntity> ew = new EntityWrapper<XiaoxitixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiaoxitixing, "xiaoxitixing")); 
        return R.ok().put("data", xiaoxitixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiaoxitixingEntity xiaoxitixing){
        EntityWrapper< XiaoxitixingEntity> ew = new EntityWrapper< XiaoxitixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiaoxitixing, "xiaoxitixing")); 
		XiaoxitixingView xiaoxitixingView =  xiaoxitixingService.selectView(ew);
		return R.ok("查询消息提醒成功").put("data", xiaoxitixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XiaoxitixingEntity xiaoxitixing = xiaoxitixingService.selectById(id);
        return R.ok().put("data", xiaoxitixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XiaoxitixingEntity xiaoxitixing = xiaoxitixingService.selectById(id);
        return R.ok().put("data", xiaoxitixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XiaoxitixingEntity xiaoxitixing, HttpServletRequest request){
    	xiaoxitixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaoxitixing);
        xiaoxitixingService.insert(xiaoxitixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XiaoxitixingEntity xiaoxitixing, HttpServletRequest request){
    	xiaoxitixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaoxitixing);
        xiaoxitixingService.insert(xiaoxitixing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XiaoxitixingEntity xiaoxitixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiaoxitixing);
        xiaoxitixingService.updateById(xiaoxitixing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiaoxitixingService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<XiaoxitixingEntity> wrapper = new EntityWrapper<XiaoxitixingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = xiaoxitixingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}

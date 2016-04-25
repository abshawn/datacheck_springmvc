package com.spring.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * 项目名称：spring-freemarker-v1
 * 描述 ：hello_jsp 表示解析jsp类型的hello页面
 * 类名称：HelloWorldAction 
 * 创建人：jl 
 * 创建时间：2016年4月15日 下午2:42:42
 */
@Controller
public class HelloWorldAction {
	
	@RequestMapping(value="/helloworld")
	public ModelAndView hello(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("hello.jsp");
		modelAndView.addObject("message", "Hello,SpringMvc，你好");
		return modelAndView;
	}
	
	
	@RequestMapping(value="/welcome")
	public ModelAndView helloVm(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("welcome.vm");
		modelAndView.addObject("message", "Hello,Velocity，你好");
		return modelAndView;
	}
	
	
	@RequestMapping(value="/free")
	public String free(Model model){
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("message", "hello world,你好!");
		model.addAttribute(result);
		return "freemarker.ftl";
	}
}

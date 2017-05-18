package com.alec.demo.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alec.demo.domain.Demo;
import com.alec.demo.service.DemoService;

@RestController
@RequestMapping("/demos")
public class DemoController {
	@Resource
	DemoService demoService;
	@RequestMapping("/savedemo")
	public String savedemo(){
		Demo demo = new Demo();
		demo.setName("Alec");
		demoService.save(demo);
		return "ok.DemoController.save";
	}
}

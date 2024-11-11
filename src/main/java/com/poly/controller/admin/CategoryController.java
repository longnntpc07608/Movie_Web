package com.poly.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CategoryController {
	@RequestMapping("admin/category")
	public String index() {
		return "admin/category/index";
	}
	@RequestMapping("admin/create")
	public String create() {
		return "admin/category/create";
	}
}

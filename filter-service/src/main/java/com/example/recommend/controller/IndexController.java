package com.example.recommend.controller;

import com.example.recommend.base.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * index
 *
 * @author clx
 */
@RestController
@RequestMapping(value = "/")
public class IndexController {

	@GetMapping(value = "index")
	public BaseResponse index() {
		return new BaseResponse();
	}
}

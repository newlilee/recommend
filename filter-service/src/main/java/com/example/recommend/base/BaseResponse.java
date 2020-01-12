package com.example.recommend.base;

import java.util.Collections;
import java.util.Map;

/**
 * base response
 *
 * @author clx
 */
public class BaseResponse {
	/**
	 * code
	 */
	private int code = 1000;
	/**
	 * json data
	 */
	private Map<String, Object> data = Collections.emptyMap();
	/**
	 * message
	 */
	private String message = "success.";

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

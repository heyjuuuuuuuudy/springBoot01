package com.example.demo.modules.common.vo;

public class Result<T> {
	
	//状态值
	private int status;
	//后台报错放入message
	private String message;
	//对象传入前端
	private T object;

	public Result() {
		super();
	}
	public Result(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public Result(int status, String message, T object) {
		super();
		this.status = status;
		this.message = message;
		this.object = object;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}


	public enum ResultEnum{
		SUCCESS(200),FAILD(500);
		
		public int status;

		private ResultEnum(int status) {
			this.status = status;
		}	
	}
}

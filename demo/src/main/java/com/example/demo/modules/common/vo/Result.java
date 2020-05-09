package com.example.demo.modules.common.vo;

public class Result<T> {
	
	//状态值
	private int status;
	//后台报错放入message
	private String message;
	//对象传入前端
	private T object;

	//比如说显示用户的照片，需要两张图片，一张图片大图片(500*500、 BIG前缀)、一张中间图片(100*100,MIDDLE )、一张小图片(50*50，SMALL
	/*
	 * public final static int BIG_IMAGE_WIDTH = 500;
	public final static int BIG_IMAGE_HEIGHT = 500;
	public final static String BIG_IMAGE_PRE = "BIG_";
	public final static int MIDDLE_IMAGE_WIDTH = 100;
	public final static int MIDDLE_IMAGE_HEIGHT = 100;
	public final static String MIDDLE_IMAGE_PRE = "BIG_";
	public final static int SMALL_IMAGE_WIDTH = 50;
	public final static int SMALL_IMAGE_HEIGHT = 50;
	public final static String SMALL_IMAGE_PRE = "BIG_";
	*/
	
	//定义图片的长宽和前缀
	public enum ImageEnum{
		BIG_IMAGE(500,500,"BIG_"),
		MIDDLE_IMAGE(100,100,"MIDDLE_"),
		SMALL_IMAGE(50,50,"SMALL_");
		
		public int height;
		public int weight;
		public String pre;
		
		private ImageEnum(int height, int weight, String pre) {
			this.height = height;
			this.weight = weight;
			this.pre = pre;
		}	
	}
	
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

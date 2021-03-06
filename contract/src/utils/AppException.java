package utils;
/*
 */
public class AppException extends Exception {
	
	//私有属性
	private int exceptionCode;		//异常编号
	private String message;			//异常消息
	 
	//构造方法
	/**
	 *Constructor,set the exception message
	 * @param message 
	 */
	
	public AppException(String message) {
		this.message = message;
	}
	
	/**
	 * Constructor,set the exception message and exception code
	 * @param message
	 * @param exceptionCode
	 */
	public AppException(String message,int exceptionCode) {
		this.message = message;
		this.exceptionCode = exceptionCode;
	}
	
	//方法
	/**
	 * Get exception code
	 * @return exceptionCode
	 */
	public int getExceptionCode() {
		return exceptionCode;
	}

	/**
	 * Get detailed exception message
	 * @return detailMessage 
	 */
	public String getMessage() {
		String detailMessage = "Detail message:"
			+ exceptionCode + " " + message;
		return detailMessage;
	}

}

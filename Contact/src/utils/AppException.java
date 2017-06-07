package utils;
/*
 */
public class AppException {
	
	//˽������
	private int exceptionCode;		//�쳣���
	private String message;			//�쳣��Ϣ
	 
	//���췽��
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
	
	//����
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
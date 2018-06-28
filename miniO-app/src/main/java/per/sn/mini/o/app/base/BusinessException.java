package per.sn.mini.o.app.base;

public class BusinessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6006323706710775023L;

	private IReturnCode returnCode;

	public BusinessException() {
		super();
	}

	public BusinessException(IReturnCode returnCode) {
		this.returnCode = returnCode;
	}

	public IReturnCode getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(IReturnCode returnCode) {
		this.returnCode = returnCode;
	}

}

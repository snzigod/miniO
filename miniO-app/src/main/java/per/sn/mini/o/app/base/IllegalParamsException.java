package per.sn.mini.o.app.base;

public class IllegalParamsException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9083210666345330364L;

	private IReturnCode returnCode;

	public IllegalParamsException() {
		new IllegalParamsException(BaseReturnCode.ILLEGAL_PARAMS_ERROR);
	}

	public IllegalParamsException(IReturnCode returnCode) {
		this.returnCode = returnCode;
	}

	public IllegalParamsException(String... strings) {
		IReturnCode returnCode = new IReturnCode() {
			@Override
			public int getCode() {
				return 0;
			}

			@Override
			public String getMessage() {
				return null;
			}
		};
		this.returnCode = returnCode;
	}

	public IReturnCode getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(IReturnCode returnCode) {
		this.returnCode = returnCode;
	}

}

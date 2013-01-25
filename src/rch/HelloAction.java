package rch;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
	private static final String MESSAGE = "hello.msg";

	private String message;

	@Override
	public String execute() throws Exception {
		this.setMessage(super.getText(MESSAGE));
		return ActionSupport.SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}



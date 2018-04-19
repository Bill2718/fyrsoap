package com.fuyao.fyrsoap;

/**
 * @author gdel489
 *
 */
public class MsgBody {
	public MsgBody(String state, String msg) {
		this.STATE =state;
		this.ERROR_DESC = msg;
	}
	public String STATE;
	public String ERROR_DESC;
}

package com.fuyao.fyrsoap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author gdel489
 *
 */
@WebService
public class MaterialService {
	private String state;
	private String msg;

	public MaterialService() {

	}

	@WebMethod
	public MsgBody DetermineMaterialAndReturnState(@WebParam(name = "MATERIAL_CODE") String MATERIAL_CODE, 
			@WebParam (name = "LOT_NUMBER") String LOT_NUMBER ,
			@WebParam (name = "QUANTITY") Integer QUANTITY  ) {

		if (QUANTITY >= 10) {
			state = "2";
			msg = "stock is not enough";
			;
		}

		else if (LOT_NUMBER != "VEN201801") {
			state = "1";
			msg = "earlier lot exists";
		}

		else {
			state = "'0";
			msg = null;
		}

		return new MsgBody(state, msg);
	}
}
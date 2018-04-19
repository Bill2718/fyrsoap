package com.fuyao.fyrsoap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author gdel489
 *
 */
@WebService
public interface UserService {
    @WebMethod
    String getName(@WebParam(name = "userId") Long userId);
    @WebMethod
    User getUser(Long userId);
}
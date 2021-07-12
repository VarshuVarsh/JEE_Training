package com.training.ifaces;

import java.util.Map;
import javax.jws.*;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

public interface WeatherService {

	  @WebMethod(operationName="Get Weather")
	    public String getWeather(@WebParam(name="city")String city);

}

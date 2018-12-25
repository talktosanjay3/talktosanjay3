package com.tcs.nga;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PaymentAndTransfersController {

	@RequestMapping(method = RequestMethod.GET, value = "/userService/getUserDetails",  produces = "application/json;charset=UTF-8")
	@CrossOrigin(origins = "*")
	@ResponseBody
	public UserDetailsBean getCustomer() {

		return new UserDetailsBean();
	}
	
	@GetMapping("/pnt/loctfr")
	@CrossOrigin(origins = "*")
	@ResponseBody
	public String loctfr() {
		
		String fullText ="";
		for (int i = 0; i < NGAConstants.pnt_loctfr.length; i++) {
			//System.out.println("Element at index " + i + " : "+ pnt_loctfr[i]);
			fullText = fullText + NGAConstants.pnt_loctfr[i];
		}
		//System.out.println(fullText);

		return fullText;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/pnt/loctfrrecap",  produces = "application/json;charset=UTF-8")
	@CrossOrigin(origins = "*")
	@ResponseBody
	public String getRecapDetails() {

		return NGAConstants.pnt_loctfrRecap;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/pnt/loctfrconfirm",  produces = "application/json;charset=UTF-8")
	@CrossOrigin(origins = "*")
	@ResponseBody
	public String getConfirmDetails() {

		return NGAConstants.pnt_loctfrConfirm;
	}
}


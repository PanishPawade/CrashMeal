package com.noqcart.crashmeal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.noqcart.crashmeal.model.Partner;
import com.noqcart.crashmeal.service.PartnerServiceImpl;

@RestController
@RequestMapping("/partner")
public class PartnerController {
	
	@Autowired
	private PartnerServiceImpl partnerService;
	
	@RequestMapping("/index")
	public String test(){
		return "Welcome to PartnerModule";
	}
	
	@RequestMapping("/getPartner/{partnerId}")
	public Partner getPartner(@PathVariable Long partnerId){
		return partnerService.getPartner(partnerId); 
	}
	
	@RequestMapping("/getPartnerAll")
	public List<Partner> getPartnerAll(){
		return partnerService.getpartnerAll();
	}
	
	@RequestMapping(value="/savePartner", method=RequestMethod.POST)
	public void savePartner(@RequestBody Partner partner){
		partnerService.saveParnter(partner);
	}
	
	@RequestMapping(value="/updatePartner", method=RequestMethod.POST)
	public void updatePartner(@RequestBody Partner partner){
		partnerService.saveParnter(partner);
	}
	
	@RequestMapping(value="/deletePartner/{partnerId}", method=RequestMethod.DELETE)
	public void deletePartner(@PathVariable Long partnerId){
		partnerService.deletePartner(partnerId);
	}
}

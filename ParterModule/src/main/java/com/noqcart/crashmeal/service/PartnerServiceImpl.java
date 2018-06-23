package com.noqcart.crashmeal.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noqcart.crashmeal.model.Availability;
import com.noqcart.crashmeal.model.BankDetail;
import com.noqcart.crashmeal.model.Outlet;
import com.noqcart.crashmeal.model.Partner;
import com.noqcart.crashmeal.repository.AvailabilityRepository;
import com.noqcart.crashmeal.repository.BankDetailRepository;
import com.noqcart.crashmeal.repository.OutletRepository;
import com.noqcart.crashmeal.repository.PartnerRepository;
import com.noqcart.crashmeal.repository.TimeTableRepository;

@Service
@Transactional
public class PartnerServiceImpl {
	
	@Autowired
	PartnerRepository partnerRepository;
	
	@Autowired
	OutletRepository outletRepository;
	
	@Autowired
	BankDetailRepository bankDetailRepository;
	
	@Autowired
	AvailabilityRepository availabilityRepository;
	
	@Autowired
	TimeTableRepository timeTableRepository;
	
	public Partner getPartner(Long partnerId){
		return partnerRepository.findById(partnerId).get();
	}

	public List<Partner> getpartnerAll() {
		return (List<Partner>) partnerRepository.findAll();
	}

	public void saveParnter(Partner partner) {
		System.out.println("=========================================");
		System.out.println("Partner Name: "+partner.getPartnerName()+"\nOutlet Email: "+partner.getOutlets().get(0).getEmail());
		System.out.println("=========================================");
		
		partnerRepository.save(partner);
		outletRepository.save(partner.getOutlets().get(0));
		bankDetailRepository.save(partner.getOutlets().get(0).getBankDetail());
		availabilityRepository.save(partner.getOutlets().get(0).getAvailability());
		timeTableRepository.save(partner.getOutlets().get(0).getAvailability().getTimeTable().iterator().next());
	}
	
	private Partner preparePartner(){
		
		BankDetail bankDetail = new BankDetail();
		bankDetail.setBankName("ICICI");

		Availability availability = new Availability();
		availability.setMonday("yes");
		
		Outlet outlet = new Outlet();
		outlet.setEmail("panishpawade@gmail.com");
		outlet.setBankDetail(bankDetail);
		outlet.setAvailability(availability);
		
		Partner partner = new Partner();
		partner.setPartnerName("Panish");
		partner.getOutlets().add(outlet);
		
		return partner;
	}

	public void deletePartner(Long partnerId) {
		
		Partner partner = partnerRepository.findById(partnerId).get();
		
		partnerRepository.deleteById(partner.getPartnerId());
		outletRepository.deleteById(partner.getOutlets().get(0).getOutletId());
		bankDetailRepository.deleteById(partner.getOutlets().get(0).getBankDetail().getBankDetailId());
		availabilityRepository.deleteById(partner.getOutlets().get(0).getAvailability().getAvailabilityId());
	}
}

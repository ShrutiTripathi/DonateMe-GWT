package com.jkt.donateme.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.jkt.donateme.client.model.BeneficiaryDetailsFields;
import com.jkt.donateme.client.model.PatientClientImpl;
import com.jkt.donateme.client.model.ProfileDetailsFields;
import com.jkt.donateme.client.rpc.PatientDetailService;

@SuppressWarnings("serial")
public class PatientDetailServiceImpl extends RemoteServiceServlet implements
		PatientDetailService {

	/**
	 * @return 
	 * 
	 */
	public BeneficiaryDetailsFields profileDetailsServer(BeneficiaryDetailsFields beneficiaryDetailsFields)
			throws IllegalArgumentException {
		PatientClientImpl.getInstance().createPatientProfile(beneficiaryDetailsFields);

		return beneficiaryDetailsFields;
	}

	

}

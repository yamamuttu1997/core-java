package com.xworkz.hospital.crud;

import com.xworkz.hospital.dto.PatientDTO;

public interface Hospital {

	public boolean createPatient(PatientDTO dto);

	public void getPatientDetails();

	public PatientDTO getPatientDetailsById(int id);

	public boolean updatePatientAddressById(int id, String address);

	public boolean updatePatientContactNoByName(String name, long contactNo);

	public boolean deletePatientByName(String name);
}

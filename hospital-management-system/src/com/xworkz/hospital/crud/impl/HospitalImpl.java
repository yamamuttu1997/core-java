package com.xworkz.hospital.crud.impl;

import java.util.Arrays;

import com.xworkz.hospital.crud.Hospital;
import com.xworkz.hospital.dto.PatientDTO;

public class HospitalImpl implements Hospital {

	// has many patients
	PatientDTO[] dtos;
	// insatnce variable1
	
	int index;

	public HospitalImpl(int size) {
		dtos = new PatientDTO[size];
		System.out.println("Hospital Constructor is called");
	}

	@Override
	public boolean createPatient(PatientDTO dto) {
		System.out.println("inside createPatient");
		boolean isAdded = false;
		if (dto != null && dto.getName() != null) {
			this.dtos[index++] = dto;
			isAdded = true;
			System.out.println("patient added successfully");
		} else {
			System.out.println("cannot add patient");
		}
		return isAdded;
	}

	@Override
	public void getPatientDetails() {
		System.out.println("inside getPatientDetails");
		for (int i = 0; i < dtos.length; i++) {
			System.out.println(dtos[i]);
		}
	}

	@Override
	public PatientDTO getPatientDetailsById(int id) {
		System.out.println("inside getPatientDetails");
		PatientDTO patientDTO = null;
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i].getId() == id) {
				System.out.println(dtos[i]);
			}
		}
		return patientDTO;
	}

	@Override
	public boolean updatePatientAddressById(int id, String address) {
		System.out.println("inside updatePatientAddressById() ");
		boolean updateAddress = false;
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i].getId() == id) {
				dtos[i].setAddress(address);
				updateAddress = true;
				System.out.println("upadated successfully");
			} else {
				System.out.println("patient address is not matching the id");
			}
		}

		return updateAddress;

	}

	@Override
	public boolean updatePatientContactNoByName(String name, long contactNo) {
		System.out.println("inside updatePatientContactNoByName() ");
		boolean updateContactNo = false;
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i].getName().equals(name)) {
				dtos[i].setContactNo(contactNo);
				updateContactNo = true;
				System.out.println("upadated successfully");
			} else {
				System.out.println("patient Contact no is not matching the id");
			}
		}

		return updateContactNo;

	}

	@Override
	public boolean deletePatientByName(String name) {
		boolean patientDeleted = false;
		System.out.println("Inside deletePatientbyName()");
		int i, j;
		for (i = 0, j = 0; j < dtos.length; j++) {
			if (!dtos[j].getName().equals(name)) {
				dtos[i++] = dtos[j];
				patientDeleted = true;
				System.out.println("Patient Deleted Successfully");
			}

			else {
				System.out.println("Name is not found");
			}
		}
		dtos = Arrays.copyOf(dtos, i);
		return patientDeleted;
	}
}


package com.xworkz.hospital;

import java.util.Scanner;

import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.crud.Hospital;
import com.xworkz.hospital.crud.impl.HospitalImpl;
import com.xworkz.hospital.dto.PatientDTO;

public class HospitalTester {
	public static void main(String a[]) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of patients to be added");
		int size=sc.nextInt();


		Hospital hos=new HospitalImpl(size);

		for(int i=0; i<size;i++){
			
			System.out.println("Enter the id");
		int id=sc.nextInt();

		System.out.println("Enter the patient name");
		String name=sc.next();

		System.out.println("Enter the Patient's Gender");
		String gender=sc.next();

		System.out.println("Enter the contactno");
		long contactno=sc.nextLong();

		System.out.println("Enter the Address");
		String address=sc.next();

		PatientDTO dto=new PatientDTO();
		dto.setId(id);
		dto.setName(name);
		dto.setGender(Gender.valueOf(gender));
		dto.setContactNo(contactno);
		dto.setAddress(address);
		hos.createPatient(dto);
		}

				String option = null;
				do{
					System.out.println("Enter 1 fetch all the Patients ");
					System.out.println("Enter 2 to update the patients Address by Id ");
					System.out.println("Enter 3 to update Patients Contact No by name ");
					System.out.println("Enter 4 to delete Patient by name ");
					System.out.println("Enter the Choise ");
					int choise = sc.nextInt();
					
					switch(choise){
						case 1 : hos.getPatientDetails();
						break;
						
						case 2 : System.out.println("Enter the Existing id for address has to be");
						        int existingId = sc.nextInt();
						        System.out.println("Enter the Address to be Updated");
						        String updatedAddress = sc.next();
					            hos.updatePatientAddressById(existingId,updatedAddress);
								break;
								
						case 3 : System.out.println("Enter the Existing name for Contact No has to be");
					             String existingName = sc.next();
					             System.out.println("Enter the Contact No to be Updated");
					             long updatedContactNo = sc.nextLong();
					             hos.updatePatientContactNoByName(existingName , updatedContactNo);
								break;
						
						case 4 : System.out.println("Enter the Existing Name for delete patient");
					             String name = sc.next();
				                 hos.deletePatientByName(name);
								break;
						default : System.out.println("Given choise cannot be delivered");
		                        break;				
					}
					System.out.println("Do you want to continue Y/N ");
					option = sc.next();
				}
				while(option.equalsIgnoreCase("Y"));
				sc.close();
		        }
}

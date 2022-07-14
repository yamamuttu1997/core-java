import java.util.Scanner;

 class HospitalTester{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the number of patients to be added");
int size=sc.nextInt();


Hospital hos=new Hospital(size);

for(int i=0; i<size;i++){
	
	System.out.println("Enter the id");
int id=sc.nextInt();

System.out.println("Enter the patient name");
String name=sc.next();

System.out.println("Enter the contactno");
long contactno=sc.nextLong();

System.out.println("Enter the Address");
String address=sc.next();

PatientDTO dto=new PatientDTO();
dto.setId(id);
dto.setName(name);
//dto.setGender(Gender.male);
dto.setContactNo(contactno);
dto.setAddress(address);
hos.createPatient(dto);
}




/*
PatientDTO dto2=new PatientDTO();
dto2.setId(3);
dto2.setName("Akash");
dto2.setGender(Gender.male);
dto2.setContactNo(867785995l);
dto2.setAddress("Bilagi");

PatientDTO dto3=new PatientDTO();
dto3.setId(4);
dto3.setName("Madhu");
dto3.setGender(Gender.female);
dto3.setContactNo(9786885554l);
dto3.setAddress("Mudhol");

PatientDTO dto4=new PatientDTO();
dto4.setId(5);
dto4.setName("Manoj");
dto4.setGender(Gender.transgender);
dto4.setContactNo(766788578l);
dto4.setAddress("Sirsi");

hos.createPatient(dto);
hos.createPatient(dto1);
hos.createPatient(dto2);
hos.createPatient(dto3);
hos.createPatient(dto4);*/

hos.getPatientDetails();
//invokening the updatePatientAddressById method
System.out.println("enter the existing id for address has to be");
int existingId=sc.nextInt();
System.out.println("Enter the address to be updated");
String updatedAddress=sc.next();
hos.updatePatientAddressById(existingId,updatedAddress);
hos.getPatientDetails();

}

}
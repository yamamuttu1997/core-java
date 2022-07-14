class Hospital{

//has many patients
PatientDTO[] dtos;
//insatnce variable
int index;

public Hospital(int size){
	dtos= new PatientDTO[size];
System.out.println("Hospital Constructor is called");
}

public boolean createPatient(PatientDTO dto){
System.out.println("inside createPatient");
boolean isAdded= false;
if (dto !=null && dto.getName() !=null){
this.dtos[index++] =dto;
isAdded=true;
System.out.println("patient added successfully");
}
else{
System.out.println("cannot add patient");
}
return isAdded;
}
public void getPatientDetails(){
	System.out.println("inside getPatientDetails");
	for(int i=0; i<dtos.length;i++){
		System.out.println(dtos[i].getId()+" "+dtos[i].getName()+" "+dtos[i].getAddress()+" "/*+dtos[i].getGender()+" "*/+dtos[i].getContactNo());
}
}
public boolean updatePatientAddressById(int id, String address){
	System.out.println("inside updatePatientAddressById() ");
	boolean updateAddress=false;
	for(int i=0; i<dtos.length; i++){
		if (dtos[i].getId()==id){
			dtos[i].setAddress(address);
			updateAddress=true;
		System.out.println("upadated successfully");
	}
	else{
		System.out.println("patient address is not matching the id");
	}
}

return updateAddress;

}
//public boolean updateContactNoByName(long )

}
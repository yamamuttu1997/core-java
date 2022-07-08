class Hospital{

//has many patients
PatientDTO[] dtos = new PatientDTO[5];
//insatnce variable
int index;

public Hospital(){
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
		System.out.println(dtos[i].getId()+" "+dtos[i].getName()+" "+dtos[i].getAddress()+" "+dtos[i].getGender()+" "+dtos[i].getContactNo());
}
}
}
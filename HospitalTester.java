class HospitalTester{

public static void main(String[] args){

Hospital hos=new Hospital();

PatientDTO dto=new PatientDTO();
dto.setId(1);
dto.setName("Rohit");
dto.setGender(Gender.male);
dto.setContactNo(7411404438l);
dto.setAddress("Navanagar");

PatientDTO dto1 =new PatientDTO();
dto1.setId(2);
dto1.setName("Akshay");
dto1.setGender(Gender.male);
dto1.setContactNo(76478848893l);
dto1.setAddress("Vidyagiri");

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
hos.createPatient(dto4);

hos.getPatientDetails();





}






}
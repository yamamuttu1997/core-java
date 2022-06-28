class EngineerTester{
public static void main(String[] args){

CivilEngineer civil=new CivilEngineer();
    civil.civilRocks();
	System.out.println("==============");
	
MechEngineer royal=new MechEngineer();
   royal.royalMech();
   System.out.println("==============");
   
CsEngineer code=new CsEngineer();
   code.worldDependOnIt();
   System.out.println("==============");
   
EcEngineer circuit=new EcEngineer();
   circuit.playWithCircuit();
}
}
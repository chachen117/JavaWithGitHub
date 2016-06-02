package hf.ch10.state.pattern;

public class GumballMachineTestDrive {

	public static void main(String[] args){
		GumballMachine gumballMachine = new GumballMachine(5);
				
		for (int i = 0; i < 6 ; i++){
			System.out.println(gumballMachine);
			
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			System.out.println("");
		}	
		
		System.out.println(gumballMachine);
		
		gumballMachine.refill(5);		
		
		for (int i = 0; i < 6 ; i++){
			System.out.println(gumballMachine);
			
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			System.out.println("");
		}		
		
	}

}

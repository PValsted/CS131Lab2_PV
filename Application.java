
public class Application {

	public static void main(String[] args) {
		
		//testing empty-argument constructor
		Wizard saruman=new Wizard();
		System.out.println(saruman.toString());
		
		//testing preferred constructor
		Wizard gandalf=new Wizard("Gandalf");
		System.out.println(gandalf.toString());
		
		//testing original getters and setters
		gandalf.setName("Gandalf the Grey");
		System.out.println(gandalf.getName());
		
		gandalf.setHealth(20);
		System.out.println(gandalf.getHealth());
		
		//testing key for all scenarios
		gandalf.setKey(-1);
		gandalf.setKey(3);
		gandalf.setKey(2);
		System.out.println(gandalf.getKey());
		
		//testing lock system + damage
		gandalf.lock(2);
		gandalf.lock(3);
		System.out.println(gandalf.isLocked());
		gandalf.takeDamage(5);
		System.out.println(gandalf.getHealth());
		
		gandalf.unlock(2);
		gandalf.unlock(3);
		gandalf.takeDamage(5);
		System.out.println(gandalf.toString());
		
	}//end main
	
}//end class

public class Wizard implements Lockable{
	
	private String name;
	private int health;
	private int key;
	boolean locked;
  
	public Wizard() {
		this.setName("");
		this.setHealth(0);
		this.key=0;
		this.locked=false;
	}//end empty-argument constructor
  
	public Wizard(String name) {
		this.setName(name);
		this.setHealth(0);
		this.key=0;
		this.locked=false;
	}//end preferred constructor
  
	public void takeDamage(int power) {
		if (this.isLocked()==false)
			this.setHealth(health-power);
		else System.out.println("The wizard cannot take damage as it is protected.");
	}//end takeDamage
	
	public void lock(int key) {
		if (this.key==key)
			this.locked=true;
		else System.out.println("The key you entered does not match the key previously set, so nothing happened.");
	}//end lock
	
	public void unlock(int key) {
		if (this.key==key)
			this.locked=false;
		else System.out.println("The key you entered does not match the key previously set, so nothing happened.");
	}//end unlock
  
	//begin getters and setters
  
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setKey(int key) {
		if (key>0 && this.key==0)
			this.key=key;
		else if (key<=0) System.out.println("The key was not set because the number you entered was 0 or less.");
		else if (this.key!=0) System.out.println("The key was not set because the key was previously set as something else.");
	}
	
	public int getKey() {
		return key;
	}
	
	public boolean isLocked() {
		return locked;
	}
	//end getters and setters
	
	public String toString() {
		return "Wizard [name=" + this.name + ", health=" + this.health + ", key=" + this.key + ", locked=" + this.locked + "]";
	}//end toString
	
}//end class

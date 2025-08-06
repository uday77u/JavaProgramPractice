package Java_advance;
class Personal_data{
	private int atm_pin=1234; 
	public int get_pin() {
		return atm_pin;
	}
	public int set_pin(int atm_pin) {
		this.atm_pin=atm_pin;
		return atm_pin;	
	}
	
}


public class Encapsulation {
	public static void main(String[] args) {
		Personal_data pin=new Personal_data();
		
		System.out.println("atm_key is:\t"+pin.get_pin());
		pin.set_pin(4567);
		System.out.println("New atm_key is:\t"+pin.get_pin());	
	}
}

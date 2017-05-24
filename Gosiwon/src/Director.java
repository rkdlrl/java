
public class Director {
	
	public void startSinario() {
		Person person = new Person();
		Gosiwon gosiwon = new Gosiwon();
		Owner owner = new Owner();
		owner.setGosiwon(gosiwon);
		person.contract(owner);
		
	}
	public static void main(String[] args) {
		Director director = new Director();
		
		director.startSinario();
	}

}

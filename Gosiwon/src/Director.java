
public class Director {
	
	public void startSinario() {
		Person person = new Person();
		Gosiwon gosiwon = new Gosiwon(10);
		Owner owner = new Owner();
		owner.setGosiwon(gosiwon);
		
		//계약 시작
		person.findMyRoom(owner);
		person.contract(owner);
	}
	public static void main(String[] args) {
		Director director = new Director();
		
		director.startSinario();
	}

}

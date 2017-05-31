
public class Director {
	
	public void startSinario() {
		Person person = new Person();
		Gosiwon gosiwon = new Gosiwon(10);
		Owner owner = new Owner();
		owner.setGosiwon(gosiwon);
		
		//계약 시작
		System.out.println("사람, 방을 알아보세요");
		person.findMyRoom(owner);
		person.contract(owner);
	}
	public static void main(String[] args) {
		Director director = new Director();
		
		director.startSinario();
	}

}

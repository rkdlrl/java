
public class Director {
	String name = "director";
	public void startSinario() {
		System.out.println(name+": 시나리오 시작합니다.");
		System.out.println(name+": person, gosiwon, owner 생성");
		Person person = new Person();
		Gosiwon gosiwon = new Gosiwon(10);
		Owner owner = new Owner();
		
		System.out.println(name+": owner에게 gosiwon을 줍니다.");
		owner.setGosiwon(gosiwon);
		
		//계약 시작
		System.out.println(name+": 사람, 방을 알아보세요");
		person.findMyRoom(owner);
		System.out.println(name+": 사람, 계약하세요");
		person.contract(owner);
	}
	public static void main(String[] args) {
		Director director = new Director();
		
		director.startSinario();
	}

}

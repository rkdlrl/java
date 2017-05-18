
public class Owner {
	Gosiwon gosiwon;
	
	public Owner(Gosiwon gosiwon){
		System.out.println("주인 생성");
	}
	
	public void setGosiwon(Gosiwon gosiwon) {
		this.gosiwon = gosiwon;
		System.out.println("고시원 설정완료");
	}
	
	public boolean getRoomsStat() {
		gosiwon.getRooms();
		return false;
	}
}


public class Owner {
	Gosiwon gosiwon;
	public Owner() {
		
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

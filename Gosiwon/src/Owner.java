
public class Owner {
	Gosiwon gosiwon;
	public Owner() {
		
	}

	public void setGosiwon(Gosiwon gosiwon) {
		this.gosiwon = gosiwon;
		System.out.println("��ÿ� �����Ϸ�");
	}
	
	public boolean getRoomsStat() {
		gosiwon.getRooms();
		return false;
	}
}

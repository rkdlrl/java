import java.util.List;

public class Owner {
	Gosiwon gosiwon;
	public Owner() {	
	}

	public void setGosiwon(Gosiwon gosiwon) {
		this.gosiwon = gosiwon;
		System.out.println("고시원 세팅 완료");
	}

	public List<Room> showEmptyRoom() {
		return gosiwon.getEmptyRooms();
	}

	public void contractRoom(int myRoomNumber) {
		gosiwon.setRoomOwner(myRoomNumber);
	}

}

import java.util.List;

public class Owner {
	Gosiwon gosiwon;
	List<Room>emptyRooms;
	
	public Owner() {	
	}

	public void setGosiwon(Gosiwon gosiwon) {
		this.gosiwon = gosiwon;
		System.out.println("고시원 세팅 완료");
	}

	public Room showEmptyRoom() {
		emptyRooms = gosiwon.getEmptyRooms();		
		return emptyRooms.remove(0);
	}

	public Room showNextEmptyRoom() {
		return emptyRooms.remove(0);
	}

	public void contractRoom(int myRoomNumber) {
		gosiwon.setRoomOwner(myRoomNumber);

	}

}

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
		System.out.println("고시원아 빈 방 리스트를 넘겨줘");
		return gosiwon.getEmptyRooms();
	}

	public void contractRoom(Person person) {
		System.out.println("고시원아 방 주인을 설정해줘");
		gosiwon.setRoomOwner(person);
	}

}

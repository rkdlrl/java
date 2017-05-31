import java.util.ArrayList;
import java.util.List;

public class Gosiwon {
	private List<Room>rooms = new ArrayList<Room>();
	private int roomQuntity; //방 수량
	
	public Gosiwon(int roomQuntity) {
		System.out.println("고시원 생성");
		this.roomQuntity = roomQuntity;
		for(int i=1;i<=roomQuntity;i++)
			rooms.add(new Room(i));
		System.out.println("방 "+roomQuntity+"개 생성");
		setRoomFeature();
	}
	
	//임의로 특정 방의 특징 설정
	private void setRoomFeature() {
		rooms.get(4).setRoomSize(RoomSize.LARGE);
		rooms.get(4).setRoomWindow(true);
	}

	public List<Room> getEmptyRooms() {
		System.out.println("빈 방을 찾습니다.");
		List<Room>emptyRooms = new ArrayList<Room>();
		for(Room room : rooms)
			if(!(room.isRoomFUll()))
				emptyRooms.add(room);
		return emptyRooms;
	}

	public void setRoomOwner(Person person) {
		System.out.println("방아 입실 부탁해");
		rooms.get(person.getMyRoomNumber()-1).setRoomOwned(person);
	}

}

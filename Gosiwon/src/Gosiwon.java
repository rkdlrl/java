import java.util.ArrayList;
import java.util.List;

public class Gosiwon {
	private List<Room>rooms = new ArrayList<Room>();
	private int roomQuntity; //방 수량
	private String name = "gosiwon";
	public Gosiwon(int roomQuntity) {
		System.out.println(name+": 생성 완료");
		this.roomQuntity = roomQuntity;
		System.out.println(name+": 방 "+roomQuntity+"개 생성");
		for(int i=1;i<=roomQuntity;i++)
			rooms.add(new Room(i));
		setRoomFeature();
	}
	
	//임의로 특정 방의 특징 설정
	private void setRoomFeature() {
		rooms.get(4).setRoomSize(RoomSize.LARGE);
		rooms.get(4).setRoomWindow(true);
	}

	public List<Room> getEmptyRooms() {
		System.out.println(name+": 빈 방을 찾습니다.");
		List<Room>emptyRooms = new ArrayList<Room>();
		for(Room room : rooms)
			if(!(room.isRoomFUll()))
				emptyRooms.add(room);
		return emptyRooms;
	}

	public void setRoomOwner(Person person) {
		System.out.println(name+": 방아 입실 부탁해");
		rooms.get(person.getMyRoomNumber()-1).setRoomOwned(person);
	}

}

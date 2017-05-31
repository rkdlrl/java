import java.util.List;

public class Person {
	int myRoomNumber;
	
	public Person() {
		System.out.println("사람 생성 완료");
	}
	
	public void findMyRoom(Owner owner) {
		System.out.println("주인씨, 방을 보여주세요");
		List<Room> rooms = owner.showEmptyRoom();
		for(Room room : rooms) {
			if(preferRoomFeature(room))
				break;
		}
	}
	private boolean preferRoomFeature(Room room) {
		if(room.getRoomWindow() == true && room.getRoomSize() == RoomSize.LARGE) {
			myRoomNumber = room.getRoomNumber();
			System.out.println("사람 : "+myRoomNumber+"번 방이 맘에 드네요!");
			return true;
		}
		else return false;
	}
	public void contract(Owner owner) {
		System.out.println("계약할께요");
		owner.contractRoom(this);
	}

	public int getMyRoomNumber() {
		return myRoomNumber;
	}
}

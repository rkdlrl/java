
public class Room {
	private int roomNumber;
	private Person roomOwned = null;
	private boolean roomWindow = false;
	private RoomSize roomSize = RoomSize.SMALL;
	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
		System.out.println(+this.roomNumber+"번 방 생성 완료");
	}
	
	public boolean isRoomFUll() {
		if(roomOwned == null) return false;
		else return true;
	}

	//방을 계약함
	public void setRoomOwned(Person person) {
		roomOwned = person;
		System.out.println(roomNumber+"번 방 입실 완료");
	}
	
	public boolean getRoomWindow() {
		return roomWindow;
	}
	public void setRoomWindow(boolean b) {
		roomWindow = b;
	}
	
	public RoomSize getRoomSize() {
		return roomSize;
	}
	public void setRoomSize(RoomSize roomSize) {
		this.roomSize = roomSize;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
}

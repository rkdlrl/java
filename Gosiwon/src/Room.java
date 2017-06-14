
public class Room {
	private int roomNumber;
	private String name = "room";
	private String roomOwnedName = null;
	private boolean roomWindow = false;
	private RoomSize roomSize = RoomSize.SMALL;
	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
		System.out.println(name+": "+this.roomNumber+"번 방 생성 완료");
	}
	
	public boolean isRoomFUll() {
		if(roomOwnedName.equals(null)) return false;
		else return true;
	}

	//방을 계약함
	public void setRoomOwned(String personName) {
		roomOwnedName = personName;
		System.out.println(name+": "+roomNumber+"번 방 입실 완료");
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

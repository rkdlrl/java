
public class Room {
	private int roomNumber;
	private boolean roomOwned = false;
	
	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
		System.out.println(+this.roomNumber+"번 방 생성 완료");
	}
	
	public boolean isRoomFUll() {
		return this.roomOwned;
	}
	
	public int getRoomNumber() {
		return this.roomNumber;
	}
	//방을 계약함
	public void setRoomOwned() {
		roomOwned = true;
		System.out.println(roomNumber+"번 방 계약 완료");
	}
}

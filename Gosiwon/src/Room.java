
public class Room {
	private int roomNumber;
	private boolean roomOwned = false;
	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
		System.out.println("방번호: "+this.roomNumber+" 생성");
	}
	
	public boolean isRoomFUll() {
		return this.roomOwned;
	}
	public int getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomOwned() {
		roomOwned = true;
	}
}

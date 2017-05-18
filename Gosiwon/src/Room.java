
public class Room {
	private int roomNumber;
	private boolean roomStat = false;
	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
		System.out.println("방번호: "+this.roomNumber+" 생성");
	}
	
	public boolean isRoomFUll() {
		return this.roomStat;
	}
}


public class Room {
	private int roomNumber;
	private boolean roomStat = false;
	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
		System.out.println("���ȣ: "+this.roomNumber+" ����");
	}
	
	public boolean isRoomFUll() {
		return this.roomStat;
	}
}

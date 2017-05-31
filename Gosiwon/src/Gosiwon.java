import java.util.ArrayList;
import java.util.List;

public class Gosiwon {
	private List<Room>rooms = new ArrayList<Room>();
	private int roomQuntity;
	
	public Gosiwon(int roomQuntity) {
		System.out.println("고시원 생성");
		this.roomQuntity = roomQuntity;
		for(int i=1;i<=roomQuntity;i++)
			rooms.add(new Room(i));
		System.out.println("방 "+roomQuntity+"개 생성");
	}
	
	public List<Room> getEmptyRooms() {
		List<Room>emptyRooms = new ArrayList<Room>();
		for(int i =0;i<roomQuntity;i++) {
			if(rooms.get(i).isRoomFUll())
				emptyRooms.add(rooms.get(i));
		}
		return emptyRooms;
	}

	public void setRoomOwner(int myRoomNumber) {
		rooms.get(myRoomNumber-1).setRoomOwned();
	}

}

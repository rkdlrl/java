import java.util.ArrayList;
import java.util.List;

public class Gosiwon {
	private List<Room>rooms = new ArrayList<Room>();
	
	public Gosiwon() {
		System.out.println("고시원 생성");
		int i;
		for(i=1;i<=10;i++)
			rooms.add(new Room(i));
		System.out.println("room "+--i+"개 생성");
	}
	
	public List<Room> getRooms() {

		return rooms;
	}

}

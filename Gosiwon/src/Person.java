import java.util.List;

public class Person {
	int myRoomNumber;
	
	public Person() {
		System.out.println("사람 생성 완료");
	}
	
	public void findMyRoom(Owner owner) {
		List<Room> rooms = owner.showEmptyRoom();
		for(int i=0; i<rooms.size();i++) {
			//방를 고르는 기준
			if(rooms.get(i).getRoomNumber() == 5) {
				myRoomNumber = rooms.get(i).getRoomNumber();
				System.out.println("사람 : "+myRoomNumber+"번 방이 맘에 드네요!");
				break;
			}
			else
				rooms = owner.showEmptyRoom();
		}
	}
	
	public void contract(Owner owner) {
		System.out.println("계약할께요");
		owner.contractRoom(myRoomNumber);
	}
}

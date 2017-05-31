
public class Person {
	int myRoomNumber;
	
	public Person() {
		System.out.println("사람 생성 완료");
	}
	
	public void findMyRoom(Owner owner) {
		Room room = owner.showEmptyRoom();
		while(true) {
			//방를 고르는 기준
			if(room.getRoomNumber() == 105) {
				myRoomNumber = room.getRoomNumber();
				break;
			}
			else
				room = owner.showNextEmptyRoom();
		}
	}
	
	public void contract(Owner owner) {
		owner.contractRoom(myRoomNumber);
	}
}

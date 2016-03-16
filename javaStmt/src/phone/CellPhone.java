package phone;

public class CellPhone extends Phone {
	private boolean portable; // 이동성 존재
	private String move;

	public boolean isPortable() {
		return portable;
	}

	public void setPortable(boolean portable) {
		if (portable) {
			this.setMove("폰을 가지고 다닐 수 있음");
		} else {
			this.setMove("폰을 가지고 다닐 수 없음");
		}
		this.portable = portable;
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}
}

package switchcase;

public class Calc {
	String result;
	
	public void setResult(int a, String opcode, int b) {
		switch (opcode) {
		case "+":
			result = a + opcode + b + "=" + (a+b);
			break;
		case "-":
			result = a + opcode + b + "=" + (a-b);
			break;
		case "*":
			result = a + opcode + b + "=" + (a*b);
			break;
		case "/":
			if (b == 0) {
				result = "0으로 나눌 수 없습니다.";
				return;
			}

			result = a + opcode + b + " >> 몫 : " + (a/b) + ", 나머지 : " + (a%b);
			return;

		default:
			result = "연산기호를 잘못 입력";
			return;
		}
	}
	
	@Override
	public String toString() {
		return result;
	}
}

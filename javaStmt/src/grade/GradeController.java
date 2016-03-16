package grade;

import java.util.*;

public class GradeController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeServiceImpl service = new GradeServiceImpl();
		
		while (true) {
			System.out.print("[메뉴] 1.등록 2.수정 3.삭제 4.조회(전체) 5.조회(이름) 6.조회(학번) 7.회원수 0.종료 ");
			
			switch (scanner.nextInt()) {
			case 1:
				System.out.print("학번, 이름, 자바, SQL, JSP, 스프링 점수를 입력하세요 ");				
				service.input(new GradeBean(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
				break;
			case 2:
				System.out.print("수정하려는 성적표의 학번, 자바, SQL, JSP, 스프링 점수를 입력하세요 ");
				int hak = scanner.nextInt();
				String name = service.getNameByHak(hak);
				System.out.println(service.update(new GradeBean(hak, name, scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt())));
				break;
			case 3:
				System.out.print("학번을 입력하세요 ");
				System.out.println(service.delete(scanner.nextInt()));
				break;
			case 4:
				System.out.println(service.getList().size() == 0 ? "등록된 성적표가 없습니다." : service.getList());
				break;
			case 5:
				System.out.print("이름을 입력하세요 ");
				ArrayList<GradeBean> tempList = service.getGradesByName(scanner.next());
				System.out.println((tempList.size() != 0) ? tempList : "조회하려는 이름이 없습니다.");
				break;
			case 6:
				System.out.print("학번을 입력하세요 ");
				GradeBean temp = service.getGradeByHak(scanner.nextInt());
				System.out.println((temp != null) ? temp : "조회하려는 학번이 없습니다.");
				break;
			case 7:
				System.out.println(service.getCount());
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;

			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
		}
	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public void run() {

		System.out.println("==명언 앱 실행==");
		
		Scanner sc = new Scanner(System.in);
		
		int lastId = 0;

		List<WiseSaying> wiseSayings = new ArrayList<>();

		while (true) {
			System.out.println("명령어 ) ");
			String cmd = sc.nextLine();
			if (cmd.equals("종료")) {
				break;
			}

			if (cmd.equals("등록")) {
				int id = lastId + 1;
				System.out.println("명언 :");
				String wise = sc.nextLine();
				System.out.println("작가 :");
				String author = sc.nextLine();
				WiseSaying wiseSaying = new WiseSaying(id, wise, author);
				wiseSayings.add(wiseSaying);

				System.out.printf("%d번 명언이 등록되었습니다\n", id);
				lastId++;

			} else if (cmd.equals("목록")) {
				System.out.println("번호   /   작가   /   명언   ");
				if (wiseSayings.size() == 0) {
					System.out.println("명언이 존재하지 않습니다");
				} else {
					for (int i = wiseSayings.size() - 1; i >= 0; i--) {
						System.out.printf("%d   /   %s   /   %s\n", wiseSayings.get(i).getId(),
								wiseSayings.get(i).getAuthor(), wiseSayings.get(i).getWiseSaying());
					}
				}
			}else if (cmd.startsWith("수정")) {
				System.out.println("수정할 번호를 입력");
				String[] cmdbits = cmd.split("?",2);
				
				
				
				
			}else if (cmd.startsWith("삭제")) {
				
				String[] cmdbits = cmd.split("?",2);
				
				if (cmdbits.length == 1) {
					System.out.println("삭제할 명언의 번호를 입력");
				}
				
				int id = 0;
				
				try{
					id = Integer.parseInt(cmdbits[1]);
				}catch(Exception e){
					System.out.println("정수를 다시 입력해주세요");
					continue;
				}
				
			}else {
				System.out.println("잘못된 명령어 입니다");
			}

		}

		sc.close();
	}
}

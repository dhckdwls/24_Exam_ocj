import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	Scanner sc = new Scanner(System.in);

	public void run() {

		int lastId = 0;

		List<WiseSaying> wiseSayings = new ArrayList<>();
		System.out.println("==명언 앱 실행==");

		while (true) {
			
			System.out.println("명령어 ) ");
			String cmd = sc.nextLine();

			if (cmd.equals("종료")) {
				System.out.println("앱이 종료 되었습니다");
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
			} else if (cmd.startsWith("수정")) {
				System.out.println("수정");
			} 
			else if (cmd.startsWith("삭제")) {
				
				String[] cmdbits = cmd.split("\\?", 2);
				int deleteid = 0;

				if (cmdbits.length == 1) {
					System.out.println("삭제할 번호를 입력해주세요");
				} else if (cmdbits.length == 2) {
					try {
						deleteid = Integer.parseInt(cmdbits[1]);

					} catch (Exception e) {
						System.out.println("삭제할 정수를 입력해주세요");
					}
				}

				for (WiseSaying wisesaying : wiseSayings) {
					if (wisesaying.getId() == deleteid) {
						wiseSayings.remove(wisesaying);
					}
				}

				System.out.printf("%d번 명언이 삭제되엇습니다");

			} else {
				System.out.println("잘못된 명령어 입니다");
			}

		}

		sc.close();
	}
}

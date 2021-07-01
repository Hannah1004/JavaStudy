package quiz.d_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class D07_PhoneBook {
	Scanner scan;
	HashMap<String, HashMap<String, D07_Info>> phoneBook;
	
	D07_PhoneBook(){
		scan = new Scanner(System.in);
		phoneBook = new HashMap<>();
		phoneBook.put("모임", new HashMap());
		phoneBook.put("직장", new HashMap());
		phoneBook.put("친구", new HashMap());
		
		
	}
	
	void makeGroup() {
		String group=null;
		scan = new Scanner(System.in);
		System.out.println("추가하실 그룹명을 입력해 주세요");
		System.out.println("현재 그룹:"+phoneBook.keySet());
		while(true) {
			group = scan.nextLine();
			if(phoneBook.keySet().contains(group)) {
				System.out.println("이미 존재하는 그룹명입니다. 다시 입력해주세요.");
			}else {
				break;
			}
			
		}
		phoneBook.put(group, new HashMap());
	}
	
	void addFriend() {
		HashMap<String, D07_Info> info = phoneBook.get("친구");
		info.put("010-1234-7584", new D07_Info("홍길동",30,"남"));
		info.put("010-2345-1384", new D07_Info("강감찬",20,"남"));
		info.put("010-5678-4971", new D07_Info("가영",17,"여"));
		
		info = phoneBook.get("직장");
		info.put("010-1593-1358", new D07_Info("하니",3,"여"));
		info.put("010-7814-9841", new D07_Info("강감찬",12,"남"));
		info.put("010-3581-3215", new D07_Info("하하",7,"남"));
		
		info = phoneBook.get("모임");
		info.put("010-1470-4593", new D07_Info("나기",4,"여"));
		info.put("010-6574-6491", new D07_Info("하나",42,"여"));
		info.put("010-1585-9981", new D07_Info("철수",33,"남"));
	}
	
	void addPhoneNumber() {
		scan = new Scanner(System.in);
		HashMap<String, D07_Info> info;
		
		System.out.println("번호를 추가하실 그룹명을 입력해 주세요:");
		System.out.println("현재 그룹:"+phoneBook.keySet());
		String group = scan.nextLine();
		info = phoneBook.get(group);
		
		System.out.println("추가하실 번호를 입력해주세요");
		String phone = scan.nextLine(); 
		
		System.out.println("추가 정보를 입력해 주세요(이름/ 나이/ 성별)");
		String name = scan.nextLine();
		int age = scan.nextInt();
		String gender = scan.next();
		
		info.put(phone, new D07_Info(name,age,gender));
	}
	
	void phoneView() {
		for(Entry<String, HashMap<String, D07_Info>> entry : phoneBook.entrySet()) {
			System.out.print(entry.getKey()+"\t");
			System.out.println(entry.getValue());
		}
	}
	

	void sortPhone() {
		System.out.println("정렬기준을 입력해주세요:(나이,이름,성별)");
		new D07_Info().sort = scan.next();
		System.out.println("원하는 방향을 입력해주세요:(오름차,내림차)");
		new D07_Info().sortWay = scan.next();
		
		HashMap<String, D07_Info> info = new HashMap<>();

		for(Entry<String, HashMap<String, D07_Info>> entry : phoneBook.entrySet()) {
			info.putAll(entry.getValue());			
		}
		
		ArrayList<Map.Entry<String, D07_Info>> entryList = new ArrayList<>(info.entrySet());
		entryList.sort(Map.Entry.comparingByValue());	
		for(Map.Entry<String, D07_Info> entry2 : entryList) {
			System.out.println(entry2.getValue()+" 번호: "+entry2.getKey() );

		}
	}
	
	void selectPhoneView() {		
		System.out.println("검색하고 싶은 이름의 일부를 입력해 주세요:");
		String name = scan.next();
		
		HashMap<String, D07_Info> info;
		ArrayList<String> number;
		ArrayList<D07_Info> list;
		
		for(Entry<String, HashMap<String, D07_Info>> entry : phoneBook.entrySet()) {
			info = entry.getValue();
			number = new ArrayList<>(info.keySet());
			list = new ArrayList<>(info.values());
			for(int i=0; i<list.size();i++) {
				if(list.get(i).name.contains(name)) {
					System.out.print("그룹:"+entry.getKey());
					System.out.print(list.get(i));
					System.out.println(" 번호:"+number.get(i));
				}
			}
		}
	}	
	
	void searchNum() {
		System.out.println("검색하고 싶은 번호의 일부를 입력해 주세요:");
		String search = scan.next();
		
		HashMap<String, D07_Info> info;
		ArrayList<String> number;
		ArrayList<D07_Info> list;
		
		for(Entry<String, HashMap<String, D07_Info>> entry : phoneBook.entrySet()) {
			info = entry.getValue();			
			list = new ArrayList<>(info.values());
			number = new ArrayList<>(info.keySet());
			for(int i=0; i<list.size();i++) {
				if(number.get(i).contains(search)) {
					System.out.print("그룹:"+entry.getKey()+" ");
					System.out.print(list.get(i));
					System.out.println(" 번호:"+number.get(i));
				}
			}
		}
	}
	
	void startAddPhone() {
		addFriend();
		while(true) {
			System.out.println("그룹을 추가하시려면 1번 번호를 저장하시려면 2번 현재 저장된 번호를 보시려면 3번 그만하시려면 0번을 입력해주세요.");
			int num = scan.nextInt();
			if(num==1) {
				makeGroup();
			}else if(num==2) {
				addPhoneNumber();
			}else if(num==3) {
				System.out.println("정렬된 목록을 보시려면 1번 이름의 일부분만 입력하려면 2번 전화번호의 일부를 입력하려면 3번을 입력해주세요.");
				int select = scan.nextInt();
				if(select==1) {
					sortPhone();
				}else if(select==2) {
					selectPhoneView();
				}else if(select==3) {
					searchNum();
				}
			}else {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		D07_PhoneBook pb = new D07_PhoneBook();
		pb.startAddPhone();

	}
}









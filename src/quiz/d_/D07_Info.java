package quiz.d_;

public class D07_Info implements Comparable<D07_Info> {
	String name;
	int age;
	String gender;
	static String sort = "이름";
	static String sortWay = "오름차";
	
	D07_Info(){
		
	}
	
	D07_Info(String name, int age, String gender){
		this.name= name;
		this.age = age;
		this.gender= gender;
	}
	
	public String toString() {
		return String.format(" 이름:%s 나이:%d 성별:%s",this.name,this.age,this.gender);
	}

	@Override
	public int compareTo(D07_Info o) {
		if(sort.equals("나이")&&sortWay.equals("오름차")) {
			return Integer.compare(age, o.age) !=0?
				Integer.compare(age, o.age) : this.name.compareTo(o.name);
		}else if(sort.equals("나이")&&sortWay.equals("내림차")) {
			return Integer.compare(o.age, age) !=0?
					Integer.compare(o.age, age) : this.name.compareTo(o.name);
		}else if(sort.equals("이름")&&sortWay.equals("오름차")) {
			return this.name.compareTo(o.name) !=0?
					this.name.compareTo(o.name) : Integer.compare(age, o.age);
		}else if(sort.equals("이름")&&sortWay.equals("내림차")) {
			return o.name.compareTo(this.name) !=0?
					o.name.compareTo(this.name) : Integer.compare(age, o.age);
		}else if(sort.equals("성별")&&sortWay.equals("오름차")){
			return this.gender.compareTo(o.gender) !=0?
					this.gender.compareTo(o.gender) : Integer.compare(age, o.age);
		}else {
			return o.gender.compareTo(this.gender) !=0?
					o.gender.compareTo(this.gender) : Integer.compare(age, o.age);
		}
	}
}

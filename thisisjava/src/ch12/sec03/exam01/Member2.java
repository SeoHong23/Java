package ch12.sec03.exam01;

public class Member2 {
	public String id;
	
	public Member2(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2 terget) {
			if(id.equals(terget.id)) {
				return true;
			}
		}
		return false;
	}

}

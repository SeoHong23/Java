package sub3;

public class User2VO {
	
	private String uid; 
	private String name; 
	private String brith; 
	private String addr;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrith() {
		return brith;
	}
	public void setBrith(String brith) {
		this.brith = brith;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "User2VO [uid=" + uid + ", name=" + name + ", brith=" + brith + ", addr=" + addr + "]";
	} 
		
	
	
	}



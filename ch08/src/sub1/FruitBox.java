package sub1;

public class FruitBox<T> {	// 치환변수T선언
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
		
	}



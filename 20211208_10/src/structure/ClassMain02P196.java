package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		Car a = new Car();
		a.model = "Tesla model X";
		a.price = 13999;
		a.owner = "신은택";
		a.getInfo();
		
		Car b = new Car();
		b.model = "Tesla model S";
		b.price = 12999;
		b.owner = "강태양";
		b.getInfo();
	}

}

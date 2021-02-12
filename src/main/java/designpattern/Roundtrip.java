package designpattern;

import java.util.function.Consumer;

public class Roundtrip implements checkavail{


	

	@Override
	public void avail(String orgin, String dest) {
		// TODO Auto-generated method stub
		prerequest(s->demo());
		System.out.println("roundtrip");
		
	}
	
	public void prerequest(Consumer<Roundtrip> consumer) {
		System.out.println("pre request successfull");
		consumer.accept(this);
		System.out.println("i am done");
		
	}
	
	public void demo() {
		System.out.println("demo");
		
	}

}

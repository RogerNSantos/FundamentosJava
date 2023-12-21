package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		
		//byte
		Byte b = 100;
		Short s = 1000;
		
		//Interger.parseInt(entrada.next());
		Integer i = 10000;//int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 5);
		System.out.println(l / 2);
		
		Float f = 246.20F;
		System.out.println(f);
		
		Double d = 2468.6789;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "!!!!");
		
	}

}

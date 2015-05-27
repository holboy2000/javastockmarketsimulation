package ver1;

import ver1dec.dec;


public class test {
	int pi=314;
	public static void
	main(String[] args) throws ClassNotFoundException
	{
		Class.forName("ver1dec.dec");
		int i=0;
		i=dec.pi;
		System.out.println(i);
	}
}

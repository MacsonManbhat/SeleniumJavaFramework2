package Demo;

import java.rmi.MarshalException;

public class exceptionthrow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		gatsy();

	}
	public static void gatsy()	throws Exception{
		
		System.out.println("This is the best method ever");
		int j = 00/0;
		System.out.println(j);
		throw new MarshalException ("This is not a valid exception");
		
	} };
class ChainExceptionDemo{
	static void  demoProcess(){
		NullPointerException  = new NullPointerException("Top Layer");
		e.initCause(new ArithmeticException("cause"));
		throw e;
	}
}

public static void main(String[] args){
	try{
		demoProcess();
	}catch(NullPointerException e){
		System.out.println("Caught : "+e);
		System.out.println("Original Cause : "+e.getCause());
	}
}
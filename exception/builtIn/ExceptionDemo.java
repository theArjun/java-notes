class ExceptionDemo{
	static void compute(int n) throws MyException{
		if(n > 10){
			throw new MyException(n);
		}
	}
	public static void main(String[] args){
		try{
			compute(1);
			compute(20);
		}catch(MyException errorMessage){
			System.out.println("Caught : "+errorMessage.getMessage()); // Inherited Method from Throwable class
		}
	}
}
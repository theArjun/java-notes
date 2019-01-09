// Creating own Exception SubClasses

class MyException extends Exception{
	private int detail;
	MyException(int a){
		this.detail = a;
	}
	public String toString(){
		return "MyException["+detail+"]";
	}
	// Overriding of toString() is optional and also constructor is optional.
}
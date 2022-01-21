public class Stack {
	private int[] stack;
	private static int tos;

	Stack() {
		stack = new int[5];
		tos = -1;
	}

	public boolean isEmpty() {
		if (tos < 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (tos >= 5) {
			return true;
		} else {
			return false;
		}
	}

	public boolean push(int data) {
		if (!isFull()) {
			stack[++tos] = data;
			System.out.println("Data pushed : " + data);
			return true;
		}
		return false;
	}

	public int pop() {
		if (!isEmpty()) {
			int data = stack[tos--];
			System.out.println("Data popped : " + data);
			return data;
		}
		return -1;
	}

	public void display() {
		if(!isEmpty()){
            System.out.print("Elements in Stack : [ ");
			for (int i = 0; i <= 5; i++) {
				System.out.print(stack[tos] + " ");
            }
            System.out.print("]\n");
		}else{
			System.out.println("Empty\n");
		}
	}
}



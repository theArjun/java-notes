class Exam{
    public static void main(String[] args){
        int percentage = 59;

        if(percentage<100 && percentage>0){
            if(percentage >= 80){
                System.out.println("Distinction\n");
            }
            else if(percentage >= 60){
                System.out.println("First Division\n");
            }
            else if(percentage >= 50){
                System.out.println("Second Division\n");
            }
            else if(percentage >= 40){
                System.out.println("Third Division\n");
            }
            else{
                System.out.println("Fail");
            }
        }else{
            System.out.println("Enter a valid percentage.\n");
        }
    }
}
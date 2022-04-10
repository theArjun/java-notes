interface Exam {
    public boolean pass(int average);
}

interface Classify {
    public String division(int average);
}

public class Result implements Exam, Classify {
    public boolean pass(int average) { // Interface implement garda method ko agadi jahile pani public rakhne natra "attempting to assign weaker access privileges; was public" error message aaucha.
        if (average > 50) {
            return true;
        } else {
            return false;
        }
    }

    public String division(int average) {
        if (average > 80) {
            return "First Division";
        } else if (average > 50) {
            return "Second Division";
        } else {
            return "No Division";
        }
    }
}

class ResultDemo {
    public static void main(String[] args) {
        Result resultObj = new Result();
        int average = 45;
        boolean pass = resultObj.pass(average);
        String div = resultObj.division(average);
        System.out.println("Pass : " + pass + "\nDivision : " + div);
    }
}
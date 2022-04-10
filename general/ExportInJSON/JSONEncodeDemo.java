// ClassPath is set for this class.
import org.json.simple.JSONObject;

class JSONEncodeDemo {
    public static void main(String[] args) {
        // Creating a object of JSONObject Class.
        JSONObject objectOne = new JSONObject();

        // Key and values are passed in put() method
        objectOne.put("name", "arjun");
        objectOne.put("rollno", new Integer(6));
        objectOne.put("percentage", new Double(70.6));
        objectOne.put("isGraduated", new Boolean(false));

        System.out.println(objectOne);
    }
}

import java.io.*;
import org.json.simple.JSONObject;

class ExportInJSON{

    // FileNotFoundException may arise.
    public static void main(String[] args) throws FileNotFoundException{
        JSONObject objectOne = new JSONObject();

        // Key and values are passed in put() method
        objectOne.put("name", "arjun");
        objectOne.put("rollno", new Integer(6));
        objectOne.put("percentage", new Double(70.6));
        objectOne.put("isGraduated", new Boolean(false));

        // Content of objectOne is converted into String.
        String jsonContent = objectOne.toString();
        // String content is written into .json file.
        PrintWriter pw = new PrintWriter("exportedJSON.json");
        pw.write(jsonContent);
        pw.flush();
        pw.close();
    }
}
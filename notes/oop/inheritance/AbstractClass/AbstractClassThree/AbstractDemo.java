class AbstractDemo{
    public static void main(String[] args){
        // Creating objects of various Phones.
        Iphone iPhoneObject = new Iphone();
        Huawei huaweiObject = new Huawei();

        // Calls static show function which displays the configuration irrespective of their types; Abstract superclass is used.
        show(iPhoneObject);
        show(huaweiObject);
    }

    public static void show(Phone object){
        object.showConfig();
    }
}
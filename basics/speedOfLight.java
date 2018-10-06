class SpeedOfLight{
    public static void  main(String args[]){
        int lightSpeed;
        int days;
        long seconds; // int can't hold the value here. 
        long distance;  // int can't hold the value here. 

        // approximate speed of light in miles per second
        lightSpeed = 186000;

        days=1000;

        seconds = days*86400;

        distance = lightSpeed*seconds;

        System.out.println("In "+ days+ " days light will travel about "+distance + " miles.");

    }
}
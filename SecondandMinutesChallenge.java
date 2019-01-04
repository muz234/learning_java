public class SecondandMinutesChallenge {
    public static void  main  (String [] args){
        System.out.println(getDuration(65, 45));
        System.out.println(getDuration(3945L));
    }
    private static String getDuration(long min, long second){
        if ((min < 0) || (second < 0) || (second >59)){
            return "invalid value";
        }
        long hrs = min /60;
        long remaing_min = min % 60;
        return hrs + "H " + remaing_min + "m " + second + "s";
    }
    private static String getDuration(long second){
        if (second < 0){
            return"Invalid value";
        }
        long min = second/60;
        long remaing_sec = second&60;
        return getDuration(min,remaing_sec);
    }
}

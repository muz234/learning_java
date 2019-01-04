public class has_teen {
    public static void  main(String [] args){
        hasTeen(11,13,20);
    }

    public static boolean hasTeen(int teen1, int teen2, int teen3){
        if (teen1 >= 13 && teen1 <= 19){
            return true;
        }
        else if (teen2 >= 13 && teen2 <= 19){
            return true;
        }
        else if (teen3 >= 13 && teen3 <= 19){
            return true;
        }
        else {
            return false;
        }
    }
}

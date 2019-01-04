
public class barking_time {
    public static void main(String[] args) {
        bark(true,-1);
    }

        public static boolean bark(boolean barking, int hourOfDay) {

            if (barking) {
                if ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 24))
                return true;
            }
            return false;
        }
}


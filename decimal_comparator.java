public class decimal_comparator {
    public static void main(String[] args){
        areEqualByThreeDecimalPlaces(3.987, 3.987);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int num_1 = (int) (num1 *1000);
        int num_2 = (int) (num2 * 1000);
        if (num_1 == num_2){
          return true;
        }
        else {return false;}
    }
}


public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }
        public static void printMegaBytesAndKiloBytes(int kilobytes){
         if (kilobytes < 0){
         System.out.println("invalid value");

            }
        else if (kilobytes > 0) {
         int mb = kilobytes / 1024;
         int kb = kilobytes - (mb * 1024);

        System.out.println(kilobytes + "kb" + "  = " + mb + "mb  and " + kb + "kb");
        }
        else {
            System.out.println("invalid value" );
         }
        }
}

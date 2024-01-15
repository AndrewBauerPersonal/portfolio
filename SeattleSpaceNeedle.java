public class SeattleSpaceNeedle {
   public static void main(String[] args ) {
      antenna();
      haloTop();
      haloCenter();
      haloBottom();
      antenna(); // this part has the same output as the antenna
      elevator();
      haloTop(); // the top of the base has the same output as the top of the halo
      haloCenter(); // the bottom of the base has the same output as the center of the halo
   }

   public static final int SCALE = 4;

   //Print the antenna of the needle
   public static void antenna () {
      for(int i = 1; i <= SCALE; i++) {
          for(int j = 1; j <= 3 * SCALE; i++) {
              System.out.print(" ");
          }
          System.out.print("||");
          System.out.println();
      }
   }

   //Print the top of the halo
   public static void haloTop() {
      for(int i = 1; i <= SCALE; i++) {
         for(int j = 1; j <= -3 * i + SCALE * 3 ; j++) {
            System.out.print(" ");
         }
         System.out.print("__/");
         for(int colon = 1; colon <= 3 * i - 3; colon++){
             System.out.print(":");
         }
         System.out.print("||");
         for(int colon = 1; colon <= 3 * i - 3; colon++) {
            System.out.print(":");
         }
         System.out.print("\\__");
         System.out.println();
      }
   }

   //Print the center of the halo
   public static void haloCenter() {
      System.out.print("|");
      for(int quotationmark = 1; quotationmark <= SCALE * 6; quotationmark++) {
         System.out.print("\"");
      }
      System.out.print("|");
      System.out.println();
   }

   //Print the bottom of the halo
   public static void haloBottom() {
      for(int i = 1; i <= SCALE; i++) {
          for(int j = 1; j <= 2 * i - 2; j++) {
              System.out.print(" ");
          }
          System.out.print("\\_");
          for(int h = 1; h <= -2 * i + (3 * SCALE + 1); h++) {
              System.out.print("/\\");
          }
          System.out.print("_/");
          System.out.println();
      }
   }

   //Print the elevator of the needle
   public static void elevator() {
     for(int i = 1; i <= SCALE * SCALE; i++) {
         for(int j  = 1;  j <= 2 * SCALE + 1; j++) {
         System.out.print(" ");
         }
         System.out.print("|");
         for(int per = 1; per <= SCALE - 2; per++) {
            System.out.print("%");
         }
         System.out.print("||");
         for(int per = 1; per <= SCALE - 2; per++) {
            System.out.print("%");
         }
         System.out.print("|");
         System.out.println();
      }
   }
}

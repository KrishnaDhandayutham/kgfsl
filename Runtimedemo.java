public class Runtimedemo {

   public static void main(String[] args) {
      try {

       
         String[] cmdArray = new String[2];

      
         cmdArray[0] = "notepad.exe";

         
         cmdArray[1] = "Anonymous.txt";

        
         System.out.println("Executing notepad.exe and opening example.txt");

         
         Process process = Runtime.getRuntime().exec(cmdArray);

   
         System.out.println("example.txt should now open.");
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}

public class HewanDarat implements AdvanceHabitatHewan{
   //Method yang akan mengoverride method yang ada pada class AdvancedHabitatHewan
   @Override
   public void Darat(String namaHewan) {
      System.out.println("Hewan yang Tinggal di darat adalah: "+ namaHewan);		
   }
   //Method yang akan mengoverride method yang ada pada class AdvancedHabitatHewan
   @Override
   public void Air(String namaHewan) {
      //do nothing
   }
}
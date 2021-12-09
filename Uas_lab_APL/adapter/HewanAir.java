public class HewanAir implements AdvanceHabitatHewan{
//Method yang akan mengoverride method yang ada pada class AdvancedHabitatHewan
   @Override
   public void Darat(String namaHewan) {
      //do nothing
   }
//Method yang akan mengoverride method yang ada pada class AdvancedHabitatHewan
   @Override
   public void Air(String namaHewan) {
      System.out.println("Hewan yang tiggal di air adalah : "+ namaHewan);		
   }
}
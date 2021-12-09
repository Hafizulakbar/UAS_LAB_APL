public class HabitatAdapter implements Habitat {

   AdvanceHabitatHewan AdvanceHewan;

   //Method yang melakukan mengecekan apakan termasuk ke darat atau air
   public HabitatAdapter(String typeHabitat){
   
      if(typeHabitat.equalsIgnoreCase("darat") ){
         AdvanceHewan = new HewanDarat();			
         
      }else if (typeHabitat.equalsIgnoreCase("air")){
         AdvanceHewan = new HewanAir();
      }	
   }
   //Method yang akan mengoverride method yang ada pada class habitat
   @Override
   public void pilihan(String typeHabitat, String namaHewan) {
   
      if(typeHabitat.equalsIgnoreCase("darat")){
         AdvanceHewan.Darat(namaHewan);
      }
      else if(typeHabitat.equalsIgnoreCase("air")){
         AdvanceHewan.Air(namaHewan);
      }
   }
}
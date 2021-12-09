public class Hewan implements Habitat {
   HabitatAdapter habitatAdapter; 
   //Method yang akan mengoverride method yang ada pada class habitat

   @Override
   public void pilihan(String typeHabitat, String namaHewan) {		

      
      //HabitatAdapter is providing support to Pilihan other file formats
      if(typeHabitat.equalsIgnoreCase("darat") || typeHabitat.equalsIgnoreCase("air")){
         habitatAdapter = new HabitatAdapter(typeHabitat);
         habitatAdapter.pilihan(typeHabitat, namaHewan);
      }
      
      else{
         System.out.println("Invalid media. " + typeHabitat + " format not supported");
      }
   }   
}
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      System.out.println("Selamat Datang di program memilih habitat");

      System.out.println("Pilih Habitat");
      System.out.println("- Air");
      System.out.println("- Darat");
      System.out.println("--------------------");
      Scanner in = new Scanner(System.in);
      System.out.print("Input Habitat : ");
      String habitat = in.next();
      System.out.println("--------------------");
      System.out.println("Habitat Yang dipilih : " + habitat);

      Hewan hewan = new Hewan();
      HabitatHewan h = null;
      h = new HabitatHewan();

      if( "Air".equalsIgnoreCase(habitat)){
         h.setHabitatMethod(new HabitatAir());
         h.pilihanHewan();
         hewan.pilihan("Air", "ikan cupang");

      }else if("Darat".equalsIgnoreCase(habitat)){
         h.setHabitatMethod(new HabitatDarat());
         h.pilihanHewan();
         hewan.pilihan("Darat", "tapir");
      }
   }
}
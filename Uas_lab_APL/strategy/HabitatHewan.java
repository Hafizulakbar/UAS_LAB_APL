public class HabitatHewan{
    //Mendelkarasikan sebuah variabel HabitatMethod
    private HabitatMethod HabitatMethod;
    //Method untuk merubah metode dalam habitat
    public void setHabitatMethod(HabitatMethod habitat){
        this.HabitatMethod = habitat;
    }
    //Method untuk merubah metode dalam habitat
    public HabitatMethod getHabitatMethod(){
        return HabitatMethod;
    }
    //Method untuk melakukan pilihanHewan dengan metode yang dipilih
    public void pilihanHewan(){
        HabitatMethod.pilihanHewan();
    }
}
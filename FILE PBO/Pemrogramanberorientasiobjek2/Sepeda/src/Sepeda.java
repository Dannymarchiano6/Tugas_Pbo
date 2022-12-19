public class Sepeda{
    private int jarakTempuh = 0;

    //jarak tempuh awal adalah 0

    public void laju(){
        //tambahkan jarak tempuh sebesat 1 km
        jarakTempuh = jarakTempuh + 1;
    }

    public void berhent(){
        //tidak menambhkan jarak tempuh
    }
    public void munduer(){
        jarakTempuh = jarakTempuh - 1;
    }
    public int 
    getjarakTempuh(){
        return jarakTempuh;
    }
}
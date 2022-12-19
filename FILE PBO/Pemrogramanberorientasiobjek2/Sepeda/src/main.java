public class main {
    public static void main(String[] args) {
        Sepeda sepedaSaya = new Sepeda();

        // sepeda melaju sejauh 1 km
        sepedaSaya.laju();

        //sepeda berhenti
        sepedaSaya.berhent();

        //sepedasaya mundur sejauh 1 km
        sepedaSaya.munduer();

        //cetak jarak tempuh
        System.out.println(" Jarak tempuh sepeda saya : " + sepedaSaya.getjarakTempuh() + "km" );
    }
}

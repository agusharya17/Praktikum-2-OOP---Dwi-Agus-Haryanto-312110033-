package personal.person;

public class PersonAKTIF{
    public static void main(String[] args) {
    Person Anton  = new Person ();
    /* memanggil atribut dan memberi nilai */
    
    Anton.setNama("Anton");
    Anton.setJenisKelamin("Pria");
    Anton.setUmur(23);
    System.out.println("Nama         : " + Anton.getNama());
    System.out.println("JenisKelamin : " + Anton.getJenisKelamin());
    System.out.println("Umur         : " + Anton.getUmur());
    System.out.println("                       ");
    
    Person Riko = new Person ();
    Riko.setNama("Riko");
    Riko.setJenisKelamin("Pria");
    Riko.setUmur(27);
    System.out.println("Nama         : " + Riko.getNama());
    System.out.println("JenisKelamin : " + Riko.getJenisKelamin());
    System.out.println("Umur         : " + Riko.getUmur());
    
    }
    }
class Person {
    String nama;
    int umur;

    // Konstruktor
    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode kelas induk
    public void perkenalanDiri() {
        System.out.println("Halo, nama saya " + nama + ", saya berumur " + umur + " tahun.");
    }
}

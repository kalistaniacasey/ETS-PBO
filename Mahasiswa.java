class Mahasiswa extends Person {
    String NRP;
    String jurusan;

    // Konstruktor untuk kelas turunan
    public Mahasiswa(String nama, int umur, String NRP, String jurusan) {
        super(nama, umur);
        this.NRP = NRP;
        this.jurusan = jurusan;
    }

    // Metode khusus untuk kelas turunan
    public void tampilkanInfoMahasiswa() {
        System.out.println("Nama: " + nama + ", NRP: " + NRP + ", Jurusan: " + jurusan);
    }
}

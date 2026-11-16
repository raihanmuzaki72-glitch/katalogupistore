package model;

public class Produk {

    private long id;
    private String nama;
    private long harga;
    private String foto;

    public Produk(long id, String nama, long harga, String foto) {
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama produk wajib diisi.");
        }
        if (harga <= 0) {
            throw new IllegalArgumentException("Harga harus lebih dari nol.");
        }
        if (foto == null || foto.isBlank()) {
            throw new IllegalArgumentException("Pilih foto produk.");
        }
        this.id = id;
        this.nama = nama.trim();
        this.harga = harga;
        this.foto = foto;
    }

    public Produk(String nama, long harga, String foto) {
        this(0, nama, harga, foto);
    }

    public long getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama produk wajib diisi.");
        }
        this.nama = nama.trim();
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        if (harga <= 0) {
            throw new IllegalArgumentException("Harga harus lebih dari nol.");
        }
        this.harga = harga;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        if (foto == null || foto.isBlank()) {
            throw new IllegalArgumentException("Pilih foto produk.");
        }
        this.foto = foto;
    }
}

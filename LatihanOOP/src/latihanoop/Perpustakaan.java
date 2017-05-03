package latihanoop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
   
/**
 * Created by yudiwbs & masayu on 11/04/2017.
 *  method yang harus dilengkapi 4: printDaftarSemuaBuku, cariBukuDenganId, tambahPeminjam, laporanPeminjam
 */
public class Perpustakaan {

    //id buku dan bukunya
    private HashMap<Integer,Buku> daftarBuku = new HashMap<>();
    //id peminjam dan peminjamnya
    private HashMap<Integer,Peminjam> daftarPeminjam = new HashMap<>();

    //jangan diedit
    public void loadBuku() {
        Pengarang ahmad = new Pengarang(1,"Ahmad");
        Pengarang elfan = new Pengarang(2,"Elfan");
        Pengarang rini = new Pengarang(3,"Rini");

        Buku b = new Buku(ahmad,1,"Diatas langit ada langit");
        daftarBuku.put(b.id,b);
        b = new Buku(ahmad,2,"Uang logam menggelinding");
        daftarBuku.put(b.id,b);
        b = new Buku(elfan,3,"Makan nasi dengan lauk");
        daftarBuku.put(b.id,b);
        b = new Buku(elfan,4,"Rajin pangkal pandai");
        daftarBuku.put(b.id,b);
        b = new Buku(rini,5,"Minum jika haus");
        daftarBuku.put(b.id,b);
        b = new Buku(rini,6,"Makan jika lapar");
        daftarBuku.put(b.id,b);
    }


    //lengkapi
    public void printDaftarSemuaBuku() {
        for (Map.Entry<Integer, Buku> entry : daftarBuku.entrySet()) {
            Integer key = entry.getKey();
            Buku value = entry.getValue();
            value.print();
        }
    //f.s: menampilkan daftar semua buku dengan memanggil buku.print()
    }
    

    //lengkapi
    //input id buku, retur objek bukunya
    //jika tidak ada akan menghasilkan null
    public Buku cariBukuDenganId(int idBuku) {
        Buku cari = null;
        for (Map.Entry<Integer, Buku> entry : daftarBuku.entrySet()) {
            Integer key = entry.getKey();
            Buku value = entry.getValue();
            if (entry.getKey() == idBuku) {
                cari=value;
            }
        }
        return cari;
    }
    //lengkapi
    //tambahankan peminjam ke daftarPeminjam
    public void tambahPeminjam(Peminjam p) {
        daftarPeminjam.put(p.id, p);
        }
    


    //lengkapi
    //print status peminjam
    //untuk mengetahui ukuran, gunakan size()
    public void laporanPeminjam() {
    System.out.println("Jumlah peminjam :" +daftarPeminjam.size());
      for(Peminjam minjam : daftarPeminjam.values()){
          minjam.print();
      }
    }

    //jangan edit
    //output yg harus dihasilkan:
    /*

==========================
Print buku:
== Info Pengarang ==
id &  nama pengarang: (1) Ahmad
==Info Buku==
id buku:1
Judul buku:Diatas langit ada langit
== Info Pengarang ==
id &  nama pengarang: (1) Ahmad
==Info Buku==
id buku:2
Judul buku:Uang logam menggelinding
== Info Pengarang ==
id &  nama pengarang: (2) Elfan
==Info Buku==
id buku:3
Judul buku:Makan nasi dengan lauk
== Info Pengarang ==
id &  nama pengarang: (2) Elfan
==Info Buku==
id buku:4
Judul buku:Rajin pangkal pandai
== Info Pengarang ==
id &  nama pengarang: (3) Rini
==Info Buku==
id buku:5
Judul buku:Minum jika haus
== Info Pengarang ==
id &  nama pengarang: (3) Rini
==Info Buku==
id buku:6
Judul buku:Makan jika lapar

==========================
Hasil pencarian buku id=2:
== Info Pengarang ==
id &  nama pengarang: (1) Ahmad
==Info Buku==
id buku:2
Judul buku:Uang logam menggelinding

==========================
Info Peminjam:
id:123
nama:Fulan
Buku yang dipinjam:
== Info Pengarang ==
id &  nama pengarang: (1) Ahmad
==Info Buku==
id buku:2
Judul buku:Uang logam menggelinding
Jumlah buku yg dipinjam:1

==========================
Laporan Peminjam:
Jumlah peminjam:3
id:333
nama:Rudi 
Buku yang dipinjam:
Jumlah buku yg dipinjam:0
id:123
nama:Fulan
Buku yang dipinjam:
== Info Pengarang ==
id &  nama pengarang: (1) Ahmad
==Info Buku==
id buku:2
Judul buku:Uang logam menggelinding
Jumlah buku yg dipinjam:1
id:555
nama:Wati 
Buku yang dipinjam:
== Info Pengarang ==
id &  nama pengarang: (3) Rini
==Info Buku==
id buku:5
Judul buku:Minum jika haus
== Info Pengarang ==
id &  nama pengarang: (3) Rini
==Info Buku==
id buku:6
Judul buku:Makan jika lapar
Jumlah buku yg dipinjam:2

     */
    public static void main(String[] args) {

        //test buku load
        Perpustakaan perpus = new Perpustakaan();
        perpus.loadBuku();
        System.out.println("==========================");
        System.out.println("Print buku:");
        perpus.printDaftarSemuaBuku();

        //test pencarian
        Buku b = perpus.cariBukuDenganId(2);
        System.out.println();
        System.out.println("==========================");
        System.out.println("Hasil pencarian buku id=2:");
        b.print();

        //test peminjam
        Peminjam p = new Peminjam(123, "Fulan");
        //pinjam buku
        Buku bPinjam = perpus.cariBukuDenganId(2);
        p.pinjam(bPinjam);
        System.out.println();
        System.out.println("==========================");
        System.out.println("Info Peminjam:");
        p.print();
        perpus.tambahPeminjam(p);
        p = new Peminjam(333, "Rudi ");
        perpus.tambahPeminjam(p);

        p = new Peminjam(555, "Wati ");
        bPinjam = perpus.cariBukuDenganId(5);
        p.pinjam(bPinjam);
        bPinjam = perpus.cariBukuDenganId(6);
        p.pinjam(bPinjam);
        perpus.tambahPeminjam(p);

        //test laporan
        System.out.println();
        System.out.println("==========================");
        System.out.println("Laporan Peminjam:");
        perpus.laporanPeminjam();

    }
}

public class Main {
    public static void main(String[] args) {

        SabunCuciMuka sabun = new SabunCuciMuka("Hada Labo", 45000);
        Toner toner = new Toner("Hada Labo", 75000);
        Serum serum = new Serum("Somethinc", 120000);
        Moisturizer moist = new Moisturizer("Skintific", 98000);
        Sunscreen sunscreen = new Sunscreen("Azarine", 65000);

        // GANTI DI SINI AJA, true = dipakai, false = enggak
        boolean p1 = sabun.cuciMuka(true);
        boolean p2 = toner.tuang(true);
        boolean p3 = serum.tetes(true);
        boolean p4 = moist.oles(false);
        boolean p5 = sunscreen.pakai(true);

        boolean begadang = false;
        boolean tidurPakaiMakeup = false;

        int skor = 0;
        if (p1) skor += 20;
        if (p2) skor += 15;
        if (p3) skor += 20;
        if (p4) skor += 15;
        if (p5) skor += 30;
        if (begadang) skor -= 40;
        if (tidurPakaiMakeup) skor -= 50;

        System.out.println("Skor: " + skor + "/100");

        if (skor >= 90) {
            System.out.println("Kategori: SANGAT BAIK");
        } else if (skor >= 70) {
            System.out.println("Kategori: BAIK");
        } else if (skor >= 40) {
            System.out.println("Kategori: CUKUP");
        } else {
            System.out.println("Kategori: KURANG");
        }
    }
}

class SabunCuciMuka {
    String merek;
    int harga;
    SabunCuciMuka(String merek, int harga) {
        this.merek = merek;
        this.harga = harga;
    }
    boolean cuciMuka(boolean rajin) {
        System.out.println("Cuci muka pakai " + merek);
        return rajin;
    }
}

class Toner {
    String merek;
    int harga;
    Toner(String merek, int harga) {
        this.merek = merek;
        this.harga = harga;
    }
    boolean tuang(boolean pakai) {
        System.out.println("Toner " + merek + " dipakai");
        return pakai;
    }
}

class Serum {
    String merek;
    int harga;
    Serum(String merek, int harga) {
        this.merek = merek;
        this.harga = harga;
    }
    boolean tetes(boolean pakai) {
        System.out.println("Serum " + merek + " ditetes");
        return pakai;
    }
}

class Moisturizer {
    String merek;
    int harga;
    Moisturizer(String merek, int harga) {
        this.merek = merek;
        this.harga = harga;
    }
    boolean oles(boolean pakai) {
        System.out.println("Moisturizer " + merek + " dioles");
        return pakai;
    }
}

class Sunscreen {
    String merek;
    int harga;
    Sunscreen(String merek, int harga) {
        this.merek = merek;
        this.harga = harga;
    }
    boolean pakai(boolean pakai) {
        System.out.println("Sunscreen " + merek + " dipakai");
        return pakai;
    }
}
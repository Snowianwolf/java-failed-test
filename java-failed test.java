public class HesapMakinesi {
    public int bolme(int bolunen, int bolen) {
        if (bolen == 0) {
            throw new ArithmeticException("Payda sıfır olamaz!");
        }
        return bolunen / bolen;
    }
      public void BirDegisken() {
        String degisken = "Herhangi bir degisken yazılması beklenir.";
    }
   
    public int carpmak(int sayi1, int sayi2) {
        int result;
        result = sayi1 * sayi2;
        return result;
    }
  public void BosBlok() {
        try {
            // Herhangi bir durum yazılmadı
        } catch (Exception e) {
            // Bos alan
        }
    }

    public static void main(String[] args) {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        int sayi1 = 10;
        int sayi2 = 0;
       
        try {
            int bolmeSonucu = hesapMakinesi.bolme(sayi1, sayi2);
            System.out.println("Bölme İşlemi Sonucu: " + bolmeSonucu);
        } catch (ArithmeticException e) {
            System.out.println("Hata: " + e.getMessage());
        }
       
        int carpmaSonucu = hesapMakinesi.carpmak(sayi1, sayi2);
        System.out.println("Çarpma İşlemi Sonucu: " + carpmaSonucu);
    }
} 

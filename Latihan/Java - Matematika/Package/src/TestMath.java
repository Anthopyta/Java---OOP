public class TestMath {
    public static void main(String[] args) {
        float x, y;
        double i = 454545, j = 5679;
        x = 100.1f;
        y = 3.14f;
        
        Math matematika = new Math();
        Math matematika1 = new Math();
        
        // math
        matematika.pertambahan(20, 40);
        matematika.perkalian(17, 17);
        matematika.pembagian(95, 5);
        System.out.println("Hasil : " + matematika.pertambahan(20.17f , 40.15f));
        matematika.pertambahan(x, y);
        
        // math1
        matematika1. pertambahan(100, 100);
        System.out.println("Pertambahan : " + x + " + " + y + " = " + matematika1.pertambahan(x, y));
        System.out.println("Perkalian : " + x + " * " + y + " = " + matematika1.perkalian(x, y));
        matematika1.perkalian(x, y);
        matematika1.pembagian(123456.0000, 123.000);
        System.out.println("Pembagian : " + i + " / " + j + " = " + matematika1.pembagian(i, j));


        
        
    }
}

// package Package.src;
class Math{
    float hasil;
    int hsl;
    
    // pertamabahan
    void pertambahan(int a, int b){
        hsl = a + b;
        System.out.println("Pertambahan " + a  + " + " + b + " = " + hsl);
    }
    float pertambahan(float a, float b){
        return a + b;
    }
    // perkalian
    void perkalian(int a, int b){
        hsl = a * b;
        System.out.println("Kendalian " + a + " * " + b + " = " + hsl);
    }
    float perkalian(float a, float b){
        return a * b;
    }
    // pembagian
    void pembagian(int a, int b){
        hsl = a / b;
        System.out.println("Pembagian: " + a + " / " + b + " = " + hsl);
    }
    float pembagian(float a, float b){
        return a / b;
    }
    // pembagian (double)
    double pembagian(double a, double b){
        return a / b;
    }
}
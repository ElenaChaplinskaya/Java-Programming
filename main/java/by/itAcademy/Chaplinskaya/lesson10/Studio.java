package by.itAcademy.Chaplinskaya.lesson10;

public class Studio {

    public static void dressAMan(Clothing[] clothing) {
        for(int i =0; i<clothing.length; i++){
            if(clothing[i] instanceof MensClothing){
                System.out.println((MensClothing)clothing[i]);
            }
        }
    }
    public static void dressAWoman(Clothing []clothing) {
        for(int i =0; i<clothing.length; i++){
            if(clothing[i] instanceof WomensClothing){
                System.out.println((WomensClothing)clothing[i]);
            }
        }
    }
}

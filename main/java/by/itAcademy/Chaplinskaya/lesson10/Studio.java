package by.itAcademy.Chaplinskaya.lesson10;

public class Studio {

    public void dressAMan(Object[] clothing) {
        for(int i =0; i<clothing.length; i++){
            if(clothing[i] instanceof MensClothing){
                System.out.println(clothing[i]);
            }
        }
    }
    public void dressAWoman(Object[] clothing) {
        for(int i =0; i<clothing.length; i++){
            if(clothing[i] instanceof WomensClothing){
                System.out.println(clothing[i]);
            }
        }
    }
}

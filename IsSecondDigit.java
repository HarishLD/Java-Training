
public class IsSecondDigit {
    
     

    public static void main(String[] args){
        int a = 120025;
        int secondLastDigit = (a % 100) / 10;
        System.out.println(secondLastDigit);
        secondLastDigit = (a / 10) % 10;
        System.out.println(secondLastDigit);
    }
}
    


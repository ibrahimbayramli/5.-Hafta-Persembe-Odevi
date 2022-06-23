import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
//        System.out.print("Bir kelime giriniz: ");
//        String myStr=scan.next();
        System.out.print("Bir rakam giriniz: ");
        int myNum=scan.nextInt();

        scan.close();

//        System.out.println("Ters metin: " +reverseStr(myStr));
//        System.out.println("Ters metin harf sayisi: " +reverseStr(myStr).length());
//        System.out.println("Sifreli metin: "+eraseLeter(myStr));
//        System.out.println("Faktoriyel: "+faktoriel(myNum));
        //*! 1 1 2 3 5 myNum=5
//        fibonacci(myNum);
        if(isPrime(myNum)){
            System.out.println("Girdiginiz sayi asaldir.");
        }else {
            System.out.println("Girdiginiz sayi asal degildir.");

        }
    }
    public static String reverseStr(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);

        }
        return result;
    }
    public static String eraseLeter(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if(i==0 || i==(str.length()-1)){
                result+=str.charAt(i);
            }else {
                result+="*";
            }
        }
        return result;
    }
    public static int faktoriel(int num){
        int result=1;
        for (int i = num; i >0 ; i--) {
            result*=i;
        }
        return result;
    }
    public static void fibonacci(int num){
//*! 1 1 2 3 5 myNum=5
        int temp1=1;
        int temp2=1;
        for (int i = 1; i <=num ; i++) {
            System.out.print(temp1+" ");
            int temp3=temp1+temp2;
            temp1=temp2;
            temp2=temp3;

        }
    }
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for (int i = 2; i <num ; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
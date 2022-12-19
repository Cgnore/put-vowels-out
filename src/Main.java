import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter your comment.");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        for(int i=0;i<str1.length();i++){
        switch (str1.charAt(i)){
            case 'a':
                str1=str1.replace("a","");
            case 'e':
                str1=str1.replace("e","");
            case 'ı':
                str1=str1.replace("ı","");
            case 'i':
                str1=str1.replace("i","");
            case 'o':
                str1=str1.replace("o","");
            case 'ö':
                str1=str1.replace("ö","");
            case 'u':
                str1=str1.replace("u","");
            case 'ü':
                str1=str1.replace("ü","");
        }}
        System.out.println(str1);
    }

}
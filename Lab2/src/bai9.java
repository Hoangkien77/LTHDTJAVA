import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap chuoi:");
        String S = sc.nextLine();
        int So = 0 , Normal = 0 , Hyper = 0 ;
        for(int i = 0; i < S.length();i++){
            char temp = S.charAt(i);
            if (Character.isUpperCase(temp))
                ++Hyper;
            else if(Character.isLowerCase(temp))
                ++Normal;
            else if(Character.isDigit(temp))
                ++So;
        }
        System.out.println("So ky tu in thuong:" +Normal);
        System.out.println("So ky tu in hoa :" +Hyper);
        System.out.println("So ky tu so " +So);

    }
}

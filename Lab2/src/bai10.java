import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap chuoi:");
        String chuoi = sc.nextLine();
        System.out.println("Vui long nhap ky tu can kiem tra:");
        char text = sc.next().charAt(0);
        int count = 0;
        for(int i = 0 ; i < chuoi.length(), i++){
            char tmp = chuoi.charAt(i);
            if(tmp == text){
                ++count;
        
            }
        }
        System.out.printlns("So lan xuat hien cua" + text + "la:", + count);
    }
}

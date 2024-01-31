import java.util.Scanner;

public class slide35 {
    public static void main(String[] args) {
        int Sothunhat, Sothuhai;    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat :");
        Sothunhat = scanner.nextInt();
        System.out.println("Nhap vao so thu hai ");
        Sothuhai = scanner.nextInt();
        int Sonhonhat = Sothunhat;
        if (Sonhonhat > Sothuhai)
            Sonhonhat = Sothuhai ;
            System.out.println("So nho nhat trong 2 so " + Sonhonhat + "va " 
            + Sothuhai + "la" +Sonhonhat );
    
    }
}

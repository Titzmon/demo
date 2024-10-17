/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Titz Minh/ Tấn Minh
 */
import java.util.Scanner;
public class BTVN3 {
    
    public static int Sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
    public static int Hieu(int a, int b) {
        int hieu = a - b;
        return hieu;
    }
    
    public static int Tich(int a, int b) {
        int tich = a * b;
        return tich;
    }
    
    public static void Thuong(int a, int b) {
        Scanner sc  = new Scanner(System.in);
        if(a == 0 && b == 0) {System.out.println("Invalid!"); }
        else {
            System.out.print("Lua chon cua ban (1. a/b hay 2. b/a)?: ");
            int num = sc.nextInt();
                    
            switch(num) {
                //Thực hiện a / b và ép kiểu kết quả về số thực
                case 1: System.out.println((b != 0)? "Thuong cua ban: " + ((double)a / b) : "Invalid value!"); break;
                            
                //Thực hiện b / a và ép kiểu kết quả về số thực
                case 2: System.out.println((a != 0)? "Thuong cua ban: " + ((double)b / a) : "Invalid value!"); break;
                            
                default: System.out.println("Khong hop le" ); //Khi lựa chọn khác 1 và 2
            }
        }
    }
    
    public static void Menu() {
        String[] options = {"Tong", "Hieu", "Tich", "Thuong", "Exit"};

        System.out.println("Choose your option: ");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int choice; //Khởi tạo 1 biến choice để dùng làm lại hay không
        
        do {
            System.out.print("Nhap so a: ");
            int a = sc.nextInt();
            System.out.print("Nhap so b: ");
            int b = sc.nextInt();
        
            Menu();
            System.out.print("Your option is: ");
            int option = sc.nextInt();

            //Xử lý các tuỳ chọn
            switch(option) {
                case 1: System.out.println("Tong cua ban: " + Sum(a, b)); break;
                case 2: System.out.println("Hieu cua ban: " + Hieu(a, b)); break;
                case 3: System.out.println("Tich cua ban: " + Tich(a, b)); break;
                case 4: Thuong(a, b); break;
                    
                case 5: System.out.println("Thank you for using our program!"); System.exit(0); break;
                
                default: System.out.println("Invalid choice!");
            }    
                    
            // Lựa chọn, điều kiện để vòng lặp có tiếp tục chương trình hay không
            System.out.println("Do you want to continue? (1. yes/2. no) ");
            System.out.print("Your choice is (choose 1 or 2): ");
            
            choice = sc.nextInt(); 
            
        } while (choice == 1); //Thực hiện vòng lặp khi lựa chọn là 1: yes
        
        System.out.println("Thank you for using our program!");
        
        System.exit(0);
    }
}

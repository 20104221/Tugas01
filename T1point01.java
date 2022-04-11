package t1point01;
import java.util.Scanner;

public class T1point01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
                
        System.out.print("MASUKAN JUMLAH MAHASISWA : ");
        int n = input.nextInt();
 
        // Deklarasi array
        String nama[]=new String[n];
        
        // Input data ke array
        for(int i=0;i<nama.length;i++){
            System.out.print("MAHASISWA "+(i+1)+" : ");
            nama[i] = input.next();
        }
        
        //Menampilkan data dalam array
        System.out.println("\nBERIKUT INI ADALAH 5 NAMA MAHASISWA :");
        for(int i=0;i<nama.length;i++){
            System.out.println(nama[i]);
        } 
    }    
}
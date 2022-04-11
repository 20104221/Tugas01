package t1point02;
import java.util.Scanner;

public class T1point02 {
    
   public static void main (String args[])
   {
    Scanner input=new Scanner(System.in);

    System.out.print("MASUKAN JUMLAH MAHASISWA : ");
    int n=input.nextInt();

    String nama[]=new String[n];
    int nim[]=new int[n];
    String jurusan[]=new String[n];

    for (int i=0;i<n;i++){
        System.out.println("MAHASISWA "+(i+1));
        System.out.print("NAMA      : ");
        nama[i]=input.next();

        System.out.print("NIM       : ");
        nim[i]=input.nextInt();

        System.out.print("JURUSAN   : ");
        jurusan[i]=input.next();
        
    }
    System.out.println("DAFTAR DATA-DATA MAHASISWA");
    System.out.println("===========================");
    System.out.println("NO\tNAMA\tNIM\tJURUSAN ");
    
    for (int i=0; i<n;i++) {
        System.out.println((i+1)+"    "+nama[i]+"     "+nim[i]+"       "+jurusan[i]);
        
    } 
    }
 }
import java.util.Scanner;
public class WhileGaji17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur=0, totalGajilembur=0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan :");
        jumlahKaryawan = scan.nextInt();

        int i = 0;
        while(i< jumlahKaryawan){
            System.out.println("Pilih jabatan - direktur, manager, karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + " : ");
            jabatan = scan.next();

            System.out.print("Masukkan jummlah jam lembur : ");
            jumlahJamLembur = scan.nextInt();
            i++;
            if(jabatan.equalsIgnoreCase("Direktur")){
                continue;
            }else if(jabatan.equalsIgnoreCase("manager")){
                gajiLembur = jumlahJamLembur * 100000;
            }else if(jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur = jumlahJamLembur * 75000;
            }else{
                System.out.println("Jabatan Invalid");
                continue;
            }

            

            totalGajilembur += gajiLembur;

        }

        System.out.println("Total gaji lembur : "+ totalGajilembur);
    }
}
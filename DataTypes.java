import javax.swing.JOptionPane;

public class DataTypes{
 public static void main(String[]args){
	 
	 String namaDepan = "Ibnu";
	 String namaTengah = "Azmi";
	 String namaBelakang = "Nazira";
	 int usia = 20;
	 int targetTahunKuliah = 4;
	 double ipk = 3.69;
	 char nilaiAbjad = 'A';
	 boolean tampan = true;
	 
	 System.out.println("Nama depan : " + namaDepan);
	 System.out.println("Nama tengah : " + namaTengah);
	 System.out.println("Nama belakang : " + namaBelakang);
	 System.out.println("Usia : " + usia + " Tahun");
	 System.out.println("Target Kuliah : " + targetTahunKuliah);
	 System.out.println("Usia Ketika Lulus : " + (usia+targetTahunKuliah));
	 System.out.println("IPK : " + ipk);
	 System.out.println("Nilai PBO : " + nilaiAbjad);
	 System.err.println("Tampan : " + tampan);
	 
	 JOptionPane.showMessageDialog(null,"Hai, " + namaDepan + namaTengah + namaBelakang);
 }
}
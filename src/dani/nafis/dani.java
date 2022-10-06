package dani.nafis;
import java.util.Scanner;
import java.util.scanner;

public class dani {
	static String nama;
	int usia;
	char inisial;
	public static String getnama(String inNama) {
		nama=inNama;
		return nama;
	}
	public int getUsia(int inUsia) {
		usia=inUsia;
		return usia;
	}
	public char getInisial(char inInisial) {
		inisial=inInisial;
		return inisial;
	}
	public static void showNama() {
		Scanner input = new Scanner(System.in);
		System.out.print("nama : ");
		String valNama=input.nextLine();
		getnama (valNama);
	}
	public static void main(String[] args) {
		showNama();
		System.out.println("Nama ini "+nama);
	}
}

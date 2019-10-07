/*
* By				: Abdul Aziz Al Basyir
* NPM				: 1822250092
*	Target		: Taruh informasi di setiap posisi yang telah memiliki Class masing2
*							dengan extends Karyawan, Step yang harus di delewati :
*							> Input Nama, NIP, Alamat, Jabatan
*							> Input Jumlah masuk dan Lembur (untuk posisi tersedia), dan langsung ditampilkan
*
* Note			: pakage layout dll itu cma untuk belajar semata...
*							jadi file ini sambilan belajar - belajar
*	Refrence 	:
*	https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
*	why use nextLine() sesudah menggunakan next*() (example nextInt())
*
**/

import layout.View;
import java.util.Scanner;
import model.*;

public class Home{
	private static Scanner	sc 					= new Scanner(System.in);
	private static View 		view 				= new View();

	//menentukan posisi yang di perbolehkan
	private static String[]	posis 			= {"Direktur","Keuangan","Office Boy"};
	//untuk menentukan panjang array dalam sebuah object
	private static int[] 		count_isrt	= {0,0,0};

	public static void main(String[] args){
		//Judul mulai program
		view.h1("Aplikasi Pengajian");


		//Input jumlah karyawan
		view
			.h2("Step 1 :")
			.p("Mohon masukan jumlah karyawan : ");

		int $byk_karyawan = sc.nextInt(); sc.nextLine();


		//penginputan data
		view
			.h2("Step 2:")
			.p("Setiap pertama penginputan data,").ln()
			.p("anda wajib menginput jabatan terlebih dahulu").ln()
			.p("Berikut type data yang tersedia untuk anda input").ln();

		//tampilkan posisi yang diperboelhakn
		for(int x = 0; x < posis.length; x++){
			view.p((x + 1) + ". "+posis[x]).ln();
		}
		view.ln();


		// Buat Array data
		String dataKaryawan[][] = new String[$byk_karyawan][4];
		for(int x = 0; x < $byk_karyawan; x++){
			view
				.p("Masukan data karyawan ke "+(x + 1))
				.ln();

			view.ptab("Nama\t: ");
			dataKaryawan[x][0] = sc.nextLine();

			view.ptab("NIK\t: ");
			dataKaryawan[x][1] = sc.nextLine();

			view.ptab("Alamat\t: ");
			dataKaryawan[x][2] = sc.nextLine();

			view.ptab("Jabatan\t: ");
			dataKaryawan[x][3] = sc.nextLine();

			++count_isrt[
				Integer.parseInt(dataKaryawan[x][3]) - 1
			];
		}

		//Menyiapkan Object Gaji
		Direktur	Dr[] = new Direktur[count_isrt[0]];
		Keuangan	Ku[] = new Keuangan[count_isrt[1]];
		OfficeBoy Ob[] = new OfficeBoy[count_isrt[2]];

		//memperlihatkan hasil sesuai object
		view
			.h2("Step 3 dan Hasil:")
			.p("Informasi : ").ln()
			.p(
				"Direktur "+count_isrt[0]+" orang, " +
				"Keuangan "+count_isrt[1]+" orang dan " +
				"Officeboy "+count_isrt[2]+" orang"
			)
			.ln()
			.ln();

			//reset index Class
			for(int x = 0; x < count_isrt.length; x++){
				count_isrt[x] = 0;
			}


			//menyusun data sesuai object dan memginput hasil akhir
			for(int x = 0; x < $byk_karyawan; x++){
				view.h3("Data Gaji Karyawan "+(x + 1));

				int Jbtn 						= Integer.parseInt(dataKaryawan[x][3]),
						idx_count_isrt	= Jbtn - 1,
						idxClass 				= count_isrt[idx_count_isrt];

				switch(Jbtn){
					case 1:
						//start object
						Dr[idxClass] = new Direktur();

						//placing data
						Dr[idxClass].Nama 					= dataKaryawan[x][0];
						Dr[idxClass].NIK 						= dataKaryawan[x][1];
						Dr[idxClass].Alamat 				= dataKaryawan[x][2];

						//view nama
						view.ptab("Nama\t\t\t: "+Dr[idxClass].Nama).ln();

						//input
						view.ptab("Jumlah Hadir (Hari)\t: ");
						Dr[idxClass].jumlahHariMasuk= sc.nextInt();

						//view data
						view
							.ptab("NIK\t\t\t: "+Dr[idxClass].NIK).ln()
							.ptab("Alamat\t\t\t: "+Dr[idxClass].Alamat).ln()
							.ptab("Jabatan\t\t\t: "+Dr[idxClass].getJabatan()).ln()
							.ptab("Gaji Pokok\t\t: "+Dr[idxClass].getGaji()).ln()
							.ptab("Tunjangan\t\t: "+Dr[idxClass].getTunjangan()).ln()
							.ptab("Pajak\t\t\t: "+(Dr[idxClass].getPajak())+" % ").ln()
							.ptab("Total Terima\t\t: "+Dr[idxClass].getTotalTerima()).ln();
					break;

					case 2:
						//start object
						Ku[idxClass] = new Keuangan();

						//placing data
						Ku[idxClass].Nama 					= dataKaryawan[x][0];
						Ku[idxClass].NIK 						= dataKaryawan[x][1];
						Ku[idxClass].Alamat 				= dataKaryawan[x][2];

						//view nama
						view.ptab("Nama\t\t\t: "+Ku[idxClass].Nama).ln();

						//input
						view.ptab("Jumlah Hadir (Hari)\t: ");
						Ku[idxClass].jumlahHadir= sc.nextInt();

						//view data
						view
							.ptab("NIK\t\t\t: "+Ku[idxClass].NIK).ln()
							.ptab("Alamat\t\t\t: "+Ku[idxClass].Alamat).ln()
							.ptab("Jabatan\t\t\t: "+Ku[idxClass].getJabatan()).ln()
							.ptab("Gaji Pokok\t\t: "+Ku[idxClass].getGaji()).ln()
							.ptab("Pajak\t\t\t: "+(Ku[idxClass].getPajak())+" % ").ln()
							.ptab("Total Terima\t\t: "+Ku[idxClass].getTotalTerima()).ln();
					break;

					case 3:
						//start object
						Ob[idxClass] = new OfficeBoy();

						//placing data
						Ob[idxClass].Nama 					= dataKaryawan[x][0];
						Ob[idxClass].NIK 						= dataKaryawan[x][1];
						Ob[idxClass].Alamat 				= dataKaryawan[x][2];

						//view nama
						view.ptab("Nama\t\t\t: "+Ob[idxClass].Nama).ln();

						//input
						view.ptab("Jumlah Hadir (Hari)\t: ");
						Ob[idxClass].jumlahHadir= sc.nextInt();

						view.ptab("Jumlah Lembur (Jam)\t: ");
						Ob[idxClass].jumlahLembur= sc.nextInt();

						//view data
						view
							.ptab("NIK\t\t\t: "+Ob[idxClass].NIK).ln()
							.ptab("Alamat\t\t\t: "+Ob[idxClass].Alamat).ln()
							.ptab("Jabatan\t\t\t: "+Ob[idxClass].getJabatan()).ln()
							.ptab("Gaji Pokok\t\t: "+Ob[idxClass].getGaji()).ln()
							.ptab("Pajak\t\t\t: "+(Ob[idxClass].getPajak())+" % ").ln()
							.ptab("Total Terima\t\t: "+Ob[idxClass].getTotalTerima()).ln();
					break;
				}

				view.ln().ln();
				count_isrt[idx_count_isrt]++;
			}

	}
}

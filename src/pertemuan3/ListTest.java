package pertemuan3;

public class ListTest {

public static void main(String[] args) {
		//Latihan 4
		StrukturList list = new StrukturList();
		list.addTail(3);
		list.addTail(4);
		list.addTail(5);
		
		System.out.print("Elemen : ");
		list.displayElement();
		
		//Tes-1 bagian A
		StrukturList listA = new StrukturList();
		listA.addTail(3);
		listA.addTail(2);
		listA.addTail(1);
		
		System.out.println(" ");
		System.out.print("Elemen A: ");
		listA.displayElement();
		
		//Tes-1 bagian B
		StrukturList listB= new StrukturList();
		listB.addTail(1);
		listB.addTail(4);
		listB.addTail(5);
		listB.addTail(7);
		
		System.out.println(" ");
		System.out.print("Elemen B: ");
		listB.displayElement();

		//Tes-2
		// 1. Create list dengan keyword new
		StrukturList listHEAD = new StrukturList();
		//2. Tambah Elemen 5 di awal list
		listHEAD.addHead(5);
		
		//3. Tambah Elemen 4 di awal list
		listHEAD.addHead(4);
		
		//4. Tambah Elemen 3 di awal list
		listHEAD.addHead(3);
		
		//5. Tampilkan elemen list
		System.out.println("Elemen: ");
		listHEAD.displayElement();
		
		//Tes-3
		//List a: 3 2 1
		StrukturList listAHead= new StrukturList();
		listAHead.addHead(1);
		listAHead.addHead(2);
		listAHead.addHead(3);
		
		System.out.println(" ");
		System.out.print("Elemen A: ");
		listAHead.displayElement();
		
		//List b: 1 4 5 7
		StrukturList listBHead= new StrukturList();
		listBHead.addHead(7);
		listBHead.addHead(5);
		listBHead.addHead(4);
		listBHead.addHead(1);
		
		System.out.print("Elemen B: ");
		listBHead.displayElement();
		
	}
}

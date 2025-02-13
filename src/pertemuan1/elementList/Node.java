package pertemuan1.elementList;

public class Node {

	private int nilai;
	private Node Next;
	
	//inisialisasi node
	public Node (int nilai) {
		this.nilai = nilai;
	}
	
	//setter next
	public void setNext(Node next) {
	    this.Next = next;
	}
	
	//getter next
	public Node getNext() {
	    return Next;
	}
	
	//getter nilai
	public int getNilai() {
        return nilai;
    }
}

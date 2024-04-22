package jdpSolid;

public class ClientIteratorSolid {

	public static void main(String[] args) {

		Iterator<ThemeColor> iter = ThemeColor.getIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
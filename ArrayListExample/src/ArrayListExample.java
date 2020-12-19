
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExample {

	static final int SIZE=10;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Integer[] ar=new Integer[SIZE];
		int size=0;
		
		size=add(200,ar,size);
		printArray(ar,size);
		size=add(400,ar,size);
		printArray(ar,size);
		size=add(500,ar,size);
		printArray(ar,size);
		size=add(600,ar,size);
		printArray(ar,size);
		size=insert(50,2,ar,size);	
		size=remove(3,ar,size);
		printArray(ar,size);		
		
		//int:Integer, double:Double, []:Array, boolean: Boolean;
		ArrayList<Integer> al=new ArrayList<>();
		al.add(200);
		System.out.println(al);
		al.add(400);
		System.out.println(al);
		al.add(500);
		System.out.println(al);
		al.add(600);
		System.out.println(al);
		al.add(2, 59);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		System.out.println("size="+al.size());
		
		System.out.println(al.contains(59));
		System.out.println(al.contains(11));
		
		Object[] ar2=(Object[])al.toArray();
		printArray(ar2,ar2.length);
		
		Integer[] ar3=new Integer[al.size()];
		al.toArray(ar3);
		printArray(ar3,ar3.length);
		
		
		al=new ArrayList<>(Arrays.asList(ar));
		System.out.println(al);
		
		String[] ar1= {"sam","andrew","jolin"};
		Integer[] ar4= {400,300,100,500};
		ArrayList al1=new ArrayList(Arrays.asList(ar1));
		ArrayList al2=new ArrayList(Arrays.asList(ar4));
		
		al1.addAll(al2);
		System.out.println(al1);
		System.out.println(al2);
		
		al1=new ArrayList(Arrays.asList(ar1));
		al1.addAll(2, al2);
		System.out.println(al1);
		
		al1.remove("andrew");
		System.out.println(al1);
		
		al1.add(2);
		System.out.println(al1);
		al1.remove(2);
		System.out.println(al1);
		al1.remove((Object)2);
		
		Arrays.sort(ar1);
		printArray(ar1,ar1.length);
		Collections.sort(al2);
		System.out.println(al2);
		
		al2.set(1, 200);
		System.out.println(al2);
		System.out.println(al2.get(1));
		
		
	}

	private static void printArray(Object[] ar, int size) {
		// TODO Auto-generated method stub
		for (int i=0;i<size;i++) {
			System.out.print(ar[i]+",");
		}
		System.out.println("size="+size+",leng="+ar.length);
	}

	private static int remove(int pos, Integer[] ar, int size) throws Exception {
		// TODO Auto-generated method stub
		if (size<pos)
			throw new Exception("no such data");
		for (int i=pos;i<size-1;i++) {
			ar[i]=ar[i+1];
		}
		return size-1;
	}

	private static int insert(int element, int pos, Integer[] ar, int size) throws Exception{
		// TODO Auto-generated method stub
		if (size+1 >= SIZE) 
			throw new Exception("out of boundry");
		if (size<pos)
			throw new Exception("no such data");
		for (int i=pos;i<size;i++) {
			ar[i+1]=ar[i];
		}
		ar[pos]=element;
		return size+1;
	}

	private static int add(int element, Integer[] ar, int size) throws Exception {
		// TODO Auto-generated method stub
		if (size+1 >= SIZE) 
			throw new Exception("out of boundry");
		ar[size]=element;
		size++;
		return size;
	}

}

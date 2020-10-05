package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[]arr;
	public ArrayList() {
		arr=(T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return arr[loc];
	}
	
	public void add(T val) {
		T[] duplArr=(T[]) new Object[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			duplArr[i]=arr[i];
		}
		duplArr[arr.length]=val;
		arr=duplArr;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] duplArr=(T[]) new Object[arr.length+1];
		for(int i=0;i<loc;i++) {
			duplArr[i]=arr[i];
		}
		for(int i=loc+1;i<arr.length;i++) {
			duplArr[i]=arr[i-1];
		}
		duplArr[loc]=val;
		arr=duplArr;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] duplArr=(T[]) new Object[arr.length];
		for(int i=0;i<loc;i++) {
			duplArr[i]=arr[i];
		}
		for(int i=loc+1;i<arr.length;i++) {
			duplArr[i]=arr[i];
		}
		duplArr[loc]=val;
		arr=duplArr;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] duplArr=(T[]) new Object[arr.length-1];
		for(int i=0;i<loc;i++) {
			duplArr[i]=arr[i];
		}
		for(int i=loc;i<arr.length-1;i++) {
			duplArr[i]=arr[i+1];
		}
		arr=duplArr;
	}
	
	public boolean contains(T val) {
		boolean result=false;
		for(T sub:arr) {
			if(sub==val) {
				result=true;
			}
		}
		return result;
	}
	public int size(){
		
		return arr.length;
	}
}
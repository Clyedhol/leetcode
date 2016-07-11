package leetcode.algorithms_middle;

public class Merge {
	
	public void merge(int[] arr){
		int k = 1;
		while(k<arr.length){
			mergepass(arr,k);
			k = 2*k;
		}
		mergeheihei(arr,0,k/2-1,arr.length-1);
		
	}

	private void mergepass(int[] arr, int k) {
		// TODO Auto-generated method stub
		int midle = k-1;
		int low = 0;
		int last = 2*k-1;
		while(last < arr.length){
			mergeheihei(arr,low,midle,last);
			low = low+2*k;
			midle = midle+2*k;
			last = last+2*k;
		}
	}

	private void mergeheihei(int[] arr, int low, int midle, int last) {
		int[] arrtemp = new int[last-low+1];
		int s =  low;
		int t = midle+1;
		int k = 0;
		while(s<=midle&&t<=last){
			if(arr[s] > arr[t]){
				arrtemp[k] = arr[t];
				t++;
			}else{
				arrtemp[k] = arr[s];
				s++;
			}
			k++;
		}
		while(s<=midle){
			arrtemp[k] = arr[s];
			k++;s++;
		}
		while(t<=last){
			arrtemp[k] = arr[t];
			k++;t++;
		}
		for(int i=0;i<arrtemp.length;i++){
			arr[low+i] = arrtemp[i];
		}
	}
	
	public static void main(String[] args) {
		Merge mg = new Merge();
		int[] haha = {50,10,90,30,70,40,80,100,9};
		mg.merge(haha);
		for(int j = 0;j<haha.length;j++){
			System.out.print(haha[j]+",");
		}
	}
}

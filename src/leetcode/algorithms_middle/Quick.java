package leetcode.algorithms_middle;

public class Quick {
	public void sort(int[] arr,int low,int high){
			if(low >= high) return;
			int l=low;
			int h=high;
			int povit=arr[low];
			while(l<h){
				while(l<h&&arr[h]>povit)
					h--;
				if(l<h)
					arr[l] = arr[h];
				while(l<h&&arr[l]<povit)
					l++;
				if(l<h)
					arr[h] = arr[l];
			}
			arr[l] = povit;
			sort(arr,low,l-1);
			sort(arr,l+1,high);
	}
	public static void main(String[] args) {
		Quick q = new Quick();
		int[] i = {3,7,8,2,1,5};
		q.sort(i, 0, i.length-1);
		for(int j = 0;j<i.length;j++){
			System.out.print(i[j]+",");
		}
	}
}

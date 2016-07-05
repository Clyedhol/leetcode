package leetcode.algorithms_middle;

public class BulbSwitcher {
    public int bulbSwitch(int n) {
    	int[] bl = new int[n];
    	for(int i=1;i<=bl.length;i++){
    		int ini = i-1;
    		while(ini<bl.length){
    			if(bl[ini] == 0)
    				bl[ini] = 1;
    			else bl[ini] =0;
    			ini = ini+i;
    		}
    	}
    	int sum = 0;
    	for(int i=0;i<bl.length;i++){
    		sum = sum + bl[i];
    	}
    	return sum;
    }
    
    public static void main(String[] args) {
		BulbSwitcher bs = new BulbSwitcher();
		System.out.println(bs.bulbSwitch(12));
	}
    //非平方数的因数总是成对出现的，只有平方数的因数才是奇数,而要计算一个数之下有多少小于或等于它的平方数，使用一个开平方用的函数就可以了。
    public int bulbSwitch2(int n){
    	return (int) Math.sqrt(n);
    }
}

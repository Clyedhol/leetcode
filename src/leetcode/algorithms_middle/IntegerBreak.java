package leetcode.algorithms_middle;

public class IntegerBreak {
    public int integerBreak(int n) {
    	if(n==2) return 1;
    	if(n==3) return 2;
        int cishu = n/3;
        int yushu = n%3;
        if(yushu == 1){
        	return (int) Math.pow(3, (cishu-1))*4;
        }
        if(yushu == 0) return (int) Math.pow(3, cishu);
        return (int) Math.pow(3, cishu)*yushu;
    }
    public static void main(String[] args) {
		IntegerBreak ib = new IntegerBreak();
		System.out.println(ib.integerBreak(5));
	}
}

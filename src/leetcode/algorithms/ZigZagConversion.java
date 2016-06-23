package leetcode.algorithms;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
    	if(numRows == 1) return s;
        char[] sc = s.toCharArray();
        if(numRows >= sc.length) return s;
        char[][] sczz = new char[numRows][sc.length];
        int k = 0;
        int i = 0,j = 0;
        while(k < sc.length){
        	while(i < (numRows-1) && k < sc.length){
        		sczz[i][j] = sc[k];
        		i++;
        		k++;
            }
        	while(i> 0 && k < sc.length){
        		sczz[i][j] = sc[k];
            	k++;
            	i--;
            	j++;
        	}
        }
        String temp= "";
        for(int v=0;v<numRows;v++){
        	for(int w=0;w<=j;w++){
        		if(sczz[v][w] != 0){
        			temp = temp + String.valueOf(sczz[v][w]);
        		}
        	}
        }
        return temp;
    }
    
    //找规律
    public String convert2(String s, int numRows){
    	if(numRows == 1) return s;
    	int length = s.length();
        if(numRows >= s.length()) return s;
        StringBuilder temp = new StringBuilder();
        int n = 0;
        for(int i = 0;i < numRows;i++){
        	n=i;
        	if(n%(numRows-1) == 0){
        		while(n<length){
            		temp.append(s.charAt(n));
            		n = n + 2*(numRows-1);
            	}
        	}else{
        		int precha = 2*(numRows-1)-2*n;
        		int lastcha = 2*n;
        		while(n<length){
        			temp.append(s.charAt(n));
        			n = n + precha;
        			if(n<length){
        				temp.append(s.charAt(n));
            			n = n + lastcha;
        			}
        		}
        	}
        	
        }
    	return temp.toString();
    }
    
    public static void main(String[] args) {
		ZigZagConversion zzc = new ZigZagConversion();
		System.out.println(zzc.convert2("abc", 2));
	}
}

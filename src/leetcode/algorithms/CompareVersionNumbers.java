package leetcode.algorithms;

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
    	if(version1.equals(version2)) return 0;
        String[] sba1 = version1.split("\\.");
        String[] sba2 = version2.split("\\.");
        int length = sba1.length < sba2.length?sba1.length:sba2.length;
        int i = 0;
        while(i<length){
        	if(sba1[i].equals(sba2[i]))
        		i++;
        	else{
        	    int temp1 = Integer.parseInt(sba1[i]),temp2 = Integer.parseInt(sba2[i]);
        		if(temp1 > temp2){
        			return 1;
        		}else if(temp1 < temp2){
        			return -1;
        		}else{
        		    i++;
        		}
        	}
        }
        if(length < sba2.length) {
            int lengthtemp = i;
            while(lengthtemp < sba2.length){
                if(Integer.parseInt(sba2[lengthtemp])!=0) return -1;
                lengthtemp++;
            }
        }
        if(length < sba1.length) {
            int lengthtemp = i;
            while(lengthtemp < sba1.length){
                if(Integer.parseInt(sba1[lengthtemp])!=0) return 1;
                lengthtemp++;
            }
        }
        return 0;
    }
}
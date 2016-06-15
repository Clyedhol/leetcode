package leetcode.algorithms;

public class RectangleArea {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int chang = getChang(A,C,E,G);
		int kuan = getChang(B,D,F,H);
		int result = (C - A) * (D - B) + (G - E) * (H - F); 
        return result - chang * kuan;
    }

	private int getChang(int b, int d, int f, int h) {
		if(h<d&&b<h) {
			if(b<f) return (h-f);
			else return (h-b);
		}else if(h>=d){
			if(f<d&&b<f) return (d-f);
			else if(f>=d) return 0;
			else return (d-b);
		}
		return 0;
	}

	public static void main(String[] args) {
		RectangleArea ra = new RectangleArea();
		ra.computeArea(-2, -2, 2, 2, 2, 2, 3, 3);
	}
}

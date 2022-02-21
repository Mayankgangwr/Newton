import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double sum = 0.0;
        int arr[] = new int[n];
        int aar[] = new int[n];
        for(int i = 0; i<n; i++)
        {
           arr[i] = s.nextInt();
           aar[i] = s.nextInt();
        }
        int maxx = arr[0], maxy=arr[0];
        int minx=arr[0],miny=arr[0];  
         for(int k = 0; k<n; k++)
        {
        if (arr[k] > maxx)
                 maxx = arr[k];
        if (aar[k] > maxy)
                 maxy = aar[k];
        if (aar[k] < minx)
                 minx = aar[k];
        if (aar[k] < miny)
                 miny = aar[k];
        }
        int xc = (maxx+minx)/2;
        int yc = (maxy+miny)/2;
        for(int j = 0; j<n; j++)
        {
         double d = ((xc-arr[j])*(xc-arr[j]) +  (yc-aar[j])*(yc-aar[j]));   
         sum += Math.sqrt(d);
        }
        System.out.printf("%.5f%n", sum);
	}
}

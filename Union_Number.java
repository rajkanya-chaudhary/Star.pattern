package Allpattern;

public class Union_Number {
    public static int union(int a[],int b[],int n ,int m)
    {
        int i = 0 ; int  j  = 0;
        while (i<n && j<m) {
            if(a[i]<b[j])
            {
                System.out.print(a[i] + " ");
                i++;
            }
            if (a[i]>b[j]) {
                System.out.print(b[j]+ " ");
                j++;
            }
            if(a[i] == b[j])
            {
                System.out.print(a[i]+ " ");
                i++;j++;
            }
        }
            while (i<n) {
                System.out.print(a[i++] +" ");
            }
            while (j<m) {
                System.out.print(b[j++] +" ");
            }

        
        return 0;

    }
    public static void main(String[] args) {
        int a[] = {1,2 ,3,4,5,6};
        int b[] = {2,3,4,5};
        int n = a.length;
        int m = b.length;
        union(a, b, n, m);

    }
}

package arrayJava;
// How to print the elements of a circular array from a given index.
public class CircularArray {

    public static void print(char [] a, int n, int rotateIndex)
    {
        char b [] = new char[(n*2)];  // Double size of a
        // Copying elements from a to b
        for (int i = 0;i<n;i++)
        {
            b[i] = b[i+n] = a[i];  // A B C D E F A B C D E F
        }
        // Traversing elements from rotateIndex
        for (int i =rotateIndex; i < n+rotateIndex; i++)
        {
            System.out.print(b[i]+" ");
        }

    }

    public static void main(String[] args) {
        char[] a = new char[]{ 'A', 'B', 'C', 'D', 'E', 'F' };
        int n =6;
        print(a,n,3); // rotateIndex from D
    }
}

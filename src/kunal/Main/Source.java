package kunal.Main;

import java.util.Scanner;

public class Source {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        MyClass solver = new MyClass();
        while (t-- > 0) {
            int m = in.nextInt();
            int n = in.nextInt();
            System.out.println(solver.solve(m, n));
        }
    }
}

class MyClass {

    int solve(int m, int n) {
      // Return sum of f[m] + f[m+1] + … f[n]
      // Should use classes whichever are required

        return -1;
    }


}

interface X<T> {
    T add(T a, T b);

    T subtract(T a, T b);

    T multiply(T a, T b);
}

class Z implements X<MyClass>{
    @Override
    public MyClass add(MyClass a, MyClass b) {
        return null;
    }

    @Override
    public MyClass subtract(MyClass a, MyClass b) {
        return null;
    }

    @Override
    public MyClass multiply(MyClass a, MyClass b) {
        return null;
    }
    // Implement interface X for integer operations
}

class M implements X<Matrix>{
    @Override
    public Matrix add(Matrix a, Matrix b) {
        return null;
    }

    @Override
    public Matrix subtract(Matrix a, Matrix b) {
        return null;
    }

    @Override
    public Matrix multiply(Matrix a, Matrix b) {
        return null;
    }
    // Implement interface X for matrix operations
    // Must use Z for all modulo operations, if applicable
}

class Matrix {
    // Declare a 2D ( r * c ) integer matrix
    // Use proper data structure 
}

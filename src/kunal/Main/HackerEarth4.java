package kunal.Main;

class HackerEarth4
    {
        public static void main(String [] args) 
        {
            HackerEarth4 he = new HackerEarth4();
            he.output();
        }

        void output() 
        {
            long [] x = {7,8,9};
            long [] y = fix(x);
            System.out.print(x[0] + x[1] + x[2] + " ");
            System.out.println(y[0] + y[1] + y[2]);
        }

        long [] fix(long [] z) 
        {
            z[1] = 4;
            return z;
        }
    }

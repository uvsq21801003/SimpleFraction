public class Fraction {
    private static int NUM = 1 ;
    private static int DENOM = 1 ;


    public Fraction(int num, int denom)
    {
        this.NUM =num;
        this.DENOM=denom;

    }
    //Getter
    public int getNUM() {
        return this.NUM;
    }
    public int getDENOM() {
        return this.DENOM;
    }

    // Setter
    public void setNUM(int num) {
        this.NUM = num;
    }
    public void setDENOM(int denom) {
        this.DENOM = denom;
    }


    public String toString()
    {
        String s =String.valueOf(this.NUM) + "/"+ String.valueOf(this.DENOM);
        return s;

    }
    public static void main(String[] args)
    {
        Fraction f= new Fraction(1,2);
        String s = f.toString();
        System.out.print(s);



    }

}

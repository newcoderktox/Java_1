public class examPractice {
    public void dosomething (int n) {
        if (n > 0) {
            dosomething(n - 1);
            System.out.println(n);
        }
    }
    public static void main(String [] args){
        examPractice e = new examPractice();
        e.dosomething(5);

    }
}

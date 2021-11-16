public class Jumping {
    public long count(int n, int a, int b) {
        // TODO
    }

    public static void main(String[] args) {
        Jumping j = new Jumping();
        System.out.println(j.count(4,1,2)); // 5
        System.out.println(j.count(10,2,5)); // 2
        System.out.println(j.count(10,6,7)); // 0
        System.out.println(j.count(30,3,5)); // 58
        System.out.println(j.count(50,2,3)); // 525456
    }
}

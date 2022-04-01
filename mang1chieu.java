public class mang1chieu {
    public static void main(String[] args) {
        int []a;
        a = new int [5];
        for(int i=0; i< a.length;i++){
            a[i] = i;
        }
        for(int i=0;i < 5;i++){
            System.out.println("Gia tri cua a"+i+" la: "+a[i]);
        }
    }
}

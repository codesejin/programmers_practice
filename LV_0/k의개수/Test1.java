package LV_0.k의개수;

public class Test1 {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int num = i; num <= j; num++){
            int tmp = num;
            System.out.println("tmp = " + tmp);
            while (tmp != 0){
                System.out.printf("%d 나누기 10의 나머지는 = %d \n", tmp, (tmp % 10));
                if (tmp % 10 == k)
                    answer++;
                System.out.printf("%d 나누기 10의 몫은 = %d \n", tmp, (tmp /= 10));
                tmp /= 10;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;
        Test1 test1 = new Test1();
        test1.solution(i,j,k);
    }
}

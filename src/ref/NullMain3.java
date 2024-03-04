package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        //초기화 변수
        System.out.println("bigData.count = " + bigData.count); //0
        System.out.println("bigData.data = " + bigData.data); //null

        //NullPointException
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}

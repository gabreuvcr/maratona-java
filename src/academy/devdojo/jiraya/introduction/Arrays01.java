package academy.devdojo.jiraya.introduction;

public class Arrays01 {
    public static void main(String[] args) {
        int[] ages = new int[3];
        ages[0] = 21;
        ages[1] = 15;
        ages[2] = 11;

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }
}

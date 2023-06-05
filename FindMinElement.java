package academy.devonline.java.basic.section01_setup.section06_setup;

public class FindMinElement {
    public static void main(String[] args) {
        int [] array = {1,-2,8,0,5};

        var min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min =array[i];
            }
        }
        System.out.println(min);


    }
}

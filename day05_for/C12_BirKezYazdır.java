package day05_for;

public class C12_BirKezYazdır {
    public static void main(String[] args) {
        String input=" aabbcccccddddaaa";
        birKezYazdır(" aabbcccccddddaaa");
    }

    private static void birKezYazdır(String input) {
        String output=" ";

        for (int i = 0; i <=input.length()-1; i++) {
            if(!output.contains(input.substring(i,i+1))) {
                output+=input.substring(i,i+1);
            }

        }
        System.out.println(output);
    }
}

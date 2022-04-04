package problems;

public class Validshuffle {

    public boolean validStringShuffle(String input1, String input2, String input3) {//abc , def, adbefc
        int arr1[] = new int[input1.length()];
        int arr2[] = new int[input2.length()];
        int count1 = 0;
        int count2 = 0, count3 = 0, count4 = 0;
        for (int k = 0; k < input3.length(); k++) {
            for (int i = 0, j = 0; i < input1.length() && j < input2.length(); i++, j++) {
                if (input3.charAt(k) == input1.charAt(i)) {
                    arr1[count1] = k;
                    count1++;
                }
                if (input3.charAt(k) == input2.charAt(j)) {
                    arr2[count2] = k;
                    count2++;
                }
            }
        }
        for (int f = arr1.length - 1; f >= 0; f--) {
            if (arr1[f] > arr1[f - 1]) {
                count3++;
            }
        }
        for (int g = arr2.length - 1; g >= 0; g--) {
            
            if (arr2[g] < arr2[g - 1]) {
                count4++;
            }
        }
        if (count3 == arr1.length - 1 && count4 == arr2.length - 1) {
            return true;
        }
        return false;
    }
}

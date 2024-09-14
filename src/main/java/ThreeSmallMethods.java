public class ThreeSmallMethods {

    public boolean isYoung(int age) {
        return age <= 30;
    }

    public boolean hasLegalGenderManInSweden(String personalNumber){
        if(personalNumber.length() != 10)
            return false;

        char[] numbers  = personalNumber.toCharArray();
        char toBeInt = numbers[numbers.length-2];
        int number = Integer.parseInt(String.valueOf(toBeInt));

        if(number % 2 ==0)
            return false;

        return true;
    }

    public int firstTwoDigitInteger(int[] numbers) {
        return -1;
    }
}

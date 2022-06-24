package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int a = character;
        if (a > 65 && a < 90 || a> 97 && a < 122) {
            if (a == 65 || a == 69 || a == 73 || a == 79 || a == 85 || a == 89 || a == 97  || a == 101  || a == 105
                    || a == 111  || a == 117  || a == 121) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }

        } else {

            System.out.println("wrong alphabet!");
        }
    }
}

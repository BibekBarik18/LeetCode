import java.util.HashMap;

class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> map = new HashMap<>();
                for (char ch : secret.toCharArray()) {
                    if(map.containsKey(ch))
                    {
                        map.put(ch,map.get(ch)+1);
                    }
                    else
            map.put(ch,1);
        }
        int bulls = 0, cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
                map.put(secret.charAt(i), map.get(secret.charAt(i)) - 1);
            }
        }
        for (int i = 0; i < guess.length(); i++) {
            if (secret.charAt(i) != guess.charAt(i) && map.containsKey(guess.charAt(i)) && map.get(guess.charAt(i)) > 0) {
                cows++;
                map.put(guess.charAt(i), map.get(guess.charAt(i)) - 1);
            }
        }
        return bulls + "A" + cows + "B";
    }
}


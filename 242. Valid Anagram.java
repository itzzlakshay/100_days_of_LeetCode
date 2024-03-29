class Solution {

         public static HashMap<Character, Integer> makeFreqMap (String s){
        HashMap<Character,Integer> mp = new HashMap<>();
        for( int i =0; i<s.length(); i++){
            Character ch = s.charAt(i);
            if(!mp.containsKey(ch)) {
                mp.put(ch,1);
            }
            else{
                int curr = mp.get(ch);
                mp.put(ch, curr+1);
            }
        }
        return mp;

    }

    public static boolean isAnagram (String a, String b){
        if(a.length() != b.length()) return false ;
        HashMap<Character,Integer> mp1 = makeFreqMap(a);
        HashMap<Character,Integer> mp2 = makeFreqMap(b);
        return mp1.equals(mp2);

    }
}

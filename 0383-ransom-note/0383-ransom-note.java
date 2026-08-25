class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> f = new HashMap<>();
         HashMap<Character,Integer> s = new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            f.put(ch,f.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            s.put(ch,s.getOrDefault(ch,0)+1);
        }
         for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            if (s.getOrDefault(ch, 0) < f.get(ch)) {
                return false;
            }
         
    }
    return true;

    }
}
    
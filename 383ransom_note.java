class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransomMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        int value = 0;

        for (int a = 0; a < ransomNote.length(); a++){
            if (!ransomMap.containsKey(ransomNote.charAt(a))){
                ransomMap.put(ransomNote.charAt(a), 1);
            }
            else{
                value = ransomMap.get(ransomNote.charAt(a));
                value++;
                ransomMap.put(ransomNote.charAt(a),value);
            }
        }
        for (int a = 0; a < magazine.length(); a++){
            if (!magazineMap.containsKey(magazine.charAt(a))){
                magazineMap.put(magazine.charAt(a), 1);
            }
            else{
                value = magazineMap.get(magazine.charAt(a));
                value++;
                magazineMap.put(magazine.charAt(a), value);
        }
        }

        for(Character b : ransomMap.keySet()){
            if(ransomMap.get(b) > magazineMap.getOrDefault(b, 0))
            return false;
        }
        return true;
}
}
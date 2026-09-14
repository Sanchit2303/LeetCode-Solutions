class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> s = new HashSet<>();
        int count = 0;

        for(int i = 0; i < digits.length; i++){
            for(int j = 0; j < digits.length; j++){
                for(int k = 0; k < digits.length; k++){

                    if(i == j || j == k || i == k){
                        continue;
                    }
                    
                    if(digits[i] == 0){
                        continue;
                    }

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];

                    if(num % 2 != 0){
                        continue;
                    }

                    if(!s.contains(num)){
                        s.add(num);
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final double ep = 1e-6;
    private static final double tg = 24.0;
    public boolean judgePoint24(int[] cards) {
        List<Double> nums = new ArrayList<>();
        for(int card:cards){
            nums.add((double) card);
        }
        return solve(nums);        
    }
    private boolean solve(List<Double> nums){
        if(nums.size() == 1){
            return Math.abs(nums.get(0) - tg) < ep;
        }
        for(int i = 0; i<nums.size(); i++){
            for(int j = 0; j<nums.size(); j++){
                if(i==j) continue;
                List<Double> next = new ArrayList<>();
                for (int k = 0; k < nums.size(); k++) {
                     if (k != i && k != j) next.add(nums.get(k));
                }
                for (double candidate : compute(nums.get(i), nums.get(j))) {
                    next.add(candidate);
                    if (solve(next)) return true;
                    next.remove(next.size() - 1);
                }
            }
        }
        return false;
    }
    private List<Double> compute(double a, double b) {
        List<Double> results = new ArrayList<>();
        results.add(a + b);
        results.add(a - b);
        results.add(b - a);
        results.add(a * b);
        if (Math.abs(b) > ep) results.add(a / b);
        if (Math.abs(a) > ep) results.add(b / a);
        return results;
     }

}


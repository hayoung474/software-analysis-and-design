class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        
        for(int idx=heights.length-1;idx>=0;idx--){
            for(int j=idx-1;j>=0;j--){
                if(heights[idx]<heights[j]){
                    answer[idx]=j+1;
                    break;
                }
                else{
                    continue;
                  
                }
            }
        }
        return answer;
    }
}
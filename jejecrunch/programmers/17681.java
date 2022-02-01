class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] trans1 = trans(arr1, n);
        int[][] trans2 = trans(arr2, n);
        
        for(int i=0;i<trans1.length;i++){
            answer[i] = "";
            for(int j=0;j<trans1[i].length;j++){
                if(trans1[i][j]==1 || trans2[i][j]==1) {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
        }
        
        return answer;
    }
    
    private int[][] trans(int[] arr, int n){
        int[][] result = new int[n][arr.length];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<arr.length;j++){
                result[i] = toIntegerArr(Integer.toBinaryString(arr[i]), n);
            }
        }
        
        return result;
    }
    
    private int[] toIntegerArr(String str, int n){
        while(str.length() < n){
            str ="0"+str;
        }
        
        int[] result = new int[str.length()];
        String[] temp = str.split("");
        
        for(int i=0;i<temp.length;i++){
            result[i] = Integer.parseInt(temp[i]);
        }
        
        return result;
    }
}
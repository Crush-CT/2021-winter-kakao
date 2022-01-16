import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n+1];
        
        // 오름차순으로 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        
        // 전체 학생의 체육복 상황
        // 잃어버리면 0, 여벌 있으면 2
        for(int i=1;i<=n;i++){
            arr[i] = 1;
        }
        
        for(int i=0;i<lost.length;i++){
            arr[lost[i]] = 0;
        }
        
        for(int i=0;i<reserve.length;i++){
            if(arr[reserve[i]] == 0){ // 여벌이 있는데 도난 당했을 경우
                arr[reserve[i]] = 1;
            } else {
                arr[reserve[i]] = 2;
            }
        }
        
        for(int i=1;i<=n;i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        
        // 빌려주기 메소드
        answer = borrow(arr);
        return answer;
    }
    
    private int borrow(int[] arr){
        int[] temp = arr;
        int count = 0;
        
        for(int i=1;i<temp.length;i++){
            // 무조건 뒤에서 앞으로 빌려줘보기
            if(i == temp.length-1) {
                if(temp[i] == 0 && temp[i-1] == 2){
                    temp[i] = 1;
                    temp[i-1] = 1;
                }
            } else {
                if(temp[i] == 0 && temp[i+1] == 2){
                    if(temp[i-1] == 2){
                        temp[i] = 1;
                        temp[i-1] = 1;
                    } else {
                        temp[i] = 1;
                        temp[i+1] = 1;
                    }
                } else if(temp[i] == 0 && temp[i-1] == 2){
                    temp[i] = 1;
                    temp[i-1] = 1;
                }
            }  
            
        }
        
        for(int i=1;i<temp.length;i++){
            System.out.print(temp[i] + " ");
            if(temp[i] >= 1){
                ++count;
            }
        }
        
        return count;
    }
}
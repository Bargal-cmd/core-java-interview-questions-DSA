class Solution {
    public int[] numberOfPairs(int[] nums) {
// [1,3,2,1,3,2,2]
    // int count=0;
    // int n=nums.length;
    // for(int i=0;i<n;i++){
       
    //         if (nums[i] == -1) {
    //             continue;
    //         }
    //    for(int j=i+1;j<n;j++){
    //     if(nums[i]==nums[j]){
    //         count++;
    //         nums[i]=-1;
    //         nums[j]=-1;
    //         break;
    //     }
    //    }
    // }

  
    //     int rem = n - (count * 2);
    //    return new int[]{count,rem};

    int fre[] = new int[101];
 int pairs=0;
 int lt=0;
   for(int ele :nums){
         
         fre[ele]++; 
                    
            }
    for(int fe :fre){
       lt+= fe%2;
       pairs+=fe/2;
    }       

      return new int[]{pairs,lt};  
    }
} 
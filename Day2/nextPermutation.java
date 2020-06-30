public void swap(int x,int y,int[] nums){
        int tem = nums[x];
        nums[x] = nums[y];
        nums[y] = tem;
    }
    public void nextPermutation(int[] nums){
        int i,l = nums.length-1;
        for(i=l;i>0;i--){
            if(nums[i]>nums[i-1])
                break;
        }
        for(int j=i,p=l;j<=p;j++,p--){
            swap(j,p,nums);
        }
        for(int j=i;j<=l;j++){
            if(i>0 && nums[i-1]<nums[j]){
                swap(i-1,j,nums);
                break;
            }
        }                
    }

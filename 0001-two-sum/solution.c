int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int a,i,j;
    *returnSize = 2;
    int* element = (int*)malloc(2*sizeof(int));
    for(i=0;i<numsSize;i++)
    {
        for(j=1+i;j<numsSize;j++)
        {
         a=nums[i]+nums[j];
         if(target == a)
         {
            element[0] = i;
            element[1]= j;
            return element;
         }
         
        }
    }
    element[0]= -1;
    element[1]= -1;
    return returnSize;
}


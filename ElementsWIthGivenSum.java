int arr[] = {1,4,20,3,10,5};
        int i=0;
        int j=0;
        int currentSum = 0; 
        int target =43;
        while(i<arr.length){
            if(currentSum< target){
                currentSum+= arr[i++];
            }
            else if(currentSum> target){
                currentSum -= arr[j++];
            }
            else if (currentSum == target){
                break;
            }
        }
        if(currentSum == target){
          for(int a=j;a<i;a++){
            System.out.println(arr[a]);
        }  
        }
        else{
            System.out.println(-1);
        }
        

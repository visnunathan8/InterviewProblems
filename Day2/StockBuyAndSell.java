public static void main (String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(int k=0;k<t;k++){
		    int n;
		    n = sc.nextInt();
		    int[] arr = new int[n];
		    
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    int s=0,i;
		    for(i=0;i<n-1;i++){
		        if(arr[i+1]>arr[i]){
		            break;
		        }
		    }
		    if(i==n-1){
		        System.out.print("No Profit");
		    }else{
		        s=i;
		        int j;
    		    for(j=i;j<n-1;j++){
    		        if(arr[j+1]<arr[j]){
    		            if(s!=j)
    		            System.out.print("("+s+" "+j+") ");
            		    for(i=j+1;i<n-1;i++){
            		        if(arr[i+1]>arr[i]){
            		            j=i-1;
            		            break;
            		        }
		                }
		                s=j+1;
    		        }
    		    }
    		    if(s!=j)
    		    System.out.print("("+s+" "+j+") ");
		    }
		    System.out.print("\n");
		}
	}

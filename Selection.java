public class Selection {
    public static void main(String[] args){
         int i,j,min;
         int []a=new int[1000];
        
           for(i=0;i<1000;i++){
             a[i]=i;
          } 
         long s = System.nanoTime();
        int swap=0;
        int comp=0;
         for(i=0;i<1000;i++){
            min=i;
            for(j=i+1;j<1000;j++){
             
                 if(a[min]>a[j]){
                     min=j;
                    }
                 comp++;
             }
           int temp=a[min];
           a[min]=a[i];
           a[i]=temp;
           swap++;  
         }
        long e = System.nanoTime();
        System.out.println("total time in nano second is: "+(e-s));


     System.out.println("no of swap: "+swap);
     System.out.println("no of comparison: "+comp);
          for(i=0;i<1000;i++){
          System.out.print(+a[i]+",");
         }
    }
}

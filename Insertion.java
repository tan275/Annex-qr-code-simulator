public class Insertion {
    
    public static void main(String[] args) {
        long s = System.nanoTime();
        int i,j,key;
        int []a=new int[100];
        
        for(i=1;i<100;i++){
            a[i]=(int)(Math.random()*100);
        }
        int swap=0;
        int comp=0;
        for(i=1;i<100;i++){
           key=a[i];
           j=i-1;
                while(j>=0 && key<a[j]){
                 a[j+1]=a[j];
                 j--;
                 swap++;
                }
                comp++;
            a[j+1]=key;
        }
        long e = System.nanoTime();
     for(i=0;i<100;i++){
       System.out.print(+a[i]+",");
        }
        System.out.println("no of swap: "+swap);  
        System.out.println("no of comparisons: "+comp);  
        System.out.println("total time in nano second is: "+(e-s));
    }
}

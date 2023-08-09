class h{
    public static void main(String[] args) {
        int n=5;
        int nst=n;
        int nsp=0;
        int row=1;
        while(row<=(2*n)-1){

            for(int i=1;i<=nsp;i++){
                System.out.print(" ");
            }
            for(int i=1;i<=nst;i++){
            System.out.print("* ");
        }
        if(row<n){
            nst--;
            nsp+=4;
        }
        else{
            nst++;
            nsp-=4;

        }
            System.out.println();
            row++;

        }
    }
}


class d{
    public static void main(String[] args) {
        int n=7;
        int nst=4;
        int nst2=n/2;
        int nsp=-1;
        int row=1;
        while(row<=n){

            for(int i=1; i<=nst; i++){
                System.out.print("* ");
            }
            for(int i=1;i<=nsp;i++){
                System.out.print(" ");
            }
            for(int i=1;i<=nst2;i++){
                System.out.print("* ");
            }
            if(row<=n/2){
                nst--;
                if(row!=1)
                nst2-=1;
                nsp+=4;

            }
            else{
                nst++;
                if(row!=n-1)
                nst2+=1;
                nsp-=4;
            }


            row++;
            System.out.println();
            

        }
    }
}
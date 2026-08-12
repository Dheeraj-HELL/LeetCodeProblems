// class Solution {
//     public int countEven(int num) {
//         int c=0;
//         for(int i=1; i<=num; i++){
//             int a=i;
//             int sum=0;
//             while(a>0){
//                 int t=a%10;
//                 a=a/10;
//                 sum+=t;
//             }
//             if(sum%2==0){
//                 c++;
//             }
//         }
//         return c;
//     }
// }

class Solution {
    public int countEven(int num) {
        if(num<10){
            return num/2;
        }else{
            int sum=0;
            int a=num;
            while(a>0){
                int t=a%10;
                a=a/10;
                sum+=t;
            }
            if(sum%2==0){
                return num/2;
            }else{
                return (num-1)/2;
            }
        }
        
    }
}
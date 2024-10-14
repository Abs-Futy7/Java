public class XorFrom_0_to_N {
    public static void main(String[] args) {
        int n = 5;
        int ans;
        ans = switch (n%4) {
            case 1 -> 1;
            case 2 -> n+1;
            case 3 -> 0;
            default -> n;
        };

        System.out.println(ans);
    }
}
/*
 public class XorFrom_0_to_N {
    public static void main(String[] args) {
        int n = 5;
        int ans;
        if(n%4==1){
            ans = 1;
        }
        else if(n%4==2){
            ans = n+1;
        }
        else if(n%4==3){
            ans = 0;
        }
        else{
            ans = n;
        }

        System.out.println(ans);
    }
}
 */

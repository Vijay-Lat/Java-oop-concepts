public class Steps {
    static int distance = 5;

    public static void main(String[] args){
       int answer = getDistance(6);
       System.out.println(answer);

    }
    public static int  getDistance(int dis){
        if(dis==0){
          return dis;
        }
        dis = dis/dis-1;

        return getDistance(dis) ;

    }
    
}

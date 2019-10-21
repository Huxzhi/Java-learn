package ccbupt.chapter03.classwork01;

public class Test04 {
    public static void main(String[] args) {
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};
        int max =array[1][1];
int x=1,y=1;
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++){
                if (max<array[i][j]){
            max=array[i][j];
            x=i;y=j;
                }
            }
            System.out.println("max "+ max +"第"+x+"行"+"第"+y+"列");
        }
    }
}

import java.util.Scanner;
public class Ex03 {
    static void maxQuantitiesBook(String[] names,int[] quantities){
        int max=quantities[0];
        int index=0;
        for(int i=0;i<quantities.length;i++){
            if(quantities[i]>max){
                max=quantities[i];
                index=i;
            }
        }
        System.out.printf("Sach co so luong nhieu nhat(%d) %n",quantities[index]);
        for(int i=0;i<quantities.length;i++){
                if(quantities[i]==max){
                    System.out.println("-"+names[i]);
                }
            }
        System.out.println("-------------");
    };
    static void minQuantitiesBook(String[] names,int[] quantities){
        int min=quantities[0];
        int index=0;
        for(int i=0;i<quantities.length;i++){
            if(quantities[i]<min){
                min=quantities[i];
                index=i;
            }
        }
        System.out.printf("Sach co so luong it nhat(%d) %n",quantities[index]);
        for(int i=0;i<quantities.length;i++){
            if(quantities[i]==min){
                System.out.println("-"+names[i]);
            }
        }
        System.out.println("-------------");
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String [] names =new String[]{"Quydz1","Doraemon","Xagent","CornTub","BigHamter"};
        int [] quantities= new int[] {9,1,5,9,5};
        maxQuantitiesBook(names,quantities);
        minQuantitiesBook(names,quantities);
    }
}

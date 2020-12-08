package java120701;


public class Find {
    public void findZero(int arr[][]){
        for (int row = 0; row <arr.length ; row++) {
            for (int column = 0; column <arr[row].length ; column++) {
                if(arr[row][column] == 0){
                    int zeroX = column;
                    int zeroY = row;
                    System.out.println("R_zero（"+zeroX+","+zeroY+")");
                }
            }
        }
    }
    public void findLeft(int arr[][]){
        for (int row = 0; row <arr.length ; row++) {
            for (int column = 0; column <arr[row].length ; column++) {
                if(arr[row][column] == 0){
                	int leftX = column-1<0 ? 0 : column-1;
                    int leftY = column-1<0 ? 0 : row;
                    System.out.println("R_left（"+leftX+","+leftY+")");
                }
            }
        }
    }
    public void findRight(int arr[][]){
        for (int row = 0; row <arr.length ; row++) {
            for (int column = 0; column <arr[row].length ; column++) {
                if(arr[row][column] == 0){
                    int rightX = column+1>=arr[row].length ? 0 : column+1;
                    int rightY = column+1>=arr[row].length ? 0 : row;
                    System.out.println("R_right（"+rightX+","+rightY+")");
                }
            }
        }
    }
    public void findUp(int arr[][]){
        for (int row = 0; row <arr.length ; row++) {
            for (int column = 0; column <arr[row].length ; column++) {
                if(arr[row][column] == 0){
                    int upX = row-1<0 ? 0 : column;
                    int upY = row-1<0 ? 0 : row-1;
                    try{
                        // TODO: 2020/12/7  若能取到即證明有值，否則行和列則是0
                        int item = arr[upY][upX];
                    }catch (Exception e){
                    	upY = 0;
                        upX = 0;
                    }
                    System.out.println("R_up（"+upX+","+upY+")");
                }
            }
        }
    }
    public void findDown(int arr[][]){
        for (int row = 0; row <arr.length ; row++) {
            for (int column = 0; column <arr[row].length ; column++) {
                if(arr[row][column] == 0){
                    int downX = row+1>=arr.length ? 0 : column;
                    int downY = row+1>=arr.length ? 0 : row+1;
                    try{
                        // TODO: 2020/12/7  若能取到即證明有值，否則行和列則是0
                        int item = arr[downY][downX];
                    }catch (Exception e){
                    	downY = 0;
                        downX = 0;
                    }
                    System.out.println("R_Down（"+downX+","+downY+")");
                }
            }
        }
    }
}

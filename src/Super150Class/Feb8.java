package Super150Class;

public class Feb8 {

    static int count = 0;
    public static void withBox(int col, int QTP, String path, int total_col){
        if(QTP == 0){
            System.out.println(path);
            return;
        }
        if(total_col== col){
            return;
        }
        withBox(col+1, QTP-1, path+" q"+col, total_col);
        withBox(col+1, QTP, path, total_col);

    }

    public static void main(String[]args){
//        withBox(0, 2, "", 4);
          twoDbox(0, 0, 2, "", 3);
    }

    public static void twoDbox(int col, int row, int QTP, String path, int total){
        if(QTP == 0){
            System.out.println(path);
            return;
        }
        if(col == total){
            row ++;
            col = 0;
        }
        if(row == total){
            return;
        }
            twoDbox(col + 1, row, QTP - 1, path + "q" + row + col, total);
            twoDbox(col + 1, row, QTP, path, total);
    }
}
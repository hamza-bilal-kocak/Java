import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    int rowlength,columnlength;
    int[][] map;
    int[][] board;
    int  size;
    boolean[][] isOpen;

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    MayinTarlasi(){}
    MayinTarlasi(int rowlength, int cloumblength){
        this.rowlength = rowlength;
        this.columnlength = cloumblength;
        this.map = new int[rowlength][cloumblength];
        this.board = new int[rowlength][cloumblength];
        this.size= cloumblength*rowlength;
    }

    public void Run(){
        System.out.println(size/4 + " tane mayınınız bulunmaktadır!" );
        Buildgame(size/4);
        isOpen = new boolean[rowlength][columnlength];

        for(int i = 0 ; i < rowlength ; i++)
            for(int j = 0 ; j < columnlength ; j++)
                isOpen[i][j] = false;

        print(map);
        game();
        System.out.println("Mayınlar burada");
        print(map);
    }
    public void game(){
        int r,c,s=0;
        while(s<size-size/4) {
            System.out.println("Satır Numarası:");
            r = scan.nextInt();
            System.out.println("Sütun Numarası:");
            c = scan.nextInt();

            /*Lanet sorgulamada && öncelikli koşulu sola yaz yoksa sçtığımın programı
            patlıyor. 5 saat bu b.ktan hatayı aradım*/
            if (map[r][c] == 0) {
                if ((c<columnlength-1) && (map[r][c + 1] == -1)) {
                    board[r][c]++;
                }
                if ((c>0) && (map[r][c - 1] == -1)) {
                    board[r][c]++;
                }
                if ((r<rowlength-1) && (map[r + 1][c] == -1)) {
                    board[r][c]++;
                }
                if ((r>0) && (map[r - 1][c] == -1)) {
                    board[r][c]++;
                }
                if ((r<rowlength-1) && (c<columnlength-1) && (map[r+1][c+1] == -1)) {
                    board[r][c]++;
                }
                if ((r<rowlength-1) && (c>0) && (map[r+1][c-1] == -1)) {
                    board[r][c]++;
                }
                if ((r>0) && (c>0) && (map[r-1][c-1] == -1)) {
                    board[r][c]++;
                }
                if ((r>0) && (c<columnlength-1) && (map[r-1][c+1] == -1)) {
                    board[r][c]++;
                }
                if(board[r][c]==0){
                    board[r][c]=-2;
                    dongu(r,c);
                }
            }
            else {
                System.out.println("You faild!");
                break;
            }
            print(board);
            s++;
        }
        System.out.println("Tebrikler bütün mayınsız arazileri buldunuz!");

    }
    public void dongu(int r, int c){
        for(int i =r-1; i!=r+2 ; i++ ){
            for(int j =c-1; j!=c+2 ; j++ ){
                System.out.println("hata konum1 : " + i + " "+ j);
                if((i!=r || j!=c) && (i!=-1)&&(j!=-1)&&(i!=rowlength)&&(j!=columnlength))
                    extra(i,j);
                System.out.println("hata konum2 : " + i + " "+ j);

            }
        }
    }
    public void extra(int er, int ec) {
        int es= 0;
        
        if (map[er][ec] == 0) {
            if ((ec < columnlength - 1) && (map[er][ec + 1] == -1) &&      !isOpen[er][ec]) {
                board[er][ec]++;
                isOpen[er][ec] = true;
            }
            if ((ec > 0) && (map[er][ec - 1] == -1)&& !isOpen[er][ec]) {
                board[er][ec]++;
                isOpen[er][ec] = true;
            }
            if ((er < rowlength - 1) && (map[er + 1][ec] == -1)&& !isOpen[er][ec]) {
                board[er][ec]++;
                isOpen[er][ec] = true;
            }
            if ((er > 0) && (map[er - 1][ec] == -1)&& !isOpen[er][ec]) {
                board[er][ec]++;
                isOpen[er][ec] = true;
            }
            if ((er < rowlength - 1) && (ec < columnlength - 1) && (map[er + 1][ec + 1] == -1)&& !isOpen[er][ec]) {
                board[er][ec]++;
                isOpen[er][ec] = true;
            }
            if ((er < rowlength - 1) && (ec > 0) && (map[er + 1][ec - 1] == -1)&& !isOpen[er][ec]) {
                board[er][ec]++;
                isOpen[er][ec] = true;
            }
            if ((er > 0) && (ec > 0) && (map[er - 1][ec - 1] == -1)&& !isOpen[er][ec]) {
                board[er][ec]++;
                isOpen[er][ec] = true;
            }
            if ((er > 0) && (ec < columnlength - 1) && (map[er - 1][ec + 1] == -1)&& !isOpen[er][ec]) {
                board[er][ec]++;
                isOpen[er][ec] = true;
            }
            if ((board[er][ec] == 0) && !isOpen[er][ec]) {
                board[er][ec] = -2;
                isOpen[er][ec] = true;
                dongu(er,ec);
            }
        }
    }
    public void Buildgame(int amount){
        int cnt =0;
        while(cnt < amount) {
            int randRow, randCloumb;
            randRow = rand.nextInt(rowlength);
            randCloumb = rand.nextInt(columnlength);
            if (map[randRow][randCloumb] !=-1) {
                map[randRow][randCloumb] = -1;
                cnt++;
            }
        }
    }

    public void print(int[][] arr){
        for(int i=0; i<this.rowlength;i++){
            for(int j=0; j<this.columnlength;j++){
                if (arr[i][j]>=0){
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
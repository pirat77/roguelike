
public class Board {

    int LEN=15;
    Area[][] map;

    Board(){
        this.map = new Area[LEN][LEN];
        for (int i=0; i<LEN; i++){
            for (int j=0; j<LEN; j++){
                this.map[i][j] = new Area();
            }
        } 
    }

    // generateBoard


}
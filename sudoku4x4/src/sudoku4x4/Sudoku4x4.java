/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku4x4;

/**
 *
 * 
 */
public class Sudoku4x4 {
     int[][] kotak = {{1, 0, 0, 0},
                      {0, 2, 0, 0},
                      {0, 0, 3, 0},
                      {0, 0, 0, 4}
        };
     
      boolean ada_kosong(){
        boolean ada = false;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
              if(kotak[i][j]==0){
                 ada = true;
                 return ada;
              }  
            }
        }
        return ada;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}

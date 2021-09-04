package NumberIslands;

public class Solution {
    
    public static void callBFS(int i, int j, char [][] grid){
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] != '1' ) {
            return;
        }
        grid[i][j] = '0';
        callBFS(i-1,j,grid);
        callBFS(i+1,j,grid);
        callBFS(i,j-1,grid);
        callBFS(i,j+1,grid);
    }
    
    public static int numIslands(char[][] grid) {
        int islands = 0;
        for (int i = 0 ; i < grid.length ; i++){
            for (int j = 0; j < grid[i].length ; j++){
                if (grid[i][j] == '1'){
                    islands++;
                    callBFS(i,j,grid);
                }
            }
        }
        return islands;
    }
    
    public static void main(String[] args) {
    	char [][] grid = {
    			{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','0','0','0'}
    	};
    	
    	System.out.println(numIslands(grid));
    }
}

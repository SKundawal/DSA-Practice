public class Main {
    public static void main(String[] args) {
        int grid[][] = {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };
        System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int perimeter = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    if(i - 1 < 0 || grid[i - 1][j] == 0){
                        perimeter++;
                    }

                    if(j + 1 >= n || grid[i][j + 1] == 0){
                        perimeter++;
                    }

                    if(i + 1 >= m || grid[i + 1][j] == 0){
                        perimeter++;
                    }

                    if(j - 1 < 0 || grid[i][j - 1] == 0) {
                        perimeter++;
                    }
                }
            }
        }

        return perimeter;
    }
}
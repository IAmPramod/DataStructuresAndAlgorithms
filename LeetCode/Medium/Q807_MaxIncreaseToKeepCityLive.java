/*
 * In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there.
 * We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings). 
 * Height 0 is considered to be a building as well. 
 * 
 * At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and right, 
 * must be the same as the skyline of the original grid. 
 * A city's skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance. 
 * 
 * What is the maximum total sum that the height of the buildings can be increased?
 * */

class Q807_MaxIncreaseToKeepCityLive {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int count=0;
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int[] rowMax = new int[rowLength];
        int[] colMax = new int[colLength];
        for(int i=0;i<rowLength;i++){
            rowMax[i] = findMax(grid[i]);
        }
        for(int i=0;i<colLength;i++){
            int[] tempColArray = new int[colLength];
            for(int j=0;j<rowLength;j++){
                tempColArray[j] = grid[j][i];
            }
            colMax[i] = findMax(tempColArray);
        }
        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
                int diff = (Math.min(rowMax[i],colMax[j])-grid[i][j]);
                if(diff>0) count+=diff;
            }
        }
        return count;
    }
    
    private static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            max = Math.max(max,i);
        }
        return max;
    }
}
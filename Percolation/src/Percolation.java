import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    int[][] grid;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n){

        try{
            if( n <= 0) throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        grid = new int[n][n];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){

            }
        }
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col)

    // is the site (row, col) open?
    public boolean isOpen(int row, int col)

    // is the site (row, col) full?
    public boolean isFull(int row, int col)

    // returns the number of open sites
    public int numberOfOpenSites()

    // does the system percolate?
    public boolean percolates()

    // test client (optional)
    public static void main(String[] args)
}

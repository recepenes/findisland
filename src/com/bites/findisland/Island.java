package com.bites.findisland;

public class Island implements MapInterface {

    private int mapIsland[][];

    private Dimension dimension;

    @Override
    public void SetSize(Dimension dim) {
        dimension = dim;
        mapIsland = new int[dim.width][dim.height];
        for(int i=0; i<dim.width; i++) {
            for(int j=0; j<dim.height; j++) {
                mapIsland[i][j] = 1;
            }
        }
    }

    @Override
    public void GetSize(Dimension dim) {
    }

    @Override
    public void SetBorder(int x, int y) throws Exception {
        mapIsland[x][y] =0;
    }

    @Override
    public void ClearBorder(int x, int y) throws Exception {
      mapIsland[x][y] = 1;
    }

    @Override
    public boolean IsBorder(int x, int y) throws Exception {
      return mapIsland[x][y] == 1;
    }

    @Override
    public void Show() {
        for (int[] ints : mapIsland) {
            for (int anInt : ints) {
                System.out.print(anInt == 1 ? "@" : "*");
            }
            System.out.print("\n");
        }
    }

    public int[][] getMapOfIsland() {
        return mapIsland;
    }

    public Dimension getDimension() {
        return dimension;
    }
}

Find rectangle with corners as 1
==============================================
class FindRectangleWithConcers {
    public boolean ValidCorner(int mat[][]) {
      int n = mat.length;
      int m = mat[0].length;
      for(int i=0;i<n;i++)
          for(int j=0;j<m;j++){
              if(mat[i][j]==1){
                  for(int c=j+1;c<m;c++){
                      if(mat[i][c]==1){
                          for(int r=i+1;r<n;r++){
                              if(mat[r][c]==1 && mat[r][j]==1){
                                  return true;
                              }
                          }
                      }
                  }
              }
          }
        return false;
    }
}

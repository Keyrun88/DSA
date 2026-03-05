package org.example.Graph;

public class WordSearch
{
    public boolean exist(char[][] board, String word) {

        int n = board.length;
        int m = board[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dfs(board, word, i, j, 0))
                    return true;
            }
        }

        return false;
    }


    private  static boolean  dfs(char[][] board,String word,int i,int j,int index)
    {
        if(word.length() == index) return  true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] != word.charAt(index))
            return false;

        char temp = board[i][j];
        board[i][j] = '#';

        boolean found =
        WordSearch.dfs(board,word,i+1,j,index+1) ||
        WordSearch.dfs(board,word,i-1,j,index+1) ||
        WordSearch.dfs(board,word,i,j+1,index+1) ||
        WordSearch.dfs(board,word,i,j-1,index+1);

        board[i][j] = temp;

        return found;

    }
}



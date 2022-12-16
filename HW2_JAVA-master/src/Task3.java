//https://leetcode.com/problems/flood-fill/submissions/860372989/
public class Task3 {
    private int n, m, nc, rc; // задаем переменные новый цвет,n - длина по строке, m- для по столбцу,
    // rc данный/текущий цвет

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        nc = newColor;
        n = image.length;
        rc = image[sr][sc];
        if (n == 0 || image == null)
            return null;
        m = image[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == sr && j == sc && image[i][j] != nc) {
                    runDFS(image, i, j);
                }
            }
        }
        return image;
    }

    private void runDFS(int[][] image, int i, int j) {
        //если закраска выходит за границу или не равена данному цвету
        if (i < 0 || i >= n || j < 0 || j >= m || image[i][j] != rc)
            return;
        image[i][j] = nc;
        runDFS(image, i - 1, j);
        runDFS(image, i + 1, j);
        runDFS(image, i, j - 1);
        runDFS(image, i, j + 1);

    }
}

public class Matrix {
    private int[][] mat;

    public Matrix (int[][] m) {
        mat = m;
    }

    public void reverseAllRows() {
        int i;
        for (i = 0; i < mat.length; i++) {
            int[] arr = mat[i];
            ArrayUtil.reverseArray(arr);
            mat[i] = arr;
        }
    }

    public void reverseAllColumns() {
        int[][] newMatrix = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                newMatrix[mat.length - i - 1][j] = mat[i][j];
            }
        }
        mat = newMatrix;
    }

    public void reverseMatrix() {
        reverseAllRows();
        reverseAllColumns();
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] desiredMat = {{4, 3, 2, 1}, {8, 7, 6, 5}, {12, 11, 10, 9}};
        Matrix mat1 = new Matrix(mat);
        mat1.reverseAllRows();
        System.out.println(mat1.mat[0][1] == desiredMat[0][1]);
        System.out.println(mat1.mat[2][1] == desiredMat[2][1]);
        System.out.println(mat1.mat[1][3] == desiredMat[1][3]);
        int[][] anotherMat = {{1, 2}, {3, 4}, {5, 6}};
        int[][] anotherDesiredMat = {{6, 5}, {4, 3}, {2, 1}};
        Matrix mat2 = new Matrix(anotherMat);
        mat2.reverseMatrix();
        System.out.println(mat2.mat[0][0] == anotherDesiredMat[0][0]);
        System.out.println(mat2.mat[0][1] == anotherDesiredMat[0][1]);
        System.out.println(mat2.mat[1][0] == anotherDesiredMat[1][0]);
        System.out.println(mat2.mat[1][1] == anotherDesiredMat[1][1]);
        System.out.println(mat2.mat[2][0] == anotherDesiredMat[2][0]);
        System.out.println(mat2.mat[2][1] == anotherDesiredMat[2][1]);
    }
}

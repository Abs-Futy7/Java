class MatrixMultiplier extends Thread {
    int[][] A, B, C;
    int rowStart, rowEnd;

    MatrixMultiplier(int[][] A, int[][] B, int[][] C, int rowStart, int rowEnd) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.rowStart = rowStart;
        this.rowEnd = rowEnd;
    }

    public void run() {
        for (int i = rowStart; i < rowEnd; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }
}

public class ThreadedMatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}};
        int[][] B = {{7, 8}, {9, 10}, {11, 12}};
        int[][] C = new int[A.length][B[0].length];

        // Creating two threads
        MatrixMultiplier thread1 = new MatrixMultiplier(A, B, C, 0, A.length / 2);
        MatrixMultiplier thread2 = new MatrixMultiplier(A, B, C, A.length / 2, A.length);

        // Start threads
        thread1.start();
        thread2.start();

        // Wait for threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print result
        System.out.println("Resultant Matrix C:");
        for (int[] row : C) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

/*How it Works?

    Thread 1 computes the first half of matrix C.
    Thread 2 computes the second half.
    The join() ensures both threads finish before printing.

Why Use Threads?

    Faster execution on multi-core processors.
    Efficient computation for large matrices. */

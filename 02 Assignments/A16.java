import java.util.Scanner;

public class A16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, m;

        // Input number of processes and resources
        System.out.print("Enter number of processes: ");
        n = sc.nextInt();

        System.out.print("Enter number of resource types: ");
        m = sc.nextInt();

        int[][] alloc = new int[n][m];
        int[][] max = new int[n][m];
        int[][] need = new int[n][m];
        int[] avail = new int[m];

        // Allocation Matrix
        System.out.println("Enter Allocation Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                alloc[i][j] = sc.nextInt();
            }
        }

        // Maximum Matrix
        System.out.println("Enter Maximum Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max[i][j] = sc.nextInt();
            }
        }

        // Available Resources
        System.out.println("Enter Available Resources:");
        for (int i = 0; i < m; i++) {
            avail[i] = sc.nextInt();
        }

        // Calculate Need Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                need[i][j] = max[i][j] - alloc[i][j];
            }
        }

        boolean[] finish = new boolean[n];
        int[] safeSeq = new int[n];

        int count = 0;

        while (count < n) {
            boolean found = false;

            for (int i = 0; i < n; i++) {

                if (!finish[i]) {

                    int j;
                    for (j = 0; j < m; j++) {
                        if (need[i][j] > avail[j]) {
                            break;
                        }
                    }

                    if (j == m) {

                        for (int k = 0; k < m; k++) {
                            avail[k] += alloc[i][k];
                        }

                        safeSeq[count++] = i;
                        finish[i] = true;
                        found = true;
                    }
                }
            }

            if (!found) {
                System.out.println("System is not in safe state.");
                return;
            }
        }

        // Print Safe Sequence
        System.out.println("System is in safe state.");
        System.out.print("Safe Sequence: ");

        for (int i = 0; i < n; i++) {
            System.out.print("P" + safeSeq[i]);

            if (i != n - 1)
                System.out.print(" -> ");
        }

        sc.close();
    }
}
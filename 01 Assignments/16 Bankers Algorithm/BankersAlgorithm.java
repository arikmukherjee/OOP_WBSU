import java.util.Arrays;

public class BankersAlgorithm {
    private int[][] allocation;    // Current allocation matrix
    private int[][] max;          // Maximum demand matrix
    private int[] available;       // Available resources
    private int[][] need;         // Need matrix (max - allocation)
    private int numProcesses;      // Number of processes
    private int numResources;      // Number of resources

    public BankersAlgorithm(int[][] allocation, int[][] max, int[] available) {
        this.allocation = allocation;
        this.max = max;
        this.available = available;
        this.numProcesses = allocation.length;
        this.numResources = available.length;

        // Calculate need matrix
        this.need = new int[numProcesses][numResources];
        for (int i = 0; i < numProcesses; i++) {
            for (int j = 0; j < numResources; j++) {
                need[i][j] = max[i][j] - allocation[i][j];
            }
        }
    }

    // Check if request can be granted
    public boolean requestResources(int processId, int[] request) {
        System.out.println("\n=== Processing Request from Process " + processId + " ===");
        System.out.println("Request: " + Arrays.toString(request));

        // Step 1: Check if request <= need
        for (int i = 0; i < numResources; i++) {
            if (request[i] > need[processId][i]) {
                System.out.println("Request denied: Request exceeds maximum need!");
                return false;
            }
        }

        // Step 2: Check if request <= available
        for (int i = 0; i < numResources; i++) {
            if (request[i] > available[i]) {
                System.out.println("Request denied: Insufficient resources available!");
                return false;
            }
        }

        // Step 3: Pretend to allocate resources
        int[] tempAvailable = Arrays.copyOf(available, numResources);
        int[][] tempAllocation = new int[numProcesses][numResources];
        int[][] tempNeed = new int[numProcesses][numResources];

        for (int i = 0; i < numProcesses; i++) {
            tempAllocation[i] = Arrays.copyOf(allocation[i], numResources);
            tempNeed[i] = Arrays.copyOf(need[i], numResources);
        }

        // Temporarily allocate resources
        for (int i = 0; i < numResources; i++) {
            tempAvailable[i] -= request[i];
            tempAllocation[processId][i] += request[i];
            tempNeed[processId][i] -= request[i];
        }

        // Step 4: Check if system is in safe state
        if (isSafeState(tempAllocation, tempAvailable, tempNeed)) {
            // Actually allocate the resources
            System.arraycopy(tempAvailable, 0, available, 0, numResources);
            allocation[processId] = Arrays.copyOf(tempAllocation[processId], numResources);
            need[processId] = Arrays.copyOf(tempNeed[processId], numResources);

            System.out.println("Request granted! Resources allocated.");
            return true;
        } else {
            System.out.println("Request denied: Would lead to unsafe state!");
            return false;
        }
    }

    // Safety algorithm to check if system is in safe state
    private boolean isSafeState(int[][] alloc, int[] avail, int[][] ned) {
        boolean[] finished = new boolean[numProcesses];
        int[] work = Arrays.copyOf(avail, numResources);
        int[] safeSequence = new int[numProcesses];
        int count = 0;

        System.out.println("Checking safety...");

        while (count < numProcesses) {
            boolean found = false;

            for (int i = 0; i < numProcesses; i++) {
                if (!finished[i]) {
                    // Check if need[i] <= work
                    boolean canFinish = true;
                    for (int j = 0; j < numResources; j++) {
                        if (ned[i][j] > work[j]) {
                            canFinish = false;
                            break;
                        }
                    }

                    if (canFinish) {
                        // Process can finish, add its resources back to work
                        for (int j = 0; j < numResources; j++) {
                            work[j] += alloc[i][j];
                        }
                        safeSequence[count++] = i;
                        finished[i] = true;
                        found = true;
                        System.out.println("Process " + i + " can finish. Work: " + Arrays.toString(work));
                    }
                }
            }

            if (!found) {
                System.out.println("System is in unsafe state!");
                return false;
            }
        }

        System.out.println("System is in safe state. Safe sequence: " + Arrays.toString(safeSequence));
        return true;
    }

    // Display current state
    public void displayState() {
        System.out.println("\n=== Current System State ===");
        System.out.println("Available Resources: " + Arrays.toString(available));

        System.out.println("\nAllocation Matrix:");
        for (int i = 0; i < numProcesses; i++) {
            System.out.println("Process " + i + ": " + Arrays.toString(allocation[i]));
        }

        System.out.println("\nMax Matrix:");
        for (int i = 0; i < numProcesses; i++) {
            System.out.println("Process " + i + ": " + Arrays.toString(max[i]));
        }

        System.out.println("\nNeed Matrix:");
        for (int i = 0; i < numProcesses; i++) {
            System.out.println("Process " + i + ": " + Arrays.toString(need[i]));
        }
    }

    public static void main(String[] args) {
        // Example system state
        // 3 processes, 3 resources (A=10, B=5, C=7)
        int[][] allocation = {
            {0, 1, 0},  // P0
            {2, 0, 0},  // P1
            {3, 0, 2}   // P2
        };

        int[][] max = {
            {7, 5, 3},  // P0
            {3, 2, 2},  // P1
            {9, 0, 2}   // P2
        };

        int[] available = {3, 3, 2};  // Available: A=3, B=3, C=2

        BankersAlgorithm banker = new BankersAlgorithm(allocation, max, available);

        System.out.println("=== Banker's Algorithm Demonstration ===");
        banker.displayState();

        // Test some requests
        int[][] requests = {
            {0, 2, 0},  // P0 requests (0,2,0)
            {2, 0, 2},  // P1 requests (2,0,2)
            {0, 0, 2}   // P2 requests (0,0,2)
        };

        for (int i = 0; i < requests.length; i++) {
            banker.requestResources(i, requests[i]);
            banker.displayState();
        }

        System.out.println("\n=== Final State ===");
        banker.displayState();
    }
}
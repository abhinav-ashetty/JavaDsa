import java.util.*;

public class p2 {
    static final int MAX = 200_005;
    static Set<String> stones = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of stones
        int N = scanner.nextInt();
        
        // Store stone coordinates
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            stones.add(x + "," + y);
        }
        
        // Count unreachable points
        int result = countUnreachablePoints();
        
        // Print the result
        System.out.println(result);
        
        scanner.close();
    }

    static int countUnreachablePoints() {
        int count = 0;
        
        // Iterate through all possible lattice points
        for (int x = 0; x <= MAX; x++) {
            for (int y = 0; y <= MAX; y++) {
                // Skip if current point is a stone
                if (stones.contains(x + "," + y)) continue;
                
                // If cannot reach (-1, -1), increment count
                if (!canReachTarget(x, y)) {
                    count++;
                }
            }
        }
        
        return count;
    }

    static boolean canReachTarget(int startX, int startY) {
        // Set to track visited points
        Set<String> visited = new HashSet<>();
        
        // Queue for BFS
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        visited.add(startX + "," + startY);
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1];
            
            // Reached target
            if (x == -1 && y == -1) return true;
            
            // Possible moves: up, down, left, right
            int[][] moves = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
            
            for (int[] move : moves) {
                int nx = x + move[0];
                int ny = y + move[1];
                String key = nx + "," + ny;
                
                // Check if move is valid
                if (isValidMove(nx, ny) && 
                    !stones.contains(key) && 
                    !visited.contains(key)) {
                    queue.offer(new int[]{nx, ny});
                    visited.add(key);
                }
            }
        }
        
        return false;
    }

    static boolean isValidMove(int x, int y) {
        // Allow moves to (-1, -1) and first quadrant points
        return (x == -1 && y == -1) || 
               (x >= 0 && y >= 0 && x <= MAX);
    }
}
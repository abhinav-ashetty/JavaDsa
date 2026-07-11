import java.util.*;

public class p3 {
    static final int MAX_COORD = 200_005;
    static Set<String> stones = new HashSet<>();
    static Set<String> visited = new HashSet<>();
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

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
        
        // Count unreachable lattice points
        int unreachablePoints = countUnreachablePoints();
        
        System.out.println(unreachablePoints);
        scanner.close();
    }

    static int countUnreachablePoints() {
        int count = 0;
        
        // Iterate through all possible lattice points
        for (int x = 0; x <= MAX_COORD; x++) {
            for (int y = 0; y <= MAX_COORD; y++) {
                // Skip if current point is a stone
                if (stones.contains(x + "," + y)) continue;
                
                // Reset visited set for each point
                visited.clear();
                
                // If cannot reach (-1, -1), increment count
                if (!canReachTarget(x, y)) {
                    count++;
                }
            }
        }
        
        return count;
    }

    static boolean canReachTarget(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        visited.add(startX + "," + startY);
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1];
            
            // Reached target
            if (x == -1 && y == -1) return true;
            
            // Try all 4 directions
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                String key = nx + "," + ny;
                
                // Check boundary conditions and stone placement
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
               (x >= 0 && y >= 0 && x <= MAX_COORD && y <= MAX_COORD);
    }
}
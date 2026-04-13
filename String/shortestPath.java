// Problem: Find the shortest path distance after following directions (N, S, E, W)
// Approach: Track displacement on x and y axis
// N -> y+1, S -> y-1, E -> x+1, W -> x-1
// Final distance = sqrt(x^2 + y^2)
// Time Complexity: O(n)
// Space Complexity: O(1)
package String;

public class shortestPath {
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int X2 = x * x; // (X2-X1)^2 = (X2^2) cuz(X1=0)
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }

}

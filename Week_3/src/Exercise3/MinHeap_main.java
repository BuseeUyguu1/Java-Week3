package Exercise3;

public class MinHeap_main {
    public static void main(String[] args) {

        Integer[] A = {14, 20, 2, 15, 10, 21};

        MinHeapInterface<Integer> minHeap = new MinHeap<>();
        for (int i = 0; i < A.length; i++) {
            minHeap.add(A[i]);
        }

        if (minHeap.isEmpty())
            System.out.println("The heap is empty - INCORRECT");
        else
            System.out.println("The heap is not empty; it contains " +
                    minHeap.getSize() + " entries.");

        System.out.println("The smallest entry is " + minHeap.getMin());

        System.out.println("\n\nRemoving entries in ascending order:");
        while (!minHeap.isEmpty())
            System.out.println("Removing " + minHeap.removeMin());
    }
}
/*OUTPUT:
The heap is not empty; it contains 6 entries.
The smallest entry is 2


Removing entries in ascending order:
Removing 2
Removing 10
Removing 14
Removing 15
Removing 20
Removing 21
 */

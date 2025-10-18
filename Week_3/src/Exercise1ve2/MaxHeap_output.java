package Exercise1ve2;

public class MaxHeap_output {
    public static void main(String[] args) {
        Integer[] A = {14, 20, 2, 15, 10, 21};

        MaxHeapInterface<Integer> maxHeap = new MaxHeap<>();
        for (int i = 0; i < A.length; i++) {
            maxHeap.add(A[i]);
        }

        if (maxHeap.isEmpty())
            System.out.println("The heap is empty - INCORRECT");
        else
            System.out.println("The heap is not empty; it contains " +
                    maxHeap.getSize() + " entries.");

        System.out.println("The largest entry is " + maxHeap.getMax());

        System.out.println("\n\nRemoving entries in descending order:");
        while (!maxHeap.isEmpty())
            System.out.println("Removing " + maxHeap.removeMax());
    }
}
/*OUTPUT:
The heap is not empty; it contains 6 entries.
The largest entry is 21


Removing entries in descending order:
Removing 21
Removing 20
Removing 15
Removing 14
Removing 10
Removing 2 */

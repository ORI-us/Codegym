
package codegym;

/**
 *
 * @author orius
 */
public class BinaryHeap {
  private int[] Kucha;
  private int heapSize;
  
  public BinaryHeap(int size) {
      Kucha = new int[size];
      heapSize = 0;
  }

  public void insert(int val) 
  {
    Kucha[heapSize]=val;
    heapSize++;
    
    int i = heapSize - 1;
    int parent = (i - 1) / 2;

    while (i > 0 && Kucha[parent] < Kucha[i])
    {
        int temp = Kucha[i];
        Kucha[i] = Kucha[parent];
        Kucha[parent] = temp;

        i = parent;
        parent = (i - 1) / 2;
    }
  }

  public int poll() {
    
      return Kucha[0];
  }
}

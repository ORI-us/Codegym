/*
Бінарна Купа

Реалізуйте структуру даних  - Бінарна Купа (Binary Heap). 
Конструктор проймає один параметр size. 
Методи insert(int) що працює за O(logN) і poll(), 
який видаляє і повертає максимальне число з купи і також працює за O(logN).
*/
package codegym;

/**
 *
 * @author orius
 */
public class BinaryHeap {
  private int[] Heap;
  private int heapSize;
  
  public BinaryHeap(int size) {
      Heap = new int[size];
      heapSize = 0;
  }

  public void insert(int val) 
  {
    if(val <= 0)
        return;
        
    Heap[heapSize]=val;
    heapSize++;
    
    int i = heapSize - 1;
    int parent = (i - 1) / 2;

    while (i > 0 && Heap[parent] < Heap[i])
    {
        int temp = Heap[i];
        Heap[i] = Heap[parent];
        Heap[parent] = temp;

        i = parent;
        parent = (i - 1) / 2;
    }
  }

  public int poll() {
      int r = Heap[0];
      
      Heap[0]    = 0;
      int parent = 0;
      int i      = 1;
      
      while(i < heapSize)
      {
          if(Heap[i] < Heap[i+1])
              i++;
          
             Heap[parent] = Heap[i];
             Heap[i] = 0;
             parent = i;
             i = 2*parent+1;
      }
      
      heapSize--;
      
      return r;
  }
}

class Element<T2>{
    int index;
    T2 value;
    Element<T2> next;

    public Element(int i, T2 value) {
        // TODO: Remove index and dependencies.
        this.index = i;
        this.value = value;
        this.next = null;
    }
}

public class LinkedList<T extends Object>{
    
    private int length = 0;
    public int length() {
        return length;
    }

    private Element<T> link = null;

    private Element<T> getLastLink(Element<T> startLink) {
        Element<T> lastLink = startLink; 
        while(lastLink.next != null)
            lastLink = lastLink.next;
        return lastLink;
    }

    public void add(T item) {
        if(link == null){
            link = new Element<T>(length, item);
        }
        else{
            Element<T> lastLink = getLastLink(link);
            lastLink.next = new Element<T>(length, item);
        }
        length++;
    }

    private Element<T> getLink(int index, Element<T> startLink) {
        Element<T> currentLink = startLink; 
            while(currentLink.index != index){
                if(currentLink.next == null)
                    throw new IndexOutOfBoundsException("Index out of bounds");
                else
                    currentLink = currentLink.next;
            }
        return currentLink;
    }

    private Element<T> getLink(int index) {
        return getLink(index, link);
    }

    public T get(int index) {
        return getLink(index).value;
    }

    /**
     * Removes an item from the LinkedList
     * @param index The index of the item to be removed
     * @return The value of the removed item
     */
    public T remove(int index){
        Element<T> link = getLink(index);
        Element<T> linkBefore = getLink(index - 1);
        Element<T> linkAfter = link.next;
        linkBefore.next = linkAfter;
        // link.dispose();
        return link.value;
    }
    
    // public T[] toArray() {
    //     T[] array = null;
        
    //     try {
    //         array = (T[])Array.newInstance(---, length);
    //     } catch (NegativeArraySizeException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //     } catch (ClassNotFoundException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //     }

    //     for (int i = 0; i < length; i++) {
    //         array[i] = get(i);
    //     }
    //     return array;
    // }

    // public T[] toArray(){
    //     Object[] array =  new Object[length];
    //     for (int i = 0; i < length; i++) {
    //         array[i] = get(i);
    //     }
    //     return (T[]) array;
    // }

    // public T[] toArray(){
    //     T[] array = new T[length];
    //     for (int i = 0; i < length; i++) {
    //         array[i] = get(i);
    //     }
    //     return array;
    // }
}

package LinkedLists;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

}

public class MiddleElement {
    int getMiddle(Node head)
    {
        // Your code here.
        Node nxt = head;
        int count = 0;
        while(nxt.next != null){
            nxt = nxt.next;
            count++;
        }

        double middleDouble = (double) count/2;
        int middle = (int) Math.ceil(middleDouble);
        if((int) middleDouble - Math.floor(middleDouble) > 0){
            middle = (int) Math.ceil(middleDouble);
        } else {
            middle = (int) Math.floor(middleDouble) + 1;
        }
        count = 0;
        int nodeData = 0;
        nxt = head;
        while(middle != count && nxt.next != null){
            nxt = nxt.next;
            nodeData = nxt.data;
            count++;
        }
        return nodeData;


    }

    int getMiddleTwo(Node head)
    {
        // Your code here.
        Node tail = head;
        int currentNodeNumber = 1;

        while(tail.next != null){
            tail = tail.next;
            currentNodeNumber++;
        }

        int middleNodeIndex = (int) Math.floor( (float) currentNodeNumber/2) + 1;
        tail = head;
        currentNodeNumber = 1;
        int nodeData = tail.data;
        while(tail.next != null){
            tail = tail.next;
            nodeData = tail.data;
            currentNodeNumber++;

            if(currentNodeNumber == middleNodeIndex) {
                return nodeData;
            }
        }
        return nodeData;
    }
}

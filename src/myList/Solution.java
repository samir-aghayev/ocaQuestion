package myList;//{ Driver Code Starts

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.SoftReference;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class DeleteNode {
    Node head;

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t > 0) {
            String[] s = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node copy = head;
            for (int i = 1; i < s.length; i++) {
                Node temp = new Node(Integer.parseInt(s[i]));
                copy.next = temp;
                copy = copy.next;
            }

            int x = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            Node ans = ob.deleteNode(head, x);

            while (ans != null) {
                System.out.print(ans.data + " ");
                ans = ans.next;
            }
            System.out.println();
            System.out.println("~");
            t--;
        }
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = node;
        }
    }
}

// } Driver Code Ends


/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
        if (head == null || x < 1) {
            return head;
        }
        if (x == 1) {
            return head.next;
        }
        Node before = head;
        Node curr = head.next;
        int count = 2;
        while (curr != null) {
            if (count == x) {
                before.next = curr.next;
                break;
            }
            before = curr;
            curr = curr.next;
            count++;
        }

        return head;
    }

    int getMiddle(Node head) {
        int count = 1;
        Node curr = head;
        while (curr.next != null) {
            count++;
            curr = curr.next;
        }
        if (count % 2 != 0) {
            count = (count + 1) / 2;
        } else {
            count = count / 2 + 1;
        }
        curr = head;
        int newCount = 1;
        while (curr.next != null) {
            if (newCount == count) {
                return curr.data;
            }
            curr = curr.next;
        }
        return 0;
    }

    int getMiddle2(Node head) {
        if (head == null) {
            return -1;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
}
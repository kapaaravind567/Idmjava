import java.util.Scanner;

 

class Node {
    int data;
    Node link;

 

    Node() {
        this.link = null;
    }
}

 

public class LinkedListDemo {
    static Node head = null;

 

    public static void create(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.link = null;
        if (head == null) {
            head = temp;
        } else {
            Node p = head;
            while (p.link != null) {
                p = p.link;
            }
            p.link = temp;
        }
    }

 

    public static void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Empty List!");
        } else {
            while (temp.link != null) {
                System.out.println(temp.data);
                temp = temp.link;
            }
            System.out.println(temp.data);
        }
    }

 

    static void menu() {
        String m = "Menu Driven Application\n";
        m += "1. Add Element\n";
        m += "2. Display elements\n";
        m += "3. No.of Nodes\n";
        m += "4. Exit\n";
        m += "Enter your choice";
        System.out.println(m);
    }

 

    static void accept() {
        System.out.println("Enter Any value ");
    }
    static int length() {
        int count = 0;
        Node temp = head;
        if(temp == null) {
            System.out.println("No Elements are there");
        }
        else {
            while(temp.link != null) {
                count++;
                temp = temp.link;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        LinkedListDemo obj = new LinkedListDemo();
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            menu();
            int choice = sc.nextInt();
            switch (choice) {
            case 1:
                accept();
                create(sc.nextInt());
                break;
            case 2:
                print();
                break;
            case 3:
                System.out.println(length());
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Please select a valid option");
            }
            System.out.println("Do you want to continue?");
            ch = sc.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}
 
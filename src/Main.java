import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int countWord(String input) {
        if (input == null) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;
        Myqueue mq = new Myqueue();
        MyStack ms = new MyStack();
        while (true) {
            System.out.println("Chọn đối tượng: ");
            System.out.println("1: nhập ký tự");
            System.out.println("2. Gửi tin nhắn");

            System.out.println("3. Hiển thị tin nhắn đã nhận");
            System.out.println("4. Exit");
            choice = sc.nextLine();
            switch (choice) {
                case "1": {
                    String mess = "haihihi ";
                    System.out.println("Nhap ki tu: ");
                    do {
                        mess = sc.nextLine();
                        if (!"done".equals(mess)) {
                            if (countWord(mess) <= 250) {
                                mq.enqueue(new Node(mess));
                            } else {
                                System.out.println("over word");
                            }
                        }
                    } while (!"done".equals(mess));
                    break;
                }

                case "2": {
                    mq.display();
                    break;
                }
                case "3": {

                    while (!mq.isEmpty()) {
                        Node x = mq.dequeue();
                        ms.push(x);
                        System.out.println("Tin nhắn đang gửi");
                    }            
                    System.out.println("Thư trong ngăn xếp ");

                    while (!ms.isEmpty()) {
                        System.out.println(ms.pop().getContent());
                    }
                    break;
                }
                case "4": {
                    System.exit(0);
                }
            }
        }
    }
}
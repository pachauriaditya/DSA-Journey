public class designBrowserHistory {
    static class Node {
        String data;
        Node next;
        Node back;

        Node(String data) {
            this.data = data;
            this.next = null;
            this.back = null;
        }
    }

    static class Browser {

        Node currentPage;

        Browser(String homepage) {
            currentPage = new Node(homepage);
        }

        void visit(String url) {
            Node newNode = new Node(url);

            currentPage.next = newNode;
            newNode.back = currentPage;
            currentPage = newNode;
        }

        String back(int steps) {
            while (steps > 0) {
                if (currentPage.back != null)
                    currentPage = currentPage.back;
                else
                    break;

                steps--;
            }
            return currentPage.data;
        }

        String forward(int steps) {
            while (steps > 0) {
                if (currentPage.next != null)
                    currentPage = currentPage.next;
                else
                    break;

                steps--;
            }
            return currentPage.data;
        }
    }

    public static void main(String[] args) {

        Browser browser = new Browser("leetcode.com");

        browser.visit("google.com");
        browser.visit("facebook.com");
        browser.visit("youtube.com");

        System.out.println(browser.back(1));      // facebook.com
        System.out.println(browser.back(1));      // google.com
        System.out.println(browser.forward(1));   // facebook.com

        browser.visit("linkedin.com");

        System.out.println(browser.forward(2));   // linkedin.com
        System.out.println(browser.back(2));      // google.com
        System.out.println(browser.back(7));      // leetcode.com
    }
}

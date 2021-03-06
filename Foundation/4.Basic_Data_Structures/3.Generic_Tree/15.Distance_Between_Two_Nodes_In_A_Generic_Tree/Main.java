import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
    if (node.data == data) {
      ArrayList<Integer> path = new ArrayList<>();
      path.add(node.data);
      return path;
    }

    for (Node child : node.children) {
      ArrayList<Integer> ptc = nodeToRootPath(child, data);
      if (ptc.size() > 0) {
        ptc.add(node.data);
        return ptc;
      }
    }

    return new ArrayList<>();
  }

  public static int lca(Node node, int d1, int d2) {
    ArrayList<Integer> p1 = nodeToRootPath(node, d1);
    ArrayList<Integer> p2 = nodeToRootPath(node, d2);

    int i = p1.size() - 1;
    int j = p2.size() - 1;

    while(i >= 0 && j >= 0 && p1.get(i) == p2.get(j)){
      i--;
      j--;
    }

    return p1.get(i + 1);
  }
//   // SP Nain
//   public static int distanceBetweenNodes(Node node, int d1, int d2){
    
//     ArrayList<Integer> fal = nodeToRootPath(node, d1);
//     ArrayList<Integer> sal = nodeToRootPath(node, d2);
    
//     int lcap = 0;
//     int falp = fal.size()-1;
//     int salp = sal.size()-1;
//     while(fal.get(falp) == sal.get(salp)){
//         falp--;
//         salp--;
//         if(falp<0 || salp<0){
//             break;
//         }
//     }
//     int dbn = (falp+1)+(salp+1);
//     return dbn;
//   }

// MB
public static int distanceBetweenNodes(Node node, int d1, int d2) {
    ArrayList<Integer> list1 = nodeToRootPath(node, d1);
    ArrayList<Integer> list2 = nodeToRootPath(node, d2);
    
    int p1 = list1.size()-1;
    int p2 = list2.size()-1;
    while(p1>0&&p2>0){
        if(list1.get(p1) == list2.get(p2)){
            p1--;
            p2--;
        }
        else{
            break;
        }

    }
    
    p1++;
    p2++;
    return p1+p2;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    int d1 = Integer.parseInt(br.readLine());
    int d2 = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    int dist = distanceBetweenNodes(root, d1, d2);
    System.out.println(dist);
    // display(root);
  }

}
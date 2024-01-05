public class tree_main{
public static void main(String[] args){
TreeMap<Integer,Integer> tree=new TreeMap<>();
tree.put(8,8);
tree.put(5,5);
tree.put(3,3);
tree.put(7,7);
tree.put(15,15);
tree.put(6,6);
tree.put(1,1);
tree.put(4,4);
tree.put(2,2);
tree.put(9,9);
tree.put(25,25);
tree.put(17,17);
tree.put(36,36);

System.out.println(tree.k_max(1));
}
}

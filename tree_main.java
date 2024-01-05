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
// method inorder subtree dakhel class abstrack binarry tree ra iz chap pedar rast be rast pedar chap taghir dadam ta list be sorat nozoli va nakos chap shavad
    // sepas k omin onsar onra ba komak fo each dakhel methon k_max dakhel class treemap bedast ovordam
System.out.println(tree.k_max(1));
}
}

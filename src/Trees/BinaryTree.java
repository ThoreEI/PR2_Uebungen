package Trees;

public class BinaryTree {

    /*
    Inorder
        left --> root --> right
    Preorder
        root --> left --> right
    Postorder
        left --> right --> root
    Level order
        nodes on current level -> next level

    Complexity of contains, insert & remove
        - Best case:
                    - Every inner node has two followers
                    - A tree at level k has 2*k nodes
                    - A tree with height n = k+1 can contain 1 + 2 + 4 +... + 2k-2 + 2k-1 + 2k nodes
                    - Height = log2(n) -> (balanced tree)

        - Worst case:
                    - Tree degenerates to a list -> Height = nodes

     */
}

package kunal.Main;
/**
 * Created by kv58935 on 12/15/2018.
 */

    class Node2
    {
        int data;
        Node2 left, right;

        Node2(int item)
        {
            data = item;
            left = right = null;
        }
    }

    class BinaryTree2
    {
        Node2 root;

        /* Compute the "maxDepth" of a tree -- the number of
        nodes along the longest path from the root node
        down to the farthest leaf node.*/
        int maxDepth(Node2 node)
        {
            if (node == null)
                return 0;
            else
            {
			/* compute the depth of each subtree */
                int lDepth = maxDepth(node.left);
                int rDepth = maxDepth(node.right);

			/* use the larger one */
                if (lDepth > rDepth)
                    return (lDepth + 1);
                else
                    return (rDepth + 1);
            }
        }

        /* Driver program to test above functions */
        public static void main(String[] args)
        {
            BinaryTree2 tree = new BinaryTree2();

            tree.root = new Node2(1);
            tree.root.left = new Node2(2);
            tree.root.right = new Node2(3);
            tree.root.left.left = new Node2(4);
            tree.root.left.right = new Node2(5);

            System.out.println("Height of tree is : " +
                    tree.maxDepth(tree.root));
        }
    }
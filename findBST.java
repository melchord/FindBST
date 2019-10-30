/**
 * Class which will hold the logic of finding the closest integer value in a binary
 * search tree
 * @author - Melchor Dominguez
 * @version - 10/26/2019
 */
public class FindBST{
    
    /**
     * Class which will return the closest value within a given binary search tree
     * to the target value
     * @param tree - A binary search tree which has an integer stored in a property called
     *              "value" and two children nodes stored in properties called
     *              "left" and "right," respectively.
     * @param target - the target integer
     */
    public static int findBST(BST tree, int target){
        return getCloser(tree, target, Double.MAX_Value);
    }
    
    /**
     * Helper function to get closer to the target value
     * @param tree - A binary search tree with the same properties as previously mentioned.
     * @param target - the target integer
     * @param closest - currently the closest integer
     */
    public static int getCloser(BST tree, int target, double closest){
        //check if the current value in the tree is closer
        if(Math.abs(target - closest) > Math.abs(target - tree.value)){
            closest = tree.value; //new value if current value is closer
        }

        if(target > tree.value && tree.right != null){
            return getCloser(tree.right, target, closest);
        }else if(target < tree.value && tree.left != null){
            return getCloser(tree.left, targetm closest);
        }

        return (int) closest; //target has been met or no children left that are closer
    }

    /**
     * Inner class which holds the logic for a binary search tree
     */
    class BST{
        /** Integer value stored in the current node*/
        public int value;
        /** Left node which contains a smaller value than the current node*/
        public BST left;
        /** Right node which contains a greater value than the current node*/
        public BST right;
        
        /**
         * Constructor for the binary search tree
         * @param value - the value to be stored in the current node
         */
        public BST(int value){
            this.value = value;   
        }
    }

}

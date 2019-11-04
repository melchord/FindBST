package test;

import source.FindBST;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Junit tests for class which will determine if the closest value in a binary search tree
 * is accurate
 * @author - Melchor Dominguez
 * @version - 11/1/2019
 */
public class Tests{
    
    public TestBST test;

    public Tests(){
        this.test = new TestBST(100);
        this.test
            .insert(5)
            .insert(15)
            .insert(5)
            .insert(2)
            .insert(2)
            .insert(1)
            .insert(22)
            .insert(1)
            .insert(1)
            .insert(3)
            .insert(1)
            .insert(502)
            .insert(55000)
            .insert(204)
            .insert(205)
            .insert(207)
            .insert(206)
            .insert(-10)
            .insert(-400)
            .insert(60)
            .insert(5000);
    }
    
    @Test
    public void TestCase1(){
        assertTrue(FindBST.findBST(this.test,100) == 100);
    }

    @Test 
    public void TestCase2(){
        assertTrue(FindBST.findBST(this.test,207) == 207);
    }

    @Test
    public void TestCase3(){
        assertTrue(FindBST.findBST(this.test, -60) == -10);
    }

    @Test
    public void TestCase4(){
        assertTrue(FindBST.findBST(this.test,2000)== 502);
    }

    @Test
    public void TestCase5(){
        assertTrue(FindBST.findBST(this.test,-1) == 1);
    }
    
    class TestBST extends FindBST.BST{
        public TestBST(int value){
            super(value);
        }

        public TestBST insert(int value){
            FindBST.BST current = null;
            if(value < this.value){
                if(this.left == null){
                    FindBST.BST newBST = new FindBST.BST(value);
                    this.left = newBST;
                    return this;   
                }else{
                    current = this.left;
                }
            }else{
                if(right == null){
                    FindBST.BST newBST = new FindBST.BST(value);
                    this.right = newBST;
                    return this;
                }else{
                    current = this.right;
                }
            }
            while(true){
                if(value < current.value){
                    if(current.left == null){
                        FindBST.BST newBST = new FindBST.BST(value);
                        current.left= newBST;
                        return this;
                    }else{
                        current = current.left;
                    }
                }else{
                    if(current.right == null){
                        FindBST.BST newBST = new FindBST.BST(value);
                        current.right = newBST;
                        return this;
                    }else{
                        current = current.right;
                    }
                }
            }
        }
    }
}


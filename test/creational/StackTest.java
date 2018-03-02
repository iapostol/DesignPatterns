package creational;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void pushOneItemToStack(){
        Stack stack = Stack.getInstance();

        stack.push(1);

        Assert.assertEquals(1, stack.getSize());
    }

    @Test
    public void popOneItemFromStack(){
        Stack stack = Stack.getInstance();

        stack.pop();

        Assert.assertEquals(0, stack.getSize());
    }
}

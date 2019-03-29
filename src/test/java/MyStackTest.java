import com.jason.algorithm.base.MyStack;
import org.junit.Test;

public class MyStackTest {

    @Test
    public void test() throws Exception{
        MyStack stack = new MyStack();
        for (int i = 0; i < 9; i++) {
            stack.push("test"+i);
        }
        System.out.println(stack);
        System.out.println("frist pop="+stack.pop());
//        System.out.println("second pop="+stack.pop());
//        System.out.println("pop 之后的"+stack);

    }
}

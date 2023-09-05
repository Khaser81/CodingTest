package Stack;

import org.example.leetcode.Stack.ValidParentheses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    private final ValidParentheses validParentheses= new ValidParentheses();

    @Test
    void normal_pattern1(){
        Assertions.assertTrue(validParentheses.isValid("()"));
    }

    @Test
    void normal_pattern2(){
        Assertions.assertTrue(validParentheses.isValid("()[]{}"));
    }

    @Test
    void abnormal_pattern1(){
        Assertions.assertFalse(validParentheses.isValid("(}"));
    }
}

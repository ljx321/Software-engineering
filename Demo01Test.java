import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Demo01Test {

 @Test
 public void test() {
  int[] arr={12,6,4,8,3};
  Demo01.mpPx(arr);
  System.out.println(Arrays.toString(arr));
 }
}
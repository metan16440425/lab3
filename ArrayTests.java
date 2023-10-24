import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] input2 = { 1,2,3,4};
    ArrayExamples.reverseInPlace(input2);

    assertArrayEquals(new int[]{4,3,2,1 }, input2);
    

	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] input2={1,2,3,4,5};
  
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input2));
    
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] array={1.0,2.0,2.0,1.0};
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(array),1e-15);
  }


}

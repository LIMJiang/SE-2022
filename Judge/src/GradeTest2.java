import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeTest2 {

	@Test
	void test() {
		Grade city=new Grade();
		int result=city.Grading(1314);
		assertEquals(2,result);
	}

}

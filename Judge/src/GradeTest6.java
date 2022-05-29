import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeTest6 {

	@Test
	void test() {
		Grade city=new Grade();
		int result=city.Grading(150);
		assertEquals(6,result);
	}

}

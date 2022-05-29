import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeTest7 {

	@Test
	void test() {
		Grade city=new Grade();
		int result=city.Grading(20);
		assertEquals(7,result);
	}

}

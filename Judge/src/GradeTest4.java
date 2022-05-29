import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeTest4 {

	@Test
	void test() {
		Grade city=new Grade();
		int result=city.Grading(530);
		assertEquals(4,result);
	}

}

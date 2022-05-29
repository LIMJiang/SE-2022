import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeTest3 {

	@Test
	void test() {
		Grade city=new Grade();
		int result=city.Grading(860);
		assertEquals(3,result);
	}

}

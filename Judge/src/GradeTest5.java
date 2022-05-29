import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeTest5 {

	@Test
	void test() {
		Grade city=new Grade();
		int result=city.Grading(201);
		assertEquals(5,result);
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeTest {

	@Test
	void testGrading() {
		Grade city=new Grade();
		int result=city.Grading(2022);
		assertEquals(1,result);
	
	}

}

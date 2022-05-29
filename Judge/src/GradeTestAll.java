import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GradeTestAll {

	@ParameterizedTest
	@CsvSource({"2022,1","1314,2","860,3","530,4","201,5","150,6","20,7"})
	void test(int number,int level) {
		Grade city=new Grade();
		int result=city.Grading(number);
		assertEquals(level,result);
	}

}

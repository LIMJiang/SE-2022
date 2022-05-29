
public class Grade {
	protected int Grading(int s)
	{
		if(s<50)
			return 7;
		else if(s<200)
			return 6;
		else if(s<500)
			return 5;
		else if(s<800)
			return 4;
		else if(s<1300)
			return 3;
		else if(s<2000)
			return 2;
		else 
			return 1;
	}
	
	
}

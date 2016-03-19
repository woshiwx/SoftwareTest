package ST;

public class Triangle {	
	public String judge(double a, double  b, double  c)
	{
		if(a+b>c&&b+c>a&&a+c>b)
		{
			if(a==b||b==c||c==a)
			{	
				if(a==b&&b==c)
					return "equilateral";
				else return "isosceles";
			}
			else return "scalene";
		}
		else return "it is not a triangle";		
	}
}

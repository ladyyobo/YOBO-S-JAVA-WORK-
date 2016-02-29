public class ElseAndIf
{
	public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;

		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
                if ( cars < people ) //else if gives an alternative condition to be tested
		{
			System.out.println( "We should not take the cars." );
		}
                else // else gives an instruction to be executed after the if and else if statement conditions are not met.
		{
			System.out.println( "We can't decide." );
		} // Removing else from the else if creates a new if statement and causes the else statement to be executed.


		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}

	}
}

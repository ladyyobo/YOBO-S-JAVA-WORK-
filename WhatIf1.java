public class WhatIf1
{
	public static void main(String [] args)
	{
		int people = 30;
		int cats = 30;
		int dogs = 15;

		if ( people < cats )// The if statement is a test statement.It tests whether a condition is true and then executes the instuction given.
		{ //The curly brackets contain the instruction to be executed after the condition has been tested.
			System.out.println( "Too many cats!  The world is doomed!" );
		}

		if ( people > cats )
		{
			System.out.println( "Not many cats!  The world is saved!" );
		}

		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}

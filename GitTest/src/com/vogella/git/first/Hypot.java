package com.vogella.git.first;

public class Hypot
	{

		public static void main(String[] args)
			{
				/*Use the Pythagorean theorem to find the length of the hypotenuse given the length of the two opposing sides*/
				
				double x,y,z;
				x = 3;
				y = 4;
				
				z = Math.sqrt(x*x +y*y);
				System.out.println("Hypotenuse is "+z);

			}

	}

package com.vogella.git.first;

public class Histogram
	{

		private final double [] freq;
		private double max;
		
		public Histogram(int N)
		{
			freq = new double [N];
		}
		
		public void addDataPoint(int i)
		{
			freq[i]++;
			if(freq[i]>max)max =freq[i];
			draw();
		}
		
		
		private void draw()
		{
			StdDraw.setYscale(0,max);
			StdStats.plotBars(freq);
			
		}
		public static void main(String[] args)
			{
			int N = 100;
			int T = 50;
				Histogram histogram = new Histogram(N+1);
				for (int t = 0; t<T; t++)
					histogram.addDataPoint(Bernoulli.binomial(N));
				StdDraw.setCanvasSize(300,400);
				histogram.draw();
			}
			
		}
		
	

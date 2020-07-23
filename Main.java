/* Name: Richard Haynes III
 * Course: CNT 4714 Summer 2020
 * Assignment title: Project 2 - Synchronized, Cooperating Threads Under Locking
 * Due Date: June 14, 2020
 */

import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {

			final Threads thrd = new Threads();
		
			Thread d1 = new Thread(new Runnable()
			{
				public void run()
				{
					while(true)
					{
						try
						{
							thrd.depositOne();
									
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					 }
				}
			});
			Thread d2 = new Thread(new Runnable()
			{
				public void run()
				{
					while(true)
					{
						try
						{
							thrd.depositTwo();
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			});
			Thread d3 = new Thread(new Runnable()
			{
				public void run()
				{
					while(true)
					{
						try
						{
							thrd.depositThree();
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			});
			Thread d4 = new Thread(new Runnable()
			{
				public void run()
				{
					while(true)
					{
						try
						{
							thrd.depositFour();
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			});
			Thread d5 = new Thread(new Runnable()
			{
				public void run()
				{
					while(true)
					{
						try
						{
							thrd.depositFive();
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			});
			Thread w1 = new Thread(new Runnable()
			{
				public void run()
				{
					while(true)
					{
						try
						{
							thrd.withdrawlOne();
						}catch (Exception e)
						{
							e.printStackTrace();
						}
				    }
				}
			});
			Thread w2 = new Thread(new Runnable()
			{
				public void run()
				{
					while(true)
					{
						try
						{
							thrd.withdrawlTwo();
						}catch (Exception e)
						{
							e.printStackTrace();
						}
					}
				}
			});
			Thread w3 = new Thread(new Runnable()
			{
				public void run()
				{
					while(true)
					{
						try
						{
							thrd.withdrawlThree();
						}catch (Exception e)
						{
							e.printStackTrace();
						}
					}
				}
			});
			Thread w4 = new Thread(new Runnable()
			{
				public void run()
				{
					while(true)
					{
						try
						{
							thrd.withdrawlFour();
						}catch (Exception e)
						{
							e.printStackTrace();
						}
					}
				}
			});
			Thread w5 = new Thread(new Runnable()
			{
				public void run()
				{
					while(true)
					{
						try
						{
							thrd.withdrawlFive();
						}catch (Exception e)
						{
							e.printStackTrace();
						}
					}
				}
			});
			Thread w6 = new Thread(new Runnable()
			{
				public void run()
				{
					while(true)
					{
						try
						{
							thrd.withdrawlSix();
						}catch (Exception e)
						{
							e.printStackTrace();
						}
					}
				}
			});
			Thread w7 = new Thread(new Runnable()
			{
				public void run()
				{
					while(true)
					{
						try
						{
							thrd.withdrawlSeven();
						}catch (Exception e)
						{
							e.printStackTrace();
						}
					}
				}
			});
			Thread w8 = new Thread(new Runnable()
			{
				public void run()
				{
					while(true)
					{
						try
						{
							thrd.withdrawlEight();
						}catch (Exception e)
						{
							e.printStackTrace();
						}
					}
				}
			});
			Thread w9 = new Thread(new Runnable()
			{
				public void run()
				{
					while(true)
					{
						try
						{
							thrd.withdrawlNine();
						}catch (Exception e)
						{
							e.printStackTrace();
						}
					}
				}
			});
			d1.start();
			d2.start();
			d3.start();
			d4.start();
			d5.start();
			w1.start();
			w2.start();
			w3.start();
			w4.start();
			w5.start();
			w6.start();
			w7.start();
			w8.start();
			w9.start();
		}
}

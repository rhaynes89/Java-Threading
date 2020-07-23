/* Name: Richard Haynes III
 * Course: CNT 4714 Summer 2020
 * Assignment title: Project 2 - Synchronized, Cooperating Threads Under Locking
 * Due Date: June 14, 2020
 */

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;

public class Threads {

	private int bankAccount;
	private int withdrawlAmount;
	private int depositAmount;
	private Lock newLock = new ReentrantLock();
	//private Condition cond = newLock.newCondition();
	private Random rand = new Random();
	
	
	public void depositOne() throws Exception
	{
		newLock.lock();
		Thread.sleep(rand.nextInt(1000));
		try
		{
			depositAmount = rand.nextInt(250);
			bankAccount += depositAmount;
			System.out.println("Thread D1 Amount: $" + depositAmount + ".......Bank Total: $" + bankAccount + "\n");
		}
		finally
		{
			newLock.unlock();
			Thread.sleep(rand.nextInt(10000));
		}
	}
	public void depositTwo() throws Exception
	{
		newLock.lock();
		Thread.sleep(rand.nextInt(1000));
		try
		{
			depositAmount = rand.nextInt(250);
			bankAccount += depositAmount;
			System.out.println("Thread D2 Amount: $" + depositAmount + ".......Bank Total: $" + bankAccount + "\n");
		}
		finally
		{
			newLock.unlock();
			Thread.sleep(rand.nextInt(10000));
		}
	}
	public void depositThree() throws Exception
	{
		newLock.lock();
		Thread.sleep(rand.nextInt(1000));
		try
		{
			depositAmount = rand.nextInt(250);
			bankAccount += depositAmount;
			System.out.println("Thread D3 Amount: $" + depositAmount + ".......Bank Total: $" + bankAccount + "\n");
		}
		finally
		{
			newLock.unlock();
			Thread.sleep(rand.nextInt(10000));
		}
	}
	public void depositFour() throws Exception
	{
		newLock.lock();
		Thread.sleep(rand.nextInt(1000));
		try
		{
			depositAmount = rand.nextInt(250);
			bankAccount += depositAmount;
			System.out.println("Thread D4 Amount: $" + depositAmount + ".......Bank Total: $" + bankAccount + "\n");
		}
		finally
		{
			newLock.unlock();
			Thread.sleep(rand.nextInt(10000));
		}
	}
	public void depositFive() throws Exception
	{
		newLock.lock();
		Thread.sleep(rand.nextInt(1000));
		try
		{
			depositAmount = rand.nextInt(250);
			bankAccount += depositAmount;
			System.out.println("Thread D5 Amount: $" + depositAmount + ".......Bank Total: $" + bankAccount + "\n");
		}
		finally
		{
			newLock.unlock();
			Thread.sleep(rand.nextInt(10000));
		}
	}
	public void withdrawlOne() throws Exception
	{
		newLock.lock();
	
		try
		{
			withdrawlAmount = rand.nextInt(50);
			if(withdrawlAmount > bankAccount)
			{
				System.out.println("Thread W1 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount);
				System.out.println("******** INSUFFICIENT FUNDS ******** W1 blocked\n\n");
				Thread.sleep(rand.nextInt(100));
			}
			else if(withdrawlAmount > 0)
			{
				bankAccount -= withdrawlAmount;
				System.out.println("Thread W1 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount + "\n");
				Thread.sleep(rand.nextInt(5));
			}
		}
		finally
		{
			newLock.unlock();
			Thread.sleep(rand.nextInt(10));
		}
	}
	public void withdrawlTwo() throws Exception
	{
		newLock.lock();
	
		try
		{
			withdrawlAmount = rand.nextInt(50);
			if(withdrawlAmount > bankAccount)
			{
				System.out.println("Thread W2 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount);
				System.out.println("******** INSUFFICIENT FUNDS ******** W2 blocked\n\n");
				Thread.sleep(rand.nextInt(100));
			}
			else if(withdrawlAmount > 0)
			{
				bankAccount -= withdrawlAmount;
				System.out.println("Thread W2 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount + "\n");
				Thread.sleep(rand.nextInt(5));
			}
		}
		finally
		{
			newLock.unlock();
			Thread.sleep(rand.nextInt(10));
		}
	}
	public void withdrawlThree() throws Exception
	{
		newLock.lock();
	
		try
		{
			withdrawlAmount = rand.nextInt(50);
			if(withdrawlAmount > bankAccount)
			{
				System.out.println("Thread W3 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount);
				System.out.println("******** INSUFFICIENT FUNDS ******** W3 blocked\n\n");
				Thread.sleep(rand.nextInt(100));
			}
			else if(withdrawlAmount > 0)
			{
				bankAccount -= withdrawlAmount;
				System.out.println("Thread W3 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount + "\n");
				Thread.sleep(rand.nextInt(5));
			}
		}
		finally
		{
			newLock.unlock();
			Thread.sleep(rand.nextInt(10));
		}
	}
	public void withdrawlFour() throws Exception
	{
		newLock.lock();
	
		try
		{
			withdrawlAmount = rand.nextInt(50);
			if(withdrawlAmount > bankAccount)
			{
				System.out.println("Thread W4 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount);
				System.out.println("******** INSUFFICIENT FUNDS ******** W4 blocked\n\n");
				Thread.sleep(rand.nextInt(100));
			}
			else if(withdrawlAmount > 0)
			{
				bankAccount -= withdrawlAmount;
				System.out.println("Thread W4 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount + "\n");
				Thread.sleep(rand.nextInt(5));
			}
		}
		finally
		{
			newLock.unlock();
			Thread.sleep(rand.nextInt(10));
		}
	}
	public void withdrawlFive() throws Exception
	{
		newLock.lock();
	
		try
		{
			withdrawlAmount = rand.nextInt(50);
			if(withdrawlAmount > bankAccount)
			{
				System.out.println("Thread W5 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount);
				System.out.println("******** INSUFFICIENT FUNDS ******** W5 blocked\n\n");
				Thread.sleep(rand.nextInt(100));
			}
			else if(withdrawlAmount > 0)
			{
				bankAccount -= withdrawlAmount;
				System.out.println("Thread W5 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount + "\n");
				Thread.sleep(rand.nextInt(5));
			}
		}
		finally
		{
			newLock.unlock();
			Thread.sleep(rand.nextInt(10));
		}
	}
	public void withdrawlSix() throws Exception
	{
		newLock.lock();
	
		try
		{
			withdrawlAmount = rand.nextInt(50);
			if(withdrawlAmount > bankAccount)
			{
				System.out.println("Thread W6 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount);
				System.out.println("******** INSUFFICIENT FUNDS ******** W6 blocked\n\n");
				Thread.sleep(rand.nextInt(100));
			}
			else if(withdrawlAmount > 0)
			{
				bankAccount -= withdrawlAmount;
				System.out.println("Thread W6 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount + "\n");
				Thread.sleep(rand.nextInt(5));
			}
		}
		finally
		{
			newLock.unlock();
			Thread.sleep(rand.nextInt(10));
		}
	}
	public void withdrawlSeven() throws Exception
	{
		newLock.lock();
	
		try
		{
			withdrawlAmount = rand.nextInt(50);
			if(withdrawlAmount > bankAccount)
			{
				System.out.println("Thread W7 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount);
				System.out.println("******** INSUFFICIENT FUNDS ******** W7 blocked\n\n");
				Thread.sleep(rand.nextInt(100));
			}
			else if(withdrawlAmount > 0)
			{
				bankAccount -= withdrawlAmount;
				System.out.println("Thread W7 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount + "\n");
				Thread.sleep(rand.nextInt(5));
			}
		}
		finally
		{
			newLock.unlock();
			Thread.sleep(rand.nextInt(10));
		}
	}
	public void withdrawlEight() throws Exception
	{
		newLock.lock();
	
		try
		{
			withdrawlAmount = rand.nextInt(50);
			if(withdrawlAmount > bankAccount)
			{
				System.out.println("Thread W8 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount);
				System.out.println("******** INSUFFICIENT FUNDS ******** W8 blocked\n\n");
				Thread.sleep(rand.nextInt(100));
			}
			else if(withdrawlAmount > 0)
			{
				bankAccount -= withdrawlAmount;
				System.out.println("Thread W8 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount + "\n");
				Thread.sleep(rand.nextInt(5));
			}
		}
		finally
		{
			newLock.unlock();
			Thread.sleep(rand.nextInt(10));
		}
	}
	public void withdrawlNine() throws Exception
	{
		newLock.lock();
	
		try
		{
			withdrawlAmount = rand.nextInt(50);
			if(withdrawlAmount > bankAccount)
			{
				System.out.println("Thread W9 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount);
				System.out.println("******** INSUFFICIENT FUNDS ******** W9 blocked\n\n");
				Thread.sleep(rand.nextInt(100));
			}
			else if(withdrawlAmount > 0)
			{
				bankAccount -= withdrawlAmount;
				System.out.println("Thread W9 Amount: $" + withdrawlAmount + ".......Bank Total: $" + bankAccount + "\n");
				Thread.sleep(rand.nextInt(5));
			}
		}
		finally
		{
			newLock.unlock();
			Thread.sleep(rand.nextInt(10));
		}
	}
	
}

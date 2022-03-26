//package com.incubyte.assessment.stringcalculatortest;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.incubyte.assessment.stringcalculator.StringCalculator;

//package com.incubyte.assessment.stringcalculatortest;


class StringCalculatorTest 
{

	StringCalculator1 calculator = new StringCalculator1();
	
	@Test
	public void checkIfStringIsEmptyAndReturnZero() 
	{
	
		assertEquals(0, calculator.add(""));
	}
	
	@Test
	public void checkIfStringHasOnlyOneNumberAndReturnNumberItself() 
	{
		
		assertEquals(2, calculator.add("2"));
	}
	
	@Test
	public void checkIfStringHasTwoNumbersDelimitedByCommaAndReturnSum() 
	{
		
		assertEquals(5, calculator.add("3,2"));
	}
	
	@Test
	public void checkIfStringHasMultipleNumbersDelimitedByCommaAndReturnSum() 
	{
		
		assertEquals(10, calculator.add("3,2,5"));
	}
	
	@Test
	public void allowNewLineAsValidDelimiterBetweenNumbersAndReturnSum() 
	{
		
		assertEquals(10, calculator.add("3\n2,5"));
	}
	
	@Test
	public void checkIfStringContainsDelimiterStartWithLineAndReturnSum() 
	{
		
		assertEquals(3, calculator.add("//;\n1;2"));
	}
	
	@Test
	public void checkIfStringContainsNegativeNumberAndReturnException() 
	{
		try 
		{
			calculator.add("-3,-2,5");
			
			fail("Negative Number Exception expected.");
		}
		
		catch(RuntimeException e)
		{
			assertEquals("Negatives not allowed: [-3, -2]", e.getMessage());
		}
	}
	
	@Test
	public void getAddCallCount()
	{
		
		assertEquals(StringCalculator.getCalledCount(), StringCalculator.getAddCount);
	}

	@Test
	public void checkIfStringContainsNumberGreaterThan1000AndIgnoreTheNo() 
	{
		
		assertEquals(5, calculator.add("5,1002"));
	}
	
	@Test
	public void allowOneDelimiterOfAnyLengthBetweenNumbersAndReturnSum() 
	{
		
		assertEquals(10, calculator.add("//[***]\n3***2***5"));
	}
	
	@Test
	public void allowMutlipleDelimiterBetweenNumbersAndReturnSum() 
	{
		
		assertEquals(10, calculator.add("//[*][%]\n3*2%5"));
	}
	
	@Test
	public void allowMutlipleDelimiterOfAnyLengthBetweenNumbersAndReturnSum() 
	{
		
		assertEquals(10, calculator.add("//[**][%%]\n3**2%%5"));
	}


}

public class StringCalculator1 
{
	
	public static int getAddCount = 0;
	
	public int add(String numbers) 
	{ 
		getAddCount++;
		
		if(numbers.isEmpty() || numbers == null)
		{
			return 0;	
		}
		
		else if(numbers.contains(",") || numbers.contains("\n"))
		{			
			
			return getMultipleNumberSum(getStringTokens(numbers));
		}

		else
		{
			return Integer.parseInt(numbers);
		}
		
	}
	
	private static int getMultipleNumberSum(String [] number)
    {       
        int sum = 0;
        
        int size = number.length;
        		
		int checkValidNumber = 0;
		
		String str = "";
				
		List <Integer> negativeNumbers = new ArrayList<>();
		
		List <Integer> ignoredNumbers = new ArrayList<>();
		
		for(int i = 0; i<size; i++)
		{
			Matcher match = Pattern.compile("^(\\+|-)?\\d+$").matcher(number[i]);
			
			while(match.find())
			{	
				str = match.group();
				
				checkValidNumber = Integer.parseInt(number[i]);

				if(checkValidNumber < 0)
				{
					negativeNumbers.add(checkValidNumber);
				}
				if(checkValidNumber > 1000)
				{
					checkValidNumber = 0;
				}
				
				ignoredNumbers.add(checkValidNumber);
				
				sum = sum + checkValidNumber;
			 }
        	       		
		}
		
		if(negativeNumbers.size() > 0)
		{
			throw new RuntimeException("Negatives not allowed: " + negativeNumbers);
		}
        
		return sum;
    }
	
	private static String [] getStringTokens(String number)
    {
		if(number.startsWith("//"))
		{
			if(number.startsWith("//["))
			{
				return supportDifferentOrMultipleDelimiterAnyLengthAndSplit(number);
			}
			
			else
			{
				return supportDifferentDelimiterAndSplit(number);
			}			
		}
		
		else
		{
			return supportNewlineAndCommasDelimiterAndSplit(number);
		}
    }
	
	private static String[] supportNewlineAndCommasDelimiterAndSplit(String number)
	{
		String[] numberSplit = number.split(",|\n");
		
		return numberSplit;
	}

	private static String[] supportDifferentDelimiterAndSplit(String number)
	{
		Matcher checkNumberMatch = Pattern.compile("//(.)\n(.*)").matcher(number);
		
		checkNumberMatch.matches();
		
		String delimiter = checkNumberMatch.group(1);
		
		String newNumber = checkNumberMatch.group(2);
		
		return newNumber.split(delimiter);
	}
	
	private static String[] supportDifferentOrMultipleDelimiterAnyLengthAndSplit(String number)
	{
		Matcher checkNumberMatch = Pattern.compile("//(\\[.+\\])+\n(.*)").matcher(number);
		
		checkNumberMatch.matches();
		
		String checkDelimiter = checkNumberMatch.group(1);
		
		String delimiters = new String();

		int size = checkDelimiter.length();
		
		int end = 0;
		
		for(int i = 0; i < size ; i++)
		{
			if( checkDelimiter.charAt(i) == ']' && i != size - 1 )
			{	
				delimiters = delimiters + checkDelimiter.substring(end,i);
				
				delimiters = delimiters + "]|";
				
				end = i + 1;

			}

			else if(i == size-1)
			{
				delimiters += checkDelimiter.substring(end,i) + "]";
			}
				
		}
		
		String newNumber = checkNumberMatch.group(2);

		return newNumber.split(delimiters); 
	}
	
	public static int getCalledCount()
	{
		return getAddCount;
	}

}
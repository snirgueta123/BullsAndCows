

import java.util.ArrayList;


//The department responsible for the game logic.
public class GameLogic {
	protected final int LENGTH = 4;//The length of the guess

	private int numberOfGuess=0;//The number of guesses
	private int Bulls=0; ;//The number of stamps
	private int Cows=0;  ;//The number of hits
	private int cover=0;//A number that prevents runtime errors when Cancel or X is pressed in the first text box

	private int[] theNumber=new int[LENGTH];//The number the user has to guess


	private ArrayList<String> guess=new ArrayList<String>();//A linked list that holds the guess history

	public  GameLogic() {//Reset variables for starting a new game

		numberOfGuess=0;
		LotteryNumber(theNumber);



	}

	public ArrayList<String> getGuess() {//Returns the history of guess results
		return guess;
	}
	public int checkGuess(String number) //The method passes the user's input and returns the result of the current guess
	{

		while((Bulls!=LENGTH || cover==Integer.parseInt(number)) && number!=null ) 
		{
			if(number.length()!=LENGTH)//Checking that the user did not exceed the allowed number of characters
				return 1;
			else 
			{
				++numberOfGuess;
				Bulls=0;
				Cows=0;
				for(int i=0;i<LENGTH;i++) 
				{


					if(number.charAt(i)< '0' || number.charAt(i)> '9')//Checking whether the input contains only numbers
					{
						numberOfGuess=0;
						return 2; 
					}
				}

				for(int i=0;i<LENGTH;i++) {
					if(number.charAt(i)-'0'==theNumber[i])// Checking whether there is a Bull
						Bulls++;
					else if (isCows(number.charAt(i),number))//Checking whether there is a Cow
						Cows++;	
				}//for
				guess.add( "\n The guess " + numberOfGuess +": "  + number + ", Bulls: "+Bulls + ", Cows: " + Cows );//Adding the results of the current guess to the history of guesses
				return 3;
			}//else

		}

		return 0;
	}
	private boolean isCows(char ch,String number) {//Checks whether the current digit that the user has typed is Cow

		for(int i=0;i<LENGTH;i++)

		{

			if(theNumber[i]==ch-'0' && number.charAt(i)!=theNumber[i])
				return true;
		}
		return false;
	}

	private void LotteryNumber(int[] theNumber) { //Number lottery between 0 and 9 without repetitions
		int rand;
		int[] a=new int[10];
		for(int j=0;j<10;j++)
			a[j]=j;
		for(int i=0;i<LENGTH;i++)
		{
			rand = (int)(Math.random()*10);
			while(a[rand]==-1)
			{
				rand = (int)(Math.random()*10);	
			}
			theNumber[i]=rand;
			a[rand]=-1;
		}
	}

	public int getCows() {//Returns the number of Cows.

		return Cows;
	}
	public int getBulls() {//Returns the number of Bulls.

		return Bulls;
	}
	public int getNumberOfGuess() {//Returns the number of number of guess.

		return numberOfGuess;
	}


}





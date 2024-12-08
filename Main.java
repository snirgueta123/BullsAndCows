

import javax.swing.JOptionPane;
//The department that manages the game Bulls a Cows and issues appropriate messages to the user.
public class Main {
	public static void main(String[] args) {
		int state;
		String str;
		int gameOn=JOptionPane.YES_OPTION;
		GameLogic game = new GameLogic();


		while(gameOn==JOptionPane.YES_OPTION ) {	
			while(game.getBulls()!=game.LENGTH)
			{
				str=JOptionPane.showInputDialog("Please enter your guess:");
				if(str==null)//When requesting to enter a number, we can click X or cancel without the window appearing again.
					return;
				state=game.checkGuess(str);
				if(state==1 || state==2)
				{
					if(state==1)
						JOptionPane.showMessageDialog(null,"The guess must contain exactly 4 numbers");//error message
					else
						JOptionPane.showMessageDialog(null,"The guess must contain only numbers");//error message
					//JOptionPane.showInputDialog("Please enter your guess:");

				}
				else
				{
					JOptionPane.showMessageDialog(null,game.getBulls()==game.LENGTH? "You win \n Bulls: " + game.getBulls()+"\n   Cows: "+ game.getCows() +"\nTotal guess : "+ game.getNumberOfGuess()+"\n" +game.getGuess()  : game.getGuess() );

				}



			}
			gameOn=JOptionPane.showConfirmDialog(null, "Play again?");
			if(gameOn==JOptionPane.YES_OPTION)
				game = new GameLogic();
		}

	}

}

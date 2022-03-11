import java.util.Scanner;
import java.lang.Math;
public class LSCoinFlip {
	
	public static void main(String[] args) {	
		Scanner scnr = new Scanner(System.in);
		
		int max = 2;
        int min = 1;
        int range = max - min + 1;
		int tailsCounter = 0;
		int headsCounter = 0;
		int correctCount = 0;
		int numberOfFlips = 0;
		int moneyBank = 100;
			
		System.out.println("******************************************");
		System.out.println("*  Warning: Leisure Suit Coin Flippers   *"); 
		System.out.println("* has some elements of plot which may not*");
		System.out.println("* be considered appropriate for children *");
		System.out.println("******************************************");
		System.out.println("How old are you? :");
		int playerAge = scnr.nextInt();
		if ((playerAge >= 18) && playerAge <= 75) {
			System.out.println("To verify you are really " + playerAge + " please answer three simple questions.");
			System.out.println("Question 1. Is this software pirated?");
			System.out.println("a. Yes.");
			System.out.println("b. I'm not talking.");
			System.out.println("c. No. (How could you even ask!)");
			System.out.println("d. No, just borrowed.");
			System.out.println("Please answer a, b, c, or d:");
			char firstQuestion = scnr.next().charAt(0);
			if (firstQuestion == 'c') {
				System.out.println("Correct");
				System.out.println("Question 2. IBM stands for");
				System.out.println("a. Ittsy Bittsy Men.");
				System.out.println("b. International Business Machines.");
				System.out.println("c. Italian Branch of the Mafia");
				System.out.println("d. Ice Block Makers.");
				System.out.println("Please answer a, b, c, or d:");
				char secondQuestion = scnr.next().charAt(0);
				if (secondQuestion == 'b' ) {
					System.out.println("Correct");
					System.out.println("Final Question. A hard disk is");
					System.out.println("a. Better than a floppy.");
					System.out.println("b. Better than a CD.");
					System.out.println("c. A state of the art frisbee.");
					System.out.println("d. What happens when you leave your floppy out in the sun too long.");
					System.out.println("Please answer a, b, c, or d:");
					char finalQuestion = scnr.next().charAt(0);
					if (finalQuestion == 'a') {
						System.out.println("Correct!");
						System.out.println("");
						System.out.println("*************************");
						System.out.println("And now, slip into your Leisure Suit and prepare to");
						System.out.println("enter the land of the coin flippers!");
						System.out.println("*************************");
						System.out.println("");
						Scanner scnrTwo = new Scanner(System.in);
						System.out.println("How much would you like to bet?");
						System.out.println("You have $" + moneyBank + " in your bank.");
						int bet = scnrTwo.nextInt();
						if (bet > 100) {
							System.out.println("Lol, you only have $100, but ok. Your first born sits on the table.");
							System.out.println("You still bet the full $" + bet);
							} else if (bet == 100) {
								System.out.println("Going all in!? Good luck!");
								System.out.println("You bet $" + bet);
							} else if ((bet < 100) && (bet >= 75)) {
								System.out.println("Betting a good chunk there - hope it works out!");
								System.out.println("You bet $" + bet);
							} else if (bet <= 74) {
								System.out.println("A cautious bet! What's your strategy, anyways?");
								System.out.println("You bet $" + bet);
							} else {
								System.out.println("You didn't bet anything?");
								}
							Scanner scnrThree = new Scanner(System.in);
							System.out.println("Guess which will have more - heads or tails?:");
												
							String headsOrTailsGuess = scnrThree.nextLine();
						
							System.out.println("How many times shall we flip the coin?");
							System.out.println("Double your money if your guess is in the majority (50% or more).");
							System.out.println("Lose your bet if your guess is in the minority (49% or less).");
						
							int loop = scnrThree.nextInt();
						
								for (int i = 0; i < loop; i++) {
									int rand = (int)(Math.random() * range) + min; 
				            
									if (rand <= 1) {
										tailsCounter++;
										numberOfFlips++;
										System.out.println("tails");
									} else { 
										headsCounter++;
										numberOfFlips++;
										System.out.println("heads");
										}
										if (headsOrTailsGuess.equals("heads")) {
											correctCount = headsCounter;
				            	
										} else {
											correctCount = tailsCounter;
											}  
								}
										System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + correctCount + " times.");
										System.out.println("Thats " + correctCount * 100 / numberOfFlips + "%");
										
									
											if ((correctCount * 100 / numberOfFlips) >= 50) {
												moneyBank = bet * 2 + 100;
												System.out.println("Congrats! You now have $" + moneyBank);
											} else {
												System.out.println("Ouch! You're leaving with $" + (moneyBank - bet) + ".");
												}
											if (moneyBank < 0) {
												System.out.println("Well, they were a good kid while they lasted.");
												System.out.println("Thanks for playing!");
											} else if 														
												(moneyBank > 300) {
												System.out.println("****************************");
												System.out.println("*       Boss Fight !       *");
												System.out.println("*         Uh oh.           *");
												System.out.println("*   The Pit Boss is mad.   *");
												System.out.println("*He wanted your first born.*");
												System.out.println("****************************");
												Scanner scnrBoss = new Scanner(System.in);
												System.out.println("You have two options. Enter your choice as a number.");
												System.out.println("1. Run");
												System.out.println("2. Fight");
						        
														int firstBoss = scnrBoss.nextInt();
															if (firstBoss == 1) {
																int bossRunMax = 4;
																int bossRunMin = 1;
																int bossRunRange = bossRunMax - bossRunMin + 1;
																	for (int i = 0; i < 1; i++) {
																		int randRunBoss = (int)(Math.random() * bossRunRange) + bossRunMin; 
							            
																			if (randRunBoss <= 1) {							            	
																				System.out.println("You tried to run but tripped and fell!");
																				System.out.println("Anyways...they were a good kid while they lasted.");
																				System.out.println("Thanks for playing!");
																			} else { 
																				System.out.println("You outran the Pit Boss and managed to save your cash and your kid!");
																				System.out.println("You won't be allowed back, but at least you have a good story.");
																				}
																		}
																	scnr.close();
																	scnrTwo.close();
																	scnrThree.close();
																	scnrBoss.close();
															} else {
																System.out.println("You chose to fight the Pit Boss!?");
																int bossFightMax = 4;
																int bossFightMin = 1;
																int bossFightRange = bossFightMax - bossFightMin + 1;
																	for (int i = 0; i < 1; i++) {
																		int randFightBoss = (int)(Math.random() * bossFightRange) + bossFightMin;
																		if (randFightBoss <= 2) {							            	
																			System.out.println("You tried your best to fight, but were no match for this guy.");
																			System.out.println("What were you thinking!?.");
																			System.out.println("Anyways...they were a good kid while they lasted.");
																			System.out.println("Thanks for playing!");
																		} else { 
																			System.out.println("You got a lucky punch and managed to save your cash and your kid!");
																			System.out.println("You won't be allowed back, but at least you have a good story.");
																			}
																		}
																	}
													} else {
														System.out.println("Thanks for playing!");
														}
					} else {
						System.out.println("You're a kid!!");
						System.out.println("Shame on you for trying to deceive a friendly game like this!");
						System.out.println("Please play again when you're older.");
						}	
				} else {
					System.out.println("You're a kid!!");
					System.out.println("Shame on you for trying to deceive a friendly game like this!");
					System.out.println("Please play again when you're older.");
					}
			
			} else {
				System.out.println("You're a kid!!");
				System.out.println("Shame on you for trying to deceive a friendly game like this!");
				System.out.println("Please play again when you're older.");
				}
				
		} else {
			System.out.println("You're a kid!!");
			System.out.println("Shame on you for trying to deceive a friendly game like this!");
			System.out.println("Please play again when you're older.");
			}
	} 
}

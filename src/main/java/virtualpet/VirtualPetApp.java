package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int currentHunger = 40;
		int currentThirst = 10;
		int currentBoredom = 15;

		VirtualPet myPet = new VirtualPet(currentHunger, currentThirst, currentBoredom);

		System.out.println("Welcome to your virtual pet!");
		System.out.println("Your pet's name is Harry the Gila Monster,");
		System.out.println("and Harry requires lots of attention and responsibility.");
		System.out.println("You'll be in charge of Harry's eating and drinking habits,");
		System.out.println("as well as playing with him so he doesn't get bored!");
		System.out.println("Right now Harry is very hungry, but not very thirsty, and he is a little bored.");
		while (myPet.getHunger() <= 50 && myPet.getThirst() <= 50 && myPet.getBoredom() <= 50) {
			myPet.tick();
			System.out.println("Hunger: " + myPet.getHunger());
			System.out.println("Thirst: " + myPet.getThirst());
			System.out.println("Boredom: " + myPet.getBoredom());
			System.out.println("What do you want to do?");
			System.out.println("1. Feed Harry.");
			System.out.println("2. Give Harry some water.");
			System.out.println("3. Play with Harry.");
			String task = input.nextLine();
			if (myPet.getHunger() >= 50 || myPet.getThirst() >= 50 || myPet.getBoredom() >= 50) {
				System.out.println("You didn't take proper care of Harry!\nUnfortunately PETA took him away.");
				System.exit(0);
			} else if(myPet.getHunger() <= 0 || myPet.getThirst() <= 0 || myPet.getBoredom() <= 0) {
				System.out.println("You didn't take proper care of Harry!\nUnfortunately PETA took him away.");
				System.exit(0);
			}
			if (task.equals("1")) {
				myPet.feed();
			} else if (task.equals("2")) {
				myPet.drink();
			} else if (task.equals("3")) {
				myPet.play();
			} else {
				System.out.println("You didn't pick one of the options!");
				System.out.println("While you were fooling around Harry got hungrier, thirstier, and more bored.\n");
			}
		}
	}
}

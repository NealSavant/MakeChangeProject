//AUTHOR: Neal Savant
//DATE: November 15, 2019

import java.text.DecimalFormat;

public class RegisterLogic {

	public double price;
	public double cashTendered;

	public static int twenty = 20;
	public static int ten = 10;
	public static int five = 5;
	public static int one = 1;
	public static double quarter = 0.25;
	public static double dime = 0.10;
	public static double nickel = 0.05;
	public static double penny = 0.01;

	// cut the decimal to ##.##
	// Decimal Format is my favorite option for rounding numbers
	// I use a Double.parseDouble to take the string from formatting and return it
	// to a double for arithmetic
	DecimalFormat df = new DecimalFormat("##.##");

	public double amountOwed() {
		double output = cashTendered - price;
		return output;
	}

	public String denominations() {
		String output = "";

		double totalReturn = amountOwed();

		// customer has not paid the full price
		if (totalReturn < 0) {
			output = "Error: The customer owes: " + Double.parseDouble(df.format(totalReturn * -1));// multiply by -1
																									// for positive
																									// return
		}

		// customer has paid full price
		double billChecker;
		double runningTotal = Double.parseDouble(df.format(totalReturn));
		runningTotal += .005; // TODO is this okay
		// double counter = 0.0;

		if (runningTotal > 0) {
			// initialize the output string content
			output += "Amount: " + price + ", Tendered: " + cashTendered + ", Result: ";
			// boolean for comma placement, is it the first string concatenation?
			boolean isFirst = true;

			if (runningTotal / twenty > 1) {
				billChecker = Double.parseDouble(df.format(runningTotal / twenty));
				int howMany = (int) billChecker;

				if (isFirst) {
					if (billChecker >= 2)
						output += (int) (billChecker) + " twenty dollar bills";// no starting comma
					else
						output += (int) (billChecker) + " twenty dollar bill";
				}
				if (isFirst == false) {
					if (billChecker >= 2)
						output += ", " + (int) (billChecker) + " twenty dollar bills";
					else
						output += ", " + (int) (billChecker) + " twenty dollar bill";
				}
				// update running total
				runningTotal -= howMany * twenty;
				isFirst = false;
			}

			if (runningTotal / ten > 1) {
				billChecker = Double.parseDouble(df.format(runningTotal / ten));
				int howMany = (int) billChecker;
				if (isFirst) {
					if (billChecker >= 2)
						output += (int) (billChecker) + " ten dollar bills";// no starting comma
					else
						output += (int) (billChecker) + " ten dollar bill";
				}
				if (isFirst == false) {
					if (billChecker >= 2)
						output += ", " + (int) (billChecker) + " ten dollar bills";
					else
						output += ", " + (int) (billChecker) + " ten dollar bill";
				}
				// update running total
				runningTotal -= howMany * ten;
				isFirst = false;
			}

			if (runningTotal / five >= 1) {
				billChecker = Double.parseDouble(df.format(runningTotal / five));
				int howMany = (int) billChecker;
				if (isFirst) {
					if (billChecker >= 2)
						output += (int) (billChecker) + " five dollar bills";// no starting comma
					else
						output += (int) (billChecker) + " five dollar bill";
				}
				if (isFirst == false) {
					if (billChecker >= 2)
						output += ", " + (int) (billChecker) + " five dollar bills";
					else
						output += ", " + (int) (billChecker) + " five dollar bill";
				}
				// update running total
				runningTotal -= howMany * five;
				isFirst = false;
			}

			if (runningTotal / one >= 1) {
				billChecker = Double.parseDouble(df.format(runningTotal / one));
				int howMany = (int) billChecker;
				if (isFirst) {
					if (billChecker >= 2)
						output += (int) (billChecker) + " one dollar bills";// no starting comma
					else
						output += (int) (billChecker) + " one dollar bill";
				}
				if (isFirst == false) {
					if (billChecker >= 2)
						output += ", " + (int) (billChecker) + " one dollar bills";
					else
						output += ", " + (int) (billChecker) + " one dollar bill";
				}
				// update running total
				runningTotal -= howMany * one;
				isFirst = false;
			}

			if (runningTotal / quarter >= 1) {
				billChecker = Double.parseDouble(df.format(runningTotal / quarter));
				int howMany = (int) billChecker;
				if (isFirst) {
					if (billChecker >= 2)
						output += (int) (billChecker) + " quarters";// no starting comma
					else
						output += (int) (billChecker) + " quarter";
				}
				if (isFirst == false) {
					if (billChecker >= 2)
						output += ", " + (int) (billChecker) + " quarters";
					else
						output += ", " + (int) (billChecker) + " quarter";
				}
				// update running total
				runningTotal -= howMany * quarter;
				isFirst = false;
			}

			if (runningTotal / dime >= 1) {
				billChecker = Double.parseDouble(df.format(runningTotal / dime));
				int howMany = (int) billChecker;

				if (isFirst) {
					if (billChecker >= 2)
						output += (int) (billChecker) + " dimes";// no starting comma
					else
						output += (int) (billChecker) + " dime";
				}

				if (isFirst == false) {
					if (billChecker >= 2)
						output += ", " + (int) (billChecker) + " dimes";
					else
						output += ", " + (int) (billChecker) + " dime";
				}
				// update running total
				runningTotal -= howMany * dime;
				isFirst = false;
			}

			if (runningTotal / nickel >= 1) {
				billChecker = Double.parseDouble(df.format(runningTotal / nickel));
				int howMany = (int) billChecker;

				if (isFirst) {
					if (billChecker >= 2)
						output += (int) (billChecker) + " nickels";// no starting comma
					else
						output += (int) (billChecker) + " nickel";
				}
				if (isFirst == false) {
					if (billChecker >= 2)
						output += ", " + (int) (billChecker) + " nickels";
					else
						output += ", " + (int) (billChecker) + " nickel";
				}
				// update running total
				runningTotal -= howMany * nickel;
				isFirst = false;

			}
			if (runningTotal / penny >= 1) {
				billChecker = Double.parseDouble(df.format(runningTotal / penny));
				int howMany = (int) billChecker;

				if (isFirst) {
					if (billChecker >= 2)
						output += (int) (billChecker) + " pennies";// no starting comma
					else
						output += (int) (billChecker) + " penny";
				}
				if (isFirst == false) {
					if (billChecker >= 2)
						output += ", " + (int) (billChecker) + " pennies";
					else
						output += ", " + (int) (billChecker) + " penny";
				}
				// update running total
				runningTotal -= howMany * penny;
				isFirst = false;
			}

		}
		output += ".";
		return output;
	}
}

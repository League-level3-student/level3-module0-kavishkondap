/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/
package _07_The_Wrong_Way_Cow;

import java.util.HashMap;

public class TheWrongWayCow {
	public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
    	int[] rowCol = null;
        int northCnt = 0;
        int southCnt = 0;
        int westCnt = 0;
        int eastCnt = 0;
        HashMap<String, int[]> hm = new HashMap<String, int[]>(4);
        

        for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if( hm.size() > 1 && ( northCnt + southCnt + eastCnt + westCnt ) > 2 ) {
		            // Set i to break out of outer loop
		            i = field.length;
		            break;
		        }
				if( field[i][j] == 'c' ) {
                    int numRows = field.length;
                    int numCols = field[i].length;
                    if( northCnt < 2 ) {
                        if( i + 2 < numRows && field[i+1][j] == 'o' && field[i+2][j] == 'w' ) {
                            hm.put( "north", new int[] { j, i } );
                            northCnt++;
                            continue;
                        }
                    }
                    if (southCnt < 2) {
                    	if (i - 2 >= 0 && field [i-1][j] == 'o' && field [i-2][j] == 'w') {
                    		hm.put("south", new int [] {j, i});
                    		southCnt++;
                    		continue;
                    	}
                    }
                    if( westCnt < 2 ) {
                        if( j + 2 < numCols && field[i][j+1] == 'o' && field[i][j+2] == 'w' ) {
                            hm.put( "west", new int[] { j, i } );
                            westCnt++;
                            continue;
                        }
                    }
                    if( eastCnt < 2 ) {
                        if( j - 2 >= 0 && field[i][j-1] == 'o' && field[i][j-2] == 'w' ) {
                            hm.put( "east", new int[] { j, i } );
                            eastCnt++;
                            continue;
                        }
                    }
				}

		}
        
    }
        if (northCnt==1) {
        	rowCol = hm.get("north");
        } else if (southCnt ==1) {
        	rowCol = hm.get("south");
        }else if (westCnt ==1) {
        	rowCol = hm.get("west");
        }else if (eastCnt ==1) {
        	rowCol = hm.get("east");
        }
        return rowCol;
}
}
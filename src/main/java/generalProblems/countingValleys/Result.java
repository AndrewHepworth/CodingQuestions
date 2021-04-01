package generalProblems.countingValleys;

public class Result {

    /*
     * Complete the 'generalProblems.jumpingOnClouds.countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int altitude = 0;
        boolean valley = false;
        StringBuilder newPath = new StringBuilder();
        newPath.append(path);
        int totalValleys = 0;
        for(int i = 0; i < steps ; i++){
//            if(newPath.charAt(i) == 'D'){
//                altitude--;
//            } else if (newPath.charAt(i) == 'U') {
//                altitude++;
//            }
//            if(altitude == 0 && newPath.charAt(i) == 'U'){
//                totalValleys++;
//            }
            altitude = checkChar(path, i) + altitude;
            totalValleys = totalValleys + checkIfValley(altitude,checkChar(path,i));

        }
        return totalValleys;
    }

    public static int checkIfValley(int altitude, int character){
        if(altitude == 0 && character == 1){
            return 1;
        } else {
            return 0;
        }
    }

    public static int checkChar(String input, int index){
        if(input.charAt(index) == 'D'){
            return -1;
        } else if(input.charAt(index) == 'U'){
            return 1;
        } else{
            return 0;
        }
    }

}


class Main {
    public static void main(String[] args) {
        int ammountOfPoints = (args.length > 0) ? Integer.parseInt(args[0]) : 1000000000;
        int timesToLog = (ammountOfPoints < 100) ? ammountOfPoints : 100;
        int circleRadius = 1;
        int pointsTotal = 0;
        int pointsInCircle = 0;
        for(int i = 0; i < ammountOfPoints; i++) {
            double pointX = Math.random() * circleRadius * 2 - circleRadius;
            double pointY = Math.random() * circleRadius * 2 - circleRadius;
            double distanceFromCenter = Math.sqrt(pointX * pointX + pointY * pointY);
            if(distanceFromCenter < circleRadius) {
                pointsInCircle++;
            }
            pointsTotal++;
            if (pointsTotal % (ammountOfPoints / timesToLog) == 0) {
                double estPi = 4 * ((double) pointsInCircle / (double) pointsTotal);
                System.out.println("Estimation of PI using " + pointsTotal + " points: " + estPi);
                System.out.printf("Off by: %.10f\n", (estPi - Math.PI));
                System.out.println((int)((float)pointsTotal / (float)ammountOfPoints * 100f) + "% done");
            }
        }
    }
}
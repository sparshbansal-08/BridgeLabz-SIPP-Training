public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;

        // Volume in cubic kilometers
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        // Convert to cubic miles
        double kmToMiles = 0.621371;
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}

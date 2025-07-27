package activities;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        double seconds = 1000000000;

		        double EarthSeconds = 31557600;
		        double MercurySeconds = 0.2408467;
		        double VenusSeconds = 0.61519726;
		        double MarsSeconds = 1.8808158;
		        double JupiterSeconds = 11.862615;
		        double SaturnSeconds = 29.447498;
		        double UranusSeconds = 84.016846;
		        double NeptuneSeconds = 164.79132;

		        double earthAge = seconds / EarthSeconds;

		        System.out.println("Age on Earth: " + round(earthAge) + " years");
		        System.out.println("Age on Mercury: " + round(earthAge / MercurySeconds) + " years");
		        System.out.println("Age on Venus: " + round(earthAge / VenusSeconds) + " years");
		        System.out.println("Age on Mars: " + round(earthAge / MarsSeconds) + " years");
		        System.out.println("Age on Jupiter: " + round(earthAge / JupiterSeconds ) + " years");
		        System.out.println("Age on Saturn: " + round(earthAge / SaturnSeconds) + " years");
		        System.out.println("Age on Uranus: " + round(earthAge / UranusSeconds ) + " years");
		        System.out.println("Age on Neptune: " + round(earthAge / NeptuneSeconds) + " years");
		    }

		    public static double round(double value) {
		        return Math.round(value * 100.0) / 100.0;
		    }

	}


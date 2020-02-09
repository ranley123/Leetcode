import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
class craft {
    public static double solution(String[] aircraftEmissions, String[] flightItineraries, String origin, String destination) {
        // Type your solution here
        double dist = -1;
        List<String> types = new ArrayList<>();
        
        for (String iti: flightItineraries){
            String[] pieces = iti.split("-");
            if (pieces[0].equals(origin) && pieces[1].equals(destination)){
                if (dist < 0)
                    dist = Double.parseDouble(pieces[2]);
                if (!types.contains(pieces[3])) {
                	types.add(pieces[3]);
                }
            }
        }
        if (dist == -1)
        	return 0;
        
        double min = Double.MAX_VALUE;
        for (String emi: aircraftEmissions) {
        	String[] pieces = emi.split("-");
        	if (types.contains(pieces[0])) {
        		min = Math.min(min, Double.parseDouble(pieces[1]));
        	}
        }
        DecimalFormat format = new DecimalFormat("#.00");
        return Math.round(Double.parseDouble(format.format((double)dist * min)));
    }
    
    public static void main(String[] args) {
//    	aircraft = {}

    	String[] aircraftEmissions = {"boeing_737-0.101","boeing_747-0.12"};
    	String[]flightItineraries = {"LON-EDI-534-boeing_737","LON-EDI-534-boeing_787","-LON-464-embraer_190"};
    	String origin = "LON";
    	String destination = "EDI";
    	System.out.println(solution(aircraftEmissions, flightItineraries, origin, destination));
    }

}
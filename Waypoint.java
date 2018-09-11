
/**
 * Class to represent one waypoint from a METAL TMG file.
 *
 * @author Jim Teresco and the CSIS 210 Fall 2018 class
 */
public class Waypoint
{
    // instance variables to hold label, latitude and longitude
    private String label;
    private double lat;
    private double lng;
    
    // constructor for a Waypoint object
    public Waypoint(String label, double lat, double lng) {
        this.label = label;
        this.lat = lat;
        this.lng = lng;
    }
    
    // accessors for fields
    public String getLabel() {
        
        return label;
    }
    
    public double getLat() {
        
        return lat;
    }
        
    public double getLng() {
        
        return lng;
    }
    
    public String toString() {
     
        return label + " (" + lat + "," + lng + ")";
    }
}

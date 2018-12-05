
import java.awt.Color;

public class ImageSegmenter {
    
    public static Color[][] segment(Color[][] rgbArray, double granularity) {
    	DisjointSetForest forest = new DisjointSetForest(rgbArray);
        return rgbArray; 
    }
    
}


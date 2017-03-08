package wdsr.exercise1.conversions;

import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
 import org.apache.logging.log4j.Logger;

/**
 * Created by Marek on 14.02.2016.
 */
 

		
public class ArrayConverter {
	 
	
	private static final Logger logger = LogManager.getLogger();
      
	
    public int[] convertToInts(String[] strings) {
		logger.debug("convertToInts, args: " + Arrays.toString(strings));
		
 		int[] result = Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
		
 		logger.debug("convertToInts, result: " + Arrays.toString(result));
		
 		
 		return result;
    }
}

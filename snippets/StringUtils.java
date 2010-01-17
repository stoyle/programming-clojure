
import static org.apache.commons.lang.StringUtils.*;
import org.apache.commons.lang.ArrayUtils;

// From Apache Commons Lang, http://commons.apache.org/lang/
public class StringUtils {
  public static boolean isBlank(String str) { 
    int strLen; 
    if (str == null || (strLen = str.length()) == 0) { 
      return true; 
    }  
    for (int i = 0; i < strLen; i++) { 
	    if ((Character.isWhitespace(str.charAt(i)) == false)) { 
	      return false; 
	    }
    }
    return true;
  }

public static int indexOfAny(String str, char[] searchChars) {
    if (isEmpty(str) || ArrayUtils.isEmpty(searchChars)) {
	return -1;
    }
    for (int i = 0; i < str.length(); i++) {
	char ch = str.charAt(i);
	for (int j = 0; j < searchChars.length; j++) {
	    if (searchChars[j] == ch) {
		return i;
	    }
	}
    }
    return -1;
}
}
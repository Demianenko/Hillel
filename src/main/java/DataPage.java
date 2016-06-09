import java.util.HashMap;
import java.util.Map;

/**
 * Created by sega on 06.06.16.
 */
public class DataPage {
    public Map<String,String> selectorMap = new HashMap<String, String>();
    private Map<String,String> initSelector(){
        selectorMap.put("loginName","Email");
        selectorMap.put("nexButton","next");
        selectorMap.put("loginPassword","Passwd");
        selectorMap.put("sinGinButton","signIn");
        selectorMap.put("settingsButton",":2m");
        return selectorMap;
    }



}

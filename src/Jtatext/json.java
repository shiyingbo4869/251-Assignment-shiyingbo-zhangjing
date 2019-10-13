package Jtatext;

import net.sf.json.JSONObject;

public class json {
	private void testJson(){
    JSONObject obj = new JSONObject();
    obj.put("string","string");
    obj.put("int",5);
    obj.put("boolean",false);
    System.out.println(obj);
	}
}

package com.hand.JSON02;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class json02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JsonObject object=new JsonObject();
        object.addProperty("cat", "pop");
        
        JsonArray array=new JsonArray();
        
        JsonObject lan1=new JsonObject();
        lan1.addProperty("id", 1);
        lan1.addProperty("name", "Java");
        lan1.addProperty("ide", "Eclipse");
        array.add(lan1);
       
        JsonObject lan2=new JsonObject();
        lan2.addProperty("id", 2);
        lan2.addProperty("name", "Swift");
        lan2.addProperty("ide", "XCode");
        array.add(lan2);
        
        JsonObject lan3=new JsonObject();
        lan3.addProperty("id", 3);
        lan3.addProperty("name", "C#");
        lan3.addProperty("ide", "Visual Studio");
        array.add(lan3);
     
        object.add("languages", array);
        object.addProperty("pop", true);
        System.out.println(object);  //直接在系统输出
        
	}

}

package open;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;


import java.sql.Time;

public class FileManagement {
	
	public static World loadWorld(String filePath) throws FileNotFoundException {
		var world = new World();
		
		//google json reader obj
		var gson = new Gson();
		JsonReader r = new JsonReader(new FileReader(filePath));
		
		world = gson.fromJson(r, World.class);
		
		return world;
		
	}
	
	public static void saveMap(World world, String filePath) throws IOException {
		/** necessary prerequisite google json object*/
		var gson = new Gson();
		var writer = new FileWriter(filePath);
		
		//JsonWriter w = new JsonWriter(new FileWriter(map.getFilePath()));
		gson.toJson(world,writer );
		writer.flush();
		writer.close();
	}
	
}

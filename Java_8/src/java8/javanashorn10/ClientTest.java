package java8.javanashorn10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ClientTest {

	public static void main(String[] args) {  
        // Creating script engine  
        //ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Reading Nashorn file  
        //ee.eval(new FileReader("H:\\Java8_Workspace\\Java_8\\src\\java8\\jsnashorn10\\hello.js"));
		/*
		 * ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		 * ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");
		 * 
		 * try { //scriptEngine.eval(new
		 * FileReader("H:\\Java8_Workspace\\Java_8\\src\\java8\\jsnashorn10\\hello.js"))
		 * ; //scriptEngine.eval(new FileReader("src\\java8\\jsnashorn10\\hello.js"));
		 * scriptEngine.eval(new FileReader("src/java8/jsnashorn10/hello.js")); } catch
		 * (FileNotFoundException | ScriptException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */
		
		ScriptEngineManager sem = new ScriptEngineManager();
		List<ScriptEngineFactory> factories = sem.getEngineFactories();
		for (ScriptEngineFactory factory : factories)
		    System.out.println(factory.getEngineName() + " " + factory.getEngineVersion() + " " + factory.getNames());
		if (factories.isEmpty())
		    System.out.println("No Script Engines found");
		
		//javascript engine does not work because This eclipse version would startup with jdk 15. 
    }
}

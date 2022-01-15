package utulities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //1- Properties objesi oluştur.
    //2- Make it static to reach from all class with classname. And meke it private to not changing.

    static private Properties properties;
    //3- Create a static block for first running.
        static {
     //4- To read file create object
     //5- show the path
        String path="src/configuration.properties";

                try {
                    FileInputStream fileInput=new FileInputStream(path); // add the path
            // 6- For : java.io.FileNotFoundException Add Try Catch, We havent test method so We cant put throws exp.

     //7- Put the properties object
                    properties=new Properties();
                    properties.load(fileInput);  //This code take the data with fileInput then it will read with properties.
     //8- Close the fileInputStream
                    fileInput.close();
                    } catch (FileNotFoundException e) {
            e.printStackTrace();
                    } catch (IOException e) {
            e.printStackTrace();
                    }

            }
        public static String getproperty (String key) {
            String value=properties.getProperty(key);
            return value;
            }

    }

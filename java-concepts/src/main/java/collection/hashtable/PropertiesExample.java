package collection.hashtable;

import java.io.*;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("/Users/sreedevi/Documents/learning/java-concepts/src/main/java/collections/hashtable/sree.properties");
        properties.load(fileInputStream);
        System.out.println(properties);
        System.out.println(properties.getProperty("username"));
        properties.setProperty("name", "sree");
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/sreedevi/Documents/learning/java-concepts/src/main/java/collections/hashtable/sree.properties");
        properties.store(fileOutputStream, " updated by sreedevi");
    }
}

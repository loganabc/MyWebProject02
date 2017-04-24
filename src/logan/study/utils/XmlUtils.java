package logan.study.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;


import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

//用来读取和写入xml文件
public class XmlUtils {
	private static String filename = "grade.xml";
	public static Document getDocument() throws Exception{
		URL url = XmlUtils.class.getClassLoader().getResource(filename);
		String realpath = url.getPath();
		System.out.println(realpath);
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File(realpath));
		return document;
	}
	
	public static void write2Xml(Document document) throws Exception, FileNotFoundException{
		URL url = XmlUtils.class.getClassLoader().getResource(filename);
		String realpath = url.getPath();
		System.out.println(realpath);
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("UTF-8");
		XMLWriter writer = new XMLWriter(new FileOutputStream(realpath));
		writer.write(document);
		writer.close();
	}

}

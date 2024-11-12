package com.pipe.test;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.InputStream;

public class TestDom4j {

    @Test
    public void testReadXML() throws Exception {

        SAXReader saxReader = new SAXReader();
        InputStream resourceAsStream = TestDom4j.class.getClassLoader().getResourceAsStream("jdbc.xml");
        Document document = saxReader.read(resourceAsStream);

        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());
    }
}

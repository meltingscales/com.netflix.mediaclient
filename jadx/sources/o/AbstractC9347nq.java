package o;

import com.bugsnag.android.repackaged.dslplatform.json.ConfigurationException;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.bugsnag.android.repackaged.dslplatform.json.ParsingException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import o.C9337ng;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* renamed from: o.nq  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9347nq {
    private static final DocumentBuilder a;
    static final JsonReader.d<Element> b = new JsonReader.d<Element>() { // from class: o.nq.3
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: e */
        public Element d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return AbstractC9347nq.c(jsonReader);
        }
    };
    static final C9337ng.a<Element> d = new C9337ng.a<Element>() { // from class: o.nq.1
        @Override // o.C9337ng.a
        public void b(C9337ng c9337ng, Element element) {
            AbstractC9347nq.c(element, c9337ng);
        }
    };

    static {
        try {
            a = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    public static void c(Element element, C9337ng c9337ng) {
        if (element == null) {
            c9337ng.b();
        } else {
            e(element, c9337ng);
        }
    }

    public static void e(Element element, C9337ng c9337ng) {
        Document ownerDocument = element.getOwnerDocument();
        DOMImplementationLS dOMImplementationLS = (DOMImplementationLS) ownerDocument.getImplementation();
        LSSerializer createLSSerializer = dOMImplementationLS.createLSSerializer();
        LSOutput createLSOutput = dOMImplementationLS.createLSOutput();
        createLSOutput.setEncoding("UTF-8");
        StringWriter stringWriter = new StringWriter();
        createLSOutput.setCharacterStream(stringWriter);
        createLSSerializer.write(ownerDocument, createLSOutput);
        AbstractC9339ni.d(stringWriter.toString(), c9337ng);
    }

    public static Element c(JsonReader jsonReader) {
        if (jsonReader.i() == 34) {
            try {
                return a.parse(new InputSource(new StringReader(jsonReader.o()))).getDocumentElement();
            } catch (SAXException e) {
                throw jsonReader.e("Invalid XML value", 0, e);
            }
        }
        return d(AbstractC9340nj.a(jsonReader));
    }

    public static Element d(Map<String, Object> map) {
        Set<String> keySet = map.keySet();
        if (keySet.size() > 1) {
            throw ParsingException.e("Invalid XML. Expecting root element", true);
        }
        String next = keySet.iterator().next();
        Document b2 = b();
        Element createElement = b2.createElement(next);
        b2.appendChild(createElement);
        e(b2, createElement, map.get(next));
        return createElement;
    }

    private static Document b() {
        Document newDocument;
        synchronized (AbstractC9347nq.class) {
            try {
                newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            } catch (ParserConfigurationException e) {
                throw new ConfigurationException(e);
            }
        }
        return newDocument;
    }

    private static void e(Document document, Element element, Object obj) {
        if (obj instanceof HashMap) {
            for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                String str = (String) entry.getKey();
                if (str.startsWith("@")) {
                    element.setAttribute(str.substring(1), entry.getValue().toString());
                } else if (str.startsWith("#")) {
                    if (str.equals("#text")) {
                        if (entry.getValue() instanceof List) {
                            b(document, element, (List) entry.getValue());
                        } else {
                            element.appendChild(document.createTextNode(entry.getValue().toString()));
                        }
                    } else if (str.equals("#cdata-section")) {
                        if (entry.getValue() instanceof List) {
                            e(document, (Node) element, (List<String>) entry.getValue());
                        } else {
                            element.appendChild(document.createCDATASection(entry.getValue().toString()));
                        }
                    } else if (str.equals("#comment")) {
                        if (entry.getValue() instanceof List) {
                            a(document, element, (List) entry.getValue());
                        } else {
                            element.appendChild(document.createComment(entry.getValue().toString()));
                        }
                    }
                } else {
                    Element createElement = document.createElement(str);
                    element.appendChild(createElement);
                    e(document, createElement, entry.getValue());
                }
            }
        } else if (obj instanceof List) {
            d(document, element, (List) obj);
        } else if (obj != null) {
            element.setTextContent(obj.toString());
        }
    }

    private static void b(Document document, Node node, List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
        }
        node.appendChild(document.createTextNode(sb.toString()));
    }

    private static void e(Document document, Node node, List<String> list) {
        for (String str : list) {
            node.appendChild(document.createCDATASection(str));
        }
    }

    private static void a(Document document, Node node, List<String> list) {
        for (String str : list) {
            node.appendChild(document.createComment(str));
        }
    }

    private static void d(Document document, Node node, List<Object> list) {
        Node parentNode = node.getParentNode();
        e(document, (Element) node, list.get(0));
        for (Object obj : list.subList(1, list.size())) {
            Element createElement = document.createElement(node.getNodeName());
            parentNode.appendChild(createElement);
            e(document, createElement, obj);
        }
    }
}

package o;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: o.dmr  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8467dmr {

    /* renamed from: o.dmr$b */
    /* loaded from: classes5.dex */
    public interface b {
        void e(Element element);
    }

    public static void b(Element element, b bVar) {
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                bVar.e((Element) item);
            }
        }
    }
}

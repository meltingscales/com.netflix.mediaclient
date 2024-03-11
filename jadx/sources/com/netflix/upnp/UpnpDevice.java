package com.netflix.upnp;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import com.netflix.ssdp.SsdpDevice;
import com.netflix.upnp.UpnpDevice;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.xml.parsers.DocumentBuilderFactory;
import o.C1044Mm;
import o.C8467dmr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes5.dex */
public class UpnpDevice implements Serializable {
    private Map<String, String> a;
    private String b;
    private String d;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String l;
    private SsdpDevice m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private String f13335o;
    private String p;
    private String q;
    private List<Icon> e = new ArrayList();
    private List<Service> k = new ArrayList();
    private List<UpnpDevice> c = new ArrayList();

    public Map<String, String> b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.d;
    }

    public String f() {
        return this.f;
    }

    public String g() {
        return this.i;
    }

    public String h() {
        return this.g;
    }

    public String i() {
        return this.j;
    }

    public String j() {
        return this.h;
    }

    public SsdpDevice k() {
        return this.m;
    }

    public String l() {
        return this.f13335o;
    }

    public String n() {
        return this.l;
    }

    public String o() {
        return this.n;
    }

    public String p() {
        return this.q;
    }

    public String r() {
        return this.p;
    }

    /* loaded from: classes5.dex */
    public class Icon implements Serializable {
        private String a;
        private String b;
        private int c;
        private int e;
        private int i;

        public String a() {
            return this.a;
        }

        public int b() {
            return this.i;
        }

        public int c() {
            return this.c;
        }

        public String d() {
            return this.b;
        }

        public int e() {
            return this.e;
        }

        protected Icon(Element element) {
            C8467dmr.b(element, new C8467dmr.b() { // from class: o.dmm
                @Override // o.C8467dmr.b
                public final void e(Element element2) {
                    UpnpDevice.Icon.this.d(element2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public /* synthetic */ void d(Element element) {
            char c;
            String tagName = element.getTagName();
            tagName.hashCode();
            switch (tagName.hashCode()) {
                case -1391167122:
                    if (tagName.equals("mimetype")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1221029593:
                    if (tagName.equals(InteractiveAnimation.ANIMATION_TYPE.HEIGHT)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 116079:
                    if (tagName.equals(SignupConstants.Field.URL)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 95472323:
                    if (tagName.equals("depth")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 113126854:
                    if (tagName.equals(InteractiveAnimation.ANIMATION_TYPE.WIDTH)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.b = element.getTextContent();
            } else if (c == 1) {
                this.c = Integer.valueOf(element.getTextContent()).intValue();
            } else if (c == 2) {
                this.a = element.getTextContent();
            } else if (c == 3) {
                this.e = Integer.valueOf(element.getTextContent()).intValue();
            } else if (c == 4) {
                this.i = Integer.valueOf(element.getTextContent()).intValue();
            } else {
                C1044Mm.j("UpnpDevice.Icon", "Found unknown tag while parsing icon.  TagName: " + element.getTagName());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof Icon) {
                Icon icon = (Icon) obj;
                return Objects.equals(icon.d(), d()) && icon.b() == b() && icon.c() == c() && icon.e() == e() && Objects.equals(icon.a(), a());
            }
            return false;
        }

        public String toString() {
            return getClass().getSimpleName() + "{mimeType=" + d() + ",width=" + b() + ",height=" + c() + ",depth=" + e() + ",url=" + a() + "}";
        }
    }

    /* loaded from: classes5.dex */
    public class Service implements Serializable {
        private String a;
        private String b;
        private String c;
        private String e;
        private String h;

        public String a() {
            return this.c;
        }

        public String b() {
            return this.h;
        }

        public String c() {
            return this.a;
        }

        public String d() {
            return this.e;
        }

        public String e() {
            return this.b;
        }

        protected Service(Element element) {
            C8467dmr.b(element, new C8467dmr.b() { // from class: o.dmn
                @Override // o.C8467dmr.b
                public final void e(Element element2) {
                    UpnpDevice.Service.this.e(element2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public /* synthetic */ void e(Element element) {
            char c;
            String tagName = element.getTagName();
            tagName.hashCode();
            switch (tagName.hashCode()) {
                case -1928370289:
                    if (tagName.equals("serviceType")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1652460917:
                    if (tagName.equals("SCPDURL")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -194185552:
                    if (tagName.equals("serviceId")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 107570761:
                    if (tagName.equals("eventSubURL")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 637405906:
                    if (tagName.equals("controlURL")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.h = element.getTextContent();
            } else if (c == 1) {
                this.a = element.getTextContent();
            } else if (c == 2) {
                this.b = element.getTextContent();
            } else if (c == 3) {
                this.c = element.getTextContent();
            } else if (c == 4) {
                this.e = element.getTextContent();
            } else {
                C1044Mm.j("UpnpDevice.Service", "Found unknown tag while parsing service.  TagName: " + element.getTagName());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof Service) {
                Service service = (Service) obj;
                return Objects.equals(service.b(), b()) && Objects.equals(service.e(), e()) && Objects.equals(service.c(), c()) && Objects.equals(service.d(), d()) && Objects.equals(service.a(), a());
            }
            return false;
        }

        public String toString() {
            return getClass().getSimpleName() + "{serviceType=" + b() + ",serviceId=" + e() + ",scpdUrl=" + c() + ",controlUrl=" + d() + ",eventSubUrl=" + a() + "}";
        }
    }

    public static UpnpDevice b(SsdpDevice ssdpDevice, Map<String, String> map, String str) {
        Element element = (Element) DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8))).getDocumentElement().getElementsByTagName("device").item(0);
        if (element == null) {
            throw new InvalidParameterException("No device element in body");
        }
        return new UpnpDevice(ssdpDevice, map, element);
    }

    protected UpnpDevice(SsdpDevice ssdpDevice, Map<String, String> map, Element element) {
        this.m = ssdpDevice;
        this.a = map;
        e(element);
    }

    public List<Icon> e() {
        return Collections.unmodifiableList(this.e);
    }

    public List<Service> m() {
        return Collections.unmodifiableList(this.k);
    }

    public List<UpnpDevice> a() {
        return Collections.unmodifiableList(this.c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof UpnpDevice) {
            UpnpDevice upnpDevice = (UpnpDevice) obj;
            return Objects.equals(d(), upnpDevice.d()) && Objects.equals(c(), upnpDevice.c()) && Objects.equals(i(), upnpDevice.i()) && Objects.equals(j(), upnpDevice.j()) && Objects.equals(h(), upnpDevice.h()) && Objects.equals(g(), upnpDevice.g()) && Objects.equals(f(), upnpDevice.f()) && Objects.equals(l(), upnpDevice.l()) && Objects.equals(n(), upnpDevice.n()) && Objects.equals(r(), upnpDevice.r()) && Objects.equals(p(), upnpDevice.p()) && Objects.equals(o(), upnpDevice.o()) && e(e(), upnpDevice.e()) && e(m(), upnpDevice.m()) && e(a(), upnpDevice.a()) && Objects.equals(b(), upnpDevice.b()) && Objects.equals(k(), upnpDevice.k());
        }
        return false;
    }

    public String toString() {
        return getClass().getSimpleName() + "{deviceType=" + d() + ",friendlyName=" + c() + ",manufacturer=" + i() + ",manufacturerUrl=" + j() + ",modelDescription=" + h() + ",modelName=" + g() + ",modelNumber=" + f() + ",modelUrl=" + l() + ",serialNumber=" + n() + ",udn=" + r() + ",upc=" + p() + ",presentationUrl=" + o() + ",iconList=" + e() + ",serviceList=" + m() + ",deviceList=" + a() + ",headers=" + b() + ",ssdpDevice=" + k() + "}";
    }

    private void e(Element element) {
        C8467dmr.b(element, new C8467dmr.b() { // from class: o.dmo
            @Override // o.C8467dmr.b
            public final void e(Element element2) {
                UpnpDevice.this.a(element2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public /* synthetic */ void a(Element element) {
        char c;
        String tagName = element.getTagName();
        tagName.hashCode();
        switch (tagName.hashCode()) {
            case -2010829484:
                if (tagName.equals("modelName")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1969347631:
                if (tagName.equals("manufacturer")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1928623885:
                if (tagName.equals("serviceList")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1859924717:
                if (tagName.equals("modelDescription")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -738165577:
                if (tagName.equals("iconList")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -619048570:
                if (tagName.equals("modelURL")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83871:
                if (tagName.equals("UDN")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 84232:
                if (tagName.equals("UPC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83787357:
                if (tagName.equals("serialNumber")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 346619858:
                if (tagName.equals("modelNumber")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 418072542:
                if (tagName.equals("manufacturerURL")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 461933014:
                if (tagName.equals("friendlyName")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 780937236:
                if (tagName.equals("deviceList")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 781190832:
                if (tagName.equals("deviceType")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1714273269:
                if (tagName.equals("presentationURL")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                this.i = element.getTextContent();
                return;
            case 1:
                this.j = element.getTextContent();
                return;
            case 2:
                c(element);
                return;
            case 3:
                this.g = element.getTextContent();
                return;
            case 4:
                b(element);
                return;
            case 5:
                this.f13335o = element.getTextContent();
                return;
            case 6:
                this.p = element.getTextContent();
                return;
            case 7:
                this.q = element.getTextContent();
                return;
            case '\b':
                this.l = element.getTextContent();
                return;
            case '\t':
                this.f = element.getTextContent();
                return;
            case '\n':
                this.h = element.getTextContent();
                return;
            case 11:
                this.b = element.getTextContent();
                return;
            case '\f':
                d(element);
                return;
            case '\r':
                this.d = element.getTextContent();
                return;
            case 14:
                this.n = element.getTextContent();
                return;
            default:
                C1044Mm.j("UpnpDevice", "Found unknown tag while parsing device.  TagName: " + element.getTagName());
                return;
        }
    }

    private void d(Element element) {
        NodeList elementsByTagName = element.getElementsByTagName("device");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Node item = elementsByTagName.item(i);
            if (item.getNodeType() == 1) {
                this.c.add(new UpnpDevice(k(), b(), (Element) item));
            }
        }
    }

    private void c(Element element) {
        NodeList elementsByTagName = element.getElementsByTagName("service");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Node item = elementsByTagName.item(i);
            if (item.getNodeType() == 1) {
                this.k.add(new Service((Element) item));
            }
        }
    }

    private void b(Element element) {
        NodeList elementsByTagName = element.getElementsByTagName("icon");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Node item = elementsByTagName.item(i);
            if (item.getNodeType() == 1) {
                this.e.add(new Icon((Element) item));
            }
        }
    }

    private boolean e(List<?> list, List<?> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null) {
            return false;
        }
        return list.size() == list2.size() && list.containsAll(list2) && list2.containsAll(list);
    }
}

package com.netflix.dial;

import com.netflix.dial.DialDevice;
import com.netflix.upnp.UpnpDevice;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.security.InvalidParameterException;
import java.util.Date;
import java.util.Objects;
import javax.xml.parsers.DocumentBuilderFactory;
import o.AbstractC2065aYo;
import o.C8467dmr;
import org.w3c.dom.Element;

/* loaded from: classes3.dex */
public class DialDevice implements Serializable {
    private String a;
    private AppState b;
    private String d;
    private UpnpDevice i;
    private Date e = new Date(new Date().getTime() + 604800000);
    private String c = AbstractC2065aYo.f();

    public String a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public AppState d() {
        return this.b;
    }

    public UpnpDevice h() {
        return this.i;
    }

    /* loaded from: classes3.dex */
    public enum AppState {
        Running("running"),
        Stopped("stopped"),
        Hidden("hidden"),
        Unknown("unknown");
        
        private String g;

        public String e() {
            return this.g;
        }

        AppState(String str) {
            this.g = str;
        }

        public static AppState d(String str) {
            AppState appState = Running;
            if (appState.e().equals(str)) {
                return appState;
            }
            AppState appState2 = Stopped;
            if (appState2.e().equals(str)) {
                return appState2;
            }
            AppState appState3 = Hidden;
            return appState3.e().equals(str) ? appState3 : Unknown;
        }

        @Override // java.lang.Enum
        public String toString() {
            return e();
        }
    }

    protected DialDevice(UpnpDevice upnpDevice, Element element) {
        this.i = upnpDevice;
        this.d = element.getAttribute("dialVer");
        a(element);
    }

    public static DialDevice c(UpnpDevice upnpDevice, String str) {
        Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8))).getDocumentElement();
        if (documentElement == null || !documentElement.getTagName().equals("service")) {
            throw new InvalidParameterException("No service element in body");
        }
        return new DialDevice(upnpDevice, documentElement);
    }

    public String e() {
        return this.i.b().get("Application-URL");
    }

    public boolean g() {
        return this.i.k().h();
    }

    public int i() {
        return this.i.k().g();
    }

    public Boolean f() {
        return Boolean.valueOf(new Date().after(this.e));
    }

    public void j() {
        this.b = AppState.Unknown;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DialDevice) {
            DialDevice dialDevice = (DialDevice) obj;
            return Objects.equals(c(), dialDevice.c()) && Objects.equals(a(), dialDevice.a()) && Objects.equals(d(), dialDevice.d()) && Objects.equals(h(), dialDevice.h());
        }
        return false;
    }

    public String toString() {
        return getClass().getSimpleName() + "{dialVer=" + c() + ",name=" + a() + ",state=" + d() + ",upnpDevice=" + h() + "}";
    }

    private void a(Element element) {
        C8467dmr.b(element, new C8467dmr.b() { // from class: o.GP
            @Override // o.C8467dmr.b
            public final void e(Element element2) {
                DialDevice.this.e(element2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Element element) {
        String tagName = element.getTagName();
        tagName.hashCode();
        if (tagName.equals("name")) {
            this.a = element.getTextContent();
        } else if (tagName.equals("state")) {
            this.b = AppState.d(element.getTextContent());
        }
    }
}

package o;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.AbstractC9286mi;

/* renamed from: o.lI  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9207lI extends C9185kn {
    private final C9206lH d;

    public C9207lI() {
        this(null, 1, null);
    }

    public final C9206lH a() {
        return this.d;
    }

    public final C9207lI a(C9206lH c9206lH) {
        return new C9207lI(c9206lH);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9207lI) && C8632dsu.c(this.d, ((C9207lI) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        return "MetadataState(metadata=" + this.d + ')';
    }

    public /* synthetic */ C9207lI(C9206lH c9206lH, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new C9206lH(null, 1, null) : c9206lH);
    }

    public C9207lI(C9206lH c9206lH) {
        this.d = c9206lH;
    }

    public void a(String str, Map<String, ? extends Object> map) {
        this.d.b(str, map);
        e(str, map);
    }

    public void c(String str, String str2, Object obj) {
        this.d.a(str, str2, obj);
        b(str, str2, obj);
    }

    public void b(String str) {
        this.d.b(str);
        c(str, null);
    }

    public void b(String str, String str2) {
        this.d.d(str, str2);
        c(str, str2);
    }

    public final void c() {
        Set<Map.Entry<String, Object>> entrySet;
        for (String str : this.d.e().keySet()) {
            Map<String, Object> c = this.d.c(str);
            if (c != null && (entrySet = c.entrySet()) != null) {
                Iterator<T> it = entrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    b(str, (String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    private final void b(String str, String str2, Object obj) {
        if (obj == null) {
            c(str, str2);
        } else if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            AbstractC9286mi.d dVar = new AbstractC9286mi.d(str, str2, a().b(str, str2));
            for (InterfaceC9263mL interfaceC9263mL : getObservers$bugsnag_android_core_release()) {
                interfaceC9263mL.onStateChange(dVar);
            }
        }
    }

    private final void e(String str, Map<String, ? extends Object> map) {
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!getObservers$bugsnag_android_core_release().isEmpty()) {
                AbstractC9286mi.d dVar = new AbstractC9286mi.d(str, (String) entry.getKey(), a().b(str, (String) entry.getKey()));
                for (InterfaceC9263mL interfaceC9263mL : getObservers$bugsnag_android_core_release()) {
                    interfaceC9263mL.onStateChange(dVar);
                }
            }
        }
    }

    private final void c(String str, String str2) {
        if (str2 == null) {
            if (getObservers$bugsnag_android_core_release().isEmpty()) {
                return;
            }
            AbstractC9286mi.h hVar = new AbstractC9286mi.h(str);
            for (InterfaceC9263mL interfaceC9263mL : getObservers$bugsnag_android_core_release()) {
                interfaceC9263mL.onStateChange(hVar);
            }
        } else if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            AbstractC9286mi.j jVar = new AbstractC9286mi.j(str, str2);
            for (InterfaceC9263mL interfaceC9263mL2 : getObservers$bugsnag_android_core_release()) {
                interfaceC9263mL2.onStateChange(jVar);
            }
        }
    }
}

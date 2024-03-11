package o;

import com.netflix.android.volley.Request;
import com.netflix.mediaclient.net.NetworkRequestType;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class aRX<T> extends AbstractC2100aZw<T> {
    @Override // com.netflix.android.volley.Request
    public boolean C() {
        return true;
    }

    @Override // o.aZE
    public String O() {
        return "/nq/androidui/samurai/v1/config";
    }

    abstract String S();

    @Override // com.netflix.android.volley.Request
    public Request.Priority s() {
        return Request.Priority.HIGH;
    }

    @Override // com.netflix.android.volley.Request
    public Object y() {
        return NetworkRequestType.CONFIG;
    }

    @Override // o.aZE
    public void L() {
        k(((aZE) this).i.j().b(null));
    }

    @Override // o.AbstractC2100aZw, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> o() {
        Map<String, String> o2 = super.o();
        Map<String, String> c = ((aZE) this).i.j().c();
        if (o2 == null) {
            return c;
        }
        o2.putAll(c);
        return o2;
    }

    @Override // o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> j = super.j();
        if (j == null) {
            j = new HashMap<>();
        }
        C8147der.b(AbstractApplicationC1040Mh.d(), j);
        e(j);
        if (C5041brK.a(AbstractApplicationC1040Mh.d())) {
            j.put("x-netflix.tracing.client-sampled", "true");
        }
        j.put("X-Netflix.Request.NqTracking", S());
        return j;
    }
}

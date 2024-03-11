package o;

import com.netflix.android.volley.Request;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import java.util.Map;

/* renamed from: o.aZz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2103aZz<T> extends AbstractC2100aZw<T> {
    @Override // com.netflix.android.volley.Request
    public boolean C() {
        return true;
    }

    public AbstractC2103aZz() {
    }

    public AbstractC2103aZz(ApiEndpointRegistry.ResponsePathFormat responsePathFormat) {
        super(responsePathFormat);
    }

    @Override // o.aZE
    public String O() {
        return C8159dfC.a();
    }

    @Override // o.aZE
    public void L() {
        k(((aZE) this).i.j().i().toExternalForm());
    }

    @Override // com.netflix.android.volley.Request
    public Request.Priority s() {
        return Request.Priority.HIGH;
    }

    @Override // com.netflix.android.volley.Request
    public Object y() {
        return NetworkRequestType.BROWSE;
    }

    @Override // o.AbstractC2100aZw, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> o() {
        Map<String, String> o2 = super.o();
        Map<String, String> a = ((aZE) this).i.j().a(((AbstractC2100aZw) this).f);
        if (o2 == null) {
            return a;
        }
        o2.putAll(a);
        return o2;
    }
}

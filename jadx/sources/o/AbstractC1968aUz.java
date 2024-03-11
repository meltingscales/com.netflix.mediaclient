package o;

import com.netflix.android.volley.Request;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;

/* renamed from: o.aUz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1968aUz extends AbstractC5042brL<String> {
    protected ApiEndpointRegistry a;

    @Override // o.AbstractC5042brL
    public String K() {
        return "post";
    }

    public abstract String L();

    public abstract String P();

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1968aUz() {
        super(1);
    }

    @Override // o.AbstractC5042brL
    public void a(ApiEndpointRegistry apiEndpointRegistry) {
        this.a = apiEndpointRegistry;
        g(P());
    }

    @Override // o.AbstractC5042brL
    public String a(String str) {
        String f = f(str);
        C1044Mm.a(L(), "URL = %s", f);
        return f;
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public Request.Priority s() {
        return Request.Priority.LOW;
    }

    private String f(String str) {
        String obj;
        Object y = y();
        if (y instanceof String) {
            obj = (String) y;
        } else {
            obj = y != null ? y.toString() : null;
        }
        if (C8168dfL.h(obj)) {
            if (str.contains("?")) {
                return str + "&TAG=" + obj;
            }
            return str + "?TAG=" + obj;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5042brL
    /* renamed from: e */
    public String a_(String str, String str2) {
        C1044Mm.a(L(), "String response to parse = %s", str);
        return "OK";
    }
}

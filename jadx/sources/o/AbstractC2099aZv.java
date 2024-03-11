package o;

import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.aZv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2099aZv<T> extends AbstractC2103aZz<T> {
    protected abstract String T();

    public AbstractC2099aZv() {
        super(ApiEndpointRegistry.ResponsePathFormat.GRAPH);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC2103aZz, o.aZE
    public void L() {
        k(((aZE) this).i.j().i().toExternalForm());
    }

    @Override // o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> j = super.j();
        if (j == null) {
            j = new HashMap<>();
        }
        j.put("X-Netflix.Request.NqTracking", T());
        e(j);
        return j;
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public Object y() {
        return NetworkRequestType.BROWSE;
    }
}

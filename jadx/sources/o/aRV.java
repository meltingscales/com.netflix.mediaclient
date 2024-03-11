package o;

import android.content.Context;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class aRV<T> extends AbstractC5039brI<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aRV(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aRV(Context context, int i) {
        super(context, i);
    }

    @Override // o.AbstractC5039brI, o.AbstractC5042brL
    public void a(ApiEndpointRegistry apiEndpointRegistry) {
        ((AbstractC5039brI) this).h = apiEndpointRegistry;
        g(apiEndpointRegistry.b(null));
    }

    @Override // o.AbstractC5039brI, o.AbstractC5042brL, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> j = super.j();
        if (j == null) {
            j = new HashMap<>();
        }
        C8147der.b(((AbstractC5039brI) this).g, j);
        if (C5041brK.a(((AbstractC5039brI) this).g)) {
            j.put("x-netflix.tracing.client-sampled", "true");
        }
        return j;
    }
}

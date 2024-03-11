package o;

import android.content.Context;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.webclient.AUIApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;

/* loaded from: classes3.dex */
abstract class aMQ<T> extends aMK<T> {
    public static String l = "aui";

    @Override // o.AbstractC5042brL
    public boolean O() {
        return false;
    }

    @Override // o.AbstractC5042brL
    public boolean X() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aMQ(Context context, aOV aov) {
        super(context, aov);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aMQ(Context context, aOV aov, int i) {
        super(context, aov, i);
    }

    @Override // o.AbstractC5042brL
    public void a(ApiEndpointRegistry apiEndpointRegistry) {
        AUIApiEndpointRegistry aUIApiEndpointRegistry = (AUIApiEndpointRegistry) apiEndpointRegistry;
        ((aMK) this).e = aUIApiEndpointRegistry;
        g(aUIApiEndpointRegistry.i().toExternalForm());
    }

    @Override // com.netflix.android.volley.Request
    public Object y() {
        return NetworkRequestType.AUI;
    }
}

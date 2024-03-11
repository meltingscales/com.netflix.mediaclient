package o;

import android.content.Intent;
import com.netflix.mediaclient.service.webclient.volley.RequestAppStateContext;

/* renamed from: o.brM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5043brM extends C1076Nu {
    public static final C5043brM a = new C5043brM();
    private static RequestAppStateContext b = RequestAppStateContext.b;

    public final RequestAppStateContext a() {
        return b;
    }

    private C5043brM() {
    }

    @Override // o.C1076Nu, o.InterfaceC1072Nq
    public void a(NC nc, boolean z) {
        C8632dsu.c((Object) nc, "");
        b = RequestAppStateContext.a;
    }

    @Override // o.C1076Nu, o.InterfaceC1072Nq
    public void c(NC nc, Intent intent) {
        C8632dsu.c((Object) nc, "");
        b = RequestAppStateContext.e;
    }

    @Override // o.C1076Nu, o.InterfaceC1072Nq
    public void b(NC nc) {
        C8632dsu.c((Object) nc, "");
        b = RequestAppStateContext.e;
    }
}

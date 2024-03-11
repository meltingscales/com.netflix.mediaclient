package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.error.crypto.ErrorSource;
import java.util.ArrayList;

/* renamed from: o.bMq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3841bMq extends AbstractC3834bMj {
    public static final d b = new d(null);
    private static final ArrayList<StatusCode> d;
    private final StatusCode c;

    public static final boolean c(StatusCode statusCode) {
        return b.a(statusCode);
    }

    @Override // o.AbstractC3834bMj
    protected StatusCode c() {
        return this.c;
    }

    public C3841bMq(StatusCode statusCode) {
        C8632dsu.c((Object) statusCode, "");
        this.c = statusCode;
    }

    /* renamed from: o.bMq$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final ArrayList<StatusCode> e() {
            return C3841bMq.d;
        }

        public final boolean a(StatusCode statusCode) {
            C8632dsu.c((Object) statusCode, "");
            return e().contains(statusCode);
        }
    }

    static {
        ArrayList<StatusCode> a;
        a = C8569dql.a(StatusCode.INIT_SERVICE_TIMEOUT_CONFIG_CREATE_CRYPTO, StatusCode.INIT_SERVICE_TIMEOUT_CONFIG_INIT_CRYPTO);
        d = a;
    }

    @Override // o.InterfaceC1910aSu
    public InterfaceC1905aSp a(Context context, Throwable th) {
        C8632dsu.c((Object) context, "");
        String str = AbstractC3834bMj.a;
        String name = this.c.name();
        int value = this.c.getValue();
        C1044Mm.e(str, "MediaDrm Widevine Plugin " + name + " (" + value + "). Kill app...");
        return c(context, th);
    }

    @Override // o.AbstractC3834bMj
    protected ErrorSource a() {
        return ErrorSource.msl;
    }
}

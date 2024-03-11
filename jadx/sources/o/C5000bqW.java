package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.bqW  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5000bqW extends AbstractC1900aSk<String> {
    public static final b d = new b(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5000bqW(Context context, NetflixDataRequest.Transport transport) {
        super(context, transport, "OptInToWhatsAppNotificationsRequest");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) transport, "");
    }

    /* renamed from: o.bqW$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("OptInToWhatsAppNotificationsRequest");
        }
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        List<String> asList = Arrays.asList("[\"ums\", \"optInToWhatsAppNotifications\"]");
        C8632dsu.a(asList, "");
        return asList;
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) status, "");
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("Failed to opt in to WhatsApp", null, null, false, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                String c = errorType.c();
                c1596aHd.a(c + " " + b2);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: e */
    public void b(String str) {
        C8632dsu.c((Object) str, "");
        d.getLogTag();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: a */
    public String e(String str, String str2) {
        C8632dsu.c((Object) str, "");
        d.getLogTag();
        return str;
    }
}

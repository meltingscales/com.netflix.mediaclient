package o;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.user.UserAgent;
import io.reactivex.subjects.PublishSubject;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.brU  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5051brU {
    public static final C5051brU d = new C5051brU();

    private C5051brU() {
    }

    public final AbstractC5046brP b(Context context, aOV aov, UserAgent userAgent, PublishSubject<dpR> publishSubject) {
        AbstractC5046brP c5054brX;
        Throwable th;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) publishSubject, "");
        if (C8151dev.d(context)) {
            C1044Mm.e("nf_zuul_factory", "Running on Echo Show, try to load ");
            try {
                Object newInstance = Class.forName("com.netflix.mediaclient.service.smartdisplay.EchoShowZuulAgentImpl").getConstructor(aOV.class, UserAgent.class, PublishSubject.class).newInstance(aov, userAgent, publishSubject);
                if (newInstance instanceof AbstractC5046brP) {
                    c5054brX = (AbstractC5046brP) newInstance;
                } else {
                    C1044Mm.d("nf_zuul_factory", "Created instance is NOT SmartDisplayAgent. It can not be");
                    c5054brX = null;
                }
            } catch (Throwable th2) {
                C1044Mm.e("nf_zuul_factory", th2, "Could not successfully create EchoShowSmartDisplayAgentImpl instance", new Object[0]);
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                C1596aHd b = new C1596aHd("Could not successfully create EchoShowSmartDisplayAgentImpl instance", null, null, false, null, false, false, 126, null).b(ErrorType.v).d(th2).b(false);
                ErrorType errorType = b.a;
                if (errorType != null) {
                    b.e.put("errorType", errorType.c());
                    String b2 = b.b();
                    if (b2 != null) {
                        String c = errorType.c();
                        b.a(c + " " + b2);
                    }
                }
                if (b.b() != null && b.i != null) {
                    th = new Throwable(b.b(), b.i);
                } else if (b.b() != null) {
                    th = new Throwable(b.b());
                } else {
                    th = b.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(b, th);
                } else {
                    dVar.e().b(b, th);
                }
                c5054brX = new C5054brX(aov, userAgent, publishSubject);
            }
        } else {
            c5054brX = new C5054brX(aov, userAgent, publishSubject);
        }
        C8632dsu.d(c5054brX);
        return c5054brX;
    }
}

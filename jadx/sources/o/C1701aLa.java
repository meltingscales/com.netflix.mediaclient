package o;

import android.content.Intent;
import android.net.Uri;
import com.netflix.cl.model.event.session.command.HomeCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.protocol.netflixcom.DeepLinkUtils;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse;
import java.util.List;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.aLa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1701aLa implements aKP {
    public static final a c = new a(null);

    /* renamed from: o.aLa$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("NetflixComSimpleUrlHandler");
        }
    }

    @Override // o.aKP
    public boolean c(List<String> list) {
        C8632dsu.c((Object) list, "");
        return !list.isEmpty();
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        Object y;
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) list, "");
        if (!list.isEmpty()) {
            y = C8576dqs.y(list);
            b(netflixActivity, (String) y);
        }
        return NflxHandler.Response.HANDLING_WITH_DELAY;
    }

    @Override // o.aKP
    /* renamed from: b */
    public HomeCommand d() {
        return new HomeCommand();
    }

    private final void b(NetflixActivity netflixActivity, String str) {
        netflixActivity.getServiceManager().b(str, new c(netflixActivity));
    }

    /* renamed from: o.aLa$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC5164btb {
        final /* synthetic */ NetflixActivity e;

        c(NetflixActivity netflixActivity) {
            this.e = netflixActivity;
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void d(ResolveSimpleUrlPatternResponse resolveSimpleUrlPatternResponse, Status status) {
            Map d;
            Map k;
            Throwable th;
            boolean g;
            Map d2;
            Map k2;
            Throwable th2;
            super.d(resolveSimpleUrlPatternResponse, status);
            if (resolveSimpleUrlPatternResponse == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                String str = C1701aLa.c.getLogTag() + ": response is null with status " + (status != null ? status.c() : null);
                d2 = dqE.d();
                k2 = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd(str, null, null, false, k2, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    Throwable th3 = c1596aHd.i;
                    if (th3 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th3 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else {
                        th2 = th3;
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
                DeepLinkUtils.INSTANCE.d(this.e);
                return;
            }
            String url = resolveSimpleUrlPatternResponse.url();
            if (url != null) {
                g = C8691duz.g(url);
                if (!g && resolveSimpleUrlPatternResponse.error() == null) {
                    Uri parse = Uri.parse(resolveSimpleUrlPatternResponse.url());
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    if (aKQ.e(intent)) {
                        aKQ.c(this.e, intent);
                        return;
                    } else {
                        DeepLinkUtils.INSTANCE.b(this.e, parse);
                        return;
                    }
                }
            }
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            String str2 = C1701aLa.c.getLogTag() + ": response is null with status " + (status != null ? status.c() : null);
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd2 = new C1596aHd(str2, null, null, false, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd2.a;
            if (errorType2 != null) {
                c1596aHd2.e.put("errorType", errorType2.c());
                String b2 = c1596aHd2.b();
                if (b2 != null) {
                    c1596aHd2.a(errorType2.c() + " " + b2);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th = new Throwable(c1596aHd2.b());
            } else {
                Throwable th4 = c1596aHd2.i;
                if (th4 == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th4 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else {
                    th = th4;
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar2.a();
            if (a2 != null) {
                a2.e(c1596aHd2, th);
            } else {
                dVar2.e().b(c1596aHd2, th);
            }
            DeepLinkUtils.INSTANCE.d(this.e);
        }
    }
}

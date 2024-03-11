package o;

import android.content.Context;
import android.content.Intent;
import android.webkit.URLUtil;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.clH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ActivityC6857clH extends ActivityC6188cXc {
    public static final d a = new d(null);

    @Override // o.ActivityC6188cXc
    public void d() {
    }

    /* renamed from: o.clH$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MultiMonthWebViewLinkActivity");
        }

        public final Intent d(Context context, String str) {
            Map d;
            Map k;
            Throwable th;
            Map d2;
            Map k2;
            Throwable th2;
            C8632dsu.c((Object) context, "");
            if (str == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k2 = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("UmaLinkAction: url is null!", null, null, true, k2, false, false, 96, null);
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
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
                return null;
            } else if (!URLUtil.isNetworkUrl(str)) {
                InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd2 = new C1596aHd("UmaLinkAction: " + str + " is not a network URL!", null, null, true, k, false, false, 96, null);
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
                    th = c1596aHd2.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar2.a();
                if (a2 != null) {
                    a2.e(c1596aHd2, th);
                } else {
                    dVar2.e().b(c1596aHd2, th);
                }
                return null;
            } else {
                ActivityC6188cXc.d.e(str);
                Intent intent = new Intent(context, a());
                intent.putExtra(SignupConstants.Field.URL, str);
                intent.putExtra("auto_login_enable", true);
                return intent;
            }
        }

        private final Class<? extends ActivityC6857clH> a() {
            return NetflixApplication.getInstance().M() ? ActivityC6858clI.class : ActivityC6857clH.class;
        }
    }

    @Override // o.ActivityC6188cXc
    public void a(String str) {
        b(-1);
    }

    @Override // o.ActivityC6188cXc
    public void d(String str) {
        b(Integer.MAX_VALUE);
    }

    private final void b(int i) {
        setResult(i);
        finish();
    }
}

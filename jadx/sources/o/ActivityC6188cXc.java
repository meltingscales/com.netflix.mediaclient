package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.webkit.WebView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.NetworkErrorStatus;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.ActivityC6188cXc;
import o.C1596aHd;
import o.C8051ddA;
import o.C8054ddD;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.cQQ;
import o.dpR;
import o.dqE;

/* renamed from: o.cXc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class ActivityC6188cXc extends ActivityC8099ddw {
    private boolean e;
    private final cQQ f = new cQQ();
    private boolean j;
    public static final d d = new d(null);
    public static final int b = 8;
    private static final List<String> a = new ArrayList();

    public static final Intent b(Context context, String str, String str2, String str3, boolean z) {
        return d.a(context, str, str2, str3, z);
    }

    public static final void e(String str) {
        d.e(str);
    }

    /* renamed from: o.cXc$d */
    /* loaded from: classes5.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final void e(String str) {
            Map d;
            Map k;
            Throwable th;
            if (str == null) {
                return;
            }
            try {
                List list = ActivityC6188cXc.a;
                String host = new URL(str).getHost();
                C8632dsu.a(host, "");
                list.add(host);
            } catch (MalformedURLException unused) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                String str2 = "can not add a malformed url = \"" + str + "\" to trusted hosts list";
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd(str2, null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
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
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(String str) {
            if (str == null) {
                return false;
            }
            try {
                return ActivityC6188cXc.a.contains(new URL(str).getHost());
            } catch (MalformedURLException unused) {
                return false;
            }
        }

        public final Intent a(Context context, String str, String str2, String str3, boolean z) {
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
                Intent intent = new Intent(context, NetflixApplication.getInstance().M() ? cWT.class : ActivityC6188cXc.class);
                intent.putExtra(SignupConstants.Field.URL, str);
                intent.putExtra("success_msg", str2);
                intent.putExtra("failure_msg", str3);
                intent.putExtra("auto_login_enable", z);
                return intent;
            }
        }
    }

    @Override // o.ActivityC8099ddw, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c.addJavascriptInterface(new b(this, this, getIntent().getStringExtra("success_msg"), getIntent().getStringExtra("failure_msg")), "nfandroid");
        this.e = getIntent().getBooleanExtra("auto_login_enable", false);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C8632dsu.c((Object) menuItem, "");
        if (menuItem.getItemId() == 16908332) {
            performUpAction();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        WebView webView = this.c;
        if (webView == null || !webView.canGoBackOrForward(-1)) {
            super.performUpAction();
        } else {
            this.c.goBack();
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean handleBackPressed() {
        performUpAction();
        return true;
    }

    @Override // o.ActivityC8099ddw
    public void c(final String str) {
        Map d2;
        Map k;
        Throwable th;
        if (str != null) {
            if (!this.e) {
                super.c(str);
                return;
            } else {
                C1645aIz.a(this, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.ums.UmaLinkActionEmbeddedWebViewActivity$loadUrl$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                        e(serviceManager);
                        return dpR.c;
                    }

                    public final void e(ServiceManager serviceManager) {
                        C8632dsu.c((Object) serviceManager, "");
                        ActivityC6188cXc.this.b(str);
                    }
                });
                return;
            }
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("not loading empty url", null, null, false, k, false, false, 96, null);
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
        InterfaceC1598aHf a2 = dVar.a();
        if (a2 != null) {
            a2.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final String str) {
        Map d2;
        Map k;
        Throwable th;
        if (str == null) {
            return;
        }
        if (!d.d(str)) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("loading " + str + " with auto login token for non-trusted host names", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
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
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        final C3983bRx c3983bRx = new C3983bRx(this);
        final NetworkErrorStatus networkErrorStatus = new NetworkErrorStatus(C8237dgb.c);
        final Runnable runnable = new Runnable() { // from class: o.cXb
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC6188cXc.c(C3983bRx.this, networkErrorStatus, str);
            }
        };
        getHandler().postDelayed(runnable, 10000L);
        if (C8126deW.c(this) != null) {
            Observable<cQQ.d> takeUntil = this.f.c(3600000L).takeUntil(this.mActivityDestroy);
            C8632dsu.a(takeUntil, "");
            SubscribersKt.subscribeBy$default(takeUntil, (drM) null, (drO) null, new drM<cQQ.d, dpR>() { // from class: com.netflix.mediaclient.ui.ums.UmaLinkActionEmbeddedWebViewActivity$loadUrlWithAutoLogin$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cQQ.d dVar2) {
                    d(dVar2);
                    return dpR.c;
                }

                public final void d(cQQ.d dVar2) {
                    Map d3;
                    Map k2;
                    Throwable th2;
                    Handler handler;
                    String b3 = dVar2.b();
                    if (b3 == null || b3.length() == 0) {
                        InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                        d3 = dqE.d();
                        k2 = dqE.k(d3);
                        C1596aHd c1596aHd2 = new C1596aHd("valid auto login token was not created", null, null, false, k2, false, false, 96, null);
                        ErrorType errorType2 = c1596aHd2.a;
                        if (errorType2 != null) {
                            c1596aHd2.e.put("errorType", errorType2.c());
                            String b4 = c1596aHd2.b();
                            if (b4 != null) {
                                String c = errorType2.c();
                                c1596aHd2.a(c + " " + b4);
                            }
                        }
                        if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                            th2 = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                        } else if (c1596aHd2.b() != null) {
                            th2 = new Throwable(c1596aHd2.b());
                        } else {
                            th2 = c1596aHd2.i;
                            if (th2 == null) {
                                th2 = new Throwable("Handled exception with no message");
                            } else if (th2 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        }
                        InterfaceC1601aHi.d dVar3 = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a3 = dVar3.a();
                        if (a3 != null) {
                            a3.e(c1596aHd2, th2);
                        } else {
                            dVar3.e().b(c1596aHd2, th2);
                        }
                    }
                    if (b3 == null) {
                        b3 = "";
                    }
                    ActivityC6188cXc activityC6188cXc = ActivityC6188cXc.this;
                    if (C8054ddD.l(activityC6188cXc)) {
                        return;
                    }
                    handler = activityC6188cXc.handler;
                    handler.removeCallbacks(runnable);
                    super/*o.ddw*/.c(C8051ddA.c(str, b3));
                }
            }, 3, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3983bRx c3983bRx, NetworkErrorStatus networkErrorStatus, String str) {
        C8632dsu.c((Object) c3983bRx, "");
        C8632dsu.c((Object) networkErrorStatus, "");
        C3983bRx.b(c3983bRx, null, networkErrorStatus, str, null, false, 24, null);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        d();
    }

    public void d(final String str) {
        boolean g;
        if (str != null) {
            g = C8691duz.g(str);
            if (g) {
                return;
            }
            C8187dfe.c(new Runnable() { // from class: o.cXd
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC6188cXc.c(ActivityC6188cXc.this, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ActivityC6188cXc activityC6188cXc, String str) {
        C8632dsu.c((Object) activityC6188cXc, "");
        C8054ddD.a(activityC6188cXc, str, 1);
    }

    public void a(final String str) {
        boolean g;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                C8187dfe.c(new Runnable() { // from class: o.cXf
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC6188cXc.g(ActivityC6188cXc.this, str);
                    }
                });
            }
        }
        this.j = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ActivityC6188cXc activityC6188cXc, String str) {
        C8632dsu.c((Object) activityC6188cXc, "");
        C8054ddD.a(activityC6188cXc, str, 1);
    }

    public void d() {
        if (this.j) {
            LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent("RefreshUserMessageRequest.ACTION_DISMISS_UMA_MESSAGE"));
        } else {
            getServiceManager().e(true);
        }
    }

    /* renamed from: o.cXc$b */
    /* loaded from: classes5.dex */
    public final class b {
        private final Activity a;
        private final String b;
        final /* synthetic */ ActivityC6188cXc c;
        private final String e;

        public b(ActivityC6188cXc activityC6188cXc, Activity activity, String str, String str2) {
            C8632dsu.c((Object) activity, "");
            this.c = activityC6188cXc;
            this.a = activity;
            this.b = str;
            this.e = str2;
        }

        @JavascriptInterface
        public final void onSuccess() {
            this.c.a(this.b);
        }

        @JavascriptInterface
        public final void onFailure() {
            this.c.d(this.e);
        }

        @JavascriptInterface
        public final void showToastMessage(final String str) {
            C8632dsu.c((Object) str, "");
            C8187dfe.c(new Runnable() { // from class: o.cXi
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC6188cXc.b.b(ActivityC6188cXc.b.this, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(b bVar, String str) {
            C8632dsu.c((Object) bVar, "");
            C8632dsu.c((Object) str, "");
            C8054ddD.a(bVar.a, str, 1);
        }

        @JavascriptInterface
        public final void exit() {
            if (this.c.isFinishing()) {
                return;
            }
            this.c.finish();
        }
    }
}

package o;

import android.view.View;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C7373cuw;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.cvB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7379cvB extends AbstractC3336ax<a> {
    private boolean b;
    private View.OnClickListener g;
    private String h;
    private String i;
    private String j;
    public static final c d = new c(null);
    public static final int c = 8;

    @Override // o.AbstractC3073as
    public int a() {
        return C7373cuw.b.a;
    }

    public final void a(String str) {
        this.h = str;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public final void d(String str) {
        this.i = str;
    }

    public final void d(boolean z) {
        this.b = z;
    }

    public final void e(String str) {
        this.j = str;
    }

    public final boolean i() {
        return this.b;
    }

    public final String k() {
        return this.i;
    }

    public final View.OnClickListener l() {
        return this.g;
    }

    public final String m() {
        return this.j;
    }

    public final String n() {
        return this.h;
    }

    /* renamed from: o.cvB$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("DownloadedForYouMerchView");
        }
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(a aVar) {
        Map d2;
        Map k;
        Throwable th;
        boolean g;
        boolean g2;
        boolean g3;
        C8632dsu.c((Object) aVar, "");
        String str = this.j;
        String str2 = this.h;
        String str3 = this.i;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g && str2 != null) {
                g2 = C8691duz.g(str2);
                if (!g2 && str3 != null) {
                    g3 = C8691duz.g(str3);
                    if (!g3) {
                        aVar.b().showImage(str);
                        aVar.e().showImage(str2);
                        aVar.a().showImage(str3);
                        aVar.c().setVisibility(this.b ? 8 : 0);
                        aVar.d().setOnClickListener(this.g);
                        return;
                    }
                }
            }
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("DownloadedForYouMerchView: missing required params", null, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b = c1596aHd.b();
            if (b != null) {
                String c2 = errorType.c();
                c1596aHd.a(c2 + " " + b);
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

    /* renamed from: o.cvB$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(a.class, "image1", "getImage1()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "image2", "getImage2()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "image3", "getImage3()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "setupButton", "getSetupButton()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0)), dsA.c(new PropertyReference1Impl(a.class, "divider", "getDivider()Landroid/view/View;", 0))};
        public static final int b = 8;
        private final dsZ c = bIF.d(this, C7373cuw.c.U, false, 2, null);
        private final dsZ e = bIF.d(this, C7373cuw.c.V, false, 2, null);
        private final dsZ j = bIF.d(this, C7373cuw.c.X, false, 2, null);
        private final dsZ f = bIF.d(this, C7373cuw.c.G, false, 2, null);
        private final dsZ d = bIF.d(this, C7373cuw.c.l, false, 2, null);

        public final NetflixImageView b() {
            return (NetflixImageView) this.c.getValue(this, a[0]);
        }

        public final NetflixImageView e() {
            return (NetflixImageView) this.e.getValue(this, a[1]);
        }

        public final NetflixImageView a() {
            return (NetflixImageView) this.j.getValue(this, a[2]);
        }

        public final C1203Sq d() {
            return (C1203Sq) this.f.getValue(this, a[3]);
        }

        public final View c() {
            return (View) this.d.getValue(this, a[4]);
        }
    }
}

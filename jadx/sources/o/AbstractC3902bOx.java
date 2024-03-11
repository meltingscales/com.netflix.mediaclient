package o;

import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3895bOq;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.bOx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3902bOx extends AbstractC3336ax<d> {
    public static final e d = new e(null);
    private String b;
    private String c;
    private String g;

    @Override // o.AbstractC3073as
    public int a() {
        return C3895bOq.c.d;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final String i() {
        return this.c;
    }

    public final String k() {
        return this.g;
    }

    public final String m() {
        return this.b;
    }

    public final void n_(String str) {
        this.b = str;
    }

    public final void o_(String str) {
        this.g = str;
    }

    /* renamed from: o.bOx$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("GameBillboardIconAndTitleModel");
        }
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(d dVar) {
        Map d2;
        Map k;
        Throwable th;
        boolean g;
        C8632dsu.c((Object) dVar, "");
        String str = this.b;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                dVar.c().showImage(new ShowImageRequest().a(this.b).c(ShowImageRequest.Priority.a).e(Integer.valueOf(C3895bOq.a.a)).d());
                dVar.a().setText(this.g);
            }
        }
        dVar.c().setImageResource(C3895bOq.a.a);
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        String str2 = "iconImageUrl is empty for gameId:" + this.c;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd(str2, null, null, false, k, false, false, 96, null);
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
        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar2.a();
        if (a != null) {
            a.e(c1596aHd, th);
        } else {
            dVar2.e().b(c1596aHd, th);
        }
        dVar.a().setText(this.g);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        NetflixImageView c = dVar.c();
        c.setBackground(null);
        c.setForeground(null);
        c.onViewRecycled();
    }

    /* renamed from: o.bOx$d */
    /* loaded from: classes4.dex */
    public static final class d extends bIG {
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(d.class, "iconImage", "getIconImage()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(d.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ b = bIF.d(this, C3895bOq.b.w, false, 2, null);
        private final dsZ c = bIF.d(this, C3895bOq.b.al, false, 2, null);

        public final NetflixImageView c() {
            return (NetflixImageView) this.b.getValue(this, d[0]);
        }

        public final C1204Sr a() {
            return (C1204Sr) this.c.getValue(this, d[1]);
        }
    }
}

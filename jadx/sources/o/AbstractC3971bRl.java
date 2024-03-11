package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3895bOq;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.bRl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3971bRl extends AbstractC3336ax<c> {
    private String b;
    private String c;
    private String d;
    private String j;

    public final void A_(String str) {
        this.d = str;
    }

    public final void B_(String str) {
        this.c = str;
    }

    public final void C_(String str) {
        this.j = str;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C3895bOq.c.Z;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final String i() {
        return this.d;
    }

    public final String k() {
        return this.b;
    }

    public final String l() {
        return this.c;
    }

    public final String o() {
        return this.j;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(c cVar) {
        Map d;
        Map k;
        Throwable th;
        boolean g;
        C8632dsu.c((Object) cVar, "");
        String str = this.b;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                cVar.d().showImage(this.b);
                cVar.e().setText(this.j);
                cVar.a().setText(this.c);
            }
        }
        cVar.d().clearImage();
        InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
        String str2 = "iconUrl is empty in IPBasedGame for gameId:" + this.d;
        d = dqE.d();
        k = dqE.k(d);
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
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
        cVar.e().setText(this.j);
        cVar.a().setText(this.c);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        cVar.d().setBackground(null);
        cVar.d().setForeground(null);
        cVar.d().onViewRecycled();
        super.b((AbstractC3971bRl) cVar);
    }

    /* renamed from: o.bRl$c */
    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(c.class, "icon", "getIcon()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(c.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "genre", "getGenre()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ e = bIF.d(this, C3895bOq.b.w, false, 2, null);
        private final dsZ c = bIF.d(this, C3895bOq.b.al, false, 2, null);
        private final dsZ b = bIF.d(this, C3895bOq.b.q, false, 2, null);

        public final NetflixImageView d() {
            return (NetflixImageView) this.e.getValue(this, a[0]);
        }

        public final C1204Sr e() {
            return (C1204Sr) this.c.getValue(this, a[1]);
        }

        public final C1204Sr a() {
            return (C1204Sr) this.b.getValue(this, a[2]);
        }
    }
}

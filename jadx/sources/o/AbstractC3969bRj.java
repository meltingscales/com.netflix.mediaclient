package o;

import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3895bOq;

/* renamed from: o.bRj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3969bRj extends AbstractC3336ax<a> {
    private String b;
    private String c;
    private String d;

    public final void D_(String str) {
        this.d = str;
    }

    public final void E_(String str) {
        this.b = str;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C3895bOq.c.ag;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final String i() {
        return this.d;
    }

    public final String k() {
        return this.c;
    }

    public final String m() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // o.AbstractC3336ax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC3969bRj.a r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r5, r0)
            java.lang.String r0 = r4.d
            if (r0 == 0) goto L1a
            boolean r0 = o.C8684dus.a(r0)
            if (r0 == 0) goto L10
            goto L1a
        L10:
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r5.d()
            java.lang.String r1 = r4.d
            r0.showImage(r1)
            goto L21
        L1a:
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r5.d()
            r0.clearImage()
        L21:
            java.lang.String r0 = r4.b
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L47
            boolean r0 = o.C8684dus.a(r0)
            if (r0 == 0) goto L2f
            goto L47
        L2f:
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r5.b()
            java.lang.String r3 = r4.b
            r0.showImage(r3)
            o.Sr r0 = r5.e()
            r0.setVisibility(r1)
            com.netflix.mediaclient.android.widget.NetflixImageView r5 = r5.b()
            r5.setVisibility(r2)
            goto L65
        L47:
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r5.b()
            r0.clearImage()
            o.Sr r0 = r5.e()
            java.lang.String r3 = r4.c
            r0.setText(r3)
            o.Sr r0 = r5.e()
            r0.setVisibility(r2)
            com.netflix.mediaclient.android.widget.NetflixImageView r5 = r5.b()
            r5.setVisibility(r1)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC3969bRj.e(o.bRj$a):void");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.d().setBackground(null);
        aVar.d().setForeground(null);
        aVar.d().onViewRecycled();
        aVar.b().setBackground(null);
        aVar.b().setForeground(null);
        aVar.b().onViewRecycled();
        super.b((AbstractC3969bRj) aVar);
    }

    /* renamed from: o.bRj$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(a.class, "banner", "getBanner()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "logo", "getLogo()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "logoFallback", "getLogoFallback()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ d = bIF.d(this, C3895bOq.b.d, false, 2, null);
        private final dsZ a = bIF.d(this, C3895bOq.b.f13523J, false, 2, null);
        private final dsZ e = bIF.d(this, C3895bOq.b.M, false, 2, null);

        public final NetflixImageView d() {
            return (NetflixImageView) this.d.getValue(this, b[0]);
        }

        public final NetflixImageView b() {
            return (NetflixImageView) this.a.getValue(this, b[1]);
        }

        public final C1204Sr e() {
            return (C1204Sr) this.e.getValue(this, b[2]);
        }
    }
}

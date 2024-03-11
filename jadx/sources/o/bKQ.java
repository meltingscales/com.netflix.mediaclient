package o;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3796bKz;
import o.InterfaceC3825bMa;

/* loaded from: classes4.dex */
public abstract class bKQ extends AbstractC3336ax<d> implements InterfaceC3829bMe {
    public AppView b;
    private Float c;
    public drO<? extends TrackingInfo> d;
    private String f;
    private C9686vA g;
    private InterfaceC3825bMa.a h;
    private String i;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.v;
    }

    public final void a(String str) {
        this.i = str;
    }

    public final void a_(Float f) {
        this.c = f;
    }

    public final void a_(C9686vA c9686vA) {
        this.g = c9686vA;
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return true;
    }

    public final String k() {
        return this.i;
    }

    public final C9686vA l() {
        return this.g;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.h;
    }

    public final Float o() {
        return this.c;
    }

    public final String q() {
        return this.f;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        AppView appView = this.b;
        if (appView != null) {
            return appView;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        drO dro = this.d;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    @Override // o.AbstractC3336ax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.bKQ.d r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r5, r0)
            java.lang.String r0 = r4.i
            r1 = 0
            if (r0 == 0) goto L27
            boolean r2 = o.C8684dus.a(r0)
            if (r2 == 0) goto L11
            goto L27
        L11:
            com.netflix.mediaclient.android.widget.NetflixImageView r2 = r5.a()
            com.netflix.android.imageloader.api.ShowImageRequest r3 = new com.netflix.android.imageloader.api.ShowImageRequest
            r3.<init>()
            com.netflix.android.imageloader.api.ShowImageRequest r0 = r3.a(r0)
            r3 = 1
            com.netflix.android.imageloader.api.ShowImageRequest r0 = r0.b(r3)
            r2.showImage(r0)
            goto L2e
        L27:
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r5.a()
            r0.setImageDrawable(r1)
        L2e:
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r5.a()
            java.lang.Float r2 = r4.c
            r0.setAspectRatio(r2)
            o.vA r0 = r4.g
            if (r0 == 0) goto L43
            android.view.View r5 = r5.r()
            o.C9702vQ.c(r5, r0)
            goto L4a
        L43:
            android.view.View r5 = r5.r()
            r5.setOutlineProvider(r1)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bKQ.e(o.bKQ$d):void");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        dVar.a().onViewRecycled();
    }

    /* loaded from: classes4.dex */
    public static final class d extends bIG {
        private final dsZ c = bIF.d(this, C3796bKz.a.h, false, 2, null);
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(d.class, "image", "getImage()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        public static final int a = 8;

        public final NetflixImageView a() {
            return (NetflixImageView) this.c.getValue(this, e[0]);
        }
    }
}

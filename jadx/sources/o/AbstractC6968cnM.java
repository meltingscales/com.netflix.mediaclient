package o;

import android.view.View;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C6956cnA;
import o.C9834xU;

/* renamed from: o.cnM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6968cnM extends AbstractC3336ax<c> {
    public TrackingInfoHolder c;
    private View.OnClickListener f;
    private View.OnLongClickListener g;
    private View.OnClickListener h;
    private boolean i;
    private String j;
    private InterfaceC5160btX k;
    private View.OnClickListener l;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f13754o;
    public static final e d = new e(null);
    public static final int b = 8;
    private String n = "";
    private VideoType m = VideoType.SHOW;

    @Override // o.AbstractC3073as
    public int a() {
        return C6956cnA.b.h;
    }

    public final void a(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public final void a(InterfaceC5160btX interfaceC5160btX) {
        this.k = interfaceC5160btX;
    }

    public final void a(boolean z) {
        this.i = z;
    }

    public final void aa_(String str) {
        this.j = str;
    }

    public final void c(CharSequence charSequence) {
        this.f13754o = charSequence;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.l = onClickListener;
    }

    public final void d(VideoType videoType) {
        C8632dsu.c((Object) videoType, "");
        this.m = videoType;
    }

    public final void e(String str) {
        C8632dsu.c((Object) str, "");
        this.n = str;
    }

    public final String i() {
        return this.j;
    }

    public final void i_(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public final boolean k() {
        return this.i;
    }

    public final View.OnLongClickListener l() {
        return this.g;
    }

    public final InterfaceC5160btX m() {
        return this.k;
    }

    public final View.OnClickListener n() {
        return this.f;
    }

    public final View.OnClickListener o() {
        return this.h;
    }

    public final String q() {
        return this.n;
    }

    public final View.OnClickListener r() {
        return this.l;
    }

    public final VideoType s() {
        return this.m;
    }

    public final CharSequence t() {
        return this.f13754o;
    }

    /* renamed from: o.cnM$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("MyListVideoModel");
        }
    }

    public final TrackingInfoHolder p() {
        TrackingInfoHolder trackingInfoHolder = this.c;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    @Override // o.AbstractC3336ax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC6968cnM.c r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r5, r0)
            o.Sr r0 = r5.i()
            java.lang.CharSequence r1 = r4.f13754o
            r0.setText(r1)
            java.lang.String r0 = r4.j
            if (r0 == 0) goto L21
            boolean r1 = o.C8684dus.a(r0)
            if (r1 == 0) goto L19
            goto L21
        L19:
            com.netflix.mediaclient.android.widget.NetflixImageView r1 = r5.b()
            r1.showImage(r0)
            goto L30
        L21:
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r5.b()
            com.netflix.mediaclient.util.gfx.ImageLoader$c r1 = com.netflix.mediaclient.ui.experience.BrowseExperience.b()
            int r1 = r1.b()
            r0.setImageResource(r1)
        L30:
            boolean r0 = r4.i
            r1 = 8
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L79
            o.Sg r0 = r5.a()
            r0.setVisibility(r1)
            o.Sg r0 = r5.d()
            r0.setVisibility(r3)
            o.Sg r0 = r5.d()
            android.view.View$OnClickListener r1 = r4.l
            r0.setOnClickListener(r1)
            if (r1 == 0) goto L53
            r1 = r2
            goto L54
        L53:
            r1 = r3
        L54:
            r0.setClickable(r1)
            android.view.View r0 = r5.c()
            android.view.View$OnClickListener r1 = r4.l
            r0.setOnClickListener(r1)
            if (r1 == 0) goto L64
            r1 = r2
            goto L65
        L64:
            r1 = r3
        L65:
            r0.setClickable(r1)
            android.view.View r0 = r5.e()
            android.view.View$OnClickListener r1 = r4.f
            r0.setOnClickListener(r1)
            if (r1 == 0) goto L74
            goto L75
        L74:
            r2 = r3
        L75:
            r0.setClickable(r2)
            goto Lb9
        L79:
            o.Sg r0 = r5.a()
            r0.setVisibility(r3)
            o.Sg r0 = r5.d()
            r0.setVisibility(r1)
            o.Sg r0 = r5.a()
            android.view.View$OnClickListener r1 = r4.h
            r0.setOnClickListener(r1)
            if (r1 == 0) goto L94
            r1 = r2
            goto L95
        L94:
            r1 = r3
        L95:
            r0.setClickable(r1)
            android.view.View r0 = r5.c()
            android.view.View$OnClickListener r1 = r4.h
            r0.setOnClickListener(r1)
            if (r1 == 0) goto La5
            r1 = r2
            goto La6
        La5:
            r1 = r3
        La6:
            r0.setClickable(r1)
            android.view.View r0 = r5.e()
            android.view.View$OnClickListener r1 = r4.f
            r0.setOnClickListener(r1)
            if (r1 == 0) goto Lb5
            goto Lb6
        Lb5:
            r2 = r3
        Lb6:
            r0.setClickable(r2)
        Lb9:
            android.view.View r5 = r5.e()
            int r0 = o.C9834xU.g.H
            r1 = 0
            r5.setTag(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC6968cnM.e(o.cnM$c):void");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        super.b((AbstractC6968cnM) cVar);
        cVar.b().clearImage();
        View e2 = cVar.e();
        e2.setOnClickListener(null);
        e2.setClickable(false);
        C1193Sg d2 = cVar.d();
        d2.setOnClickListener(null);
        d2.setClickable(false);
        C1193Sg a = cVar.a();
        a.setOnClickListener(null);
        a.setClickable(false);
        View c2 = cVar.c();
        c2.setOnClickListener(null);
        c2.setClickable(false);
        cVar.e().setTag(C9834xU.g.H, null);
    }

    /* renamed from: o.cnM$c */
    /* loaded from: classes4.dex */
    public static class c extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(c.class, "baseView", "getBaseView()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(c.class, "titleView", "getTitleView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "boxShotView", "getBoxShotView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "playIcon", "getPlayIcon()Lcom/netflix/mediaclient/android/widget/NetflixImageButton;", 0)), dsA.c(new PropertyReference1Impl(c.class, "removeIcon", "getRemoveIcon()Lcom/netflix/mediaclient/android/widget/NetflixImageButton;", 0)), dsA.c(new PropertyReference1Impl(c.class, "buttonContainer", "getButtonContainer()Landroid/view/View;", 0))};
        public static final int d = 8;
        private final dsZ b = bIF.d(this, C6956cnA.e.v, false, 2, null);
        private final dsZ f = bIF.d(this, C6956cnA.e.y, false, 2, null);
        private final dsZ e = bIF.d(this, C6956cnA.e.b, false, 2, null);
        private final dsZ h = bIF.d(this, C6956cnA.e.q, false, 2, null);
        private final dsZ j = bIF.d(this, C6956cnA.e.x, false, 2, null);
        private final dsZ c = bIF.d(this, C6956cnA.e.d, false, 2, null);

        public final View e() {
            return (View) this.b.getValue(this, a[0]);
        }

        public final C1204Sr i() {
            return (C1204Sr) this.f.getValue(this, a[1]);
        }

        public final NetflixImageView b() {
            return (NetflixImageView) this.e.getValue(this, a[2]);
        }

        public final C1193Sg a() {
            return (C1193Sg) this.h.getValue(this, a[3]);
        }

        public final C1193Sg d() {
            return (C1193Sg) this.j.getValue(this, a[4]);
        }

        public final View c() {
            return (View) this.c.getValue(this, a[5]);
        }
    }
}

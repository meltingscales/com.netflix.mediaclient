package o;

import android.view.View;
import android.widget.ImageView;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C8029dcf;

/* renamed from: o.dcb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8025dcb extends AbstractC3336ax<e> {
    public TrackingInfoHolder b;
    private View.OnClickListener c;
    private String d;
    private boolean f;
    private String g = "";
    private CharSequence h;
    private View.OnClickListener i;
    private CharSequence j;
    private boolean k;
    private String l;
    private View.OnClickListener m;
    private CharSequence n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13828o;

    public final void N_(boolean z) {
        this.f13828o = z;
    }

    public final void Q_(CharSequence charSequence) {
        this.j = charSequence;
    }

    public final void R_(CharSequence charSequence) {
        this.h = charSequence;
    }

    public final void S_(CharSequence charSequence) {
        this.n = charSequence;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C8029dcf.c.e;
    }

    public final void a(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public final void a(boolean z) {
        this.k = z;
    }

    public final void ap_(String str) {
        this.d = str;
    }

    public final void aq_(String str) {
        this.l = str;
    }

    public final void b(boolean z) {
        this.f = z;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.m = onClickListener;
    }

    public final void d(String str) {
        C8632dsu.c((Object) str, "");
        this.g = str;
    }

    public final String i() {
        return this.d;
    }

    public final String k() {
        return this.g;
    }

    public final CharSequence l() {
        return this.j;
    }

    public final boolean m() {
        return this.f;
    }

    public final void m_(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    public final CharSequence n() {
        return this.h;
    }

    public final View.OnClickListener o() {
        return this.c;
    }

    public final View.OnClickListener p() {
        return this.m;
    }

    public final CharSequence q() {
        return this.n;
    }

    public final View.OnClickListener r() {
        return this.i;
    }

    public final boolean s() {
        return this.f13828o;
    }

    public final boolean t() {
        return this.k;
    }

    public final String v() {
        return this.l;
    }

    public final TrackingInfoHolder y() {
        TrackingInfoHolder trackingInfoHolder = this.b;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC8025dcb.e r6) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC8025dcb.e(o.dcb$e):void");
    }

    /* renamed from: o.dcb$e */
    /* loaded from: classes5.dex */
    public static class e extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(e.class, "baseView", "getBaseView()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(e.class, "parentTitleView", "getParentTitleView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "titleView", "getTitleView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "timestampView", "getTimestampView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "boxShotView", "getBoxShotView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "removeButton", "getRemoveButton()Lcom/netflix/mediaclient/android/widget/NetflixImageButton;", 0)), dsA.c(new PropertyReference1Impl(e.class, "moveIcon", "getMoveIcon()Landroid/widget/ImageView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "shareButton", "getShareButton()Lcom/netflix/mediaclient/android/widget/NetflixImageButton;", 0))};
        public static final int d = 8;
        private final dsZ a = bIF.d(this, C8029dcf.a.h, false, 2, null);
        private final dsZ f = bIF.d(this, C8029dcf.a.i, false, 2, null);
        private final dsZ m = bIF.d(this, C8029dcf.a.f13830o, false, 2, null);
        private final dsZ h = bIF.d(this, C8029dcf.a.l, false, 2, null);
        private final dsZ b = bIF.d(this, C8029dcf.a.d, false, 2, null);
        private final dsZ j = bIF.d(this, C8029dcf.a.f, false, 2, null);
        private final dsZ c = bIF.d(this, C8029dcf.a.e, false, 2, null);
        private final dsZ g = bIF.d(this, C8029dcf.a.g, false, 2, null);

        public final View c() {
            return (View) this.a.getValue(this, e[0]);
        }

        public final C1204Sr e() {
            return (C1204Sr) this.f.getValue(this, e[1]);
        }

        public final C1204Sr j() {
            return (C1204Sr) this.m.getValue(this, e[2]);
        }

        public final C1204Sr h() {
            return (C1204Sr) this.h.getValue(this, e[3]);
        }

        public final NetflixImageView a() {
            return (NetflixImageView) this.b.getValue(this, e[4]);
        }

        public final C1193Sg d() {
            return (C1193Sg) this.j.getValue(this, e[5]);
        }

        public final ImageView b() {
            return (ImageView) this.c.getValue(this, e[6]);
        }

        public final C1193Sg f() {
            return (C1193Sg) this.g.getValue(this, e[7]);
        }
    }
}

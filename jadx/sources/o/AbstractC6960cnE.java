package o;

import android.util.Base64;
import android.view.View;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C6956cnA;
import o.C9834xU;

/* renamed from: o.cnE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6960cnE extends AbstractC3336ax<e> {
    public static final int b;
    public static final a c;
    private static byte e$ss2$3215 = 0;
    private static int p = 1;
    private static int r;
    public TrackingInfoHolder d;
    private String f = "";
    private boolean g;
    private boolean h;
    private View.OnClickListener i;
    private boolean j;
    private String k;
    private View.OnClickListener l;
    private View.OnClickListener m;
    private View.OnLongClickListener n;

    /* renamed from: o  reason: collision with root package name */
    private String f13753o;
    private String q;

    static {
        y();
        c = new a(null);
        b = 8;
    }

    static void y() {
        e$ss2$3215 = (byte) 24;
    }

    public final void X_(String str) {
        this.f13753o = str;
    }

    public final void Y_(String str) {
        this.k = str;
    }

    public final void Z_(String str) {
        this.q = str;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C6956cnA.b.d;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.m = onClickListener;
    }

    public final void c(String str) {
        C8632dsu.c((Object) str, "");
        this.f = str;
    }

    public final void e(boolean z) {
        this.j = z;
    }

    public final void g_(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    public final void h_(View.OnClickListener onClickListener) {
        this.l = onClickListener;
    }

    public final boolean i() {
        return this.h;
    }

    public final String k() {
        return this.f13753o;
    }

    public final String l() {
        return this.f;
    }

    public final boolean m() {
        return this.j;
    }

    public final View.OnClickListener n() {
        return this.i;
    }

    public final boolean o() {
        return this.g;
    }

    public final View.OnLongClickListener p() {
        return this.n;
    }

    public final View.OnClickListener q() {
        return this.m;
    }

    public final String r() {
        return this.k;
    }

    public final String s() {
        return this.q;
    }

    public final View.OnClickListener t() {
        return this.l;
    }

    public final void y_(boolean z) {
        this.h = z;
    }

    public final void z_(boolean z) {
        this.g = z;
    }

    /* renamed from: o.cnE$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("MyListGameModel");
        }
    }

    public final TrackingInfoHolder v() {
        TrackingInfoHolder trackingInfoHolder = this.d;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016a  */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC6960cnE.e r12) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC6960cnE.e(o.cnE$e):void");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        super.b((AbstractC6960cnE) eVar);
        eVar.a().clearImage();
        eVar.d().setTag(C9834xU.g.H, null);
        View d = eVar.d();
        d.setOnClickListener(null);
        d.setClickable(false);
        C1193Sg j = eVar.j();
        j.setOnClickListener(null);
        j.setClickable(false);
        C1193Sg b2 = eVar.b();
        b2.setOnClickListener(null);
        b2.setClickable(false);
        View e2 = eVar.e();
        e2.setOnClickListener(null);
        e2.setClickable(false);
    }

    /* renamed from: o.cnE$e */
    /* loaded from: classes4.dex */
    public static class e extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(e.class, "baseView", "getBaseView()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(e.class, "titleView", "getTitleView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "genreView", "getGenreView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "boxShotView", "getBoxShotView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "playIcon", "getPlayIcon()Lcom/netflix/mediaclient/android/widget/NetflixImageButton;", 0)), dsA.c(new PropertyReference1Impl(e.class, "removeIcon", "getRemoveIcon()Lcom/netflix/mediaclient/android/widget/NetflixImageButton;", 0)), dsA.c(new PropertyReference1Impl(e.class, "buttonContainer", "getButtonContainer()Landroid/view/View;", 0))};
        public static final int c = 8;
        private final dsZ b = bIF.d(this, C6956cnA.e.v, false, 2, null);
        private final dsZ h = bIF.d(this, C6956cnA.e.y, false, 2, null);
        private final dsZ f = bIF.d(this, C6956cnA.e.c, false, 2, null);
        private final dsZ a = bIF.d(this, C6956cnA.e.b, false, 2, null);
        private final dsZ j = bIF.d(this, C6956cnA.e.q, false, 2, null);
        private final dsZ g = bIF.d(this, C6956cnA.e.x, false, 2, null);
        private final dsZ d = bIF.d(this, C6956cnA.e.d, false, 2, null);

        public final View d() {
            return (View) this.b.getValue(this, e[0]);
        }

        public final C1204Sr i() {
            return (C1204Sr) this.h.getValue(this, e[1]);
        }

        public final C1204Sr c() {
            return (C1204Sr) this.f.getValue(this, e[2]);
        }

        public final NetflixImageView a() {
            return (NetflixImageView) this.a.getValue(this, e[3]);
        }

        public final C1193Sg b() {
            return (C1193Sg) this.j.getValue(this, e[4]);
        }

        public final C1193Sg j() {
            return (C1193Sg) this.g.getValue(this, e[5]);
        }

        public final View e() {
            return (View) this.d.getValue(this, e[6]);
        }
    }

    private void u(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$3215);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}

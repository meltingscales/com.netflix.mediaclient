package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.epoxy.models.HorizontalGravity;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.util.ViewUtils;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.bYo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4163bYo extends AbstractC3336ax<b> {
    public String b;
    private String c;
    public String d;
    private String f;
    private View.OnClickListener g;
    private String i;
    private String j;
    private String k;
    private Drawable l;
    private String m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private String f13555o;
    private String q;
    private int r = -430;
    private HorizontalGravity h = HorizontalGravity.a;

    /* renamed from: o.bYo$c */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HorizontalGravity.values().length];
            try {
                iArr[HorizontalGravity.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HorizontalGravity.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public final void N_(String str) {
        this.c = str;
    }

    public final void O_(String str) {
        this.i = str;
    }

    public final void P_(String str) {
        this.j = str;
    }

    public final void Q_(String str) {
        this.f = str;
    }

    public final void R_(String str) {
        this.k = str;
    }

    public final void S_(String str) {
        this.q = str;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.am;
    }

    public final void a_(HorizontalGravity horizontalGravity) {
        C8632dsu.c((Object) horizontalGravity, "");
        this.h = horizontalGravity;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public final void d(Drawable drawable) {
        this.l = drawable;
    }

    public final String i() {
        return this.c;
    }

    public final void j(String str) {
        this.f13555o = str;
    }

    public final View.OnClickListener k() {
        return this.g;
    }

    public final String l() {
        return this.j;
    }

    public final String m() {
        return this.i;
    }

    public final HorizontalGravity n() {
        return this.h;
    }

    public final String o() {
        return this.f;
    }

    public final String p() {
        return this.m;
    }

    public final String q() {
        return this.f13555o;
    }

    public final int r() {
        return this.n;
    }

    public final Drawable s() {
        return this.l;
    }

    public final String t() {
        return this.k;
    }

    public final int u() {
        return this.r;
    }

    public final String x() {
        return this.q;
    }

    public final String w() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    public final String y() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    /* renamed from: o.bYo$d */
    /* loaded from: classes4.dex */
    public static final class d implements View.OnLayoutChangeListener {
        final /* synthetic */ NetflixImageView a;

        public d(NetflixImageView netflixImageView) {
            this.a = netflixImageView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            AbstractC4163bYo.this.a(this.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0110  */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC4163bYo.b r8) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC4163bYo.e(o.bYo$b):void");
    }

    private final void b(b bVar) {
        Map d2;
        Map k;
        Throwable th;
        boolean g;
        String str = this.k;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                bVar.e().showImage(new ShowImageRequest().a(str).c(ShowImageRequest.Priority.a));
                NetflixImageView e = bVar.e();
                dsE dse = dsE.b;
                String string = bVar.e().getContext().getString(com.netflix.mediaclient.ui.R.o.l);
                C8632dsu.a(string, "");
                String format = String.format(string, Arrays.copyOf(new Object[]{y()}, 1));
                C8632dsu.a(format, "");
                e.setContentDescription(format);
                ViewUtils.b(bVar.e());
                a(bVar.e());
            }
        }
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        String w = w();
        String y = y();
        aVar.a("Character videoId: " + w + " title: " + y);
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("Character image url is empty", null, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                String c2 = errorType.c();
                c1596aHd.a(c2 + " " + b2);
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
        bVar.e().setImageResource(BrowseExperience.b().b());
        NetflixImageView e2 = bVar.e();
        dsE dse2 = dsE.b;
        String string2 = bVar.e().getContext().getString(com.netflix.mediaclient.ui.R.o.l);
        C8632dsu.a(string2, "");
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{y()}, 1));
        C8632dsu.a(format2, "");
        e2.setContentDescription(format2);
        ViewUtils.b(bVar.e());
        a(bVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetflixImageView netflixImageView) {
        float applyDimension;
        int i;
        int p;
        if (C8150deu.h()) {
            if (C8150deu.s(netflixImageView.getContext())) {
                i = (int) (C8150deu.l(netflixImageView.getContext()) * 0.7d);
                ViewGroup.LayoutParams layoutParams = netflixImageView.getLayoutParams();
                layoutParams.height = i;
                netflixImageView.setLayoutParams(layoutParams);
                C9702vQ.e(netflixImageView);
            }
            if (netflixImageView.getWidth() > 0) {
                p = netflixImageView.getWidth();
            } else {
                if (ViewCompat.isLaidOut(netflixImageView) && !netflixImageView.isLayoutRequested()) {
                    a(netflixImageView);
                } else {
                    netflixImageView.addOnLayoutChangeListener(new d(netflixImageView));
                }
                p = C8150deu.p(netflixImageView.getContext());
            }
            applyDimension = p * 0.5625f;
        } else {
            C1332Xp c1332Xp = C1332Xp.b;
            applyDimension = TypedValue.applyDimension(1, 308, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        }
        i = (int) applyDimension;
        ViewGroup.LayoutParams layoutParams2 = netflixImageView.getLayoutParams();
        layoutParams2.height = i;
        netflixImageView.setLayoutParams(layoutParams2);
        C9702vQ.e(netflixImageView);
    }

    /* renamed from: o.bYo$b */
    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(b.class, "mainImageView", "getMainImageView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "playIconView", "getPlayIconView()Landroid/widget/ImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "detailsLayout", "getDetailsLayout()Landroid/widget/LinearLayout;", 0)), dsA.c(new PropertyReference1Impl(b.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Landroid/widget/TextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "titleImageView", "getTitleImageView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "certification", "getCertification()Landroid/widget/TextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "ratingIcon", "getRatingIcon()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "basicSupplementalInfo", "getBasicSupplementalInfo()Landroid/widget/TextView;", 0))};
        public static final int d = 8;
        private final dsZ h = bIF.d(this, com.netflix.mediaclient.ui.R.g.dz, false, 2, null);
        private final dsZ j = bIF.d(this, com.netflix.mediaclient.ui.R.g.ez, false, 2, null);
        private final dsZ e = bIF.d(this, com.netflix.mediaclient.ui.R.g.aN, false, 2, null);
        private final dsZ g = bIF.d(this, com.netflix.mediaclient.ui.R.g.gV, false, 2, null);

        /* renamed from: o  reason: collision with root package name */
        private final dsZ f13556o = bIF.d(this, com.netflix.mediaclient.ui.R.g.gq, false, 2, null);
        private final dsZ b = bIF.d(this, com.netflix.mediaclient.ui.R.g.gm, false, 2, null);
        private final dsZ f = bIF.d(this, com.netflix.mediaclient.ui.R.g.fg, false, 2, null);
        private final dsZ c = bIF.d(this, com.netflix.mediaclient.ui.R.g.cR, false, 2, null);

        public final NetflixImageView e() {
            return (NetflixImageView) this.h.getValue(this, a[0]);
        }

        public final LinearLayout d() {
            return (LinearLayout) this.e.getValue(this, a[2]);
        }

        public final TextView h() {
            return (TextView) this.g.getValue(this, a[3]);
        }

        public final NetflixImageView g() {
            return (NetflixImageView) this.f13556o.getValue(this, a[4]);
        }

        public final TextView a() {
            return (TextView) this.b.getValue(this, a[5]);
        }

        public final NetflixImageView c() {
            return (NetflixImageView) this.f.getValue(this, a[6]);
        }

        public final TextView b() {
            return (TextView) this.c.getValue(this, a[7]);
        }
    }
}

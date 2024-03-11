package o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.util.ViewUtils;
import java.util.Arrays;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes4.dex */
public abstract class bIQ extends AbstractC3336ax<c> {
    public DownloadButton.ButtonState c;
    public bIN f;
    private View.OnClickListener g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private CharSequence l;
    private CharSequence m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private String f13511o;
    private CharSequence p;
    private boolean q;
    private CharSequence r;
    private int s;
    public static final d d = new d(null);
    public static final int b = 8;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.bz;
    }

    public final void a(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public final void a(boolean z) {
        this.q = z;
    }

    public final void b(int i) {
        this.j = i;
    }

    public final void b(CharSequence charSequence) {
        this.l = charSequence;
    }

    public final void b(boolean z) {
        this.h = z;
    }

    public final void d(String str) {
        this.f13511o = str;
    }

    public final boolean i() {
        return this.i;
    }

    public final void i_(int i) {
        this.n = i;
    }

    public final int k() {
        return this.k;
    }

    public final void k_(boolean z) {
        this.i = z;
    }

    public final View.OnClickListener l() {
        return this.g;
    }

    public final boolean m() {
        return this.h;
    }

    public final CharSequence n() {
        return this.m;
    }

    public final int o() {
        return this.j;
    }

    public final int p() {
        return this.n;
    }

    public final int q() {
        return this.s;
    }

    public final String r() {
        return this.f13511o;
    }

    public final CharSequence s() {
        return this.l;
    }

    public final void s_(CharSequence charSequence) {
        this.r = charSequence;
    }

    public final boolean v() {
        return this.q;
    }

    public final CharSequence w() {
        return this.p;
    }

    public final CharSequence x() {
        return this.r;
    }

    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    public final bIN t() {
        bIN bin = this.f;
        if (bin != null) {
            return bin;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void e(c cVar) {
        dpR dpr;
        C8632dsu.c((Object) cVar, "");
        Context context = cVar.r().getContext();
        View r = cVar.r();
        dsE dse = dsE.b;
        String string = context.getResources().getString(com.netflix.mediaclient.ui.R.o.h);
        C8632dsu.a(string, "");
        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.k), this.r, this.p, Integer.valueOf(C8175dfS.c(this.s))}, 4));
        C8632dsu.a(format, "");
        r.setContentDescription(format);
        cVar.g().setText(this.r);
        cVar.g().setClickable(false);
        String str = this.f13511o;
        if (str != null) {
            cVar.a().showImage(new ShowImageRequest().a(str).c(ShowImageRequest.Priority.a));
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            cVar.a().clearImage();
        }
        cVar.a().setContentDescription(this.r);
        cVar.d().setText(this.l);
        cVar.d().setVisibility(this.l == null ? 8 : 0);
        cVar.e().setText(this.m);
        cVar.e().setVisibility(this.m == null ? 8 : 0);
        cVar.c().setVisibility(cVar.e().getVisibility() == 0 ? 0 : 8);
        if (this.n <= 0) {
            cVar.j().setVisibility(8);
        } else {
            cVar.j().setVisibility(0);
            cVar.j().setProgress(this.n);
        }
        cVar.f().setText(this.p);
        cVar.f().setVisibility(this.p == null ? 8 : 0);
        if (this.i) {
            cVar.i().setVisibility(this.q ? 0 : 8);
            NetflixImageView a = cVar.a();
            View.OnClickListener onClickListener = this.g;
            a.setOnClickListener(onClickListener);
            a.setClickable(onClickListener != null);
            ViewUtils.b(cVar.a());
        } else {
            cVar.i().setVisibility(8);
        }
        if (this.h) {
            TextView g = cVar.g();
            C8632dsu.d(context);
            g.setTypeface(C1336Xt.e((Activity) C9737vz.e(context, Activity.class)));
        } else {
            TextView g2 = cVar.g();
            C8632dsu.d(context);
            g2.setTypeface(C1336Xt.c((Activity) C9737vz.e(context, Activity.class)));
        }
        if (InterfaceC7303ctf.c.a(context).c((Activity) C9737vz.e(context, Activity.class))) {
            cVar.b().setVisibility(0);
            cVar.b().setStateFromPlayable(t(), (Activity) C9737vz.e(context, Activity.class));
            return;
        }
        cVar.b().setVisibility(8);
    }

    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(c.class, "image", "getImage()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(c.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Landroid/widget/TextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "synopsis", "getSynopsis()Landroid/widget/TextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "badgeView", "getBadgeView()Landroid/widget/TextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "playButton", "getPlayButton()Landroid/widget/ImageView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "downloadButton", "getDownloadButton()Lcom/netflix/mediaclient/ui/offline/DownloadButton;", 0)), dsA.c(new PropertyReference1Impl(c.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)), dsA.c(new PropertyReference1Impl(c.class, "episodeTime", "getEpisodeTime()Landroid/widget/TextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "divider", "getDivider()Landroid/view/View;", 0))};
        public static final int e = 8;
        private final dsZ j = bIF.d(this, com.netflix.mediaclient.ui.R.g.bx, false, 2, null);
        private final dsZ l = bIF.d(this, com.netflix.mediaclient.ui.R.g.bF, false, 2, null);
        private final dsZ k = bIF.d(this, com.netflix.mediaclient.ui.R.g.bG, false, 2, null);
        private final dsZ a = bIF.d(this, com.netflix.mediaclient.ui.R.g.bz, false, 2, null);
        private final dsZ g = bIF.d(this, com.netflix.mediaclient.ui.R.g.bC, false, 2, null);
        private final dsZ b = bIF.d(this, com.netflix.mediaclient.ui.R.g.bA, false, 2, null);
        private final dsZ f = bIF.d(this, com.netflix.mediaclient.ui.R.g.bB, false, 2, null);
        private final dsZ h = bIF.d(this, com.netflix.mediaclient.ui.R.g.bJ, false, 2, null);
        private final dsZ c = bIF.d(this, com.netflix.mediaclient.ui.R.g.q, false, 2, null);

        public final NetflixImageView a() {
            return (NetflixImageView) this.j.getValue(this, d[0]);
        }

        public final TextView g() {
            return (TextView) this.l.getValue(this, d[1]);
        }

        public final TextView f() {
            return (TextView) this.k.getValue(this, d[2]);
        }

        public final TextView d() {
            return (TextView) this.a.getValue(this, d[3]);
        }

        public final ImageView i() {
            return (ImageView) this.g.getValue(this, d[4]);
        }

        public final DownloadButton b() {
            return (DownloadButton) this.b.getValue(this, d[5]);
        }

        public final ProgressBar j() {
            return (ProgressBar) this.f.getValue(this, d[6]);
        }

        public final TextView e() {
            return (TextView) this.h.getValue(this, d[7]);
        }

        public final View c() {
            return (View) this.c.getValue(this, d[8]);
        }
    }
}

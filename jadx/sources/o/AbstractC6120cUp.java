package o;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.util.AccessibilityUtils;
import java.util.Arrays;
import o.C6035cRo;
import o.C9834xU;

/* renamed from: o.cUp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6120cUp extends AbstractC3336ax<d> {
    public static final c d = new c(null);
    private static final int j;
    public TrackingInfoHolder b;
    public CharSequence c;
    public String f;
    private View.OnClickListener g;
    public String h;
    public String i;
    private View.OnClickListener k;
    private boolean m = true;
    private VideoType n;

    @Override // o.AbstractC3073as
    public int a() {
        return C6035cRo.e.i;
    }

    public final void a(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.k = onClickListener;
    }

    public final void c(boolean z) {
        this.m = z;
    }

    public final boolean l() {
        return this.m;
    }

    public final View.OnClickListener o() {
        return this.g;
    }

    public final View.OnClickListener p() {
        return this.k;
    }

    public final VideoType q() {
        return this.n;
    }

    /* renamed from: o.cUp$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public final float a() {
            return 0.5625f;
        }

        private c() {
            super("PreQuerySearchListModel");
        }

        public final int e() {
            return AbstractC6120cUp.j;
        }

        public final float d() {
            if (C8150deu.g()) {
                return 0.33333334f;
            }
            C1332Xp c1332Xp = C1332Xp.b;
            return C8150deu.y((Context) C1332Xp.b(Context.class)) ? 0.25f : 0.16666667f;
        }
    }

    public final String s() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    public final CharSequence m() {
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            return charSequence;
        }
        C8632dsu.d("");
        return null;
    }

    public final String n() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    public final TrackingInfoHolder k() {
        TrackingInfoHolder trackingInfoHolder = this.b;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        dVar.b().setText(s());
        dVar.b().setContentDescription(m());
        NetflixImageView c2 = dVar.c();
        String n = n();
        if (n == null || n.length() == 0) {
            c2.setVisibility(8);
            c2.setImageDrawable(null);
        } else {
            c2.setVisibility(0);
            c2.showImage(n());
        }
        View d2 = dVar.d();
        View.OnClickListener onClickListener = this.g;
        d2.setOnClickListener(onClickListener);
        d2.setClickable(onClickListener != null);
        if (this.m) {
            ImageView a = dVar.a();
            dsE dse = dsE.b;
            String string = dVar.a().getContext().getResources().getString(com.netflix.mediaclient.ui.R.o.l);
            C8632dsu.a(string, "");
            String format = String.format(string, Arrays.copyOf(new Object[]{s()}, 1));
            C8632dsu.a(format, "");
            a.setContentDescription(format);
            AccessibilityUtils.e(dVar.a(), null, null, dVar.d().getContext().getString(C9834xU.h.b), 3, null);
            ImageView a2 = dVar.a();
            View.OnClickListener onClickListener2 = this.k;
            a2.setOnClickListener(onClickListener2);
            a2.setClickable(onClickListener2 != null);
            dVar.a().setVisibility(0);
            return;
        }
        dVar.a().setVisibility(8);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void a(d dVar) {
        C8632dsu.c((Object) dVar, "");
        C6043cRw.c(AppView.searchResults, k());
    }

    /* renamed from: o.cUp$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3179au {
        public NetflixImageView a;
        public ImageView c;
        public View d;
        public TextView e;

        public final void a(View view) {
            C8632dsu.c((Object) view, "");
            this.d = view;
        }

        public final void a(ImageView imageView) {
            C8632dsu.c((Object) imageView, "");
            this.c = imageView;
        }

        public final void c(NetflixImageView netflixImageView) {
            C8632dsu.c((Object) netflixImageView, "");
            this.a = netflixImageView;
        }

        public final void e(TextView textView) {
            C8632dsu.c((Object) textView, "");
            this.e = textView;
        }

        public final View d() {
            View view = this.d;
            if (view != null) {
                return view;
            }
            C8632dsu.d("");
            return null;
        }

        public final NetflixImageView c() {
            NetflixImageView netflixImageView = this.a;
            if (netflixImageView != null) {
                return netflixImageView;
            }
            C8632dsu.d("");
            return null;
        }

        public final TextView b() {
            TextView textView = this.e;
            if (textView != null) {
                return textView;
            }
            C8632dsu.d("");
            return null;
        }

        public final ImageView a() {
            ImageView imageView = this.c;
            if (imageView != null) {
                return imageView;
            }
            C8632dsu.d("");
            return null;
        }

        @Override // o.AbstractC3179au
        public void e(View view) {
            C8632dsu.c((Object) view, "");
            a(view);
            View findViewById = view.findViewById(C6035cRo.d.e);
            C8632dsu.a(findViewById, "");
            c((NetflixImageView) findViewById);
            View findViewById2 = view.findViewById(C6035cRo.d.h);
            C8632dsu.a(findViewById2, "");
            e((TextView) findViewById2);
            View findViewById3 = view.findViewById(C6035cRo.d.g);
            C8632dsu.a(findViewById3, "");
            a((ImageView) findViewById3);
            c cVar = AbstractC6120cUp.d;
            float d = view.getContext().getResources().getDisplayMetrics().widthPixels * cVar.d();
            NetflixImageView c = c();
            c.getLayoutParams().width = (int) d;
            c.getLayoutParams().height = (int) (d * cVar.a());
            c.requestLayout();
            C9870yD.d(a(), cVar.e(), cVar.e(), cVar.e(), cVar.e());
        }
    }

    static {
        C1332Xp c1332Xp = C1332Xp.b;
        j = (int) TypedValue.applyDimension(1, 18, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
    }
}

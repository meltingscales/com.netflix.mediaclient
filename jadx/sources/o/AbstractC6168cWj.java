package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CheckBox;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC6184cWz;
import o.C1026Lt;
import o.C7350cuZ;
import o.C8632dsu;
import o.C9935zP;
import o.cVP;
import o.dpR;

/* renamed from: o.cWj  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC6168cWj extends AbstractC3336ax<e> {
    public static final a b = new a(null);
    private Boolean c;
    private boolean d;
    private boolean f = true;
    private final View.OnClickListener g = new View.OnClickListener() { // from class: o.cWl
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AbstractC6168cWj.a(AbstractC6168cWj.this, view);
        }
    };
    private CharSequence h;
    private C9935zP i;
    private boolean j;
    private boolean k;
    private int l;
    private String m;

    public final void I_(boolean z) {
        this.d = z;
    }

    public final void J_(boolean z) {
        this.j = z;
    }

    public final void K_(boolean z) {
        this.f = z;
    }

    public final void L_(boolean z) {
        this.k = z;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return cVP.b.d;
    }

    public final void a(Boolean bool) {
        this.c = bool;
    }

    public final void a(String str) {
        this.m = str;
    }

    public final void b(C9935zP c9935zP) {
        this.i = c9935zP;
    }

    public final void d(CharSequence charSequence) {
        this.h = charSequence;
    }

    public final Boolean i() {
        return this.c;
    }

    public final boolean k() {
        return this.j;
    }

    public final boolean l() {
        return this.f;
    }

    public final C9935zP m() {
        return this.i;
    }

    public final boolean n() {
        return this.d;
    }

    public final CharSequence o() {
        return this.h;
    }

    public final int p() {
        return this.l;
    }

    public final boolean r() {
        return this.k;
    }

    public final String t() {
        return this.m;
    }

    public final void v_(int i) {
        this.l = i;
    }

    /* renamed from: o.cWj$a */
    /* loaded from: classes6.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("SelectableItemModel");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC6168cWj abstractC6168cWj, View view) {
        C8632dsu.c((Object) abstractC6168cWj, "");
        C9726vo.d(abstractC6168cWj.i, abstractC6168cWj.m, abstractC6168cWj.c, new InterfaceC8612dsa<C9935zP, String, Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.tvconnect.impl.models.DeviceItemModel$onClickListener$1$1
            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(C9935zP c9935zP, String str, Boolean bool) {
                b(c9935zP, str, bool.booleanValue());
                return dpR.c;
            }

            public final void b(C9935zP c9935zP, String str, boolean z) {
                C8632dsu.c((Object) c9935zP, "");
                C8632dsu.c((Object) str, "");
                c9935zP.b(AbstractC6184cWz.class, new AbstractC6184cWz.a(str, !z));
            }
        });
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(e eVar) {
        dpR dpr;
        C8632dsu.c((Object) eVar, "");
        eVar.r().setAlpha(1.0f);
        eVar.g().setText(this.h);
        eVar.c().setVisibility(this.j ? 4 : 0);
        View r = eVar.r();
        View.OnClickListener onClickListener = this.f ? this.g : null;
        r.setOnClickListener(onClickListener);
        r.setClickable(onClickListener != null);
        C9696vK.e(eVar.g(), this.d, cVP.e.j, cVP.e.b);
        C9696vK.e(eVar.a(), this.d, cVP.e.n, cVP.e.d);
        C9702vQ.d(eVar.c(), this.d, cVP.e.g, cVP.e.c);
        switch (this.l) {
            case 0:
                eVar.f().setVisibility(8);
                eVar.d().setVisibility(8);
                eVar.a().setVisibility(8);
                eVar.a().setText((CharSequence) null);
                Boolean bool = this.c;
                if (bool != null) {
                    eVar.e().setChecked(bool.booleanValue());
                    eVar.e().setVisibility(0);
                    eVar.r().setClickable(true);
                    dpr = dpR.c;
                } else {
                    dpr = null;
                }
                if (dpr == null) {
                    eVar.e().setVisibility(8);
                    View r2 = eVar.r();
                    r2.setOnClickListener(null);
                    r2.setClickable(false);
                    break;
                }
                break;
            case 1:
                eVar.r().setAlpha(0.6f);
                eVar.f().setVisibility(8);
                eVar.e().setVisibility(8);
                eVar.d().setVisibility(8);
                eVar.a().setVisibility(0);
                eVar.a().setText(C8168dfL.d(com.netflix.mediaclient.ui.R.o.ms));
                break;
            case 2:
                eVar.f().setVisibility(8);
                eVar.e().setVisibility(8);
                eVar.d().setVisibility(0);
                eVar.a().setVisibility(0);
                eVar.a().setText(C8168dfL.d(com.netflix.mediaclient.ui.R.o.lZ));
                break;
            case 3:
                eVar.f().setVisibility(0);
                eVar.f().setImageDrawable(eVar.i());
                eVar.e().setVisibility(8);
                eVar.d().setVisibility(8);
                eVar.a().setVisibility(0);
                eVar.a().setText(C8168dfL.d(com.netflix.mediaclient.ui.R.o.mc));
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                eVar.f().setVisibility(0);
                eVar.f().setImageDrawable(eVar.b());
                eVar.e().setVisibility(8);
                eVar.d().setVisibility(8);
                eVar.a().setVisibility(0);
                eVar.a().setText(C8168dfL.d(com.netflix.mediaclient.ui.R.o.mp));
                break;
        }
        if (this.k) {
            eVar.e().setVisibility(8);
        }
        eVar.g().requestLayout();
    }

    /* renamed from: o.cWj$e */
    /* loaded from: classes6.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(e.class, "text", "getText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "status", "getStatus()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "progress", "getProgress()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(e.class, "separator", "getSeparator()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(e.class, "checkbox", "getCheckbox()Landroid/widget/CheckBox;", 0)), dsA.c(new PropertyReference1Impl(e.class, "statusIcon", "getStatusIcon()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        public Drawable b;
        public Drawable c;
        private final dsZ h = bIF.d(this, cVP.c.l, false, 2, null);
        private final dsZ j = bIF.d(this, cVP.c.i, false, 2, null);
        private final dsZ e = bIF.d(this, cVP.c.g, false, 2, null);
        private final dsZ g = bIF.d(this, cVP.c.f, false, 2, null);
        private final dsZ d = bIF.d(this, cVP.c.d, false, 2, null);
        private final dsZ f = bIF.d(this, cVP.c.k, false, 2, null);

        public final void a(Drawable drawable) {
            C8632dsu.c((Object) drawable, "");
            this.c = drawable;
        }

        public final void d(Drawable drawable) {
            C8632dsu.c((Object) drawable, "");
            this.b = drawable;
        }

        public final Drawable i() {
            Drawable drawable = this.c;
            if (drawable != null) {
                return drawable;
            }
            C8632dsu.d("");
            return null;
        }

        public final Drawable b() {
            Drawable drawable = this.b;
            if (drawable != null) {
                return drawable;
            }
            C8632dsu.d("");
            return null;
        }

        public final C1204Sr g() {
            return (C1204Sr) this.h.getValue(this, a[0]);
        }

        public final C1204Sr a() {
            return (C1204Sr) this.j.getValue(this, a[1]);
        }

        public final View d() {
            return (View) this.e.getValue(this, a[2]);
        }

        public final View c() {
            return (View) this.g.getValue(this, a[3]);
        }

        public final CheckBox e() {
            return (CheckBox) this.d.getValue(this, a[4]);
        }

        public final NetflixImageView f() {
            return (NetflixImageView) this.f.getValue(this, a[5]);
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            e().setClickable(false);
            Drawable drawable = ContextCompat.getDrawable(g().getContext(), C1026Lt.a.gd);
            C8632dsu.d(drawable);
            Drawable mutate = drawable.mutate();
            C8632dsu.a(mutate, "");
            mutate.setTint(-1);
            a(mutate);
            Drawable drawable2 = ContextCompat.getDrawable(g().getContext(), C7350cuZ.d.c);
            C8632dsu.d(drawable2);
            Drawable mutate2 = drawable2.mutate();
            C8632dsu.a(mutate2, "");
            mutate2.setTint(-1);
            d(mutate2);
        }
    }
}

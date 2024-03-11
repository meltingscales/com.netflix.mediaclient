package o;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import o.C1204Sr;
import o.C5320bwY;
import o.C5395bxu;

/* renamed from: o.bxu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5395bxu implements InterfaceC5396bxv {
    private final InterfaceC8554dpx h;
    private final InterfaceC8554dpx i;
    private final InterfaceC8554dpx j;
    private final InterfaceC8554dpx k;
    private final InterfaceC8554dpx m;
    private final boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final LayoutInflater f13639o;
    public static final c a = new c(null);
    private static final int f = C5320bwY.e.i;
    private static final int e = C5320bwY.e.d;
    private static final int b = C5320bwY.e.b;
    private static final int c = C5320bwY.e.f;
    private static final int g = C5320bwY.e.a;
    private static final int d = C5320bwY.e.e;

    public C5395bxu(LayoutInflater layoutInflater, boolean z) {
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        InterfaceC8554dpx b4;
        InterfaceC8554dpx b5;
        InterfaceC8554dpx b6;
        C8632dsu.c((Object) layoutInflater, "");
        this.f13639o = layoutInflater;
        this.n = z;
        b2 = dpB.b(new drO<View>() { // from class: com.netflix.mediaclient.ui.advisories.provider.view.ContentAdvisoryKMRBView$view$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final View invoke() {
                LayoutInflater layoutInflater2;
                boolean z2;
                layoutInflater2 = C5395bxu.this.f13639o;
                z2 = C5395bxu.this.n;
                return layoutInflater2.inflate(z2 ? C5320bwY.c.d : C5320bwY.c.b, (ViewGroup) null);
            }
        });
        this.k = b2;
        b3 = dpB.b(new drO<NetflixImageView>() { // from class: com.netflix.mediaclient.ui.advisories.provider.view.ContentAdvisoryKMRBView$ratingIconView$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final NetflixImageView invoke() {
                return (NetflixImageView) C5395bxu.this.a().findViewById(C5395bxu.a.a());
            }
        });
        this.m = b3;
        b4 = dpB.b(new drO<ViewGroup>() { // from class: com.netflix.mediaclient.ui.advisories.provider.view.ContentAdvisoryKMRBView$iconContainer$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final ViewGroup invoke() {
                return (ViewGroup) C5395bxu.this.a().findViewById(C5395bxu.a.c());
            }
        });
        this.h = b4;
        b5 = dpB.b(new drO<C1204Sr>() { // from class: com.netflix.mediaclient.ui.advisories.provider.view.ContentAdvisoryKMRBView$advisoryRating18WarningText$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final C1204Sr invoke() {
                return (C1204Sr) C5395bxu.this.a().findViewById(C5395bxu.a.b());
            }
        });
        this.j = b5;
        b6 = dpB.b(new drO<C1204Sr>() { // from class: com.netflix.mediaclient.ui.advisories.provider.view.ContentAdvisoryKMRBView$advisoryCertSystemConfirmationIdText$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final C1204Sr invoke() {
                return (C1204Sr) C5395bxu.this.a().findViewById(C5395bxu.a.d());
            }
        });
        this.i = b6;
    }

    /* renamed from: o.bxu$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final int a() {
            return C5395bxu.f;
        }

        public final int c() {
            return C5395bxu.e;
        }

        public final int b() {
            return C5395bxu.g;
        }

        public final int d() {
            return C5395bxu.d;
        }
    }

    @Override // o.InterfaceC5396bxv
    public View a() {
        Object value = this.k.getValue();
        C8632dsu.a(value, "");
        return (View) value;
    }

    private final NetflixImageView h() {
        Object value = this.m.getValue();
        C8632dsu.a(value, "");
        return (NetflixImageView) value;
    }

    private final ViewGroup j() {
        Object value = this.h.getValue();
        C8632dsu.a(value, "");
        return (ViewGroup) value;
    }

    private final C1204Sr i() {
        Object value = this.j.getValue();
        C8632dsu.a(value, "");
        return (C1204Sr) value;
    }

    private final C1204Sr f() {
        Object value = this.i.getValue();
        C8632dsu.a(value, "");
        return (C1204Sr) value;
    }

    public final void a(String str) {
        if (str == null || str.length() == 0) {
            i().setVisibility(8);
            return;
        }
        i().setText(str);
        i().setVisibility(0);
    }

    public final void d(String str) {
        if (str == null || str.length() == 0) {
            f().setVisibility(8);
            return;
        }
        f().setText(str);
        f().setVisibility(0);
    }

    public final void b(Drawable drawable) {
        h().setImageDrawable(drawable);
    }

    public final void b(List<? extends Pair<? extends Drawable, String>> list) {
        j().removeAllViews();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                View e2 = C9703vR.e(j(), C5320bwY.c.c, 0, 2, null);
                ((NetflixImageView) e2.findViewById(b)).setImageDrawable((Drawable) pair.d());
                String str = (String) pair.a();
                if (str != null && str.length() > 0) {
                    TextView textView = (TextView) e2.findViewById(c);
                    textView.setText((CharSequence) pair.a());
                    C8632dsu.d(textView);
                    textView.setVisibility(0);
                }
            }
        }
    }

    public final void c(String str, String str2) {
        h().setContentDescription(str);
        j().setContentDescription(str2);
    }
}

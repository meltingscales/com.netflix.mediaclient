package o;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C5320bwY;
import o.C5397bxw;

/* renamed from: o.bxw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5397bxw implements InterfaceC5396bxv {
    public static final b a = new b(null);
    private static final int c = C5320bwY.e.b;
    private static final int e = C5320bwY.e.c;
    private final InterfaceC8554dpx b;
    private final InterfaceC8554dpx d;
    private final InterfaceC8554dpx f;
    private final LayoutInflater g;
    private final boolean j;

    public C5397bxw(LayoutInflater layoutInflater, boolean z) {
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        InterfaceC8554dpx b4;
        C8632dsu.c((Object) layoutInflater, "");
        this.g = layoutInflater;
        this.j = z;
        b2 = dpB.b(new drO<View>() { // from class: com.netflix.mediaclient.ui.advisories.provider.view.ContentAdvisoryRatingIconTextAdvisoriesView$view$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final View invoke() {
                LayoutInflater layoutInflater2;
                boolean z2;
                layoutInflater2 = C5397bxw.this.g;
                z2 = C5397bxw.this.j;
                return layoutInflater2.inflate(z2 ? C5320bwY.c.g : C5320bwY.c.h, (ViewGroup) null);
            }
        });
        this.f = b2;
        b3 = dpB.b(new drO<NetflixImageView>() { // from class: com.netflix.mediaclient.ui.advisories.provider.view.ContentAdvisoryRatingIconTextAdvisoriesView$iconView$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final NetflixImageView invoke() {
                return (NetflixImageView) C5397bxw.this.a().findViewById(C5397bxw.a.d());
            }
        });
        this.b = b3;
        b4 = dpB.b(new drO<TextView>() { // from class: com.netflix.mediaclient.ui.advisories.provider.view.ContentAdvisoryRatingIconTextAdvisoriesView$advisoriesView$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final TextView invoke() {
                return (TextView) C5397bxw.this.a().findViewById(C5397bxw.a.b());
            }
        });
        this.d = b4;
    }

    /* renamed from: o.bxw$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final int d() {
            return C5397bxw.c;
        }

        public final int b() {
            return C5397bxw.e;
        }
    }

    @Override // o.InterfaceC5396bxv
    public View a() {
        Object value = this.f.getValue();
        C8632dsu.a(value, "");
        return (View) value;
    }

    private final NetflixImageView b() {
        Object value = this.b.getValue();
        C8632dsu.a(value, "");
        return (NetflixImageView) value;
    }

    private final TextView d() {
        Object value = this.d.getValue();
        C8632dsu.a(value, "");
        return (TextView) value;
    }

    public final void b(Drawable drawable, String str) {
        b().setImageDrawable(drawable);
        b().setContentDescription(str);
    }

    public final void b(String str) {
        d().setText(str);
        d().setVisibility((str == null || str.length() <= 0) ? 8 : 0);
    }
}

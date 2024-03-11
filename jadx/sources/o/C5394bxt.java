package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import java.util.List;
import o.C5320bwY;
import o.C5394bxt;

/* renamed from: o.bxt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5394bxt implements InterfaceC5396bxv {
    private final LayoutInflater c;
    private final InterfaceC8554dpx e;
    private final boolean f;
    private final InterfaceC8554dpx g;
    private final InterfaceC8554dpx i;
    public static final d b = new d(null);
    private static final int d = C5320bwY.e.i;
    private static final int a = C5320bwY.e.d;

    public C5394bxt(LayoutInflater layoutInflater, boolean z) {
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        InterfaceC8554dpx b4;
        C8632dsu.c((Object) layoutInflater, "");
        this.c = layoutInflater;
        this.f = z;
        b2 = dpB.b(new drO<View>() { // from class: com.netflix.mediaclient.ui.advisories.provider.view.ContentAdvisoryNICAMView$view$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final View invoke() {
                LayoutInflater layoutInflater2;
                boolean z2;
                layoutInflater2 = C5394bxt.this.c;
                z2 = C5394bxt.this.f;
                return layoutInflater2.inflate(z2 ? C5320bwY.c.i : C5320bwY.c.e, (ViewGroup) null);
            }
        });
        this.g = b2;
        b3 = dpB.b(new drO<NetflixImageView>() { // from class: com.netflix.mediaclient.ui.advisories.provider.view.ContentAdvisoryNICAMView$ratingIconView$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final NetflixImageView invoke() {
                return (NetflixImageView) C5394bxt.this.a().findViewById(C5394bxt.b.b());
            }
        });
        this.i = b3;
        b4 = dpB.b(new drO<ViewGroup>() { // from class: com.netflix.mediaclient.ui.advisories.provider.view.ContentAdvisoryNICAMView$iconContainer$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final ViewGroup invoke() {
                return (ViewGroup) C5394bxt.this.a().findViewById(C5394bxt.b.e());
            }
        });
        this.e = b4;
    }

    /* renamed from: o.bxt$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final int b() {
            return C5394bxt.d;
        }

        public final int e() {
            return C5394bxt.a;
        }
    }

    @Override // o.InterfaceC5396bxv
    public View a() {
        Object value = this.g.getValue();
        C8632dsu.a(value, "");
        return (View) value;
    }

    private final NetflixImageView b() {
        Object value = this.i.getValue();
        C8632dsu.a(value, "");
        return (NetflixImageView) value;
    }

    private final ViewGroup e() {
        Object value = this.e.getValue();
        C8632dsu.a(value, "");
        return (ViewGroup) value;
    }

    public final void d(Drawable drawable) {
        b().setImageDrawable(drawable);
    }

    public final void b(List<? extends Drawable> list) {
        e().removeAllViews();
        C1332Xp c1332Xp = C1332Xp.b;
        float f = -((int) TypedValue.applyDimension(1, 3, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        e().setTranslationX(f);
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                if (i < 0) {
                    C8569dql.h();
                }
                View e = C9703vR.e(e(), C5320bwY.c.a, 0, 2, null);
                C8632dsu.d(e);
                NetflixImageView netflixImageView = (NetflixImageView) e;
                netflixImageView.setImageDrawable((Drawable) obj);
                netflixImageView.setTranslationX(i * f);
                i++;
            }
        }
    }

    public final void d(String str, String str2) {
        b().setContentDescription(str);
        e().setContentDescription(str2);
    }
}

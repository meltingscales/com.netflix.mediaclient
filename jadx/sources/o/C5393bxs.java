package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import o.C5320bwY;
import o.C5393bxs;

/* renamed from: o.bxs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5393bxs implements InterfaceC5396bxv {
    private final LayoutInflater a;
    private final InterfaceC8554dpx c;
    private final InterfaceC8554dpx h;
    private final InterfaceC8554dpx j;
    public static final a e = new a(null);
    private static final int b = C5320bwY.e.j;
    private static final int d = C5320bwY.e.g;

    public C5393bxs(LayoutInflater layoutInflater) {
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        InterfaceC8554dpx b4;
        C8632dsu.c((Object) layoutInflater, "");
        this.a = layoutInflater;
        b2 = dpB.b(new drO<View>() { // from class: com.netflix.mediaclient.ui.advisories.provider.view.ContentAdvisoryTwoLineView$view$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final View invoke() {
                LayoutInflater layoutInflater2;
                layoutInflater2 = C5393bxs.this.a;
                return layoutInflater2.inflate(C5320bwY.c.j, (ViewGroup) null);
            }
        });
        this.j = b2;
        b3 = dpB.b(new drO<TextView>() { // from class: com.netflix.mediaclient.ui.advisories.provider.view.ContentAdvisoryTwoLineView$messageView$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final TextView invoke() {
                return (TextView) C5393bxs.this.a().findViewById(C5393bxs.e.e());
            }
        });
        this.c = b3;
        b4 = dpB.b(new drO<TextView>() { // from class: com.netflix.mediaclient.ui.advisories.provider.view.ContentAdvisoryTwoLineView$secondaryMessageView$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final TextView invoke() {
                return (TextView) C5393bxs.this.a().findViewById(C5393bxs.e.c());
            }
        });
        this.h = b4;
    }

    /* renamed from: o.bxs$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final int e() {
            return C5393bxs.b;
        }

        public final int c() {
            return C5393bxs.d;
        }
    }

    @Override // o.InterfaceC5396bxv
    public View a() {
        Object value = this.j.getValue();
        C8632dsu.a(value, "");
        return (View) value;
    }

    private final TextView c() {
        Object value = this.c.getValue();
        C8632dsu.a(value, "");
        return (TextView) value;
    }

    private final TextView d() {
        Object value = this.h.getValue();
        C8632dsu.a(value, "");
        return (TextView) value;
    }

    public final void a(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        c().setText(charSequence);
    }

    public final void c(CharSequence charSequence) {
        d().setText(charSequence);
        d().setVisibility((charSequence == null || charSequence.length() <= 0) ? 8 : 0);
    }
}

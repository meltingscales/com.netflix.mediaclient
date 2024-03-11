package o;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorMatrixColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.LinearLayout;
import io.reactivex.Observable;
import java.nio.ByteBuffer;
import o.C5752cHa;
import o.cIE;

/* renamed from: o.cHa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5752cHa extends AbstractC5765cHn implements cFW {
    public static final c b = new c(null);
    private static final ColorMatrixColorFilter e = new ColorMatrixColorFilter(new float[]{0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    private C3599bDv a;
    private final C1204Sr c;
    private C3599bDv d;
    private ViewPropertyAnimator f;
    private final int g;
    private final LinearLayout h;
    private final C1172Rl j;
    private final Observable<cBO> k;
    private final InterfaceC8554dpx l;
    private boolean m;
    private final ViewGroup n;

    /* renamed from: o  reason: collision with root package name */
    private final View f13662o;
    private final ViewGroup q;

    @Override // o.cFW
    public void b(boolean z) {
        this.m = z;
    }

    @Override // o.AbstractC9944zY
    /* renamed from: i */
    public ViewGroup e() {
        return this.q;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public Observable<cBO> v() {
        return this.k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5752cHa(ViewGroup viewGroup) {
        super(viewGroup);
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) viewGroup, "");
        this.n = viewGroup;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.Q, viewGroup, true);
        C8632dsu.a(inflate, "");
        this.f13662o = inflate;
        View findViewById = inflate.findViewById(cIE.b.bf);
        C8632dsu.a(findViewById, "");
        this.q = (ViewGroup) findViewById;
        View findViewById2 = e().findViewById(cIE.b.e);
        C8632dsu.a(findViewById2, "");
        this.c = (C1204Sr) findViewById2;
        View findViewById3 = e().findViewById(cIE.b.d);
        C8632dsu.a(findViewById3, "");
        this.h = (LinearLayout) findViewById3;
        View findViewById4 = e().findViewById(cIE.b.b);
        C8632dsu.a(findViewById4, "");
        this.j = (C1172Rl) findViewById4;
        this.g = (int) viewGroup.getContext().getResources().getDimension(com.netflix.mediaclient.ui.R.b.E);
        Observable<cBO> empty = Observable.empty();
        C8632dsu.a(empty, "");
        this.k = empty;
        b2 = dpB.b(new drO<Integer>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerSeekbarBifUIView$containerId$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final Integer invoke() {
                return Integer.valueOf(C5752cHa.this.e().getId());
            }
        });
        this.l = b2;
    }

    /* renamed from: o.cHa$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // o.AbstractC5765cHn
    public int bI_() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        e().setVisibility(0);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        g();
        o();
    }

    @Override // o.cFW
    public void b(String str, int i) {
        C8632dsu.c((Object) str, "");
        this.c.setText(str);
        this.c.setTranslationX(e(this.c, i));
    }

    private final int e(View view, int i) {
        Window window;
        View decorView;
        view.measure(0, 0);
        int paddingStart = e().getPaddingStart();
        int paddingEnd = e().getPaddingEnd();
        int measuredWidth = ((i - (view.getMeasuredWidth() / 2)) - paddingStart) - ((int) e().getX());
        Activity activity = (Activity) C9737vz.b(this.n.getContext(), Activity.class);
        Integer valueOf = (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : Integer.valueOf(decorView.getMeasuredWidth());
        if (measuredWidth < 0 || valueOf == null) {
            return 0;
        }
        return ((view.getMeasuredWidth() + measuredWidth) + paddingStart) + paddingEnd > valueOf.intValue() ? (valueOf.intValue() - view.getMeasuredWidth()) - paddingEnd : measuredWidth;
    }

    @Override // o.cFW
    public void a(ByteBuffer byteBuffer, int i) {
        C8632dsu.c((Object) byteBuffer, "");
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit());
        if (decodeByteArray != null) {
            this.j.setImageBitmap(decodeByteArray);
            if (this.m) {
                this.j.setColorFilter(e);
            }
        }
        this.h.setTranslationX(e(this.h, i));
    }

    @Override // o.cFW
    public boolean j() {
        return this.h.getVisibility() == 0;
    }

    @Override // o.cFW
    public void h() {
        C8254dgs.e(this.h, true);
    }

    @Override // o.cFW
    public void g() {
        ViewPropertyAnimator viewPropertyAnimator = this.f;
        if (viewPropertyAnimator != null) {
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            this.f = null;
            this.h.setAlpha(0.0f);
            return;
        }
        C8254dgs.e(this.h, false);
    }

    @Override // o.cFW
    public void f() {
        C1044Mm.e("PlayerSeekbarUIView", "Show Current time label");
        C8254dgs.e(this.c, true);
        C1044Mm.e("PlayerSeekbarUIView", "Animate UP the elevation of Current time Label");
        if (this.d == null) {
            this.d = new C3599bDv(this.c, 0, -this.g);
        }
        C3599bDv c3599bDv = this.d;
        if (c3599bDv != null) {
            c3599bDv.b();
        }
    }

    public void o() {
        C1044Mm.e("PlayerSeekbarUIView", "Animate DOWN the elevation of Current time Label");
        C3599bDv c3599bDv = this.d;
        if (c3599bDv == null || c3599bDv == null || !c3599bDv.e()) {
            if (this.a == null) {
                this.a = new C3599bDv(this.c, -this.g, 0);
            }
            C3599bDv c3599bDv2 = this.a;
            if (c3599bDv2 != null) {
                c3599bDv2.b();
            }
        } else {
            C1044Mm.e("PlayerSeekbarUIView", "Animate UP elevation Current Time label is not complete yet - cancelling it");
            C3599bDv c3599bDv3 = this.d;
            if (c3599bDv3 != null) {
                c3599bDv3.d();
            }
            this.c.setTranslationY(0.0f);
        }
        C1044Mm.e("PlayerSeekbarUIView", "Hide Current time label");
        C8254dgs.e(this.c, false);
    }
}

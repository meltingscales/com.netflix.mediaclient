package o;

import com.netflix.mediaclient.android.lottie.drawables.RaterThumbDownLottieDrawable;
import com.netflix.mediaclient.android.lottie.drawables.RaterThumbUpLottieDrawable;

/* renamed from: o.bBx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3547bBx {
    private final C1106Ox a = new C1106Ox();
    private final C1104Ov c = new C1104Ov();
    private final b b = new b();
    private final a e = new a();

    public final C1106Ox c() {
        return this.a;
    }

    public final C1104Ov e() {
        return this.c;
    }

    /* renamed from: o.bBx$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC1101Os<RaterThumbUpLottieDrawable.State> {
        @Override // o.InterfaceC1101Os
        public void e(InterfaceC1107Oy<RaterThumbUpLottieDrawable.State> interfaceC1107Oy) {
            C8632dsu.c((Object) interfaceC1107Oy, "");
        }

        b() {
        }

        @Override // o.InterfaceC1101Os
        public void d(InterfaceC1107Oy<RaterThumbUpLottieDrawable.State> interfaceC1107Oy) {
            C8632dsu.c((Object) interfaceC1107Oy, "");
            if (interfaceC1107Oy.e() == RaterThumbUpLottieDrawable.State.b) {
                C3547bBx.this.c().animateToState(RaterThumbUpLottieDrawable.State.e);
            }
        }
    }

    /* renamed from: o.bBx$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1101Os<RaterThumbDownLottieDrawable.State> {
        @Override // o.InterfaceC1101Os
        public void e(InterfaceC1107Oy<RaterThumbDownLottieDrawable.State> interfaceC1107Oy) {
            C8632dsu.c((Object) interfaceC1107Oy, "");
        }

        a() {
        }

        @Override // o.InterfaceC1101Os
        public void d(InterfaceC1107Oy<RaterThumbDownLottieDrawable.State> interfaceC1107Oy) {
            C8632dsu.c((Object) interfaceC1107Oy, "");
            if (interfaceC1107Oy.e() == RaterThumbDownLottieDrawable.State.c) {
                C3547bBx.this.e().animateToState(RaterThumbDownLottieDrawable.State.a);
            }
        }
    }

    public final void a() {
        C1104Ov c1104Ov = this.c;
        c1104Ov.setState((C1104Ov) RaterThumbDownLottieDrawable.State.a);
        c1104Ov.setTransitionListener(this.e);
        C1106Ox c1106Ox = this.a;
        c1106Ox.setState((C1106Ox) RaterThumbUpLottieDrawable.State.e);
        c1106Ox.setTransitionListener(this.b);
    }

    public final void b() {
        this.a.animateToState(RaterThumbUpLottieDrawable.State.b);
    }

    public final void h() {
        this.a.setState((C1106Ox) RaterThumbUpLottieDrawable.State.e);
    }

    public final void d() {
        this.c.animateToState(RaterThumbDownLottieDrawable.State.c);
    }

    public final void g() {
        this.c.setState((C1104Ov) RaterThumbDownLottieDrawable.State.a);
    }
}

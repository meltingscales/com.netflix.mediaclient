package o;

import android.view.View;
import android.view.ViewGroup;
import io.reactivex.Observable;
import o.C5759cHh;
import o.cIE;

/* renamed from: o.cHh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5759cHh extends AbstractC5765cHn implements InterfaceC5726cGb {
    public static final a c = new a(null);
    private final ViewGroup a;
    private final InterfaceC8554dpx b;
    private final Observable<cBO> d;

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
    }

    @Override // o.AbstractC9944zY
    /* renamed from: j */
    public ViewGroup e() {
        return this.a;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public Observable<cBO> v() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5759cHh(ViewGroup viewGroup) {
        super(viewGroup);
        InterfaceC8554dpx b;
        C8632dsu.c((Object) viewGroup, "");
        View e = C9703vR.e(viewGroup, cIE.c.B, 0, 2, null);
        C8632dsu.d(e);
        this.a = (ViewGroup) e;
        Observable<cBO> empty = Observable.empty();
        C8632dsu.a(empty, "");
        this.d = empty;
        b = dpB.b(new drO<Integer>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerSubtitlesUIView$containerId$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final Integer invoke() {
                return Integer.valueOf(C5759cHh.this.e().getId());
            }
        });
        this.b = b;
    }

    /* renamed from: o.cHh$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("PlayerSubtitlesUIView");
        }
    }

    @Override // o.AbstractC5765cHn
    public int bI_() {
        return ((Number) this.b.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C5759cHh c5759cHh) {
        C8632dsu.c((Object) c5759cHh, "");
        c5759cHh.e().setAlpha(0.0f);
        c5759cHh.e().setVisibility(0);
    }

    @Override // o.InterfaceC5726cGb
    public void e(int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = e().getLayoutParams();
        C8632dsu.d(layoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i4;
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.rightMargin = i3;
        marginLayoutParams.topMargin = i2;
        e().setLayoutParams(marginLayoutParams);
        e().requestLayout();
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        c.getLogTag();
        e().setVisibility(8);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        c.getLogTag();
        e().setVisibility(0);
    }

    private final void i() {
        c.getLogTag();
        e().animate().cancel();
        e().animate().withStartAction(new Runnable() { // from class: o.cHj
            @Override // java.lang.Runnable
            public final void run() {
                C5759cHh.d(C5759cHh.this);
            }
        }).setDuration(0L).setStartDelay(900L).alpha(1.0f).start();
    }

    @Override // o.InterfaceC5726cGb
    public void f() {
        c.getLogTag();
        i();
    }
}

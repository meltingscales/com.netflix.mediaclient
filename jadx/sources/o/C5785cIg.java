package o;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.cBO;
import o.cIE;

/* renamed from: o.cIg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5785cIg extends AbstractC5765cHn implements cHP {
    public static final e c = new e(null);
    private final ViewGroup a;
    private final View e;

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
    }

    @Override // o.cHW
    public void b(int i, int i2, int i3, int i4) {
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
    }

    @Override // o.cHW
    public void d(boolean z) {
    }

    @Override // o.AbstractC9944zY
    public View e() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5785cIg(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        this.a = viewGroup;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.k, viewGroup, false);
        C8632dsu.a(inflate, "");
        this.e = inflate;
        viewGroup.addView(e());
        NetflixImageView netflixImageView = (NetflixImageView) e().findViewById(cIE.b.ai);
        if (netflixImageView != null) {
            netflixImageView.setOnClickListener(new View.OnClickListener() { // from class: o.cIf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C5785cIg.d(C5785cIg.this, view);
                }
            });
        }
        e().setVisibility(8);
        e().setOnTouchListener(null);
        e().setOnClickListener(null);
        e().setClickable(false);
    }

    /* renamed from: o.cIg$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PlayerInteractivePlayerControlsUIView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C5785cIg c5785cIg, View view) {
        C8632dsu.c((Object) c5785cIg, "");
        c5785cIg.b((C5785cIg) cBO.C5581q.d);
        c5785cIg.b((C5785cIg) cBO.I.b);
    }

    @Override // o.AbstractC5765cHn, o.InterfaceC5730cGf
    public boolean w() {
        return e().getVisibility() == 0;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        AbstractC5765cHn.a(this, true, 0L, 0L, false, 14, null);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        AbstractC5765cHn.a(this, false, 0L, 0L, true, 6, null);
    }

    @Override // o.cHP
    public void i() {
        e().setVisibility(8);
    }

    @Override // o.cHP
    public void a(aJY ajy) {
        C8632dsu.c((Object) ajy, "");
        SurfaceView N = ajy.N();
        if (N != null) {
            View e2 = e();
            ViewGroup.LayoutParams layoutParams = e().getLayoutParams();
            layoutParams.height = N.getHeight();
            layoutParams.width = N.getWidth();
            e2.setLayoutParams(layoutParams);
        }
    }
}

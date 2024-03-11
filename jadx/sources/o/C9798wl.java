package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.mediaclient.android.widget.NetflixImageView;

/* renamed from: o.wl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9798wl extends AbstractC9710vY implements InterfaceC9799wm {
    private final int a;
    private final ConstraintLayout c;
    private final NetflixImageView d;
    private final C1204Sr e;
    private final ConstraintLayout f;

    @Override // o.AbstractC9944zY
    /* renamed from: r */
    public ConstraintLayout e() {
        return this.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9798wl(View view, C9812wz c9812wz) {
        super(view);
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) c9812wz, "");
        ConstraintLayout constraintLayout = c9812wz.e;
        C8632dsu.a(constraintLayout, "");
        this.c = constraintLayout;
        NetflixImageView netflixImageView = c9812wz.b;
        C8632dsu.a(netflixImageView, "");
        this.d = netflixImageView;
        C1204Sr c1204Sr = c9812wz.c;
        C8632dsu.a(c1204Sr, "");
        this.e = c1204Sr;
        this.f = constraintLayout;
        this.a = e().getId();
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        this.c.setVisibility(8);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        this.c.setVisibility(0);
    }

    @Override // o.InterfaceC9799wm
    public void c(Drawable drawable) {
        this.d.setImageDrawable(drawable);
    }

    @Override // o.InterfaceC9799wm
    public void c(CharSequence charSequence) {
        this.e.setText(charSequence);
    }
}

package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/* renamed from: o.bp  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4924bp {
    private final ViewGroup a;
    private final int b;
    private final ViewStub d;

    public final ViewGroup b() {
        return this.a;
    }

    public C4924bp(ViewGroup viewGroup, ViewStub viewStub, int i) {
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) viewStub, "");
        this.a = viewGroup;
        this.d = viewStub;
        this.b = i;
    }

    public final void c(View view, boolean z) {
        C8632dsu.c((Object) view, "");
        d();
        int inflatedId = this.d.getInflatedId();
        if (inflatedId != -1) {
            view.setId(inflatedId);
        }
        if (z) {
            this.a.addView(view, this.b, this.d.getLayoutParams());
        } else {
            this.a.addView(view, this.b);
        }
    }

    public final void e() {
        d();
        this.a.addView(this.d, this.b);
    }

    private final void d() {
        View childAt = this.a.getChildAt(this.b);
        if (childAt == null) {
            throw new IllegalStateException("No view exists at position " + this.b);
        }
        this.a.removeView(childAt);
    }
}

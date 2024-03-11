package o;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C4022bTi;

/* renamed from: o.bVl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4079bVl extends AbstractC3336ax<e> {
    private int b;
    private View c;

    @Override // o.AbstractC3073as
    public int a() {
        return C4022bTi.a.m;
    }

    public final View i() {
        return this.c;
    }

    public final int k() {
        return this.b;
    }

    public final void a_(View view) {
        this.c = view;
        if (this.b == 0) {
            this.b = view != null ? view.hashCode() : 0;
        }
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        View view = this.c;
        if (view == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        C9702vQ.d(view);
        eVar.e().addView(view);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        View view = this.c;
        if (view == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        C9702vQ.d(view);
    }

    /* renamed from: o.bVl$e */
    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(e.class, "container", "getContainer()Landroid/widget/FrameLayout;", 0))};
        private final dsZ c = bIF.d(this, C4022bTi.e.f, false, 2, null);

        public final FrameLayout e() {
            return (FrameLayout) this.c.getValue(this, e[0]);
        }
    }
}

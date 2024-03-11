package o;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.jvm.internal.PropertyReference1Impl;

/* renamed from: o.crF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7171crF extends AbstractC3336ax<e> {
    private View.OnClickListener b;
    private boolean d;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.N;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    public final void d(boolean z) {
        this.d = z;
    }

    public final View.OnClickListener i() {
        return this.b;
    }

    public final boolean o() {
        return this.d;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.c().setChecked(this.d);
        eVar.c().setOnClickListener(this.b);
    }

    /* renamed from: o.crF$e */
    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(e.class, "switch", "getSwitch()Landroidx/appcompat/widget/SwitchCompat;", 0))};
        public static final int e = 8;
        private final dsZ b = bIF.d(this, com.netflix.mediaclient.ui.R.g.l, false, 2, null);

        public final SwitchCompat c() {
            return (SwitchCompat) this.b.getValue(this, a[0]);
        }
    }
}

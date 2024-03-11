package o;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3796bKz;

/* renamed from: o.bJm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3756bJm extends AbstractC3336ax<a> {
    private CompoundButton.OnCheckedChangeListener b;
    private boolean c = true;
    private boolean d;
    private CharSequence i;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.g;
    }

    public final void c(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.b = onCheckedChangeListener;
    }

    public final boolean i() {
        return this.d;
    }

    public final boolean k() {
        return this.c;
    }

    public final CharSequence l() {
        return this.i;
    }

    public final void l_(boolean z) {
        this.d = z;
    }

    public final CompoundButton.OnCheckedChangeListener m() {
        return this.b;
    }

    public final void m_(boolean z) {
        this.c = z;
    }

    public final void t_(CharSequence charSequence) {
        this.i = charSequence;
    }

    @Override // o.AbstractC3336ax
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.a().setChecked(this.d);
        aVar.a().setEnabled(this.c);
        aVar.a().setText(this.i);
        aVar.a().setOnCheckedChangeListener(this.b);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.a().setOnCheckedChangeListener(null);
    }

    /* renamed from: o.bJm$a */
    /* loaded from: classes4.dex */
    public final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(a.class, "checkBox", "getCheckBox()Landroid/widget/CheckBox;", 0))};
        private final dsZ b = bIF.d(this, C3796bKz.a.d, false, 2, null);

        public a() {
        }

        public final CheckBox a() {
            return (CheckBox) this.b.getValue(this, c[0]);
        }
    }
}

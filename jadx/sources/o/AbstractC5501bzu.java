package o;

import android.text.method.LinkMovementMethod;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C5503bzw;

/* renamed from: o.bzu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5501bzu extends AbstractC3336ax<b> {
    private CompoundButton.OnCheckedChangeListener c;
    private CharSequence d;

    @Override // o.AbstractC3073as
    public int a() {
        return C5503bzw.d.a;
    }

    public final void d(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final void e(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.c = onCheckedChangeListener;
    }

    public final CharSequence i() {
        return this.d;
    }

    public final CompoundButton.OnCheckedChangeListener n() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        bVar.c().setText(this.d);
        bVar.c().setMovementMethod(LinkMovementMethod.getInstance());
        bVar.e().setOnCheckedChangeListener(this.c);
    }

    /* renamed from: o.bzu$b */
    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(b.class, "checkBox", "getCheckBox()Landroid/widget/CheckBox;", 0)), dsA.c(new PropertyReference1Impl(b.class, "text", "getText()Landroid/widget/TextView;", 0))};
        private final dsZ d = bIF.d(this, C5503bzw.c.a, false, 2, null);
        private final dsZ b = bIF.d(this, C5503bzw.c.h, false, 2, null);

        public final CheckBox e() {
            return (CheckBox) this.d.getValue(this, c[0]);
        }

        public final TextView c() {
            return (TextView) this.b.getValue(this, c[1]);
        }
    }
}

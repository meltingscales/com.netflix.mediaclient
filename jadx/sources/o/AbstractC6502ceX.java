package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;

/* renamed from: o.ceX  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6502ceX extends AbstractC3336ax<d> {
    private CharSequence b;
    private View.OnClickListener d;

    public final void H_(CharSequence charSequence) {
        this.b = charSequence;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.q;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final View.OnClickListener i() {
        return this.d;
    }

    public final CharSequence n() {
        return this.b;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        super.e((AbstractC6502ceX) dVar);
        dVar.c().setText(this.b);
        dVar.c().setOnClickListener(this.d);
    }

    /* renamed from: o.ceX$d */
    /* loaded from: classes4.dex */
    public static final class d extends bIG {
        private final dsZ e = bIF.d(this, com.netflix.mediaclient.ui.R.g.al, false, 2, null);
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(d.class, "castDeviceNameText", "getCastDeviceNameText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        public static final int a = 8;

        public final C1204Sr c() {
            return (C1204Sr) this.e.getValue(this, b[0]);
        }
    }
}

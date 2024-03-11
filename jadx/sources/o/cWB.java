package o;

import kotlin.jvm.internal.PropertyReference1Impl;
import o.cVP;

/* loaded from: classes6.dex */
public abstract class cWB extends AbstractC3336ax<c> {
    private int b;
    private boolean c;
    private CharSequence d;

    @Override // o.AbstractC3073as
    public int a() {
        return cVP.b.i;
    }

    public final void b(boolean z) {
        this.c = z;
    }

    public final void e(int i) {
        this.b = i;
    }

    public final void e(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final boolean i() {
        return this.c;
    }

    public final CharSequence m() {
        return this.d;
    }

    public final int o() {
        return this.b;
    }

    @Override // o.AbstractC3336ax
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        cVar.e().setText(this.d);
        C9696vK.e(cVar.e(), this.c, cVP.e.n, cVP.e.a);
        cVar.e().setMinimumHeight(this.b);
        cVar.e().setMinHeight(this.b);
    }

    /* loaded from: classes6.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(c.class, "text", "getText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ e = bIF.d(this, cVP.c.l, false, 2, null);

        public final C1204Sr e() {
            return (C1204Sr) this.e.getValue(this, d[0]);
        }
    }
}

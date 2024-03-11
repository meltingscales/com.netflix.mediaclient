package o;

import kotlin.jvm.internal.PropertyReference1Impl;
import o.cVP;

/* renamed from: o.cWt  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC6178cWt extends AbstractC3336ax<b> {
    private CharSequence b;
    private int c = 8388611;
    private boolean d;

    public final void P_(CharSequence charSequence) {
        this.b = charSequence;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return cVP.b.c;
    }

    public final void e(boolean z) {
        this.d = z;
    }

    public final boolean i() {
        return this.d;
    }

    public final CharSequence m() {
        return this.b;
    }

    public final int o() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        bVar.a().setText(this.b);
        bVar.a().setGravity(this.c);
        C9696vK.e(bVar.a(), this.d, cVP.e.h, cVP.e.a);
    }

    /* renamed from: o.cWt$b */
    /* loaded from: classes6.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(b.class, "text", "getText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ d = bIF.d(this, cVP.c.l, false, 2, null);

        public final C1204Sr a() {
            return (C1204Sr) this.d.getValue(this, b[0]);
        }
    }
}

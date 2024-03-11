package o;

import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC6173cWo;
import o.cVP;

/* renamed from: o.cWo  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC6173cWo extends AbstractC3336ax<e> {
    private CharSequence b;
    private boolean d;

    public final void O_(CharSequence charSequence) {
        this.b = charSequence;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return cVP.b.e;
    }

    public final void b(boolean z) {
        this.d = z;
    }

    public final boolean i() {
        return this.d;
    }

    public final CharSequence m() {
        return this.b;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(final e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.b().setText(this.b);
        C9696vK.e(eVar.b(), this.d, cVP.e.n, cVP.e.f);
        eVar.b().postDelayed(new Runnable() { // from class: o.cWn
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC6173cWo.e2(AbstractC6173cWo.e.this);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e  reason: avoid collision after fix types in other method */
    public static final void e2(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.b().sendAccessibilityEvent(8);
    }

    /* renamed from: o.cWo$e */
    /* loaded from: classes6.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(e.class, "text", "getText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ e = bIF.d(this, cVP.c.l, false, 2, null);

        public final C1204Sr b() {
            return (C1204Sr) this.e.getValue(this, b[0]);
        }
    }
}

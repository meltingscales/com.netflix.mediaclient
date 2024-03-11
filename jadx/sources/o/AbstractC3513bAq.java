package o;

import kotlin.jvm.internal.PropertyReference1Impl;
import o.C5473bzS;

/* renamed from: o.bAq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3513bAq extends AbstractC3336ax<d> {
    private CharSequence c;

    @Override // o.AbstractC3073as
    public int a() {
        return C5473bzS.e.b;
    }

    public final void b_(CharSequence charSequence) {
        this.c = charSequence;
    }

    public final CharSequence i() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        super.e((AbstractC3513bAq) dVar);
        dVar.e().setText(this.c);
    }

    /* renamed from: o.bAq$d */
    /* loaded from: classes4.dex */
    public static final class d extends bIG {
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(d.class, "textView", "getTextView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ c = bIF.d(this, C5473bzS.a.d, false, 2, null);

        public final C1204Sr e() {
            return (C1204Sr) this.c.getValue(this, d[0]);
        }
    }
}

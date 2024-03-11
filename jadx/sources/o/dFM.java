package o;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class dFM {
    public static final <T> T c(AbstractC7773dEv abstractC7773dEv, dEI dei, dBP<? extends T> dbp) {
        InterfaceC7720dCw c7804dFz;
        C8632dsu.c((Object) abstractC7773dEv, "");
        C8632dsu.c((Object) dei, "");
        C8632dsu.c((Object) dbp, "");
        if (dei instanceof dEP) {
            c7804dFz = new C7802dFx(abstractC7773dEv, (dEP) dei, null, null, 12, null);
        } else if (dei instanceof dEB) {
            c7804dFz = new dFB(abstractC7773dEv, (dEB) dei);
        } else if (!(dei instanceof dEJ) && !C8632dsu.c(dei, dEQ.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            c7804dFz = new C7804dFz(abstractC7773dEv, (dET) dei);
        }
        return (T) c7804dFz.d(dbp);
    }

    public static final <T> T b(AbstractC7773dEv abstractC7773dEv, String str, dEP dep, dBP<? extends T> dbp) {
        C8632dsu.c((Object) abstractC7773dEv, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dep, "");
        C8632dsu.c((Object) dbp, "");
        return (T) new C7802dFx(abstractC7773dEv, dep, str, dbp.e()).d((dBP<? extends Object>) dbp);
    }
}

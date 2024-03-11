package o;

/* renamed from: o.iO  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9054iO {
    private AbstractC9054iO c;

    public abstract AbstractC9055iP b();

    public final AbstractC9055iP d() {
        AbstractC9054iO abstractC9054iO = this.c;
        if (abstractC9054iO != null) {
            return b().a(abstractC9054iO.d());
        }
        return b();
    }

    public final AbstractC9054iO e(AbstractC9054iO abstractC9054iO) {
        C8632dsu.c((Object) abstractC9054iO, "");
        AbstractC9054iO abstractC9054iO2 = this;
        while (true) {
            AbstractC9054iO abstractC9054iO3 = abstractC9054iO2.c;
            if (abstractC9054iO3 != null) {
                C8632dsu.d(abstractC9054iO3);
                abstractC9054iO2 = abstractC9054iO3;
            } else {
                abstractC9054iO2.c = abstractC9054iO;
                return this;
            }
        }
    }
}

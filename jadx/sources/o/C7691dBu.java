package o;

/* renamed from: o.dBu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C7691dBu extends dwQ {
    public static final C7691dBu e = new C7691dBu();

    private C7691dBu() {
    }

    @Override // o.dwQ
    public void dispatchYield(dqZ dqz, Runnable runnable) {
        C7677dBg.b.d(runnable, C7687dBq.c, true);
    }

    @Override // o.dwQ
    public void dispatch(dqZ dqz, Runnable runnable) {
        C7677dBg.b.d(runnable, C7687dBq.c, false);
    }

    @Override // o.dwQ
    public dwQ limitedParallelism(int i) {
        C7661dAr.b(i);
        return i >= C7687dBq.b ? this : super.limitedParallelism(i);
    }
}

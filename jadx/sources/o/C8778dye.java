package o;

/* renamed from: o.dye  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8778dye extends dwQ {
    public static final C8778dye a = new C8778dye();

    @Override // o.dwQ
    public boolean isDispatchNeeded(dqZ dqz) {
        return false;
    }

    @Override // o.dwQ
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    private C8778dye() {
    }

    @Override // o.dwQ
    public dwQ limitedParallelism(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // o.dwQ
    public void dispatch(dqZ dqz, Runnable runnable) {
        C8784dyk c8784dyk = (C8784dyk) dqz.get(C8784dyk.e);
        if (c8784dyk != null) {
            c8784dyk.d = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}

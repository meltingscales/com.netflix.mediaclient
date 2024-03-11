package o;

import o.dqZ;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dyl  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8785dyl implements dqZ.b, dqZ.d<C8785dyl> {
    public static final C8785dyl e = new C8785dyl();

    @Override // o.dqZ.b
    public dqZ.d<?> getKey() {
        return this;
    }

    private C8785dyl() {
    }

    @Override // o.dqZ
    public <R> R fold(R r, drX<? super R, ? super dqZ.b, ? extends R> drx) {
        return (R) dqZ.b.e.d(this, r, drx);
    }

    @Override // o.dqZ.b, o.dqZ
    public <E extends dqZ.b> E get(dqZ.d<E> dVar) {
        return (E) dqZ.b.e.b(this, dVar);
    }

    @Override // o.dqZ
    public dqZ minusKey(dqZ.d<?> dVar) {
        return dqZ.b.e.a(this, dVar);
    }

    @Override // o.dqZ
    public dqZ plus(dqZ dqz) {
        return dqZ.b.e.d(this, dqz);
    }
}

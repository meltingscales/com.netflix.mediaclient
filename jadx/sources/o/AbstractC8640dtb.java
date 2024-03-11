package o;

import kotlin.random.Random;

/* renamed from: o.dtb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8640dtb extends Random {
    public abstract java.util.Random c();

    @Override // kotlin.random.Random
    public int b(int i) {
        return dsY.e(c().nextInt(), i);
    }

    @Override // kotlin.random.Random
    public int b() {
        return c().nextInt();
    }

    @Override // kotlin.random.Random
    public int e(int i) {
        return c().nextInt(i);
    }
}

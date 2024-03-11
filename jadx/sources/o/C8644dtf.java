package o;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: o.dtf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8644dtf extends AbstractC8640dtb {
    @Override // o.AbstractC8640dtb
    public Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C8632dsu.a(current, "");
        return current;
    }

    @Override // kotlin.random.Random
    public int b(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }
}

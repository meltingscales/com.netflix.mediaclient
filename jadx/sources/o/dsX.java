package o;

import java.util.Random;

/* loaded from: classes5.dex */
public final class dsX extends AbstractC8640dtb {
    private final a b = new a();

    /* loaded from: classes5.dex */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: e */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // o.AbstractC8640dtb
    public Random c() {
        Random random = this.b.get();
        C8632dsu.a(random, "");
        return random;
    }
}

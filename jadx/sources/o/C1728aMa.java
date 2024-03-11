package o;

import java.util.Random;
import javax.inject.Singleton;

@Singleton
/* renamed from: o.aMa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1728aMa implements InterfaceC1730aMc {
    public static final b e = new b(null);
    private static final long a = System.nanoTime();

    /* renamed from: o.aMa$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("SamplingHelperImpl");
        }
    }

    @Override // o.InterfaceC1730aMc
    public boolean a(int i) {
        boolean z = new Random(a + ((long) i)).nextInt(100) < i;
        e.getLogTag();
        return z;
    }
}

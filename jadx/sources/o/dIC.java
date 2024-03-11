package o;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.netflix.ale.AleCryptoBouncyCastle;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class dIC {
    private static final AtomicReference<dIE>[] a;
    private static final int d;
    public static final dIC c = new dIC();
    private static final int b = AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
    private static final dIE e = new dIE(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        d = highestOneBit;
        AtomicReference<dIE>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        a = atomicReferenceArr;
    }

    private dIC() {
    }

    public static final dIE c() {
        AtomicReference<dIE> a2 = c.a();
        dIE die = e;
        dIE andSet = a2.getAndSet(die);
        if (andSet == die) {
            return new dIE();
        }
        if (andSet == null) {
            a2.set(null);
            return new dIE();
        }
        a2.set(andSet.c);
        andSet.c = null;
        andSet.d = 0;
        return andSet;
    }

    public static final void e(dIE die) {
        AtomicReference<dIE> a2;
        dIE die2;
        C8632dsu.c((Object) die, "");
        if (die.c != null || die.i != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (die.j || (die2 = (a2 = c.a()).get()) == e) {
            return;
        }
        int i = die2 != null ? die2.d : 0;
        if (i >= b) {
            return;
        }
        die.c = die2;
        die.g = 0;
        die.d = i + 8192;
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(a2, die2, die)) {
            return;
        }
        die.c = null;
    }

    private final AtomicReference<dIE> a() {
        Thread currentThread = Thread.currentThread();
        C8632dsu.a(currentThread, "");
        return a[(int) (currentThread.getId() & (d - 1))];
    }
}

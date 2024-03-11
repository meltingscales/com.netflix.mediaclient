package o;

import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextViewModel;
import com.netflix.mediaclient.net.NetworkRequestType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.aSt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1909aSt {
    private static volatile Map<String, CountDownLatch> a;
    private static volatile Set<String> b;
    private static final List<InterfaceC5177bto> c = Collections.synchronizedList(new ArrayList());
    private static final HashMap<InterfaceC5177bto, InterfaceC1757aNc> d = new HashMap<>();
    private static final AtomicInteger e = new AtomicInteger();

    public static void e(String str) {
        C8166dfJ.c();
        if (b == null) {
            b = Collections.synchronizedSet(new HashSet());
        }
        b.add(str);
        C1044Mm.a("DPPrefetchManager", "Start prefetch DP request for videoId - %s", str);
    }

    public static void d(String str) {
        c();
        if (b == null) {
            return;
        }
        b.remove(str);
        C1044Mm.a("DPPrefetchManager", "Received prefetch DP response for videoId - %s", str);
        if (a == null || !a.containsKey(str)) {
            return;
        }
        CountDownLatch countDownLatch = a.get(str);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        a.remove(str);
    }

    public static void a(String str) {
        C8166dfJ.c();
        if (b(str)) {
            if (a == null) {
                a = Collections.synchronizedMap(new HashMap());
            }
            CountDownLatch countDownLatch = a.containsKey(str) ? a.get(str) : null;
            if (countDownLatch == null) {
                countDownLatch = new CountDownLatch(1);
            }
            a.put(str, countDownLatch);
            try {
                try {
                    C1044Mm.a("DPPrefetchManager", "Waiting on prefetch DP response for videoId - %s", str);
                    C1044Mm.a("DPPrefetchManager", "latchToPrefetchRequestIfExists: latch await countdown complete = %b", Boolean.valueOf(countDownLatch.await(VerifyCardContextViewModel.AUTO_SUBMIT_TIMEOUT_MS, TimeUnit.MILLISECONDS)));
                } catch (InterruptedException unused) {
                    C1044Mm.e("DPPrefetchManager", "latchToPrefetchRequestIfExists: latch interrupted");
                }
            } finally {
                a.remove(str);
            }
        }
    }

    public static boolean b(String str) {
        return b != null && b.contains(str);
    }

    public static Object a() {
        return NetworkRequestType.DP_PREFETCH;
    }

    public static boolean h() {
        return c.isEmpty();
    }

    public static InterfaceC5177bto d() {
        InterfaceC5177bto remove;
        List<InterfaceC5177bto> list = c;
        synchronized (list) {
            remove = list.isEmpty() ? null : list.remove(0);
        }
        return remove;
    }

    public static InterfaceC1757aNc a(InterfaceC5177bto interfaceC5177bto) {
        InterfaceC1757aNc remove = d.remove(interfaceC5177bto);
        return remove == null ? AbstractC1761aNg.e() : remove;
    }

    public static int e() {
        return e.get();
    }

    public static int c() {
        return e.getAndDecrement();
    }

    public static int b() {
        return e.getAndIncrement();
    }
}

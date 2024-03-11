package com.netflix.mediaclient.service.player.bladerunnerclient;

import com.netflix.mediaclient.service.player.bladerunnerclient.volley.FetchLicenseRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C1044Mm;
import o.C4411bdx;
import o.InterfaceC4362bdA;

/* loaded from: classes.dex */
public abstract class BladeRunnerPrefetchResponseHandler {
    public static String c = "nf_bladerunner";
    private final Map<Long, FetchLicenseRequest> e = new PrefetchRequestTrackingMap();
    private final Map<Long, FetchLicenseRequest> a = new PrefetchRequestTrackingMap();
    private final Map<Long, InterfaceC4362bdA> b = new PrefetchRequestTrackingMap();
    private final Map<Long, InterfaceC4362bdA> d = new PrefetchRequestTrackingMap();

    /* loaded from: classes3.dex */
    static class PrefetchRequestTrackingMap<K, V> extends LinkedHashMap<K, V> {
        PrefetchRequestTrackingMap() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() >= 16;
        }
    }

    public void e(Long l, C4411bdx c4411bdx) {
        synchronized (this.e) {
            if (c4411bdx.ak()) {
                this.e.remove(l);
                this.e.put(l, c4411bdx);
            } else {
                this.a.remove(l);
                this.a.put(l, c4411bdx);
            }
        }
    }

    public FetchLicenseRequest e(Long l) {
        FetchLicenseRequest remove;
        synchronized (this.e) {
            this.e.remove(l);
            remove = this.a.remove(l);
        }
        return remove;
    }

    public void a(Long l) {
        C1044Mm.a(c, "%d receives LDL response.", l);
        synchronized (this.e) {
            this.e.remove(l);
            this.a.remove(l);
        }
    }

    public void a(Long[] lArr, InterfaceC4362bdA interfaceC4362bdA) {
        synchronized (this.b) {
            for (Long l : lArr) {
                if (interfaceC4362bdA.T()) {
                    this.b.put(l, interfaceC4362bdA);
                } else {
                    C1044Mm.e("nq_manifest", "adding nq manifest request to prefetchQueue");
                    this.d.put(l, interfaceC4362bdA);
                }
            }
        }
    }

    public InterfaceC4362bdA d(Long l) {
        InterfaceC4362bdA remove;
        synchronized (this.b) {
            remove = this.b.remove(l);
            if (remove != null) {
                d(remove.P());
            }
        }
        return remove;
    }

    public void e(Long[] lArr) {
        d(lArr);
    }

    private void d(Long[] lArr) {
        synchronized (this.b) {
            for (Long l : lArr) {
                this.b.remove(l);
                this.d.remove(l);
            }
        }
    }
}

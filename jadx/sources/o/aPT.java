package o;

import com.netflix.mediaclient.service.configuration.crypto.DrmMetricsCollector;

/* loaded from: classes3.dex */
public abstract class aPT {
    private final String c;
    private final DrmMetricsCollector.WvApi e;

    public /* synthetic */ aPT(String str, DrmMetricsCollector.WvApi wvApi, C8627dsp c8627dsp) {
        this(str, wvApi);
    }

    public final String a() {
        return this.c;
    }

    public final DrmMetricsCollector.WvApi d() {
        return this.e;
    }

    private aPT(String str, DrmMetricsCollector.WvApi wvApi) {
        this.c = str;
        this.e = wvApi;
    }

    /* loaded from: classes3.dex */
    public static final class b extends aPT {
        public static final b a = new b();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1642362557;
        }

        public String toString() {
            return "CreateMediaDrm";
        }

        private b() {
            super("Failed to create MediaDrm with Widevine scheme", DrmMetricsCollector.WvApi.c, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends aPT {
        public static final c c = new c();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 952156794;
        }

        public String toString() {
            return "GetSecurityLevel";
        }

        private c() {
            super("Failed to get property security level", DrmMetricsCollector.WvApi.j, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends aPT {
        public static final e b = new e();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 299599764;
        }

        public String toString() {
            return "GetSystemId";
        }

        private e() {
            super("Failed to get system ID", DrmMetricsCollector.WvApi.i, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class a extends aPT {
        public static final a d = new a();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 397819244;
        }

        public String toString() {
            return "GetUniqueDeviceId";
        }

        private a() {
            super("Failed to get property unique device ID", DrmMetricsCollector.WvApi.g, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends aPT {
        public static final d c = new d();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 713169838;
        }

        public String toString() {
            return "GetVersion";
        }

        private d() {
            super("Failed to get property version", DrmMetricsCollector.WvApi.h, null);
        }
    }
}

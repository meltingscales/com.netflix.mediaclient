package o;

import android.os.SystemClock;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Cdx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aNB {
    public static final d e = new d(null);
    private int a;
    private int b;
    private final InterfaceC1773aNs c;
    private boolean d;
    private final String f;
    private final Map<Integer, a> i;

    public aNB(InterfaceC1773aNs interfaceC1773aNs, String str) {
        C8632dsu.c((Object) interfaceC1773aNs, "");
        C8632dsu.c((Object) str, "");
        this.c = interfaceC1773aNs;
        this.f = str;
        this.i = new HashMap();
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("nf_cdx_logger");
        }
    }

    private final void e(a aVar) {
        c(aVar);
        a();
    }

    private final void a() {
        if (this.b >= Config_FastProperty_Cdx.Companion.e()) {
            e.getLogTag();
            long j = 0;
            int i = 0;
            for (a aVar : this.i.values()) {
                if (aVar.a()) {
                    i++;
                    j = (j + aVar.b()) - aVar.e();
                }
            }
            if (i == 0) {
                return;
            }
            e.getLogTag();
            d(j / (i * 2));
            e();
        }
    }

    private final void e() {
        this.b = 0;
        ArrayList<Number> arrayList = new ArrayList();
        for (a aVar : this.i.values()) {
            if (aVar.a()) {
                arrayList.add(Integer.valueOf(aVar.c()));
            }
        }
        for (Number number : arrayList) {
            this.i.remove(Integer.valueOf(number.intValue()));
        }
        e.getLogTag();
    }

    private final void c(a aVar) {
        if (this.d || !Config_FastProperty_Cdx.Companion.f()) {
            return;
        }
        e.getLogTag();
        d(aVar.d());
        this.d = true;
    }

    private final void d(long j) {
        this.a++;
        C8159dfC.c(new C1779aNy(j, this.f, this.c.e(), aHO.c(this.c.b()), this.c.c()));
    }

    /* loaded from: classes3.dex */
    public final class a {
        private final long a = SystemClock.elapsedRealtime();
        private long b;
        private final int c;
        private long d;

        public final boolean a() {
            return this.b != 0;
        }

        public final long b() {
            return this.d;
        }

        public final int c() {
            return this.c;
        }

        public final long d() {
            return this.b;
        }

        public final long e() {
            return this.a;
        }

        public a(int i) {
            this.c = i;
        }

        public final long f() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.d = elapsedRealtime;
            long j = (elapsedRealtime - this.a) / 2;
            this.b = j;
            return j;
        }
    }

    public final void c(int i) {
        synchronized (this) {
            e.getLogTag();
            this.i.put(Integer.valueOf(i), new a(i));
        }
    }

    public final void e(int i) {
        synchronized (this) {
            e.getLogTag();
            a aVar = this.i.get(Integer.valueOf(i));
            if (aVar != null) {
                this.b++;
                aVar.f();
                e(aVar);
                dpR dpr = dpR.c;
            }
        }
    }
}

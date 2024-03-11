package o;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import o.AbstractC7716dCs;
import o.InterfaceC7707dCj;
import o.InterfaceC7736dDl;
import o.dBT;
import o.dDQ;
import o.dDR;
import o.dDS;
import o.dDU;

/* loaded from: classes5.dex */
public class dDS implements InterfaceC7707dCj, dCL {
    private final InterfaceC8554dpx a;
    private final InterfaceC8554dpx b;
    private int c;
    private final int d;
    private List<Annotation> e;
    private Map<String, Integer> f;
    private final String[] g;
    private final boolean[] h;
    private final InterfaceC7736dDl<?> i;
    private final List<Annotation>[] j;
    private final String k;
    private final InterfaceC8554dpx n;

    @Override // o.InterfaceC7707dCj
    public String d() {
        return this.k;
    }

    @Override // o.InterfaceC7707dCj
    public final int e() {
        return this.d;
    }

    public dDS(String str, InterfaceC7736dDl<?> interfaceC7736dDl, int i) {
        Map<String, Integer> d;
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        C8632dsu.c((Object) str, "");
        this.k = str;
        this.i = interfaceC7736dDl;
        this.d = i;
        this.c = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.g = strArr;
        int i3 = this.d;
        this.j = new List[i3];
        this.h = new boolean[i3];
        d = dqE.d();
        this.f = d;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.a;
        b = dpB.b(lazyThreadSafetyMode, new drO<dBT<?>[]>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$childSerializers$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final dBT<?>[] invoke() {
                InterfaceC7736dDl interfaceC7736dDl2;
                dBT<?>[] a;
                interfaceC7736dDl2 = dDS.this.i;
                return (interfaceC7736dDl2 == null || (a = interfaceC7736dDl2.a()) == null) ? dDQ.d : a;
            }
        });
        this.a = b;
        b2 = dpB.b(lazyThreadSafetyMode, new drO<InterfaceC7707dCj[]>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$typeParameterDescriptors$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final InterfaceC7707dCj[] invoke() {
                InterfaceC7736dDl interfaceC7736dDl2;
                ArrayList arrayList;
                dBT<?>[] b4;
                interfaceC7736dDl2 = dDS.this.i;
                if (interfaceC7736dDl2 == null || (b4 = interfaceC7736dDl2.b()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(b4.length);
                    for (dBT<?> dbt : b4) {
                        arrayList.add(dbt.e());
                    }
                }
                return dDR.d(arrayList);
            }
        });
        this.n = b2;
        b3 = dpB.b(lazyThreadSafetyMode, new drO<Integer>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$_hashCode$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final Integer invoke() {
                dDS dds = dDS.this;
                return Integer.valueOf(dDU.d(dds, dds.g()));
            }
        });
        this.b = b3;
    }

    @Override // o.InterfaceC7707dCj
    public boolean a() {
        return InterfaceC7707dCj.a.d(this);
    }

    @Override // o.InterfaceC7707dCj
    public boolean i() {
        return InterfaceC7707dCj.a.c(this);
    }

    public /* synthetic */ dDS(String str, InterfaceC7736dDl interfaceC7736dDl, int i, int i2, C8627dsp c8627dsp) {
        this(str, (i2 & 2) != 0 ? null : interfaceC7736dDl, i);
    }

    @Override // o.InterfaceC7707dCj
    public AbstractC7715dCr b() {
        return AbstractC7716dCs.b.d;
    }

    @Override // o.InterfaceC7707dCj
    public List<Annotation> c() {
        List<Annotation> i;
        List<Annotation> list = this.e;
        if (list == null) {
            i = C8569dql.i();
            return i;
        }
        return list;
    }

    @Override // o.dCL
    public Set<String> j() {
        return this.f.keySet();
    }

    private final dBT<?>[] f() {
        return (dBT[]) this.a.getValue();
    }

    public final InterfaceC7707dCj[] g() {
        return (InterfaceC7707dCj[]) this.n.getValue();
    }

    private final int n() {
        return ((Number) this.b.getValue()).intValue();
    }

    public static /* synthetic */ void e(dDS dds, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        dds.b(str, z);
    }

    public final void b(String str, boolean z) {
        C8632dsu.c((Object) str, "");
        String[] strArr = this.g;
        int i = this.c + 1;
        this.c = i;
        strArr[i] = str;
        this.h[i] = z;
        this.j[i] = null;
        if (i == this.d - 1) {
            this.f = h();
        }
    }

    @Override // o.InterfaceC7707dCj
    public InterfaceC7707dCj c(int i) {
        return f()[i].e();
    }

    @Override // o.InterfaceC7707dCj
    public int b(String str) {
        C8632dsu.c((Object) str, "");
        Integer num = this.f.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    private final Map<String, Integer> h() {
        HashMap hashMap = new HashMap();
        int length = this.g.length;
        for (int i = 0; i < length; i++) {
            hashMap.put(this.g[i], Integer.valueOf(i));
        }
        return hashMap;
    }

    public int hashCode() {
        return n();
    }

    public String toString() {
        C8654dtp g;
        String d;
        g = C8657dts.g(0, this.d);
        d = C8576dqs.d(g, ", ", d() + '(', ")", 0, null, new drM<Integer, CharSequence>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$toString$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ CharSequence invoke(Integer num) {
                return e(num.intValue());
            }

            public final CharSequence e(int i) {
                return dDS.this.a(i) + ": " + dDS.this.c(i).d();
            }
        }, 24, null);
        return d;
    }

    @Override // o.InterfaceC7707dCj
    public boolean e(int i) {
        return this.h[i];
    }

    @Override // o.InterfaceC7707dCj
    public List<Annotation> d(int i) {
        List<Annotation> i2;
        List<Annotation> list = this.j[i];
        if (list == null) {
            i2 = C8569dql.i();
            return i2;
        }
        return list;
    }

    @Override // o.InterfaceC7707dCj
    public String a(int i) {
        return this.g[i];
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof dDS)) {
                return false;
            }
            InterfaceC7707dCj interfaceC7707dCj = (InterfaceC7707dCj) obj;
            if (!C8632dsu.c((Object) d(), (Object) interfaceC7707dCj.d()) || !Arrays.equals(g(), ((dDS) obj).g()) || e() != interfaceC7707dCj.e()) {
                return false;
            }
            int e = e();
            for (int i = 0; i < e; i++) {
                if (!C8632dsu.c((Object) c(i).d(), (Object) interfaceC7707dCj.c(i).d()) || !C8632dsu.c(c(i).b(), interfaceC7707dCj.c(i).b())) {
                    return false;
                }
            }
        }
        return true;
    }
}

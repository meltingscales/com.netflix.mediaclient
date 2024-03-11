package o;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C7711dCn;
import o.InterfaceC7707dCj;
import o.dDU;

/* renamed from: o.dCn  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7711dCn implements InterfaceC7707dCj, dCL {
    private final List<Annotation> a;
    private final String[] b;
    private final InterfaceC7707dCj[] c;
    private final List<Annotation>[] d;
    private final InterfaceC8554dpx e;
    private final boolean[] f;
    private final String g;
    private final AbstractC7715dCr h;
    private final Map<String, Integer> i;
    private final int j;
    private final Set<String> k;
    private final InterfaceC7707dCj[] l;

    @Override // o.InterfaceC7707dCj
    public AbstractC7715dCr b() {
        return this.h;
    }

    @Override // o.InterfaceC7707dCj
    public List<Annotation> c() {
        return this.a;
    }

    @Override // o.InterfaceC7707dCj
    public String d() {
        return this.g;
    }

    @Override // o.InterfaceC7707dCj
    public int e() {
        return this.j;
    }

    @Override // o.dCL
    public Set<String> j() {
        return this.k;
    }

    public C7711dCn(String str, AbstractC7715dCr abstractC7715dCr, int i, List<? extends InterfaceC7707dCj> list, C7703dCf c7703dCf) {
        HashSet O;
        boolean[] j;
        Iterable<C8578dqu> I;
        int d;
        Map<String, Integer> d2;
        InterfaceC8554dpx b;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) abstractC7715dCr, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c7703dCf, "");
        this.g = str;
        this.h = abstractC7715dCr;
        this.j = i;
        this.a = c7703dCf.c();
        O = C8576dqs.O(c7703dCf.a());
        this.k = O;
        String[] strArr = (String[]) c7703dCf.a().toArray(new String[0]);
        this.b = strArr;
        this.c = dDR.d(c7703dCf.e());
        this.d = (List[]) c7703dCf.b().toArray(new List[0]);
        j = C8576dqs.j(c7703dCf.d());
        this.f = j;
        I = C8563dqf.I(strArr);
        d = C8572dqo.d(I, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C8578dqu c8578dqu : I) {
            arrayList.add(dpD.a(c8578dqu.c(), Integer.valueOf(c8578dqu.d())));
        }
        d2 = dqE.d(arrayList);
        this.i = d2;
        this.l = dDR.d(list);
        b = dpB.b(new drO<Integer>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl$_hashCode$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final Integer invoke() {
                InterfaceC7707dCj[] interfaceC7707dCjArr;
                C7711dCn c7711dCn = C7711dCn.this;
                interfaceC7707dCjArr = c7711dCn.l;
                return Integer.valueOf(dDU.d(c7711dCn, interfaceC7707dCjArr));
            }
        });
        this.e = b;
    }

    @Override // o.InterfaceC7707dCj
    public boolean a() {
        return InterfaceC7707dCj.a.d(this);
    }

    @Override // o.InterfaceC7707dCj
    public boolean i() {
        return InterfaceC7707dCj.a.c(this);
    }

    private final int g() {
        return ((Number) this.e.getValue()).intValue();
    }

    @Override // o.InterfaceC7707dCj
    public int b(String str) {
        C8632dsu.c((Object) str, "");
        Integer num = this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public int hashCode() {
        return g();
    }

    public String toString() {
        C8654dtp g;
        String d;
        g = C8657dts.g(0, e());
        d = C8576dqs.d(g, ", ", d() + '(', ")", 0, null, new drM<Integer, CharSequence>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl$toString$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ CharSequence invoke(Integer num) {
                return b(num.intValue());
            }

            public final CharSequence b(int i) {
                return C7711dCn.this.a(i) + ": " + C7711dCn.this.c(i).d();
            }
        }, 24, null);
        return d;
    }

    @Override // o.InterfaceC7707dCj
    public String a(int i) {
        return this.b[i];
    }

    @Override // o.InterfaceC7707dCj
    public List<Annotation> d(int i) {
        return this.d[i];
    }

    @Override // o.InterfaceC7707dCj
    public InterfaceC7707dCj c(int i) {
        return this.c[i];
    }

    @Override // o.InterfaceC7707dCj
    public boolean e(int i) {
        return this.f[i];
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7711dCn)) {
                return false;
            }
            InterfaceC7707dCj interfaceC7707dCj = (InterfaceC7707dCj) obj;
            if (!C8632dsu.c((Object) d(), (Object) interfaceC7707dCj.d()) || !Arrays.equals(this.l, ((C7711dCn) obj).l) || e() != interfaceC7707dCj.e()) {
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

package o;

import java.util.Iterator;
import o.AbstractC7715dCr;
import o.AbstractC7716dCs;
import o.C7713dCp;
import o.InterfaceC7707dCj;

/* renamed from: o.dDd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7728dDd extends dDS {
    private final AbstractC7715dCr a;
    private final InterfaceC8554dpx e;

    @Override // o.dDS, o.InterfaceC7707dCj
    public AbstractC7715dCr b() {
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7728dDd(final String str, final int i) {
        super(str, null, i, 2, null);
        InterfaceC8554dpx b;
        C8632dsu.c((Object) str, "");
        this.a = AbstractC7715dCr.b.a;
        b = dpB.b(new drO<InterfaceC7707dCj[]>() { // from class: kotlinx.serialization.internal.EnumDescriptor$elementDescriptors$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final InterfaceC7707dCj[] invoke() {
                int i2 = i;
                InterfaceC7707dCj[] interfaceC7707dCjArr = new InterfaceC7707dCj[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    interfaceC7707dCjArr[i3] = C7713dCp.b(str + '.' + this.a(i3), AbstractC7716dCs.d.c, new InterfaceC7707dCj[0], null, 8, null);
                }
                return interfaceC7707dCjArr;
            }
        });
        this.e = b;
    }

    private final InterfaceC7707dCj[] f() {
        return (InterfaceC7707dCj[]) this.e.getValue();
    }

    @Override // o.dDS, o.InterfaceC7707dCj
    public InterfaceC7707dCj c(int i) {
        return f()[i];
    }

    @Override // o.dDS
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof InterfaceC7707dCj)) {
            InterfaceC7707dCj interfaceC7707dCj = (InterfaceC7707dCj) obj;
            return interfaceC7707dCj.b() == AbstractC7715dCr.b.a && C8632dsu.c((Object) d(), (Object) interfaceC7707dCj.d()) && C8632dsu.c(dDR.a(this), dDR.a(interfaceC7707dCj));
        }
        return false;
    }

    @Override // o.dDS
    public String toString() {
        String d;
        Iterable<String> b = C7708dCk.b(this);
        d = C8576dqs.d(b, ", ", d() + '(', ")", 0, null, null, 56, null);
        return d;
    }

    @Override // o.dDS
    public int hashCode() {
        int hashCode = d().hashCode();
        Iterator<String> it = C7708dCk.b(this).iterator();
        int i = 1;
        while (it.hasNext()) {
            String next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }
}

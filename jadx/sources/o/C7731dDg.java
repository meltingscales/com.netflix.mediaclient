package o;

import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;
import o.C7731dDg;
import o.InterfaceC7707dCj;

/* renamed from: o.dDg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7731dDg<T extends Enum<T>> implements dBT<T> {
    private InterfaceC7707dCj a;
    private final InterfaceC8554dpx b;
    private final T[] e;

    public C7731dDg(final String str, T[] tArr) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) tArr, "");
        this.e = tArr;
        b = dpB.b(new drO<InterfaceC7707dCj>(this) { // from class: kotlinx.serialization.internal.EnumSerializer$descriptor$2
            final /* synthetic */ C7731dDg<T> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.e = this;
            }

            @Override // o.drO
            /* renamed from: c */
            public final InterfaceC7707dCj invoke() {
                InterfaceC7707dCj interfaceC7707dCj;
                InterfaceC7707dCj c;
                interfaceC7707dCj = ((C7731dDg) this.e).a;
                if (interfaceC7707dCj == null) {
                    c = this.e.c(str);
                    return c;
                }
                return interfaceC7707dCj;
            }
        });
        this.b = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.dBZ
    public /* synthetic */ void e(InterfaceC7721dCx interfaceC7721dCx, Object obj) {
        c(interfaceC7721dCx, (InterfaceC7721dCx) ((Enum) obj));
    }

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return (InterfaceC7707dCj) this.b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC7707dCj c(String str) {
        C7728dDd c7728dDd = new C7728dDd(str, this.e.length);
        for (T t : this.e) {
            dDS.e(c7728dDd, t.name(), false, 2, null);
        }
        return c7728dDd;
    }

    public void c(InterfaceC7721dCx interfaceC7721dCx, T t) {
        int g;
        C8632dsu.c((Object) interfaceC7721dCx, "");
        C8632dsu.c((Object) t, "");
        g = C8563dqf.g(this.e, t);
        if (g == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(t);
            sb.append(" is not a valid enum ");
            sb.append(e().d());
            sb.append(", must be one of ");
            String arrays = Arrays.toString(this.e);
            C8632dsu.a(arrays, "");
            sb.append(arrays);
            throw new SerializationException(sb.toString());
        }
        interfaceC7721dCx.a(e(), g);
    }

    @Override // o.dBP
    /* renamed from: a */
    public T b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        int d = interfaceC7720dCw.d(e());
        if (d >= 0) {
            T[] tArr = this.e;
            if (d < tArr.length) {
                return tArr[d];
            }
        }
        throw new SerializationException(d + " is not among valid " + e().d() + " enum values, values size is " + this.e.length);
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + e().d() + '>';
    }
}

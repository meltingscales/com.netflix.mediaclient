package o;

import o.InterfaceC1107Oy;
import o.InterfaceC1107Oy.c;

/* loaded from: classes3.dex */
public final class OA<T extends InterfaceC1107Oy.c> implements InterfaceC1107Oy<T> {
    private final boolean b;
    private final T c;
    private final boolean d;
    private final InterfaceC1107Oy<T> e;
    private final T i;

    @Override // o.InterfaceC1107Oy
    public T a() {
        return this.c;
    }

    @Override // o.InterfaceC1107Oy
    public boolean d() {
        return this.b;
    }

    @Override // o.InterfaceC1107Oy
    public T e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OA) {
            OA oa = (OA) obj;
            return C8632dsu.c(this.c, oa.c) && C8632dsu.c(this.i, oa.i) && this.d == oa.d && C8632dsu.c(this.e, oa.e) && this.b == oa.b;
        }
        return false;
    }

    @Override // o.InterfaceC1107Oy
    public InterfaceC1107Oy<T> f() {
        return this.e;
    }

    @Override // o.InterfaceC1107Oy
    public boolean h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = this.i.hashCode();
        int hashCode3 = Boolean.hashCode(this.d);
        InterfaceC1107Oy<T> interfaceC1107Oy = this.e;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (interfaceC1107Oy == null ? 0 : interfaceC1107Oy.hashCode())) * 31) + Boolean.hashCode(this.b);
    }

    public OA(T t, T t2, boolean z, InterfaceC1107Oy<T> interfaceC1107Oy, boolean z2) {
        C8632dsu.c((Object) t, "");
        C8632dsu.c((Object) t2, "");
        this.c = t;
        this.i = t2;
        this.d = z;
        this.e = interfaceC1107Oy;
        this.b = z2;
    }

    @Override // o.InterfaceC1107Oy
    public InterfaceC1107Oy<T> b() {
        return InterfaceC1107Oy.d.e(this);
    }

    @Override // o.InterfaceC1107Oy
    public T c() {
        return (T) InterfaceC1107Oy.d.d(this);
    }

    @Override // o.InterfaceC1107Oy
    public boolean a(final int i) {
        Boolean bool = (Boolean) C9726vo.d(a().e(), e().e(), new drX<Integer, Integer, Boolean>() { // from class: com.netflix.mediaclient.android.lottie.drawables.StateTransitionImpl$containsFrame$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ Boolean invoke(Integer num, Integer num2) {
                return d(num.intValue(), num2.intValue());
            }

            public final Boolean d(int i2, int i3) {
                int i4 = i;
                return Boolean.valueOf(i2 >= i3 ? !(i3 > i4 || i4 > i2) : !(i2 > i4 || i4 > i3));
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public String toString() {
        T a = a();
        T e = e();
        boolean z = this.d;
        InterfaceC1107Oy<T> interfaceC1107Oy = this.e;
        return "StateTransitionImpl(fromState=" + a + ", toState=" + e + ", loop=" + z + ", nextTransition=" + interfaceC1107Oy + ")";
    }
}

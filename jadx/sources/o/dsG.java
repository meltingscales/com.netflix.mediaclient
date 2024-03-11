package o;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;
import o.C8632dsu;
import o.dsG;
import o.dtJ;

/* loaded from: classes.dex */
public final class dsG implements dtH {
    public static final e d = new e(null);
    private final InterfaceC8662dtx a;
    private final List<dtJ> b;
    private final dtH c;
    private final int e;

    /* loaded from: classes5.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            c = iArr;
        }
    }

    @Override // o.dtH
    public InterfaceC8662dtx a() {
        return this.a;
    }

    @Override // o.dtH
    public List<dtJ> b() {
        return this.b;
    }

    @Override // o.dtH
    public boolean e() {
        return (this.e & 1) != 0;
    }

    public dsG(InterfaceC8662dtx interfaceC8662dtx, List<dtJ> list, dtH dth, int i) {
        C8632dsu.c((Object) interfaceC8662dtx, "");
        C8632dsu.c((Object) list, "");
        this.a = interfaceC8662dtx;
        this.b = list;
        this.c = dth;
        this.e = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dsG(InterfaceC8662dtx interfaceC8662dtx, List<dtJ> list, boolean z) {
        this(interfaceC8662dtx, list, null, z ? 1 : 0);
        C8632dsu.c((Object) interfaceC8662dtx, "");
        C8632dsu.c((Object) list, "");
    }

    @Override // o.InterfaceC8659dtu
    public List<Annotation> getAnnotations() {
        List<Annotation> i;
        i = C8569dql.i();
        return i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof dsG) {
            dsG dsg = (dsG) obj;
            if (C8632dsu.c(a(), dsg.a()) && C8632dsu.c(b(), dsg.b()) && C8632dsu.c(this.c, dsg.c) && this.e == dsg.e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((a().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(this.e);
    }

    public String toString() {
        return b(false) + " (Kotlin reflection is not available)";
    }

    private final String b(boolean z) {
        String name;
        InterfaceC8662dtx a = a();
        InterfaceC8660dtv interfaceC8660dtv = a instanceof InterfaceC8660dtv ? (InterfaceC8660dtv) a : null;
        Class<?> e2 = interfaceC8660dtv != null ? drI.e(interfaceC8660dtv) : null;
        if (e2 == null) {
            name = a().toString();
        } else if ((this.e & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (e2.isArray()) {
            name = e(e2);
        } else if (z && e2.isPrimitive()) {
            InterfaceC8662dtx a2 = a();
            C8632dsu.d(a2);
            name = drI.d((InterfaceC8660dtv) a2).getName();
        } else {
            name = e2.getName();
        }
        String str = name + (b().isEmpty() ? "" : C8576dqs.d(b(), ", ", "<", ">", 0, null, new drM<dtJ, CharSequence>() { // from class: kotlin.jvm.internal.TypeReference$asString$args$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final CharSequence invoke(dtJ dtj) {
                String a3;
                C8632dsu.c((Object) dtj, "");
                a3 = dsG.this.a(dtj);
                return a3;
            }
        }, 24, null)) + (e() ? "?" : "");
        dtH dth = this.c;
        if (dth instanceof dsG) {
            String b = ((dsG) dth).b(true);
            if (C8632dsu.c((Object) b, (Object) str)) {
                return str;
            }
            if (C8632dsu.c((Object) b, (Object) (str + '?'))) {
                return str + '!';
            }
            return '(' + str + ".." + b + ')';
        }
        return str;
    }

    private final String e(Class<?> cls) {
        return C8632dsu.c(cls, boolean[].class) ? "kotlin.BooleanArray" : C8632dsu.c(cls, char[].class) ? "kotlin.CharArray" : C8632dsu.c(cls, byte[].class) ? "kotlin.ByteArray" : C8632dsu.c(cls, short[].class) ? "kotlin.ShortArray" : C8632dsu.c(cls, int[].class) ? "kotlin.IntArray" : C8632dsu.c(cls, float[].class) ? "kotlin.FloatArray" : C8632dsu.c(cls, long[].class) ? "kotlin.LongArray" : C8632dsu.c(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(dtJ dtj) {
        String valueOf;
        if (dtj.b() == null) {
            return "*";
        }
        dtH c = dtj.c();
        dsG dsg = c instanceof dsG ? (dsG) c : null;
        if (dsg == null || (valueOf = dsg.b(true)) == null) {
            valueOf = String.valueOf(dtj.c());
        }
        int i = d.c[dtj.b().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "in " + valueOf;
            } else if (i == 3) {
                return "out " + valueOf;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return valueOf;
    }

    /* loaded from: classes5.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}

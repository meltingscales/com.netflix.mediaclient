package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;

/* loaded from: classes.dex */
public final class dtJ {
    public static final e b = new e(null);
    public static final dtJ e = new dtJ(null, null);
    private final KVariance a;
    private final dtH d;

    /* loaded from: classes5.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] e;

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
            e = iArr;
        }
    }

    public final KVariance b() {
        return this.a;
    }

    public final dtH c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dtJ) {
            dtJ dtj = (dtJ) obj;
            return this.a == dtj.a && C8632dsu.c(this.d, dtj.d);
        }
        return false;
    }

    public int hashCode() {
        KVariance kVariance = this.a;
        int hashCode = kVariance == null ? 0 : kVariance.hashCode();
        dtH dth = this.d;
        return (hashCode * 31) + (dth != null ? dth.hashCode() : 0);
    }

    public dtJ(KVariance kVariance, dtH dth) {
        String str;
        this.a = kVariance;
        this.d = dth;
        if ((kVariance == null) == (dth == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public String toString() {
        KVariance kVariance = this.a;
        int i = kVariance == null ? -1 : a.e[kVariance.ordinal()];
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    return "in " + this.d;
                } else if (i == 3) {
                    return "out " + this.d;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return String.valueOf(this.d);
        }
        return "*";
    }

    /* loaded from: classes5.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final dtJ c(dtH dth) {
            C8632dsu.c((Object) dth, "");
            return new dtJ(KVariance.c, dth);
        }
    }
}

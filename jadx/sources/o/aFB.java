package o;

/* loaded from: classes3.dex */
public final class aFB {
    public static final aFB e = new aFB();

    private aFB() {
    }

    public static final Boolean d(dEI dei) {
        dET j;
        if (dei == null || (j = j(dei)) == null) {
            return null;
        }
        return Boolean.valueOf(dEG.c(j));
    }

    public static final Integer e(dEI dei) {
        dET j;
        if (dei == null || (j = j(dei)) == null) {
            return null;
        }
        return Integer.valueOf(dEG.i(j));
    }

    public static final Long c(dEI dei) {
        dET j;
        if (dei == null || (j = j(dei)) == null) {
            return null;
        }
        return Long.valueOf(dEG.f(j));
    }

    public static final String i(dEI dei) {
        dET j;
        if (dei == null || (j = j(dei)) == null) {
            return null;
        }
        if (j.e()) {
            return j.d();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final dEP a(dEI dei) {
        if (dei != null) {
            return dEG.c(dei);
        }
        return null;
    }

    public static final dEB b(dEI dei) {
        if (dei != null) {
            return dEG.d(dei);
        }
        return null;
    }

    public static final dET j(dEI dei) {
        if ((dei instanceof dEQ) || dei == null) {
            return null;
        }
        return dEG.e(dei);
    }
}

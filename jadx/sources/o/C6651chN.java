package o;

/* renamed from: o.chN  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6651chN implements InterfaceC8962gc {
    public static final int c = AbstractC6677chn.d;
    private final AbstractC6677chn e;

    public C6651chN() {
        this(null, 1, null);
    }

    public static /* synthetic */ C6651chN copy$default(C6651chN c6651chN, AbstractC6677chn abstractC6677chn, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC6677chn = c6651chN.e;
        }
        return c6651chN.d(abstractC6677chn);
    }

    public final AbstractC6677chn component1() {
        return this.e;
    }

    public final C6651chN d(AbstractC6677chn abstractC6677chn) {
        return new C6651chN(abstractC6677chn);
    }

    public final AbstractC6677chn e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6651chN) && C8632dsu.c(this.e, ((C6651chN) obj).e);
    }

    public int hashCode() {
        AbstractC6677chn abstractC6677chn = this.e;
        if (abstractC6677chn == null) {
            return 0;
        }
        return abstractC6677chn.hashCode();
    }

    public String toString() {
        AbstractC6677chn abstractC6677chn = this.e;
        return "MessagingState(screen=" + abstractC6677chn + ")";
    }

    public C6651chN(AbstractC6677chn abstractC6677chn) {
        this.e = abstractC6677chn;
    }

    public /* synthetic */ C6651chN(AbstractC6677chn abstractC6677chn, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : abstractC6677chn);
    }
}

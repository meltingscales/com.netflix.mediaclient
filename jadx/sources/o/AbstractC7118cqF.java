package o;

/* renamed from: o.cqF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7118cqF {
    private final boolean d;

    /* renamed from: o.cqF$a */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public AbstractC7118cqF() {
        this(false, 1, null);
    }

    public abstract int d();

    public final boolean h() {
        return this.d;
    }

    public AbstractC7118cqF(boolean z) {
        this.d = z;
    }

    public /* synthetic */ AbstractC7118cqF(boolean z, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? false : z);
    }
}

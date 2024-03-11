package o;

/* renamed from: o.dkn  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8409dkn {
    private boolean c = false;
    private boolean b = false;
    private C8401dkf a = null;

    public void b() {
        this.c = true;
    }

    protected abstract C8401dkf d(int i);

    public boolean e(int i) {
        if (!this.b && !this.c) {
            if (this.a != null) {
                return true;
            }
            C8401dkf b = b(i);
            this.a = b;
            if (b != null) {
                return true;
            }
        }
        return false;
    }

    public C8401dkf b(int i) {
        if (this.b || this.c) {
            return null;
        }
        C8401dkf c8401dkf = this.a;
        if (c8401dkf != null) {
            this.a = null;
            return c8401dkf;
        }
        return d(i);
    }
}

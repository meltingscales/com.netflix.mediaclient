package o;

/* renamed from: o.dwi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8728dwi {
    public static final C8728dwi a = new C8728dwi();

    private C8728dwi() {
    }

    public static final void b(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    public static final void c(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    public static final void a(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        } else if (i <= i2) {
        } else {
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }
    }
}

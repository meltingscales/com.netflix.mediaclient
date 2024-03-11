package o;

import android.widget.SeekBar;

/* renamed from: o.uk  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9669uk extends AbstractC9662ud {
    private final boolean a;
    private final int c;
    private final SeekBar e;

    public SeekBar b() {
        return this.e;
    }

    public final boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9669uk) {
                C9669uk c9669uk = (C9669uk) obj;
                return C8632dsu.c(b(), c9669uk.b()) && this.c == c9669uk.c && this.a == c9669uk.a;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        SeekBar b = b();
        int hashCode = b != null ? b.hashCode() : 0;
        int i = this.c;
        boolean z = this.a;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return (((hashCode * 31) + i) * 31) + i2;
    }

    public String toString() {
        return "SeekBarProgressChangeEvent(view=" + b() + ", progress=" + this.c + ", fromUser=" + this.a + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9669uk(SeekBar seekBar, int i, boolean z) {
        super(null);
        C8632dsu.d(seekBar, "");
        this.e = seekBar;
        this.c = i;
        this.a = z;
    }
}

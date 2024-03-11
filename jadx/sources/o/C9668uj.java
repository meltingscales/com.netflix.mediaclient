package o;

import android.widget.SeekBar;

/* renamed from: o.uj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9668uj extends AbstractC9662ud {
    private final SeekBar a;

    public SeekBar c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C9668uj) && C8632dsu.c(c(), ((C9668uj) obj).c());
        }
        return true;
    }

    public int hashCode() {
        SeekBar c = c();
        if (c != null) {
            return c.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "SeekBarStopChangeEvent(view=" + c() + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9668uj(SeekBar seekBar) {
        super(null);
        C8632dsu.d(seekBar, "");
        this.a = seekBar;
    }
}

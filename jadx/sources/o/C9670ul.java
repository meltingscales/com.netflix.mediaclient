package o;

import android.widget.SeekBar;

/* renamed from: o.ul  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9670ul extends AbstractC9662ud {
    private final SeekBar b;

    public SeekBar e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C9670ul) && C8632dsu.c(e(), ((C9670ul) obj).e());
        }
        return true;
    }

    public int hashCode() {
        SeekBar e = e();
        if (e != null) {
            return e.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "SeekBarStartChangeEvent(view=" + e() + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9670ul(SeekBar seekBar) {
        super(null);
        C8632dsu.d(seekBar, "");
        this.b = seekBar;
    }
}

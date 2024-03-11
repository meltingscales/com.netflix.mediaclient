package o;

/* loaded from: classes4.dex */
public interface cHW extends InterfaceC5730cGf {
    void b(int i, int i2, int i3, int i4);

    void d(boolean z);

    /* loaded from: classes4.dex */
    public static final class e {
        public static /* synthetic */ void b(cHW chw, int i, int i2, int i3, int i4, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSubtitlesMargin");
            }
            if ((i5 & 1) != 0) {
                i = 0;
            }
            if ((i5 & 2) != 0) {
                i2 = 0;
            }
            if ((i5 & 4) != 0) {
                i3 = 0;
            }
            if ((i5 & 8) != 0) {
                i4 = 0;
            }
            chw.b(i, i2, i3, i4);
        }
    }
}

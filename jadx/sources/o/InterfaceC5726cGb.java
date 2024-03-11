package o;

/* renamed from: o.cGb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5726cGb extends InterfaceC5730cGf {
    void e(int i, int i2, int i3, int i4);

    void f();

    /* renamed from: o.cGb$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ void e(InterfaceC5726cGb interfaceC5726cGb, int i, int i2, int i3, int i4, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSubtitleMargin");
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
            interfaceC5726cGb.e(i, i2, i3, i4);
        }
    }
}

package o;

import java.util.Arrays;
import java.util.List;

/* renamed from: o.dn  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8476dn extends AbstractC7778dF<C7670dB, C7670dB> {
    @Override // o.AbstractC7778dF, o.InterfaceC7643dA
    public /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    @Override // o.AbstractC7778dF, o.InterfaceC7643dA
    public /* bridge */ /* synthetic */ List c() {
        return super.c();
    }

    @Override // o.AbstractC7778dF
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public C8476dn(List<C8910fd<C7670dB>> list) {
        super(c(list));
    }

    private static List<C8910fd<C7670dB>> c(List<C8910fd<C7670dB>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, c(list.get(i)));
        }
        return list;
    }

    private static C8910fd<C7670dB> c(C8910fd<C7670dB> c8910fd) {
        C7670dB c7670dB = c8910fd.j;
        C7670dB c7670dB2 = c8910fd.d;
        if (c7670dB == null || c7670dB2 == null || c7670dB.c().length == c7670dB2.c().length) {
            return c8910fd;
        }
        float[] e = e(c7670dB.c(), c7670dB2.c());
        return c8910fd.e(c7670dB.a(e), c7670dB2.a(e));
    }

    static float[] e(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // o.InterfaceC7643dA
    public AbstractC5913cN<C7670dB, C7670dB> b() {
        return new C5940cO(this.a);
    }
}

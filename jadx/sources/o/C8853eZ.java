package o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: o.eZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8853eZ {
    private static final PointF c = new PointF();

    public static int a(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static float b(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static boolean d(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static PointF e(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void c(C7880dP c7880dP, Path path) {
        path.reset();
        PointF a = c7880dP.a();
        path.moveTo(a.x, a.y);
        c.set(a.x, a.y);
        for (int i = 0; i < c7880dP.d().size(); i++) {
            C8103de c8103de = c7880dP.d().get(i);
            PointF e = c8103de.e();
            PointF c2 = c8103de.c();
            PointF d = c8103de.d();
            PointF pointF = c;
            if (e.equals(pointF) && c2.equals(d)) {
                path.lineTo(d.x, d.y);
            } else {
                path.cubicTo(e.x, e.y, c2.x, c2.y, d.x, d.y);
            }
            pointF.set(d.x, d.y);
        }
        if (c7880dP.e()) {
            path.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(float f, float f2) {
        return d((int) f, (int) f2);
    }

    private static int d(int i, int i2) {
        return i - (i2 * a(i, i2));
    }

    private static int a(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) < 0 && i % i2 != 0) ? i3 - 1 : i3;
    }

    public static int a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static float a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static void b(C8368dj c8368dj, int i, List<C8368dj> list, C8368dj c8368dj2, InterfaceC7589cz interfaceC7589cz) {
        if (c8368dj.a(interfaceC7589cz.e(), i)) {
            list.add(c8368dj2.d(interfaceC7589cz.e()).e(interfaceC7589cz));
        }
    }
}

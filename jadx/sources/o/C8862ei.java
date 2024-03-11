package o;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: o.ei  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8862ei {
    private static final JsonReader.e a = JsonReader.e.d("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");
    private static final JsonReader.e e = JsonReader.e.d("k");

    public static C8746dx e(JsonReader jsonReader, C3658bG c3658bG) {
        boolean z;
        boolean z2 = false;
        boolean z3 = jsonReader.l() == JsonReader.Token.BEGIN_OBJECT;
        if (z3) {
            jsonReader.e();
        }
        C8557dq c8557dq = null;
        C8638dt c8638dt = null;
        InterfaceC7643dA<PointF, PointF> interfaceC7643dA = null;
        C8692dv c8692dv = null;
        C8557dq c8557dq2 = null;
        C8557dq c8557dq3 = null;
        C8665du c8665du = null;
        C8557dq c8557dq4 = null;
        C8557dq c8557dq5 = null;
        while (jsonReader.f()) {
            switch (jsonReader.c(a)) {
                case 0:
                    boolean z4 = z2;
                    jsonReader.e();
                    while (jsonReader.f()) {
                        if (jsonReader.c(e) == 0) {
                            c8638dt = C8857ed.b(jsonReader, c3658bG);
                        } else {
                            jsonReader.m();
                            jsonReader.k();
                        }
                    }
                    jsonReader.d();
                    z2 = z4;
                    continue;
                case 1:
                    interfaceC7643dA = C8857ed.a(jsonReader, c3658bG);
                    continue;
                case 2:
                    c8692dv = C8863ej.i(jsonReader, c3658bG);
                    continue;
                case 3:
                    c3658bG.c("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    c8665du = C8863ej.a(jsonReader, c3658bG);
                    continue;
                case 6:
                    c8557dq4 = C8863ej.d(jsonReader, c3658bG, z2);
                    continue;
                case 7:
                    c8557dq5 = C8863ej.d(jsonReader, c3658bG, z2);
                    continue;
                case 8:
                    c8557dq2 = C8863ej.d(jsonReader, c3658bG, z2);
                    continue;
                case 9:
                    c8557dq3 = C8863ej.d(jsonReader, c3658bG, z2);
                    continue;
                default:
                    jsonReader.m();
                    jsonReader.k();
                    continue;
            }
            C8557dq d = C8863ej.d(jsonReader, c3658bG, z2);
            if (d.c().isEmpty()) {
                d.c().add(new C8910fd(c3658bG, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(c3658bG.d())));
            } else if (((C8910fd) d.c().get(0)).j == 0) {
                z = false;
                d.c().set(0, new C8910fd(c3658bG, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(c3658bG.d())));
                z2 = z;
                c8557dq = d;
            }
            z = false;
            z2 = z;
            c8557dq = d;
        }
        if (z3) {
            jsonReader.d();
        }
        C8638dt c8638dt2 = d(c8638dt) ? null : c8638dt;
        InterfaceC7643dA<PointF, PointF> interfaceC7643dA2 = d(interfaceC7643dA) ? null : interfaceC7643dA;
        C8557dq c8557dq6 = a(c8557dq) ? null : c8557dq;
        if (d(c8692dv)) {
            c8692dv = null;
        }
        return new C8746dx(c8638dt2, interfaceC7643dA2, c8692dv, c8557dq6, c8665du, c8557dq4, c8557dq5, c(c8557dq2) ? null : c8557dq2, d(c8557dq3) ? null : c8557dq3);
    }

    private static boolean d(C8638dt c8638dt) {
        return c8638dt == null || (c8638dt.a() && c8638dt.c().get(0).j.equals(0.0f, 0.0f));
    }

    private static boolean d(InterfaceC7643dA<PointF, PointF> interfaceC7643dA) {
        return interfaceC7643dA == null || (!(interfaceC7643dA instanceof C8773dy) && interfaceC7643dA.a() && interfaceC7643dA.c().get(0).j.equals(0.0f, 0.0f));
    }

    private static boolean a(C8557dq c8557dq) {
        return c8557dq == null || (c8557dq.a() && ((Float) ((C8910fd) c8557dq.c().get(0)).j).floatValue() == 0.0f);
    }

    private static boolean d(C8692dv c8692dv) {
        return c8692dv == null || (c8692dv.a() && ((C8913fg) ((C8910fd) c8692dv.c().get(0)).j).c(1.0f, 1.0f));
    }

    private static boolean c(C8557dq c8557dq) {
        return c8557dq == null || (c8557dq.a() && ((Float) ((C8910fd) c8557dq.c().get(0)).j).floatValue() == 0.0f);
    }

    private static boolean d(C8557dq c8557dq) {
        return c8557dq == null || (c8557dq.a() && ((Float) ((C8910fd) c8557dq.c().get(0)).j).floatValue() == 0.0f);
    }
}

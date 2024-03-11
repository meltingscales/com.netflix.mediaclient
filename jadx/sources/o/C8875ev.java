package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.lang.ref.WeakReference;

/* renamed from: o.ev  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C8875ev {
    private static SparseArrayCompat<WeakReference<Interpolator>> d;
    private static final Interpolator b = new LinearInterpolator();
    static JsonReader.e c = JsonReader.e.d("t", "s", "e", "o", "i", "h", "to", "ti");
    static JsonReader.e e = JsonReader.e.d(InteractiveAnimation.ANIMATION_TYPE.X, InteractiveAnimation.ANIMATION_TYPE.Y);

    C8875ev() {
    }

    private static SparseArrayCompat<WeakReference<Interpolator>> b() {
        if (d == null) {
            d = new SparseArrayCompat<>();
        }
        return d;
    }

    private static WeakReference<Interpolator> e(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (C8875ev.class) {
            weakReference = b().get(i);
        }
        return weakReference;
    }

    private static void c(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C8875ev.class) {
            d.put(i, weakReference);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> C8910fd<T> e(JsonReader jsonReader, C3658bG c3658bG, float f, InterfaceC8846eS<T> interfaceC8846eS, boolean z, boolean z2) {
        if (z && z2) {
            return d(c3658bG, jsonReader, f, interfaceC8846eS);
        }
        if (z) {
            return b(c3658bG, jsonReader, f, interfaceC8846eS);
        }
        return c(jsonReader, f, interfaceC8846eS);
    }

    private static <T> C8910fd<T> b(C3658bG c3658bG, JsonReader jsonReader, float f, InterfaceC8846eS<T> interfaceC8846eS) {
        Interpolator b2;
        T t;
        jsonReader.e();
        PointF pointF = null;
        T t2 = null;
        T t3 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        boolean z = false;
        PointF pointF4 = null;
        while (jsonReader.f()) {
            switch (jsonReader.c(c)) {
                case 0:
                    f2 = (float) jsonReader.g();
                    break;
                case 1:
                    t3 = interfaceC8846eS.d(jsonReader, f);
                    break;
                case 2:
                    t2 = interfaceC8846eS.d(jsonReader, f);
                    break;
                case 3:
                    pointF = C8876ew.b(jsonReader, 1.0f);
                    break;
                case 4:
                    pointF4 = C8876ew.b(jsonReader, 1.0f);
                    break;
                case 5:
                    if (jsonReader.j() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF3 = C8876ew.b(jsonReader, f);
                    break;
                case 7:
                    pointF2 = C8876ew.b(jsonReader, f);
                    break;
                default:
                    jsonReader.k();
                    break;
            }
        }
        jsonReader.d();
        if (z) {
            b2 = b;
            t = t3;
        } else {
            b2 = (pointF == null || pointF4 == null) ? b : b(pointF, pointF4);
            t = t2;
        }
        C8910fd<T> c8910fd = new C8910fd<>(c3658bG, t3, t, b2, f2, null);
        c8910fd.c = pointF3;
        c8910fd.b = pointF2;
        return c8910fd;
    }

    private static <T> C8910fd<T> d(C3658bG c3658bG, JsonReader jsonReader, float f, InterfaceC8846eS<T> interfaceC8846eS) {
        Interpolator interpolator;
        Interpolator interpolator2;
        Interpolator interpolator3;
        T t;
        T t2;
        C8910fd<T> c8910fd;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        float f2;
        jsonReader.e();
        PointF pointF5 = null;
        PointF pointF6 = null;
        boolean z = false;
        PointF pointF7 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        T t3 = null;
        PointF pointF10 = null;
        T t4 = null;
        PointF pointF11 = null;
        float f3 = 0.0f;
        PointF pointF12 = null;
        while (jsonReader.f()) {
            T t5 = t4;
            switch (jsonReader.c(c)) {
                case 0:
                    pointF = pointF5;
                    pointF2 = pointF6;
                    f3 = (float) jsonReader.g();
                    t4 = t5;
                    pointF5 = pointF;
                    pointF6 = pointF2;
                    break;
                case 1:
                    pointF = pointF5;
                    pointF2 = pointF6;
                    t3 = interfaceC8846eS.d(jsonReader, f);
                    t4 = t5;
                    pointF5 = pointF;
                    pointF6 = pointF2;
                    break;
                case 2:
                    pointF = pointF5;
                    pointF2 = pointF6;
                    t4 = interfaceC8846eS.d(jsonReader, f);
                    pointF5 = pointF;
                    pointF6 = pointF2;
                    break;
                case 3:
                    pointF = pointF5;
                    pointF2 = pointF6;
                    float f4 = f3;
                    if (jsonReader.l() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.e();
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        while (jsonReader.f()) {
                            int c2 = jsonReader.c(e);
                            if (c2 == 0) {
                                pointF3 = pointF12;
                                JsonReader.Token l = jsonReader.l();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (l == token) {
                                    f7 = (float) jsonReader.g();
                                    f5 = f7;
                                } else {
                                    jsonReader.c();
                                    f5 = (float) jsonReader.g();
                                    f7 = jsonReader.l() == token ? (float) jsonReader.g() : f5;
                                    jsonReader.a();
                                }
                            } else if (c2 == 1) {
                                JsonReader.Token l2 = jsonReader.l();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (l2 == token2) {
                                    f8 = (float) jsonReader.g();
                                    f6 = f8;
                                } else {
                                    jsonReader.c();
                                    pointF3 = pointF12;
                                    f6 = (float) jsonReader.g();
                                    f8 = jsonReader.l() == token2 ? (float) jsonReader.g() : f6;
                                    jsonReader.a();
                                }
                            } else {
                                jsonReader.k();
                            }
                            pointF12 = pointF3;
                        }
                        PointF pointF13 = new PointF(f5, f6);
                        PointF pointF14 = new PointF(f7, f8);
                        jsonReader.d();
                        pointF10 = pointF14;
                        pointF9 = pointF13;
                        t4 = t5;
                        f3 = f4;
                        pointF5 = pointF;
                        pointF6 = pointF2;
                        break;
                    } else {
                        f3 = f4;
                        pointF7 = C8876ew.b(jsonReader, f);
                        t4 = t5;
                        pointF5 = pointF;
                        pointF6 = pointF2;
                    }
                case 4:
                    if (jsonReader.l() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.e();
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        while (jsonReader.f()) {
                            PointF pointF15 = pointF5;
                            int c3 = jsonReader.c(e);
                            if (c3 != 0) {
                                pointF4 = pointF6;
                                if (c3 == 1) {
                                    JsonReader.Token l3 = jsonReader.l();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (l3 == token3) {
                                        f10 = (float) jsonReader.g();
                                        f12 = f10;
                                    } else {
                                        jsonReader.c();
                                        f2 = f3;
                                        f10 = (float) jsonReader.g();
                                        f12 = jsonReader.l() == token3 ? (float) jsonReader.g() : f10;
                                        jsonReader.a();
                                    }
                                } else {
                                    jsonReader.k();
                                }
                                f2 = f3;
                            } else {
                                pointF4 = pointF6;
                                f2 = f3;
                                JsonReader.Token l4 = jsonReader.l();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (l4 == token4) {
                                    f9 = (float) jsonReader.g();
                                    f11 = f9;
                                } else {
                                    jsonReader.c();
                                    float g = (float) jsonReader.g();
                                    f11 = jsonReader.l() == token4 ? (float) jsonReader.g() : g;
                                    jsonReader.a();
                                    f9 = g;
                                }
                            }
                            f3 = f2;
                            pointF5 = pointF15;
                            pointF6 = pointF4;
                        }
                        pointF = pointF5;
                        pointF2 = pointF6;
                        PointF pointF16 = new PointF(f9, f10);
                        PointF pointF17 = new PointF(f11, f12);
                        jsonReader.d();
                        pointF11 = pointF16;
                        pointF12 = pointF17;
                    } else {
                        pointF = pointF5;
                        pointF2 = pointF6;
                        pointF8 = C8876ew.b(jsonReader, f);
                    }
                    t4 = t5;
                    pointF5 = pointF;
                    pointF6 = pointF2;
                    break;
                case 5:
                    if (jsonReader.j() != 1) {
                        t4 = t5;
                        z = false;
                        break;
                    } else {
                        z = true;
                        t4 = t5;
                        break;
                    }
                case 6:
                    pointF6 = C8876ew.b(jsonReader, f);
                    t4 = t5;
                    break;
                case 7:
                    pointF5 = C8876ew.b(jsonReader, f);
                    t4 = t5;
                    break;
                default:
                    jsonReader.k();
                    t4 = t5;
                    pointF5 = pointF5;
                    break;
            }
        }
        PointF pointF18 = pointF5;
        PointF pointF19 = pointF6;
        T t6 = t4;
        float f13 = f3;
        PointF pointF20 = pointF12;
        jsonReader.d();
        if (z) {
            interpolator = b;
            t2 = t3;
        } else {
            if (pointF7 != null && pointF8 != null) {
                interpolator = b(pointF7, pointF8);
            } else if (pointF9 != null && pointF10 != null && pointF11 != null && pointF20 != null) {
                Interpolator b2 = b(pointF9, pointF11);
                Interpolator b3 = b(pointF10, pointF20);
                interpolator2 = b2;
                interpolator3 = b3;
                t = t6;
                interpolator = null;
                if (interpolator2 == null && interpolator3 != null) {
                    c8910fd = new C8910fd<>(c3658bG, t3, t, interpolator2, interpolator3, f13, null);
                } else {
                    c8910fd = new C8910fd<>(c3658bG, t3, t, interpolator, f13, null);
                }
                c8910fd.c = pointF19;
                c8910fd.b = pointF18;
                return c8910fd;
            } else {
                interpolator = b;
            }
            t2 = t6;
        }
        t = t2;
        interpolator2 = null;
        interpolator3 = null;
        if (interpolator2 == null) {
        }
        c8910fd = new C8910fd<>(c3658bG, t3, t, interpolator, f13, null);
        c8910fd.c = pointF19;
        c8910fd.b = pointF18;
        return c8910fd;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = C8853eZ.a(pointF.x, -1.0f, 1.0f);
        pointF.y = C8853eZ.a(pointF.y, -100.0f, 100.0f);
        pointF2.x = C8853eZ.a(pointF2.x, -1.0f, 1.0f);
        float a = C8853eZ.a(pointF2.y, -100.0f, 100.0f);
        pointF2.y = a;
        int a2 = C8914fh.a(pointF.x, pointF.y, pointF2.x, a);
        WeakReference<Interpolator> e2 = C3550bC.a() ? null : e(a2);
        Interpolator interpolator = e2 != null ? e2.get() : null;
        if (e2 == null || interpolator == null) {
            try {
                linearInterpolator = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e3) {
                if ("The Path cannot loop back on itself.".equals(e3.getMessage())) {
                    linearInterpolator = PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!C3550bC.a()) {
                try {
                    c(a2, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    private static <T> C8910fd<T> c(JsonReader jsonReader, float f, InterfaceC8846eS<T> interfaceC8846eS) {
        return new C8910fd<>(interfaceC8846eS.d(jsonReader, f));
    }
}

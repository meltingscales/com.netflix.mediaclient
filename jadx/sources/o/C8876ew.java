package o;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.ew  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C8876ew {
    private static final JsonReader.e b = JsonReader.e.d(InteractiveAnimation.ANIMATION_TYPE.X, InteractiveAnimation.ANIMATION_TYPE.Y);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(JsonReader jsonReader) {
        jsonReader.c();
        int g = (int) (jsonReader.g() * 255.0d);
        int g2 = (int) (jsonReader.g() * 255.0d);
        int g3 = (int) (jsonReader.g() * 255.0d);
        while (jsonReader.f()) {
            jsonReader.k();
        }
        jsonReader.a();
        return Color.argb((int) PrivateKeyType.INVALID, g, g2, g3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<PointF> a(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        jsonReader.c();
        while (jsonReader.l() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.c();
            arrayList.add(b(jsonReader, f));
            jsonReader.a();
        }
        jsonReader.a();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ew$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            d = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF b(JsonReader jsonReader, float f) {
        int i = AnonymousClass4.d[jsonReader.l().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return d(jsonReader, f);
                }
                throw new IllegalArgumentException("Unknown point starts with " + jsonReader.l());
            }
            return e(jsonReader, f);
        }
        return c(jsonReader, f);
    }

    private static PointF c(JsonReader jsonReader, float f) {
        float g = (float) jsonReader.g();
        float g2 = (float) jsonReader.g();
        while (jsonReader.f()) {
            jsonReader.k();
        }
        return new PointF(g * f, g2 * f);
    }

    private static PointF e(JsonReader jsonReader, float f) {
        jsonReader.c();
        float g = (float) jsonReader.g();
        float g2 = (float) jsonReader.g();
        while (jsonReader.l() != JsonReader.Token.END_ARRAY) {
            jsonReader.k();
        }
        jsonReader.a();
        return new PointF(g * f, g2 * f);
    }

    private static PointF d(JsonReader jsonReader, float f) {
        jsonReader.e();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.f()) {
            int c = jsonReader.c(b);
            if (c == 0) {
                f2 = c(jsonReader);
            } else if (c == 1) {
                f3 = c(jsonReader);
            } else {
                jsonReader.m();
                jsonReader.k();
            }
        }
        jsonReader.d();
        return new PointF(f2 * f, f3 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(JsonReader jsonReader) {
        JsonReader.Token l = jsonReader.l();
        int i = AnonymousClass4.d[l.ordinal()];
        if (i != 1) {
            if (i == 2) {
                jsonReader.c();
                float g = (float) jsonReader.g();
                while (jsonReader.f()) {
                    jsonReader.k();
                }
                jsonReader.a();
                return g;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + l);
        }
        return (float) jsonReader.g();
    }
}

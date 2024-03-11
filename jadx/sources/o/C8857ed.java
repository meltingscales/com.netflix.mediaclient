package o;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.ArrayList;

/* renamed from: o.ed  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8857ed {
    private static final JsonReader.e d = JsonReader.e.d("k", InteractiveAnimation.ANIMATION_TYPE.X, InteractiveAnimation.ANIMATION_TYPE.Y);

    public static C8638dt b(JsonReader jsonReader, C3658bG c3658bG) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.l() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.c();
            while (jsonReader.f()) {
                arrayList.add(C8829eB.b(jsonReader, c3658bG));
            }
            jsonReader.a();
            C8874eu.d(arrayList);
        } else {
            arrayList.add(new C8910fd(C8876ew.b(jsonReader, C8914fh.d())));
        }
        return new C8638dt(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC7643dA<PointF, PointF> a(JsonReader jsonReader, C3658bG c3658bG) {
        jsonReader.e();
        C8638dt c8638dt = null;
        C8557dq c8557dq = null;
        boolean z = false;
        C8557dq c8557dq2 = null;
        while (jsonReader.l() != JsonReader.Token.END_OBJECT) {
            int c = jsonReader.c(d);
            if (c == 0) {
                c8638dt = b(jsonReader, c3658bG);
            } else if (c != 1) {
                if (c == 2) {
                    if (jsonReader.l() == JsonReader.Token.STRING) {
                        jsonReader.k();
                        z = true;
                    } else {
                        c8557dq = C8863ej.b(jsonReader, c3658bG);
                    }
                } else {
                    jsonReader.m();
                    jsonReader.k();
                }
            } else if (jsonReader.l() == JsonReader.Token.STRING) {
                jsonReader.k();
                z = true;
            } else {
                c8557dq2 = C8863ej.b(jsonReader, c3658bG);
            }
        }
        jsonReader.d();
        if (z) {
            c3658bG.c("Lottie doesn't support expressions.");
        }
        return c8638dt != null ? c8638dt : new C8773dy(c8557dq2, c8557dq);
    }
}

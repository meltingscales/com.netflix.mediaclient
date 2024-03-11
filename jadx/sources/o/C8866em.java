package o;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: o.em  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8866em implements InterfaceC8846eS<DocumentData> {
    public static final C8866em d = new C8866em();
    private static final JsonReader.e b = JsonReader.e.d("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private C8866em() {
    }

    @Override // o.InterfaceC8846eS
    /* renamed from: c */
    public DocumentData d(JsonReader jsonReader, float f) {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.e();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (jsonReader.f()) {
            switch (jsonReader.c(b)) {
                case 0:
                    str = jsonReader.o();
                    break;
                case 1:
                    str2 = jsonReader.o();
                    break;
                case 2:
                    f2 = (float) jsonReader.g();
                    break;
                case 3:
                    int j = jsonReader.j();
                    justification2 = DocumentData.Justification.CENTER;
                    if (j <= justification2.ordinal() && j >= 0) {
                        justification2 = DocumentData.Justification.values()[j];
                        break;
                    }
                    break;
                case 4:
                    i = jsonReader.j();
                    break;
                case 5:
                    f3 = (float) jsonReader.g();
                    break;
                case 6:
                    f4 = (float) jsonReader.g();
                    break;
                case 7:
                    i2 = C8876ew.e(jsonReader);
                    break;
                case 8:
                    i3 = C8876ew.e(jsonReader);
                    break;
                case 9:
                    f5 = (float) jsonReader.g();
                    break;
                case 10:
                    z = jsonReader.h();
                    break;
                case 11:
                    jsonReader.c();
                    PointF pointF3 = new PointF(((float) jsonReader.g()) * f, ((float) jsonReader.g()) * f);
                    jsonReader.a();
                    pointF = pointF3;
                    break;
                case 12:
                    jsonReader.c();
                    PointF pointF4 = new PointF(((float) jsonReader.g()) * f, ((float) jsonReader.g()) * f);
                    jsonReader.a();
                    pointF2 = pointF4;
                    break;
                default:
                    jsonReader.m();
                    jsonReader.k();
                    break;
            }
        }
        jsonReader.d();
        return new DocumentData(str, str2, f2, justification2, i, f3, f4, i2, i3, f5, z, pointF, pointF2);
    }
}

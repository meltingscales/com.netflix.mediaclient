package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.List;

/* renamed from: o.ej  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8863ej {
    public static C8557dq b(JsonReader jsonReader, C3658bG c3658bG) {
        return d(jsonReader, c3658bG, true);
    }

    public static C8557dq d(JsonReader jsonReader, C3658bG c3658bG, boolean z) {
        return new C8557dq(a(jsonReader, z ? C8914fh.d() : 1.0f, c3658bG, C8869ep.d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C8665du a(JsonReader jsonReader, C3658bG c3658bG) {
        return new C8665du(d(jsonReader, c3658bG, C8878ey.b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C8611ds e(JsonReader jsonReader, C3658bG c3658bG) {
        return new C8611ds(C8874eu.d(jsonReader, c3658bG, C8914fh.d(), C8834eG.c, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C8692dv i(JsonReader jsonReader, C3658bG c3658bG) {
        return new C8692dv(d(jsonReader, c3658bG, C8837eJ.e));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C8584dr f(JsonReader jsonReader, C3658bG c3658bG) {
        return new C8584dr(a(jsonReader, C8914fh.d(), c3658bG, C8838eK.d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C8719dw d(JsonReader jsonReader, C3658bG c3658bG) {
        return new C8719dw(a(jsonReader, C8914fh.d(), c3658bG, C8866em.d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C8530dp c(JsonReader jsonReader, C3658bG c3658bG) {
        return new C8530dp(d(jsonReader, c3658bG, C8867en.d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C8476dn a(JsonReader jsonReader, C3658bG c3658bG, int i) {
        return new C8476dn(d(jsonReader, c3658bG, new C8870eq(i)));
    }

    private static <T> List<C8910fd<T>> d(JsonReader jsonReader, C3658bG c3658bG, InterfaceC8846eS<T> interfaceC8846eS) {
        return C8874eu.d(jsonReader, c3658bG, 1.0f, interfaceC8846eS, false);
    }

    private static <T> List<C8910fd<T>> a(JsonReader jsonReader, float f, C3658bG c3658bG, InterfaceC8846eS<T> interfaceC8846eS) {
        return C8874eu.d(jsonReader, c3658bG, f, interfaceC8846eS, false);
    }
}

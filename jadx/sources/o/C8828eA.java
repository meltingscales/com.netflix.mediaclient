package o;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: o.eA  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C8828eA {
    private static final JsonReader.e d = JsonReader.e.d("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MergePaths c(JsonReader jsonReader) {
        String str = null;
        boolean z = false;
        MergePaths.MergePathsMode mergePathsMode = null;
        while (jsonReader.f()) {
            int c = jsonReader.c(d);
            if (c == 0) {
                str = jsonReader.o();
            } else if (c == 1) {
                mergePathsMode = MergePaths.MergePathsMode.a(jsonReader.j());
            } else if (c == 2) {
                z = jsonReader.h();
            } else {
                jsonReader.m();
                jsonReader.k();
            }
        }
        return new MergePaths(str, mergePathsMode, z);
    }
}

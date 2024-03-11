package o;

import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class aZG {
    public static final aZG b = new aZG();

    private aZG() {
    }

    public final String b(String str) {
        C8632dsu.c((Object) str, "");
        return new Regex("\\s *").a(str, " ");
    }
}

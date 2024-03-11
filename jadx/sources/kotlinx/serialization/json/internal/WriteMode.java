package kotlinx.serialization.json.internal;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class WriteMode {
    private static final /* synthetic */ InterfaceC8598drn f;
    private static final /* synthetic */ WriteMode[] h;
    public final char d;
    public final char j;
    public static final WriteMode b = new WriteMode("OBJ", 0, '{', '}');
    public static final WriteMode a = new WriteMode("LIST", 1, '[', ']');
    public static final WriteMode e = new WriteMode("MAP", 2, '{', '}');
    public static final WriteMode c = new WriteMode("POLY_OBJ", 3, '[', ']');

    private static final /* synthetic */ WriteMode[] b() {
        return new WriteMode[]{b, a, e, c};
    }

    public static WriteMode valueOf(String str) {
        return (WriteMode) Enum.valueOf(WriteMode.class, str);
    }

    public static WriteMode[] values() {
        return (WriteMode[]) h.clone();
    }

    private WriteMode(String str, int i, char c2, char c3) {
        this.d = c2;
        this.j = c3;
    }

    static {
        WriteMode[] b2 = b();
        h = b2;
        f = C8600drp.e(b2);
    }
}

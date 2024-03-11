package kotlinx.serialization;

import java.util.List;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class MissingFieldException extends SerializationException {
    private final List<String> b;

    public final List<String> c() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List<String> list, String str, Throwable th) {
        super(str, th);
        C8632dsu.c((Object) list, "");
        this.b = list;
    }
}

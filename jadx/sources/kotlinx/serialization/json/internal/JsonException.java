package kotlinx.serialization.json.internal;

import kotlinx.serialization.SerializationException;
import o.C8632dsu;

/* loaded from: classes5.dex */
public class JsonException extends SerializationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonException(String str) {
        super(str);
        C8632dsu.c((Object) str, "");
    }
}

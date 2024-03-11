package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;

/* renamed from: o.qa  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9490qa extends AbstractC9452pp<Object> {
    private final Error a;

    public C9490qa(NoClassDefFoundError noClassDefFoundError) {
        this.a = noClassDefFoundError;
    }

    @Override // o.AbstractC9452pp
    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        throw this.a;
    }
}

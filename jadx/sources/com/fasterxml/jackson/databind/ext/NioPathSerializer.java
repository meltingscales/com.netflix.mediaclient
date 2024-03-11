package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.net.URI;
import java.nio.file.Path;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.C9496qg;
import o.C9499qj;

/* loaded from: classes5.dex */
public class NioPathSerializer extends StdScalarSerializer<Path> {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, o.AbstractC9453pq
    public /* synthetic */ void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        b(C9496qg.e(obj), jsonGenerator, abstractC9459pw, abstractC9544rb);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public /* bridge */ /* synthetic */ void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        e(C9496qg.e(obj), jsonGenerator, abstractC9459pw);
    }

    public NioPathSerializer() {
        super(C9499qj.e());
    }

    public void e(Path path, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        URI uri;
        uri = path.toUri();
        jsonGenerator.i(uri.toString());
    }

    public void b(Path path, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        WritableTypeId b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.b(path, C9499qj.e(), JsonToken.VALUE_STRING));
        e(path, jsonGenerator, abstractC9459pw);
        abstractC9544rb.c(jsonGenerator, b);
    }
}

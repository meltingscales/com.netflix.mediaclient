package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import o.AbstractC9445pi;
import o.AbstractC9465qB;

/* loaded from: classes5.dex */
public class InvalidDefinitionException extends JsonMappingException {
    protected transient AbstractC9465qB c;
    protected transient AbstractC9445pi e;
    protected final JavaType f;

    protected InvalidDefinitionException(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
        this.f = javaType;
        this.e = null;
        this.c = null;
    }

    protected InvalidDefinitionException(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        super(jsonGenerator, str);
        this.f = javaType;
        this.e = null;
        this.c = null;
    }

    protected InvalidDefinitionException(JsonParser jsonParser, String str, AbstractC9445pi abstractC9445pi, AbstractC9465qB abstractC9465qB) {
        super(jsonParser, str);
        this.f = abstractC9445pi == null ? null : abstractC9445pi.t();
        this.e = abstractC9445pi;
        this.c = abstractC9465qB;
    }

    protected InvalidDefinitionException(JsonGenerator jsonGenerator, String str, AbstractC9445pi abstractC9445pi, AbstractC9465qB abstractC9465qB) {
        super(jsonGenerator, str);
        this.f = abstractC9445pi == null ? null : abstractC9445pi.t();
        this.e = abstractC9445pi;
        this.c = abstractC9465qB;
    }

    public static InvalidDefinitionException d(JsonParser jsonParser, String str, AbstractC9445pi abstractC9445pi, AbstractC9465qB abstractC9465qB) {
        return new InvalidDefinitionException(jsonParser, str, abstractC9445pi, abstractC9465qB);
    }

    public static InvalidDefinitionException b(JsonParser jsonParser, String str, JavaType javaType) {
        return new InvalidDefinitionException(jsonParser, str, javaType);
    }

    public static InvalidDefinitionException e(JsonGenerator jsonGenerator, String str, AbstractC9445pi abstractC9445pi, AbstractC9465qB abstractC9465qB) {
        return new InvalidDefinitionException(jsonGenerator, str, abstractC9445pi, abstractC9465qB);
    }

    public static InvalidDefinitionException c(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        return new InvalidDefinitionException(jsonGenerator, str, javaType);
    }
}

package com.fasterxml.jackson.databind.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import o.C9418pH;

/* loaded from: classes5.dex */
public class JsonMapper extends ObjectMapper {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.ObjectMapper, com.fasterxml.jackson.core.ObjectCodec
    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public JsonMapper() {
        this(new JsonFactory());
    }

    public JsonMapper(JsonFactory jsonFactory) {
        super(jsonFactory);
    }

    protected JsonMapper(JsonMapper jsonMapper) {
        super(jsonMapper);
    }

    @Override // com.fasterxml.jackson.databind.ObjectMapper
    /* renamed from: c */
    public JsonMapper copy() {
        _checkInvalidCopy(JsonMapper.class);
        return new JsonMapper(this);
    }

    @Override // com.fasterxml.jackson.databind.ObjectMapper, com.fasterxml.jackson.core.ObjectCodec
    public Version version() {
        return C9418pH.c;
    }
}

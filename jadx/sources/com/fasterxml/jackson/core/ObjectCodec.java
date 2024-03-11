package com.fasterxml.jackson.core;

import java.util.Iterator;
import o.AbstractC9328nX;
import o.AbstractC9378oU;
import o.AbstractC9380oW;
import o.InterfaceC9330nZ;

/* loaded from: classes2.dex */
public abstract class ObjectCodec extends AbstractC9328nX {
    public abstract InterfaceC9330nZ createArrayNode();

    public abstract InterfaceC9330nZ createObjectNode();

    public abstract <T extends InterfaceC9330nZ> T readTree(JsonParser jsonParser);

    public abstract <T> T readValue(JsonParser jsonParser, Class<T> cls);

    public abstract <T> T readValue(JsonParser jsonParser, AbstractC9378oU<T> abstractC9378oU);

    public abstract <T> T readValue(JsonParser jsonParser, AbstractC9380oW abstractC9380oW);

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls);

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, AbstractC9378oU<T> abstractC9378oU);

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, AbstractC9380oW abstractC9380oW);

    public abstract JsonParser treeAsTokens(InterfaceC9330nZ interfaceC9330nZ);

    public abstract <T> T treeToValue(InterfaceC9330nZ interfaceC9330nZ, Class<T> cls);

    public abstract Version version();

    public abstract void writeTree(JsonGenerator jsonGenerator, InterfaceC9330nZ interfaceC9330nZ);

    public abstract void writeValue(JsonGenerator jsonGenerator, Object obj);

    @Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }

    public JsonFactory getFactory() {
        return getJsonFactory();
    }
}

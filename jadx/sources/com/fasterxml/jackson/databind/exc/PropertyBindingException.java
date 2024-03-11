package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class PropertyBindingException extends MismatchedInputException {
    protected transient String c;
    protected final Collection<Object> e;
    protected final String h;
    protected final Class<?> i;

    /* JADX INFO: Access modifiers changed from: protected */
    public PropertyBindingException(JsonParser jsonParser, String str, JsonLocation jsonLocation, Class<?> cls, String str2, Collection<Object> collection) {
        super(jsonParser, str, jsonLocation);
        this.i = cls;
        this.h = str2;
        this.e = collection;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    public String e() {
        String str = this.c;
        if (str != null || this.e == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(100);
        int size = this.e.size();
        if (size == 1) {
            sb.append(" (one known property: \"");
            sb.append(String.valueOf(this.e.iterator().next()));
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        } else {
            sb.append(" (");
            sb.append(size);
            sb.append(" known properties: ");
            Iterator<Object> it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                sb.append(String.valueOf(it.next()));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                if (sb.length() > 1000) {
                    sb.append(" [truncated]");
                    break;
                } else if (it.hasNext()) {
                    sb.append(", ");
                }
            }
        }
        sb.append("])");
        String sb2 = sb.toString();
        this.c = sb2;
        return sb2;
    }
}

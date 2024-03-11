package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C9430pT;
import o.C9494qe;

/* loaded from: classes5.dex */
public class UnresolvedForwardReference extends JsonMappingException {
    private static final long serialVersionUID = 1;
    private C9494qe c;
    private List<C9430pT> e;

    public C9494qe a() {
        return this.c;
    }

    public UnresolvedForwardReference(JsonParser jsonParser, String str, JsonLocation jsonLocation, C9494qe c9494qe) {
        super(jsonParser, str, jsonLocation);
        this.c = c9494qe;
    }

    public UnresolvedForwardReference(JsonParser jsonParser, String str) {
        super(jsonParser, str);
        this.e = new ArrayList();
    }

    public Object f() {
        return this.c.e().a;
    }

    public void e(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this.e.add(new C9430pT(obj, cls, jsonLocation));
    }

    @Override // com.fasterxml.jackson.databind.JsonMappingException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this.e == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(message);
        Iterator<C9430pT> it = this.e.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append('.');
        return sb.toString();
    }
}

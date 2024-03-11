package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import o.C9537rU;
import o.InterfaceC9355ny;

/* loaded from: classes5.dex */
public class JsonMappingException extends JsonProcessingException {
    private static final long serialVersionUID = 1;
    protected LinkedList<Reference> a;
    protected transient Closeable b;

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    @InterfaceC9355ny
    public Object d() {
        return this.b;
    }

    /* loaded from: classes5.dex */
    public static class Reference implements Serializable {
        private static final long serialVersionUID = 2;
        protected int a;
        protected String b;
        protected transient Object c;
        protected String d;

        protected Reference() {
            this.a = -1;
        }

        public Reference(Object obj, String str) {
            this.a = -1;
            this.c = obj;
            if (str == null) {
                throw new NullPointerException("Cannot pass null fieldName");
            }
            this.d = str;
        }

        public Reference(Object obj, int i) {
            this.c = obj;
            this.a = i;
        }

        public String c() {
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                Object obj = this.c;
                if (obj == null) {
                    sb.append("UNKNOWN");
                } else {
                    Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
                    int i = 0;
                    while (cls.isArray()) {
                        cls = cls.getComponentType();
                        i++;
                    }
                    sb.append(cls.getName());
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        sb.append("[]");
                    }
                }
                sb.append('[');
                if (this.d != null) {
                    sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                    sb.append(this.d);
                    sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                } else {
                    int i2 = this.a;
                    if (i2 >= 0) {
                        sb.append(i2);
                    } else {
                        sb.append('?');
                    }
                }
                sb.append(']');
                this.b = sb.toString();
            }
            return this.b;
        }

        public String toString() {
            return c();
        }

        Object writeReplace() {
            c();
            return this;
        }
    }

    public JsonMappingException(Closeable closeable, String str) {
        super(str);
        this.b = closeable;
        if (closeable instanceof JsonParser) {
            this.d = ((JsonParser) closeable).G();
        }
    }

    public JsonMappingException(Closeable closeable, String str, Throwable th) {
        super(str, th);
        this.b = closeable;
        if (closeable instanceof JsonParser) {
            this.d = ((JsonParser) closeable).G();
        }
    }

    public JsonMappingException(Closeable closeable, String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
        this.b = closeable;
    }

    public static JsonMappingException d(JsonParser jsonParser, String str) {
        return new JsonMappingException(jsonParser, str);
    }

    public static JsonMappingException d(JsonParser jsonParser, String str, Throwable th) {
        return new JsonMappingException(jsonParser, str, th);
    }

    public static JsonMappingException a(JsonGenerator jsonGenerator, String str) {
        return new JsonMappingException(jsonGenerator, str, (Throwable) null);
    }

    public static JsonMappingException a(JsonGenerator jsonGenerator, String str, Throwable th) {
        return new JsonMappingException(jsonGenerator, str, th);
    }

    public static JsonMappingException c(DeserializationContext deserializationContext, String str) {
        return new JsonMappingException(deserializationContext.m(), str);
    }

    public static JsonMappingException c(DeserializationContext deserializationContext, String str, Throwable th) {
        return new JsonMappingException(deserializationContext.m(), str, th);
    }

    public static JsonMappingException b(IOException iOException) {
        return new JsonMappingException(null, String.format("Unexpected IOException (of type %s): %s", iOException.getClass().getName(), C9537rU.d((Throwable) iOException)));
    }

    public static JsonMappingException d(Throwable th, Object obj, String str) {
        return d(th, new Reference(obj, str));
    }

    public static JsonMappingException d(Throwable th, Object obj, int i) {
        return d(th, new Reference(obj, i));
    }

    public static JsonMappingException d(Throwable th, Reference reference) {
        Closeable closeable;
        JsonMappingException jsonMappingException;
        if (th instanceof JsonMappingException) {
            jsonMappingException = (JsonMappingException) th;
        } else {
            String d = C9537rU.d(th);
            if (d == null || d.length() == 0) {
                d = "(was " + th.getClass().getName() + ")";
            }
            if (th instanceof JsonProcessingException) {
                Object d2 = ((JsonProcessingException) th).d();
                if (d2 instanceof Closeable) {
                    closeable = (Closeable) d2;
                    jsonMappingException = new JsonMappingException(closeable, d, th);
                }
            }
            closeable = null;
            jsonMappingException = new JsonMappingException(closeable, d, th);
        }
        jsonMappingException.c(reference);
        return jsonMappingException;
    }

    public StringBuilder c(StringBuilder sb) {
        e(sb);
        return sb;
    }

    public void e(Object obj, String str) {
        c(new Reference(obj, str));
    }

    public void c(Reference reference) {
        if (this.a == null) {
            this.a = new LinkedList<>();
        }
        if (this.a.size() < 1000) {
            this.a.addFirst(reference);
        }
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return c();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return c();
    }

    protected String c() {
        String message = super.getMessage();
        if (this.a == null) {
            return message;
        }
        StringBuilder sb = message == null ? new StringBuilder() : new StringBuilder(message);
        sb.append(" (through reference chain: ");
        StringBuilder c = c(sb);
        c.append(')');
        return c.toString();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    protected void e(StringBuilder sb) {
        LinkedList<Reference> linkedList = this.a;
        if (linkedList == null) {
            return;
        }
        Iterator<Reference> it = linkedList.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append("->");
            }
        }
    }
}

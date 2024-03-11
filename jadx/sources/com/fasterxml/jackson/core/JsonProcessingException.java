package com.fasterxml.jackson.core;

/* loaded from: classes2.dex */
public class JsonProcessingException extends JacksonException {
    private static final long serialVersionUID = 123;
    public JsonLocation d;

    public JsonLocation b() {
        return this.d;
    }

    public Object d() {
        return null;
    }

    protected String e() {
        return null;
    }

    public JsonProcessingException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str, th);
        this.d = jsonLocation;
    }

    public JsonProcessingException(String str) {
        super(str);
    }

    public JsonProcessingException(String str, JsonLocation jsonLocation) {
        this(str, jsonLocation, null);
    }

    public JsonProcessingException(String str, Throwable th) {
        this(str, null, th);
    }

    public String g() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        JsonLocation b = b();
        String e = e();
        if (b == null && e == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (e != null) {
            sb.append(e);
        }
        if (b != null) {
            sb.append('\n');
            sb.append(" at ");
            sb.append(b.toString());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}

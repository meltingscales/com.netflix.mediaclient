package org.json;

/* loaded from: classes.dex */
public class JSONException extends RuntimeException {
    private static final long serialVersionUID = 0;
    private Throwable cause;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public JSONException(String str) {
        super(str);
    }

    public JSONException(Throwable th) {
        super(th.getMessage());
        this.cause = th;
    }
}

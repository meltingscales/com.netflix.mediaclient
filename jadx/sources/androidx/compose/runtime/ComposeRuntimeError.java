package androidx.compose.runtime;

/* loaded from: classes.dex */
public final class ComposeRuntimeError extends IllegalStateException {
    private final String message;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public ComposeRuntimeError(String str) {
        this.message = str;
    }
}

package j$.time.format;

import j$.time.DateTimeException;

/* loaded from: classes5.dex */
public class DateTimeParseException extends DateTimeException {
    private static final long serialVersionUID = 4304633501674722597L;
    private final String d;
    private final int e;

    public DateTimeParseException(String str, CharSequence charSequence, int i) {
        super(str);
        this.d = charSequence.toString();
        this.e = i;
    }

    public DateTimeParseException(String str, CharSequence charSequence, int i, Throwable th) {
        super(str, th);
        this.d = charSequence.toString();
        this.e = i;
    }
}

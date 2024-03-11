package o;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: o.my  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9302my {
    public static final C9302my d = new C9302my();
    private static final c e = new c();

    private C9302my() {
    }

    /* renamed from: o.my$c */
    /* loaded from: classes2.dex */
    public static final class c extends ThreadLocal<DateFormat> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: d */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(C8543dpm.c("UTC"));
            return simpleDateFormat;
        }
    }

    private final DateFormat e() {
        DateFormat dateFormat = e.get();
        if (dateFormat != null) {
            return dateFormat;
        }
        throw new IllegalArgumentException("Unable to find valid dateformatter".toString());
    }

    public static final String a(Date date) {
        return d.e().format(date);
    }

    public static final Date c(String str) {
        try {
            Date parse = d.e().parse(str);
            if (parse != null) {
                return parse;
            }
            throw new ParseException("DateFormat.parse returned null", 0);
        } catch (ParseException e2) {
            throw new IllegalArgumentException("Failed to parse timestamp", e2);
        }
    }
}

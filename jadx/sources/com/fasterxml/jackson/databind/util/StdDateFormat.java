package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonFactory;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C8543dpm;
import o.C9398oo;

/* loaded from: classes5.dex */
public class StdDateFormat extends DateFormat {
    protected static final DateFormat a;
    protected static final String[] b;
    protected static final Calendar c;
    protected static final Locale d;
    protected static final DateFormat e;
    protected static final Pattern f;
    protected static final TimeZone g;
    protected static final Pattern i = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");
    public static final StdDateFormat j;
    protected Boolean h;
    private boolean k;
    private transient Calendar l;
    private transient DateFormat m;
    protected final Locale n;

    /* renamed from: o  reason: collision with root package name */
    protected transient TimeZone f13114o;

    protected void c() {
        this.m = null;
    }

    @Override // java.text.DateFormat
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // java.text.DateFormat
    public TimeZone getTimeZone() {
        return this.f13114o;
    }

    static {
        try {
            f = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            b = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
            TimeZone c2 = C8543dpm.c("UTC");
            g = c2;
            Locale locale = Locale.US;
            d = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            e = simpleDateFormat;
            simpleDateFormat.setTimeZone(c2);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale);
            a = simpleDateFormat2;
            simpleDateFormat2.setTimeZone(c2);
            j = new StdDateFormat();
            c = new GregorianCalendar(c2, locale);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public StdDateFormat() {
        this.k = false;
        this.n = d;
    }

    protected StdDateFormat(TimeZone timeZone, Locale locale, Boolean bool, boolean z) {
        this.f13114o = timeZone;
        this.n = locale;
        this.h = bool;
        this.k = z;
    }

    public StdDateFormat a(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = g;
        }
        TimeZone timeZone2 = this.f13114o;
        return (timeZone == timeZone2 || timeZone.equals(timeZone2)) ? this : new StdDateFormat(timeZone, this.n, this.h, this.k);
    }

    public StdDateFormat b(Locale locale) {
        return locale.equals(this.n) ? this : new StdDateFormat(this.f13114o, locale, this.h, this.k);
    }

    public StdDateFormat e(Boolean bool) {
        return e(bool, this.h) ? this : new StdDateFormat(this.f13114o, this.n, bool, this.k);
    }

    @Override // java.text.DateFormat, java.text.Format
    /* renamed from: e */
    public StdDateFormat clone() {
        return new StdDateFormat(this.f13114o, this.n, this.h, this.k);
    }

    @Override // java.text.DateFormat
    public void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this.f13114o)) {
            return;
        }
        c();
        this.f13114o = timeZone;
    }

    @Override // java.text.DateFormat
    public void setLenient(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        if (e(valueOf, this.h)) {
            return;
        }
        this.h = valueOf;
        c();
    }

    @Override // java.text.DateFormat
    public boolean isLenient() {
        Boolean bool = this.h;
        return bool == null || bool.booleanValue();
    }

    @Override // java.text.DateFormat
    public Date parse(String str) {
        String[] strArr;
        String trim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date b2 = b(trim, parsePosition);
        if (b2 != null) {
            return b2;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : b) {
            if (sb.length() > 0) {
                sb.append("\", \"");
            } else {
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            }
            sb.append(str2);
        }
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", trim, sb.toString()), parsePosition.getErrorIndex());
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return b(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }

    protected Date b(String str, ParsePosition parsePosition) {
        if (e(str)) {
            return a(str, parsePosition);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            char charAt = str.charAt(length);
            if (charAt < '0' || charAt > '9') {
                if (length > 0 || charAt != '-') {
                    break;
                }
            }
        }
        if (length < 0 && (str.charAt(0) == '-' || C9398oo.b(str, false))) {
            return e(str, parsePosition);
        }
        return c(str, parsePosition);
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this.f13114o;
        if (timeZone == null) {
            timeZone = g;
        }
        c(timeZone, this.n, date, stringBuffer);
        return stringBuffer;
    }

    protected void c(TimeZone timeZone, Locale locale, Date date, StringBuffer stringBuffer) {
        Calendar b2 = b(timeZone);
        b2.setTime(date);
        int i2 = b2.get(1);
        if (b2.get(0) == 0) {
            b(stringBuffer, i2);
        } else {
            if (i2 > 9999) {
                stringBuffer.append('+');
            }
            c(stringBuffer, i2);
        }
        stringBuffer.append('-');
        e(stringBuffer, b2.get(2) + 1);
        stringBuffer.append('-');
        e(stringBuffer, b2.get(5));
        stringBuffer.append('T');
        e(stringBuffer, b2.get(11));
        stringBuffer.append(':');
        e(stringBuffer, b2.get(12));
        stringBuffer.append(':');
        e(stringBuffer, b2.get(13));
        stringBuffer.append('.');
        d(stringBuffer, b2.get(14));
        int offset = timeZone.getOffset(b2.getTimeInMillis());
        if (offset == 0) {
            if (this.k) {
                stringBuffer.append("+00:00");
                return;
            } else {
                stringBuffer.append("+0000");
                return;
            }
        }
        int i3 = offset / 60000;
        int abs = Math.abs(i3 / 60);
        int abs2 = Math.abs(i3 % 60);
        stringBuffer.append(offset < 0 ? '-' : '+');
        e(stringBuffer, abs);
        if (this.k) {
            stringBuffer.append(':');
        }
        e(stringBuffer, abs2);
    }

    protected void b(StringBuffer stringBuffer, int i2) {
        if (i2 == 1) {
            stringBuffer.append("+0000");
            return;
        }
        stringBuffer.append('-');
        c(stringBuffer, i2 - 1);
    }

    private static void e(StringBuffer stringBuffer, int i2) {
        int i3 = i2 / 10;
        if (i3 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i3 + 48));
            i2 -= i3 * 10;
        }
        stringBuffer.append((char) (i2 + 48));
    }

    private static void d(StringBuffer stringBuffer, int i2) {
        int i3 = i2 / 100;
        if (i3 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i3 + 48));
            i2 -= i3 * 100;
        }
        e(stringBuffer, i2);
    }

    private static void c(StringBuffer stringBuffer, int i2) {
        int i3 = i2 / 100;
        if (i3 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i3 > 99) {
                stringBuffer.append(i3);
            } else {
                e(stringBuffer, i3);
            }
            i2 -= i3 * 100;
        }
        e(stringBuffer, i2);
    }

    public String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", getClass().getName(), this.f13114o, this.n, this.h);
    }

    public String d() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("[one of: '");
        sb.append("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        sb.append("', '");
        sb.append("EEE, dd MMM yyyy HH:mm:ss zzz");
        sb.append("' (");
        sb.append(Boolean.FALSE.equals(this.h) ? "strict" : "lenient");
        sb.append(")]");
        return sb.toString();
    }

    @Override // java.text.DateFormat
    public int hashCode() {
        return System.identityHashCode(this);
    }

    protected boolean e(String str) {
        return str.length() >= 7 && Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(3)) && str.charAt(4) == '-' && Character.isDigit(str.charAt(5));
    }

    private Date e(String str, ParsePosition parsePosition) {
        try {
            return new Date(C9398oo.e(str));
        } catch (NumberFormatException unused) {
            throw new ParseException(String.format("Timestamp value %s out of 64-bit value range", str), parsePosition.getErrorIndex());
        }
    }

    protected Date a(String str, ParsePosition parsePosition) {
        try {
            return d(str, parsePosition);
        } catch (IllegalArgumentException e2) {
            throw new ParseException(String.format("Cannot parse date \"%s\", problem: %s", str, e2.getMessage()), parsePosition.getErrorIndex());
        }
    }

    protected Date d(String str, ParsePosition parsePosition) {
        String str2;
        int length = str.length();
        TimeZone timeZone = g;
        if (this.f13114o != null && 'Z' != str.charAt(length - 1)) {
            timeZone = this.f13114o;
        }
        Calendar b2 = b(timeZone);
        b2.clear();
        int i2 = 0;
        if (length <= 10) {
            if (i.matcher(str).matches()) {
                b2.set(e(str, 0), c(str, 5) - 1, c(str, 8), 0, 0, 0);
                b2.set(14, 0);
                return b2.getTime();
            }
            str2 = "yyyy-MM-dd";
        } else {
            Matcher matcher = f.matcher(str);
            if (matcher.matches()) {
                int start = matcher.start(2);
                int end = matcher.end(2);
                int i3 = end - start;
                if (i3 > 1) {
                    int c2 = c(str, start + 1) * 3600;
                    if (i3 >= 5) {
                        c2 += c(str, end - 2) * 60;
                    }
                    b2.set(15, str.charAt(start) == '-' ? c2 * (-1000) : c2 * 1000);
                    b2.set(16, 0);
                }
                b2.set(e(str, 0), c(str, 5) - 1, c(str, 8), c(str, 11), c(str, 14), (length <= 16 || str.charAt(16) != ':') ? 0 : c(str, 17));
                int start2 = matcher.start(1);
                int i4 = start2 + 1;
                int end2 = matcher.end(1);
                if (i4 >= end2) {
                    b2.set(14, 0);
                } else {
                    int i5 = end2 - i4;
                    if (i5 != 0) {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3 && i5 > 9) {
                                    throw new ParseException(String.format("Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", str, matcher.group(1).substring(1)), i4);
                                }
                                i2 = str.charAt(start2 + 3) - '0';
                            }
                            i2 += (str.charAt(start2 + 2) - '0') * 10;
                        }
                        i2 += (str.charAt(i4) - '0') * 100;
                    }
                    b2.set(14, i2);
                }
                return b2.getTime();
            }
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
        }
        throw new ParseException(String.format("Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", str, str2, this.h), 0);
    }

    private static int e(String str, int i2) {
        return ((str.charAt(i2) - '0') * 1000) + ((str.charAt(i2 + 1) - '0') * 100) + ((str.charAt(i2 + 2) - '0') * 10) + (str.charAt(i2 + 3) - '0');
    }

    private static int c(String str, int i2) {
        return ((str.charAt(i2) - '0') * 10) + (str.charAt(i2 + 1) - '0');
    }

    protected Date c(String str, ParsePosition parsePosition) {
        if (this.m == null) {
            this.m = c(e, "EEE, dd MMM yyyy HH:mm:ss zzz", this.f13114o, this.n, this.h);
        }
        return this.m.parse(str, parsePosition);
    }

    private static final DateFormat c(DateFormat dateFormat, String str, TimeZone timeZone, Locale locale, Boolean bool) {
        DateFormat dateFormat2;
        if (!locale.equals(d)) {
            dateFormat2 = new SimpleDateFormat(str, locale);
            if (timeZone == null) {
                timeZone = g;
            }
            dateFormat2.setTimeZone(timeZone);
        } else {
            dateFormat2 = (DateFormat) dateFormat.clone();
            if (timeZone != null) {
                dateFormat2.setTimeZone(timeZone);
            }
        }
        if (bool != null) {
            dateFormat2.setLenient(bool.booleanValue());
        }
        return dateFormat2;
    }

    protected Calendar b(TimeZone timeZone) {
        Calendar calendar = this.l;
        if (calendar == null) {
            calendar = (Calendar) c.clone();
            this.l = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    protected static <T> boolean e(T t, T t2) {
        if (t == t2) {
            return true;
        }
        return t != null && t.equals(t2);
    }
}

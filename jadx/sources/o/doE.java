package o;

import j$.time.DateTimeException;
import j$.time.Period;
import j$.time.ZoneId;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.DateTimeParseException;
import j$.time.format.ResolverStyle;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.IsoFields;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes5.dex */
public final class doE {
    public static final doE a;
    public static final doE b;
    public static final doE c;
    public static final doE d;
    public static final doE e;
    public static final doE f;
    public static final doE g;
    public static final doE h;
    public static final doE i;
    public static final doE j;
    public static final doE k;
    public static final doE l;
    public static final doE m;
    public static final doE n;

    /* renamed from: o  reason: collision with root package name */
    public static final doE f13862o;
    private static final InterfaceC8537dpg p;
    private static final InterfaceC8537dpg t;
    private final InterfaceC8528doy q;
    private final Locale r;
    private final doO s;
    private final DateTimeFormatterBuilder.d u;
    private final Set w;
    private final ResolverStyle x;
    private final ZoneId y;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.B;
        SignStyle signStyle = SignStyle.EXCEEDS_PAD;
        DateTimeFormatterBuilder c2 = dateTimeFormatterBuilder.a(chronoField, 4, 10, signStyle).c('-');
        ChronoField chronoField2 = ChronoField.y;
        DateTimeFormatterBuilder c3 = c2.d(chronoField2, 2).c('-');
        ChronoField chronoField3 = ChronoField.h;
        DateTimeFormatterBuilder d2 = c3.d(chronoField3, 2);
        ResolverStyle resolverStyle = ResolverStyle.STRICT;
        IsoChronology isoChronology = IsoChronology.d;
        doE c4 = d2.c(resolverStyle, isoChronology);
        e = c4;
        h = new DateTimeFormatterBuilder().h().d(c4).c().c(resolverStyle, isoChronology);
        c = new DateTimeFormatterBuilder().h().d(c4).f().c().c(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.n;
        DateTimeFormatterBuilder c5 = dateTimeFormatterBuilder2.d(chronoField4, 2).c(':');
        ChronoField chronoField5 = ChronoField.v;
        DateTimeFormatterBuilder c6 = c5.d(chronoField5, 2).f().c(':');
        ChronoField chronoField6 = ChronoField.D;
        doE c7 = c6.d(chronoField6, 2).f().e(ChronoField.w, 0, 9, true).c(resolverStyle, (InterfaceC8528doy) null);
        g = c7;
        j = new DateTimeFormatterBuilder().h().d(c7).c().c(resolverStyle, (InterfaceC8528doy) null);
        l = new DateTimeFormatterBuilder().h().d(c7).f().c().c(resolverStyle, (InterfaceC8528doy) null);
        doE c8 = new DateTimeFormatterBuilder().h().d(c4).c('T').d(c7).c(resolverStyle, isoChronology);
        i = c8;
        doE c9 = new DateTimeFormatterBuilder().h().d(c8).g().c().i().c(resolverStyle, isoChronology);
        f = c9;
        m = new DateTimeFormatterBuilder().d(c9).f().c('[').j().a().c(']').c(resolverStyle, isoChronology);
        d = new DateTimeFormatterBuilder().d(c8).f().c().f().c('[').j().a().c(']').c(resolverStyle, isoChronology);
        n = new DateTimeFormatterBuilder().h().a(chronoField, 4, 10, signStyle).c('-').d(ChronoField.f, 3).f().c().c(resolverStyle, isoChronology);
        DateTimeFormatterBuilder c10 = new DateTimeFormatterBuilder().h().a(IsoFields.c, 4, 10, signStyle).b("-W").d(IsoFields.j, 2).c('-');
        ChronoField chronoField7 = ChronoField.j;
        k = c10.d(chronoField7, 1).f().c().c(resolverStyle, isoChronology);
        b = new DateTimeFormatterBuilder().h().e().c(resolverStyle, (InterfaceC8528doy) null);
        a = new DateTimeFormatterBuilder().h().d(chronoField, 4).d(chronoField2, 2).d(chronoField3, 2).f().g().a("+HHMMss", "Z").i().c(resolverStyle, isoChronology);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        f13862o = new DateTimeFormatterBuilder().h().g().f().b(chronoField7, hashMap).b(", ").d().a(chronoField3, 1, 2, SignStyle.NOT_NEGATIVE).c(' ').b(chronoField2, hashMap2).c(' ').d(chronoField, 4).c(' ').d(chronoField4, 2).c(':').d(chronoField5, 2).f().c(':').d(chronoField6, 2).d().c(' ').a("+HHMM", "GMT").c(ResolverStyle.SMART, isoChronology);
        t = new InterfaceC8537dpg() { // from class: o.doF
            @Override // o.InterfaceC8537dpg
            public final Object e(doY doy) {
                return doE.d(doy);
            }
        };
        p = new InterfaceC8537dpg() { // from class: o.doB
            @Override // o.InterfaceC8537dpg
            public final Object e(doY doy) {
                return doE.e(doy);
            }
        };
    }

    public doE(DateTimeFormatterBuilder.d dVar, Locale locale, doO doo, ResolverStyle resolverStyle, Set set, InterfaceC8528doy interfaceC8528doy, ZoneId zoneId) {
        Objects.requireNonNull(dVar, "printerParser");
        this.u = dVar;
        this.w = set;
        Objects.requireNonNull(locale, "locale");
        this.r = locale;
        Objects.requireNonNull(doo, "decimalStyle");
        this.s = doo;
        Objects.requireNonNull(resolverStyle, "resolverStyle");
        this.x = resolverStyle;
        this.q = interfaceC8528doy;
        this.y = zoneId;
    }

    private doY a(CharSequence charSequence, ParsePosition parsePosition) {
        String charSequence2;
        ParsePosition parsePosition2 = parsePosition != null ? parsePosition : new ParsePosition(0);
        doG b2 = b(charSequence, parsePosition2);
        if (b2 == null || parsePosition2.getErrorIndex() >= 0 || (parsePosition == null && parsePosition2.getIndex() < charSequence.length())) {
            if (charSequence.length() > 64) {
                charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                charSequence2 = charSequence.toString();
            }
            if (parsePosition2.getErrorIndex() >= 0) {
                throw new DateTimeParseException("Text '" + charSequence2 + "' could not be parsed at index " + parsePosition2.getErrorIndex(), charSequence, parsePosition2.getErrorIndex());
            }
            throw new DateTimeParseException("Text '" + charSequence2 + "' could not be parsed, unparsed text found at index " + parsePosition2.getIndex(), charSequence, parsePosition2.getIndex());
        }
        return b2.e(this.x, this.w);
    }

    private doG b(CharSequence charSequence, ParsePosition parsePosition) {
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(parsePosition, "position");
        doG dog = new doG(this);
        int c2 = this.u.c(dog, charSequence, parsePosition.getIndex());
        if (c2 < 0) {
            parsePosition.setErrorIndex(~c2);
            return null;
        }
        parsePosition.setIndex(c2);
        return dog;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Period d(doY doy) {
        return doy instanceof doN ? ((doN) doy).e : Period.e;
    }

    private DateTimeParseException d(CharSequence charSequence, RuntimeException runtimeException) {
        String charSequence2;
        if (charSequence.length() > 64) {
            charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            charSequence2 = charSequence.toString();
        }
        return new DateTimeParseException("Text '" + charSequence2 + "' could not be parsed: " + runtimeException.getMessage(), charSequence, 0, runtimeException);
    }

    public static doE d(String str) {
        return new DateTimeFormatterBuilder().a(str).n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Boolean e(doY doy) {
        return doy instanceof doN ? Boolean.valueOf(((doN) doy).c) : Boolean.FALSE;
    }

    public <T> T a(CharSequence charSequence, InterfaceC8537dpg<T> interfaceC8537dpg) {
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(interfaceC8537dpg, "query");
        try {
            return (T) a(charSequence, (ParsePosition) null).b(interfaceC8537dpg);
        } catch (DateTimeParseException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw d(charSequence, e3);
        }
    }

    public doE a(ZoneId zoneId) {
        return Objects.equals(this.y, zoneId) ? this : new doE(this.u, this.r, this.s, this.x, this.w, this.q, zoneId);
    }

    public void a(doY doy, Appendable appendable) {
        Objects.requireNonNull(doy, "temporal");
        Objects.requireNonNull(appendable, "appendable");
        try {
            doL dol = new doL(doy, this);
            if (appendable instanceof StringBuilder) {
                this.u.c(dol, (StringBuilder) appendable);
                return;
            }
            StringBuilder sb = new StringBuilder(32);
            this.u.c(dol, sb);
            appendable.append(sb);
        } catch (IOException e2) {
            throw new DateTimeException(e2.getMessage(), e2);
        }
    }

    public String b(doY doy) {
        StringBuilder sb = new StringBuilder(32);
        a(doy, sb);
        return sb.toString();
    }

    public InterfaceC8528doy b() {
        return this.q;
    }

    public doO c() {
        return this.s;
    }

    public ZoneId d() {
        return this.y;
    }

    public DateTimeFormatterBuilder.d d(boolean z) {
        return this.u.c(z);
    }

    public Locale e() {
        return this.r;
    }

    public String toString() {
        String dVar = this.u.toString();
        return dVar.startsWith("[") ? dVar : dVar.substring(1, dVar.length() - 1);
    }
}

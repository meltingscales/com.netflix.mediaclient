package j$.time.format;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.IsoFields;
import j$.time.temporal.JulianFields;
import j$.time.temporal.ValueRange;
import j$.time.temporal.WeekFields;
import java.lang.ref.SoftReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormatSymbols;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import o.AbstractC8524dou;
import o.AbstractC8538dph;
import o.AbstractC8539dpi;
import o.InterfaceC8526dow;
import o.InterfaceC8528doy;
import o.InterfaceC8535dpe;
import o.InterfaceC8537dpg;
import o.doC;
import o.doE;
import o.doG;
import o.doL;
import o.doM;
import o.doO;
import o.doU;
import o.doY;

/* loaded from: classes5.dex */
public final class DateTimeFormatterBuilder {
    static final Comparator b;
    private static final Map d;
    private static final InterfaceC8537dpg e = new InterfaceC8537dpg() { // from class: o.doD
        @Override // o.InterfaceC8537dpg
        public final Object e(doY doy) {
            return DateTimeFormatterBuilder.b(doy);
        }
    };
    private final boolean a;
    private DateTimeFormatterBuilder c;
    private final DateTimeFormatterBuilder f;
    private char g;
    private int h;
    private int i;
    private final List j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.format.DateTimeFormatterBuilder$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static abstract /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[SignStyle.values().length];
            c = iArr;
            try {
                iArr[SignStyle.EXCEEDS_PAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[SignStyle.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[SignStyle.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[SignStyle.NOT_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum SettingsParser implements c {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public int c(doG dog, CharSequence charSequence, int i) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                dog.c(true);
            } else if (ordinal == 1) {
                dog.c(false);
            } else if (ordinal == 2) {
                dog.b(true);
            } else if (ordinal == 3) {
                dog.b(false);
            }
            return i;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public boolean c(doL dol, StringBuilder sb) {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            return "ParseStrict(false)";
                        }
                        throw new IllegalStateException("Unreachable");
                    }
                    return "ParseStrict(true)";
                }
                return "ParseCaseSensitive(false)";
            }
            return "ParseCaseSensitive(true)";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a implements c {
        private final int e;

        a(int i) {
            this.e = i;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public int c(doG dog, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int i4 = this.e;
            int i5 = 0;
            int i6 = i4 < 0 ? 0 : i4;
            if (i4 < 0) {
                i4 = 9;
            }
            DateTimeFormatterBuilder c = new DateTimeFormatterBuilder().d(doE.e).c('T');
            ChronoField chronoField = ChronoField.n;
            DateTimeFormatterBuilder c2 = c.d(chronoField, 2).c(':');
            ChronoField chronoField2 = ChronoField.v;
            DateTimeFormatterBuilder c3 = c2.d(chronoField2, 2).c(':');
            ChronoField chronoField3 = ChronoField.D;
            DateTimeFormatterBuilder d = c3.d(chronoField3, 2);
            ChronoField chronoField4 = ChronoField.w;
            d d2 = d.e(chronoField4, i6, i4, true).c('Z').n().d(false);
            doG b = dog.b();
            int c4 = d2.c(b, charSequence, i);
            if (c4 < 0) {
                return c4;
            }
            long longValue = b.b(ChronoField.B).longValue();
            int intValue = b.b(ChronoField.y).intValue();
            int intValue2 = b.b(ChronoField.h).intValue();
            int intValue3 = b.b(chronoField).intValue();
            int intValue4 = b.b(chronoField2).intValue();
            Long b2 = b.b(chronoField3);
            Long b3 = b.b(chronoField4);
            int intValue5 = b2 != null ? b2.intValue() : 0;
            int intValue6 = b3 != null ? b3.intValue() : 0;
            if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
                i2 = 0;
                i3 = intValue5;
                i5 = 1;
            } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
                dog.g();
                i2 = intValue3;
                i3 = 59;
            } else {
                i2 = intValue3;
                i3 = intValue5;
            }
            try {
                return dog.e(chronoField4, intValue6, i, dog.e(ChronoField.l, Math.multiplyExact(longValue / 10000, 315569520000L) + LocalDateTime.e(((int) longValue) % 10000, intValue, intValue2, i2, intValue4, i3, 0).e(i5).b(ZoneOffset.e), i, c4));
            } catch (RuntimeException unused) {
                return ~i;
            }
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public boolean c(doL dol, StringBuilder sb) {
            Long a = dol.a(ChronoField.l);
            doY c = dol.c();
            ChronoField chronoField = ChronoField.w;
            Long valueOf = c.e(chronoField) ? Long.valueOf(dol.c().a(chronoField)) : null;
            int i = 0;
            if (a == null) {
                return false;
            }
            long longValue = a.longValue();
            int b = chronoField.b(valueOf != null ? valueOf.longValue() : 0L);
            if (longValue >= -62167219200L) {
                long j = longValue - 253402300800L;
                long floorDiv = 1 + Math.floorDiv(j, 315569520000L);
                LocalDateTime d = LocalDateTime.d(Math.floorMod(j, 315569520000L) - 62167219200L, 0, ZoneOffset.e);
                if (floorDiv > 0) {
                    sb.append('+');
                    sb.append(floorDiv);
                }
                sb.append(d);
                if (d.c() == 0) {
                    sb.append(":00");
                }
            } else {
                long j2 = longValue + 62167219200L;
                long j3 = j2 / 315569520000L;
                long j4 = j2 % 315569520000L;
                LocalDateTime d2 = LocalDateTime.d(j4 - 62167219200L, 0, ZoneOffset.e);
                int length = sb.length();
                sb.append(d2);
                if (d2.c() == 0) {
                    sb.append(":00");
                }
                if (j3 < 0) {
                    if (d2.e() == -10000) {
                        sb.replace(length, length + 2, Long.toString(j3 - 1));
                    } else if (j4 == 0) {
                        sb.insert(length, j3);
                    } else {
                        sb.insert(length + 1, Math.abs(j3));
                    }
                }
            }
            int i2 = this.e;
            if ((i2 < 0 && b > 0) || i2 > 0) {
                sb.append('.');
                int i3 = 100000000;
                while (true) {
                    int i4 = this.e;
                    if ((i4 != -1 || b <= 0) && ((i4 != -2 || (b <= 0 && i % 3 == 0)) && i >= i4)) {
                        break;
                    }
                    int i5 = b / i3;
                    sb.append((char) (i5 + 48));
                    b -= i5 * i3;
                    i3 /= 10;
                    i++;
                }
            }
            sb.append('Z');
            return true;
        }

        public String toString() {
            return "Instant()";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b implements c {
        private final char c;

        b(char c) {
            this.c = c;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public int c(doG dog, CharSequence charSequence, int i) {
            if (i == charSequence.length()) {
                return ~i;
            }
            char charAt = charSequence.charAt(i);
            return (charAt == this.c || (!dog.d() && (Character.toUpperCase(charAt) == Character.toUpperCase(this.c) || Character.toLowerCase(charAt) == Character.toLowerCase(this.c)))) ? i + 1 : ~i;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public boolean c(doL dol, StringBuilder sb) {
            sb.append(this.c);
            return true;
        }

        public String toString() {
            char c = this.c;
            if (c == '\'') {
                return "''";
            }
            return "'" + c + "'";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface c {
        int c(doG dog, CharSequence charSequence, int i);

        boolean c(doL dol, StringBuilder sb);
    }

    /* loaded from: classes5.dex */
    public static final class d implements c {
        private final boolean b;
        private final c[] e;

        d(List list, boolean z) {
            this((c[]) list.toArray(new c[list.size()]), z);
        }

        d(c[] cVarArr, boolean z) {
            this.e = cVarArr;
            this.b = z;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public int c(doG dog, CharSequence charSequence, int i) {
            if (!this.b) {
                for (c cVar : this.e) {
                    i = cVar.c(dog, charSequence, i);
                    if (i < 0) {
                        break;
                    }
                }
                return i;
            }
            dog.h();
            int i2 = i;
            for (c cVar2 : this.e) {
                i2 = cVar2.c(dog, charSequence, i2);
                if (i2 < 0) {
                    dog.e(false);
                    return i;
                }
            }
            dog.e(true);
            return i2;
        }

        public d c(boolean z) {
            return z == this.b ? this : new d(this.e, z);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public boolean c(doL dol, StringBuilder sb) {
            int length = sb.length();
            if (this.b) {
                dol.a();
            }
            try {
                for (c cVar : this.e) {
                    if (!cVar.c(dol, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.b) {
                    dol.e();
                }
                return true;
            } finally {
                if (this.b) {
                    dol.e();
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.e != null) {
                sb.append(this.b ? "[" : "(");
                for (c cVar : this.e) {
                    sb.append(cVar);
                }
                sb.append(this.b ? "]" : ")");
            }
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends j {
        private final boolean j;

        e(InterfaceC8535dpe interfaceC8535dpe, int i, int i2, boolean z) {
            this(interfaceC8535dpe, i, i2, z, 0);
            Objects.requireNonNull(interfaceC8535dpe, "field");
            if (!interfaceC8535dpe.a().b()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + interfaceC8535dpe);
            } else if (i < 0 || i > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
            } else if (i2 < 1 || i2 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
            } else if (i2 >= i) {
            } else {
                throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
            }
        }

        e(InterfaceC8535dpe interfaceC8535dpe, int i, int i2, boolean z, int i3) {
            super(interfaceC8535dpe, i, i2, SignStyle.NOT_NEGATIVE, i3);
            this.j = z;
        }

        private BigDecimal b(long j) {
            ValueRange a = this.a.a();
            a.c(j, this.a);
            BigDecimal valueOf = BigDecimal.valueOf(a.d());
            BigDecimal divide = BigDecimal.valueOf(j).subtract(valueOf).divide(BigDecimal.valueOf(a.e()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            return divide.compareTo(bigDecimal) == 0 ? bigDecimal : divide.stripTrailingZeros();
        }

        private long c(BigDecimal bigDecimal) {
            ValueRange a = this.a.a();
            BigDecimal valueOf = BigDecimal.valueOf(a.d());
            return bigDecimal.multiply(BigDecimal.valueOf(a.e()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.j
        /* renamed from: a */
        public e e() {
            return this.e == -1 ? this : new e(this.a, this.c, this.d, this.j, -1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.j
        /* renamed from: b */
        public e e(int i) {
            return new e(this.a, this.c, this.d, this.j, this.e + i);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.j
        boolean b(doG dog) {
            return dog.i() && this.c == this.d && !this.j;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.j, j$.time.format.DateTimeFormatterBuilder.c
        public int c(doG dog, CharSequence charSequence, int i) {
            int i2 = 0;
            int i3 = (dog.i() || b(dog)) ? this.c : 0;
            int i4 = (dog.i() || b(dog)) ? this.d : 9;
            int length = charSequence.length();
            if (i == length) {
                return i3 > 0 ? ~i : i;
            }
            if (this.j) {
                if (charSequence.charAt(i) != dog.c().b()) {
                    return i3 > 0 ? ~i : i;
                }
                i++;
            }
            int i5 = i;
            int i6 = i3 + i5;
            if (i6 > length) {
                return ~i5;
            }
            int min = Math.min(i4 + i5, length);
            int i7 = i5;
            while (true) {
                if (i7 >= min) {
                    break;
                }
                int i8 = i7 + 1;
                int c = dog.c().c(charSequence.charAt(i7));
                if (c >= 0) {
                    i2 = (i2 * 10) + c;
                    i7 = i8;
                } else if (i8 < i6) {
                    return ~i5;
                }
            }
            return dog.e(this.a, c(new BigDecimal(i2).movePointLeft(i7 - i5)), i5, i7);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.j, j$.time.format.DateTimeFormatterBuilder.c
        public boolean c(doL dol, StringBuilder sb) {
            Long a = dol.a(this.a);
            if (a == null) {
                return false;
            }
            doO b = dol.b();
            BigDecimal b2 = b(a.longValue());
            if (b2.scale() != 0) {
                String e = b.e(b2.setScale(Math.min(Math.max(b2.scale(), this.c), this.d), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.j) {
                    sb.append(b.b());
                }
                sb.append(e);
                return true;
            } else if (this.c > 0) {
                if (this.j) {
                    sb.append(b.b());
                }
                for (int i = 0; i < this.c; i++) {
                    sb.append(b.e());
                }
                return true;
            } else {
                return true;
            }
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.j
        public String toString() {
            String str = this.j ? ",DecimalPoint" : "";
            InterfaceC8535dpe interfaceC8535dpe = this.a;
            int i = this.c;
            int i2 = this.d;
            return "Fraction(" + interfaceC8535dpe + "," + i + "," + i2 + str + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class f {
        protected char a;
        protected String b;
        protected f c;
        protected String d;
        protected f e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static class b extends f {
            private b(String str, String str2, f fVar) {
                super(str, str2, fVar);
            }

            @Override // j$.time.format.DateTimeFormatterBuilder.f
            protected boolean d(char c, char c2) {
                return doG.d(c, c2);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // j$.time.format.DateTimeFormatterBuilder.f
            /* renamed from: e */
            public b c(String str, String str2, f fVar) {
                return new b(str, str2, fVar);
            }

            @Override // j$.time.format.DateTimeFormatterBuilder.f
            protected boolean e(CharSequence charSequence, int i, int i2) {
                int length = this.b.length();
                if (length > i2 - i) {
                    return false;
                }
                int i3 = 0;
                while (length > 0) {
                    if (!d(this.b.charAt(i3), charSequence.charAt(i))) {
                        return false;
                    }
                    i++;
                    length--;
                    i3++;
                }
                return true;
            }
        }

        private f(String str, String str2, f fVar) {
            this.b = str;
            this.d = str2;
            this.c = fVar;
            this.a = str.isEmpty() ? (char) 65535 : this.b.charAt(0);
        }

        private boolean a(String str, String str2) {
            String d = d(str);
            int b2 = b(d);
            if (b2 != this.b.length()) {
                f c = c(this.b.substring(b2), this.d, this.c);
                this.b = d.substring(0, b2);
                this.c = c;
                if (b2 < d.length()) {
                    this.c.e = c(d.substring(b2), str2, null);
                    this.d = null;
                } else {
                    this.d = str2;
                }
                return true;
            } else if (b2 >= d.length()) {
                this.d = str2;
                return true;
            } else {
                String substring = d.substring(b2);
                for (f fVar = this.c; fVar != null; fVar = fVar.e) {
                    if (d(fVar.a, substring.charAt(0))) {
                        return fVar.a(substring, str2);
                    }
                }
                f c2 = c(substring, str2, null);
                c2.e = this.c;
                this.c = c2;
                return true;
            }
        }

        private int b(String str) {
            int i = 0;
            while (i < str.length() && i < this.b.length() && d(str.charAt(i), this.b.charAt(i))) {
                i++;
            }
            return i;
        }

        public static f c(Set set, doG dog) {
            f e = e(dog);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                e.a(str, str);
            }
            return e;
        }

        public static f e(doG dog) {
            return dog.d() ? new f("", null, null) : new b("", null, null);
        }

        public boolean b(String str, String str2) {
            return a(str, str2);
        }

        protected f c(String str, String str2, f fVar) {
            return new f(str, str2, fVar);
        }

        public String c(CharSequence charSequence, ParsePosition parsePosition) {
            int index = parsePosition.getIndex();
            int length = charSequence.length();
            if (e(charSequence, index, length)) {
                int length2 = index + this.b.length();
                f fVar = this.c;
                if (fVar != null && length2 != length) {
                    while (true) {
                        if (!d(fVar.a, charSequence.charAt(length2))) {
                            fVar = fVar.e;
                            if (fVar == null) {
                                break;
                            }
                        } else {
                            parsePosition.setIndex(length2);
                            String c = fVar.c(charSequence, parsePosition);
                            if (c != null) {
                                return c;
                            }
                        }
                    }
                }
                parsePosition.setIndex(length2);
                return this.d;
            }
            return null;
        }

        protected String d(String str) {
            return str;
        }

        protected boolean d(char c, char c2) {
            return c == c2;
        }

        protected boolean e(CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof String) {
                return ((String) charSequence).startsWith(this.b, i);
            }
            int length = this.b.length();
            if (length > i2 - i) {
                return false;
            }
            int i3 = 0;
            while (length > 0) {
                if (!d(this.b.charAt(i3), charSequence.charAt(i))) {
                    return false;
                }
                i++;
                length--;
                i3++;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g implements c {
        private final c a;
        private final char b;
        private final int e;

        g(c cVar, int i, char c) {
            this.a = cVar;
            this.e = i;
            this.b = c;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public int c(doG dog, CharSequence charSequence, int i) {
            boolean i2 = dog.i();
            if (i <= charSequence.length()) {
                if (i == charSequence.length()) {
                    return ~i;
                }
                int i3 = this.e + i;
                if (i3 > charSequence.length()) {
                    if (i2) {
                        return ~i;
                    }
                    i3 = charSequence.length();
                }
                int i4 = i;
                while (i4 < i3 && dog.b(charSequence.charAt(i4), this.b)) {
                    i4++;
                }
                int c = this.a.c(dog, charSequence.subSequence(0, i3), i4);
                return (c == i3 || !i2) ? c : ~(i + i4);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public boolean c(doL dol, StringBuilder sb) {
            int length = sb.length();
            if (this.a.c(dol, sb)) {
                int length2 = sb.length() - length;
                int i = this.e;
                if (length2 <= i) {
                    for (int i2 = 0; i2 < this.e - length2; i2++) {
                        sb.insert(length, this.b);
                    }
                    return true;
                }
                throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
            }
            return false;
        }

        public String toString() {
            String str;
            c cVar = this.a;
            int i = this.e;
            char c = this.b;
            if (c == ' ') {
                str = ")";
            } else {
                str = ",'" + c + "')";
            }
            return "Pad(" + cVar + "," + i + str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h implements c {
        private final TextStyle d;

        h(TextStyle textStyle) {
            this.d = textStyle;
        }

        private static StringBuilder e(StringBuilder sb, int i) {
            sb.append((char) ((i / 10) + 48));
            sb.append((char) ((i % 10) + 48));
            return sb;
        }

        int a(CharSequence charSequence, int i) {
            char charAt = charSequence.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return -1;
            }
            return charAt - '0';
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public int c(doG dog, CharSequence charSequence, int i) {
            int i2;
            int a;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int length = charSequence.length();
            if (dog.d(charSequence, i, "GMT", 0, 3)) {
                int i8 = i + 3;
                if (i8 == length) {
                    return dog.e(ChronoField.u, 0L, i, i8);
                }
                char charAt = charSequence.charAt(i8);
                if (charAt == '+') {
                    i2 = 1;
                } else if (charAt != '-') {
                    return dog.e(ChronoField.u, 0L, i, i8);
                } else {
                    i2 = -1;
                }
                int i9 = i + 4;
                int i10 = 0;
                if (this.d != TextStyle.FULL) {
                    int i11 = i + 5;
                    a = a(charSequence, i9);
                    if (a < 0) {
                        return ~i;
                    }
                    if (i11 < length) {
                        int a2 = a(charSequence, i11);
                        if (a2 >= 0) {
                            a = (a * 10) + a2;
                            i11 = i + 6;
                        }
                        int i12 = i11 + 2;
                        if (i12 < length && charSequence.charAt(i11) == ':' && i12 < length && charSequence.charAt(i11) == ':') {
                            int a3 = a(charSequence, i11 + 1);
                            int a4 = a(charSequence, i12);
                            if (a3 >= 0 && a4 >= 0) {
                                int i13 = a4 + (a3 * 10);
                                i5 = i11 + 3;
                                int i14 = i11 + 5;
                                if (i14 < length && charSequence.charAt(i5) == ':') {
                                    int a5 = a(charSequence, i11 + 4);
                                    int a6 = a(charSequence, i14);
                                    if (a5 >= 0 && a6 >= 0) {
                                        i10 = (a5 * 10) + a6;
                                        int i15 = i11 + 6;
                                        i6 = i13;
                                        i7 = i15;
                                    }
                                }
                                i6 = i13;
                                i4 = i10;
                                i3 = i5;
                                i10 = i6;
                                return dog.e(ChronoField.u, i2 * ((a * 3600) + (i10 * 60) + i4), i, i3);
                            }
                        }
                    }
                    i3 = i11;
                    i4 = 0;
                    return dog.e(ChronoField.u, i2 * ((a * 3600) + (i10 * 60) + i4), i, i3);
                }
                int a7 = a(charSequence, i9);
                int a8 = a(charSequence, i + 5);
                if (a7 < 0 || a8 < 0 || charSequence.charAt(i + 6) != ':') {
                    return ~i;
                }
                a = (a7 * 10) + a8;
                int a9 = a(charSequence, i + 7);
                i7 = i + 9;
                int a10 = a(charSequence, i + 8);
                if (a9 < 0 || a10 < 0) {
                    return ~i;
                }
                i6 = (a9 * 10) + a10;
                int i16 = i + 11;
                if (i16 < length && charSequence.charAt(i7) == ':') {
                    int a11 = a(charSequence, i + 10);
                    int a12 = a(charSequence, i16);
                    if (a11 >= 0 && a12 >= 0) {
                        i10 = (a11 * 10) + a12;
                        i7 = i + 12;
                    }
                }
                i5 = i7;
                i4 = i10;
                i3 = i5;
                i10 = i6;
                return dog.e(ChronoField.u, i2 * ((a * 3600) + (i10 * 60) + i4), i, i3);
            }
            return ~i;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public boolean c(doL dol, StringBuilder sb) {
            Long a = dol.a(ChronoField.u);
            if (a == null) {
                return false;
            }
            sb.append("GMT");
            int intExact = Math.toIntExact(a.longValue());
            if (intExact != 0) {
                int abs = Math.abs((intExact / 3600) % 100);
                int abs2 = Math.abs((intExact / 60) % 60);
                int abs3 = Math.abs(intExact % 60);
                sb.append(intExact < 0 ? "-" : "+");
                if (this.d == TextStyle.FULL) {
                    e(sb, abs);
                    sb.append(':');
                    e(sb, abs2);
                    if (abs3 == 0) {
                        return true;
                    }
                } else {
                    if (abs >= 10) {
                        sb.append((char) ((abs / 10) + 48));
                    }
                    sb.append((char) ((abs % 10) + 48));
                    if (abs2 == 0 && abs3 == 0) {
                        return true;
                    }
                    sb.append(':');
                    e(sb, abs2);
                    if (abs3 == 0) {
                        return true;
                    }
                }
                sb.append(':');
                e(sb, abs3);
                return true;
            }
            return true;
        }

        public String toString() {
            TextStyle textStyle = this.d;
            return "LocalizedOffset(" + textStyle + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class i implements c {
        private final int c;
        private final String d;
        private final int h;
        static final String[] b = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
        static final i e = new i("+HH:MM:ss", "Z");
        static final i a = new i("+HH:MM:ss", "0");

        i(String str, String str2) {
            Objects.requireNonNull(str, "pattern");
            Objects.requireNonNull(str2, "noOffsetText");
            int c = c(str);
            this.h = c;
            this.c = c % 11;
            this.d = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
            r13[0] = ~r13[0];
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void a(java.lang.CharSequence r10, int r11, int r12, int[] r13) {
            /*
                Method dump skipped, instructions count: 196
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.i.a(java.lang.CharSequence, int, int, int[]):void");
        }

        private void a(CharSequence charSequence, boolean z, boolean z2, int[] iArr) {
            if (a(charSequence, z, 3, iArr) || !z2) {
                return;
            }
            iArr[0] = ~iArr[0];
        }

        private void a(CharSequence charSequence, boolean z, int[] iArr) {
            if (!z) {
                a(charSequence, 1, 2, iArr);
            } else if (a(charSequence, false, 1, iArr)) {
            } else {
                iArr[0] = ~iArr[0];
            }
        }

        private boolean a(CharSequence charSequence, boolean z, int i, int[] iArr) {
            int i2;
            int i3 = iArr[0];
            if (i3 < 0) {
                return true;
            }
            if (z && i != 1) {
                int i4 = i3 + 1;
                if (i4 > charSequence.length() || charSequence.charAt(i3) != ':') {
                    return false;
                }
                i3 = i4;
            }
            int i5 = i3 + 2;
            if (i5 > charSequence.length()) {
                return false;
            }
            char charAt = charSequence.charAt(i3);
            char charAt2 = charSequence.charAt(i3 + 1);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || (i2 = ((charAt - '0') * 10) + (charAt2 - '0')) < 0 || i2 > 59) {
                return false;
            }
            iArr[i] = i2;
            iArr[0] = i5;
            return true;
        }

        private void b(CharSequence charSequence, boolean z, boolean z2, int[] iArr) {
            if (a(charSequence, z, 2, iArr) || !z2) {
                return;
            }
            iArr[0] = ~iArr[0];
        }

        private int c(String str) {
            int i = 0;
            while (true) {
                String[] strArr = b;
                if (i >= strArr.length) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
                } else if (strArr[i].equals(str)) {
                    return i;
                } else {
                    i++;
                }
            }
        }

        private boolean c() {
            int i = this.c;
            return i > 0 && i % 2 == 0;
        }

        private void d(CharSequence charSequence, boolean z, int[] iArr) {
            if (a(charSequence, z, 2, iArr)) {
                a(charSequence, z, 3, iArr);
            }
        }

        private void e(boolean z, int i, StringBuilder sb) {
            sb.append(z ? ":" : "");
            sb.append((char) ((i / 10) + 48));
            sb.append((char) ((i % 10) + 48));
        }

        private boolean e() {
            return this.h < 11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
            if (r19 == r9) goto L65;
         */
        @Override // j$.time.format.DateTimeFormatterBuilder.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int c(o.doG r17, java.lang.CharSequence r18, int r19) {
            /*
                Method dump skipped, instructions count: 338
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.i.c(o.doG, java.lang.CharSequence, int):int");
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public boolean c(doL dol, StringBuilder sb) {
            Long a2 = dol.a(ChronoField.u);
            if (a2 == null) {
                return false;
            }
            int intExact = Math.toIntExact(a2.longValue());
            if (intExact != 0) {
                int abs = Math.abs((intExact / 3600) % 100);
                int abs2 = Math.abs((intExact / 60) % 60);
                int abs3 = Math.abs(intExact % 60);
                int length = sb.length();
                sb.append(intExact < 0 ? "-" : "+");
                if (e() || abs >= 10) {
                    e(false, abs, sb);
                } else {
                    sb.append((char) (abs + 48));
                }
                int i = this.c;
                if ((i >= 3 && i <= 8) || ((i >= 9 && abs3 > 0) || (i >= 1 && abs2 > 0))) {
                    e(c(), abs2, sb);
                    abs += abs2;
                    int i2 = this.c;
                    if (i2 == 7 || i2 == 8 || (i2 >= 5 && abs3 > 0)) {
                        e(c(), abs3, sb);
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                }
                return true;
            }
            sb.append(this.d);
            return true;
        }

        public String toString() {
            String replace = this.d.replace("'", "''");
            String str = b[this.h];
            return "Offset(" + str + ",'" + replace + "')";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class j implements c {
        static final long[] b = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
        final InterfaceC8535dpe a;
        final int c;
        final int d;
        final int e;
        private final SignStyle f;

        j(InterfaceC8535dpe interfaceC8535dpe, int i, int i2, SignStyle signStyle) {
            this.a = interfaceC8535dpe;
            this.c = i;
            this.d = i2;
            this.f = signStyle;
            this.e = 0;
        }

        protected j(InterfaceC8535dpe interfaceC8535dpe, int i, int i2, SignStyle signStyle, int i3) {
            this.a = interfaceC8535dpe;
            this.c = i;
            this.d = i2;
            this.f = signStyle;
            this.e = i3;
        }

        boolean b(doG dog) {
            int i = this.e;
            return i == -1 || (i > 0 && this.c == this.d && this.f == SignStyle.NOT_NEGATIVE);
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x017a  */
        @Override // j$.time.format.DateTimeFormatterBuilder.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int c(o.doG r18, java.lang.CharSequence r19, int r20) {
            /*
                Method dump skipped, instructions count: 388
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.j.c(o.doG, java.lang.CharSequence, int):int");
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00a8 A[LOOP:0: B:34:0x009f->B:36:0x00a8, LOOP_END] */
        @Override // j$.time.format.DateTimeFormatterBuilder.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean c(o.doL r11, java.lang.StringBuilder r12) {
            /*
                r10 = this;
                o.dpe r0 = r10.a
                java.lang.Long r0 = r11.a(r0)
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                long r2 = r0.longValue()
                long r2 = r10.d(r11, r2)
                o.doO r11 = r11.b()
                r4 = -9223372036854775808
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1f
                java.lang.String r0 = "9223372036854775808"
                goto L27
            L1f:
                long r4 = java.lang.Math.abs(r2)
                java.lang.String r0 = java.lang.Long.toString(r4)
            L27:
                int r4 = r0.length()
                int r5 = r10.d
                java.lang.String r6 = " cannot be printed as the value "
                java.lang.String r7 = "Field "
                if (r4 > r5) goto Lb6
                java.lang.String r0 = r11.e(r0)
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r5 = 2
                r8 = 1
                if (r4 < 0) goto L61
                int[] r4 = j$.time.format.DateTimeFormatterBuilder.AnonymousClass5.c
                j$.time.format.SignStyle r6 = r10.f
                int r6 = r6.ordinal()
                r4 = r4[r6]
                if (r4 == r8) goto L4e
                if (r4 == r5) goto L5c
                goto L9f
            L4e:
                int r4 = r10.c
                r5 = 19
                if (r4 >= r5) goto L9f
                long[] r5 = j$.time.format.DateTimeFormatterBuilder.j.b
                r4 = r5[r4]
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L9f
            L5c:
                char r2 = r11.c()
                goto L9c
            L61:
                int[] r4 = j$.time.format.DateTimeFormatterBuilder.AnonymousClass5.c
                j$.time.format.SignStyle r9 = r10.f
                int r9 = r9.ordinal()
                r4 = r4[r9]
                if (r4 == r8) goto L98
                if (r4 == r5) goto L98
                r5 = 3
                if (r4 == r5) goto L98
                r5 = 4
                if (r4 == r5) goto L76
                goto L9f
            L76:
                o.dpe r11 = r10.a
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r7)
                r12.append(r11)
                r12.append(r6)
                r12.append(r2)
                java.lang.String r11 = " cannot be negative according to the SignStyle"
                r12.append(r11)
                j$.time.DateTimeException r11 = new j$.time.DateTimeException
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                throw r11
            L98:
                char r2 = r11.d()
            L9c:
                r12.append(r2)
            L9f:
                int r2 = r10.c
                int r3 = r0.length()
                int r2 = r2 - r3
                if (r1 >= r2) goto Lb2
                char r2 = r11.e()
                r12.append(r2)
                int r1 = r1 + 1
                goto L9f
            Lb2:
                r12.append(r0)
                return r8
            Lb6:
                o.dpe r11 = r10.a
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r7)
                r12.append(r11)
                r12.append(r6)
                r12.append(r2)
                java.lang.String r11 = " exceeds the maximum print width of "
                r12.append(r11)
                r12.append(r5)
                j$.time.DateTimeException r11 = new j$.time.DateTimeException
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.j.c(o.doL, java.lang.StringBuilder):boolean");
        }

        int d(doG dog, long j, int i, int i2) {
            return dog.e(this.a, j, i, i2);
        }

        long d(doL dol, long j) {
            return j;
        }

        j e() {
            return this.e == -1 ? this : new j(this.a, this.c, this.d, this.f, -1);
        }

        j e(int i) {
            return new j(this.a, this.c, this.d, this.f, this.e + i);
        }

        public String toString() {
            int i = this.c;
            if (i == 1 && this.d == 19 && this.f == SignStyle.NORMAL) {
                InterfaceC8535dpe interfaceC8535dpe = this.a;
                return "Value(" + interfaceC8535dpe + ")";
            }
            int i2 = this.d;
            if (i == i2 && this.f == SignStyle.NOT_NEGATIVE) {
                InterfaceC8535dpe interfaceC8535dpe2 = this.a;
                return "Value(" + interfaceC8535dpe2 + "," + i + ")";
            }
            InterfaceC8535dpe interfaceC8535dpe3 = this.a;
            SignStyle signStyle = this.f;
            return "Value(" + interfaceC8535dpe3 + "," + i + "," + i2 + "," + signStyle + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class k implements c {
        private static volatile Map.Entry b;
        private static volatile Map.Entry c;
        private final String a;
        private final InterfaceC8537dpg d;

        k(InterfaceC8537dpg interfaceC8537dpg, String str) {
            this.d = interfaceC8537dpg;
            this.a = str;
        }

        private int b(doG dog, CharSequence charSequence, int i, int i2, i iVar) {
            String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
            if (i2 >= charSequence.length() || charSequence.charAt(i2) == '0' || dog.b(charSequence.charAt(i2), 'Z')) {
                dog.a(ZoneId.d(upperCase));
                return i2;
            }
            doG b2 = dog.b();
            int c2 = iVar.c(b2, charSequence, i2);
            try {
                if (c2 >= 0) {
                    dog.a(ZoneId.d(upperCase, ZoneOffset.e((int) b2.b(ChronoField.u).longValue())));
                    return c2;
                } else if (iVar == i.e) {
                    return ~i;
                } else {
                    dog.a(ZoneId.d(upperCase));
                    return i2;
                }
            } catch (DateTimeException unused) {
                return ~i;
            }
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public int c(doG dog, CharSequence charSequence, int i) {
            int i2;
            int length = charSequence.length();
            if (i <= length) {
                if (i == length) {
                    return ~i;
                }
                char charAt = charSequence.charAt(i);
                if (charAt == '+' || charAt == '-') {
                    return b(dog, charSequence, i, i, i.e);
                }
                int i3 = i + 2;
                if (length >= i3) {
                    char charAt2 = charSequence.charAt(i + 1);
                    if (dog.b(charAt, 'U') && dog.b(charAt2, 'T')) {
                        int i4 = i + 3;
                        return (length < i4 || !dog.b(charSequence.charAt(i3), 'C')) ? b(dog, charSequence, i, i3, i.a) : b(dog, charSequence, i, i4, i.a);
                    } else if (dog.b(charAt, 'G') && length >= (i2 = i + 3) && dog.b(charAt2, 'M') && dog.b(charSequence.charAt(i3), 'T')) {
                        int i5 = i + 4;
                        if (length < i5 || !dog.b(charSequence.charAt(i2), '0')) {
                            return b(dog, charSequence, i, i2, i.a);
                        }
                        dog.a(ZoneId.d("GMT0"));
                        return i5;
                    }
                }
                f d = d(dog);
                ParsePosition parsePosition = new ParsePosition(i);
                String c2 = d.c(charSequence, parsePosition);
                if (c2 != null) {
                    dog.a(ZoneId.d(c2));
                    return parsePosition.getIndex();
                } else if (dog.b(charAt, 'Z')) {
                    dog.a(ZoneOffset.e);
                    return i + 1;
                } else {
                    return ~i;
                }
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public boolean c(doL dol, StringBuilder sb) {
            ZoneId zoneId = (ZoneId) dol.b(this.d);
            if (zoneId == null) {
                return false;
            }
            sb.append(zoneId.d());
            return true;
        }

        protected f d(doG dog) {
            Set a = AbstractC8539dpi.a();
            int size = a.size();
            Map.Entry entry = dog.d() ? c : b;
            if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                synchronized (this) {
                    entry = dog.d() ? c : b;
                    if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                        entry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), f.c(a, dog));
                        if (dog.d()) {
                            c = entry;
                        } else {
                            b = entry;
                        }
                    }
                }
            }
            return (f) entry.getValue();
        }

        public String toString() {
            return this.a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class l extends j {
        static final LocalDate f = LocalDate.a(2000, 1, 1);
        private final InterfaceC8526dow g;
        private final int j;

        l(InterfaceC8535dpe interfaceC8535dpe, int i, int i2, int i3, InterfaceC8526dow interfaceC8526dow) {
            this(interfaceC8535dpe, i, i2, i3, interfaceC8526dow, 0);
            if (i < 1 || i > 10) {
                throw new IllegalArgumentException("The minWidth must be from 1 to 10 inclusive but was " + i);
            } else if (i2 < 1 || i2 > 10) {
                throw new IllegalArgumentException("The maxWidth must be from 1 to 10 inclusive but was " + i);
            } else if (i2 < i) {
                throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
            } else if (interfaceC8526dow == null) {
                long j = i3;
                if (!interfaceC8535dpe.a().d(j)) {
                    throw new IllegalArgumentException("The base value must be within the range of the field");
                }
                if (j + j.b[i2] > 2147483647L) {
                    throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                }
            }
        }

        private l(InterfaceC8535dpe interfaceC8535dpe, int i, int i2, int i3, InterfaceC8526dow interfaceC8526dow, int i4) {
            super(interfaceC8535dpe, i, i2, SignStyle.NOT_NEGATIVE, i4);
            this.j = i3;
            this.g = interfaceC8526dow;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.j
        /* renamed from: b */
        public l e() {
            return this.e == -1 ? this : new l(this.a, this.c, this.d, this.j, this.g, -1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.j
        /* renamed from: b */
        public l e(int i) {
            return new l(this.a, this.c, this.d, this.j, this.g, this.e + i);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.j
        boolean b(doG dog) {
            if (dog.i()) {
                return super.b(dog);
            }
            return false;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.j
        int d(final doG dog, final long j, final int i, final int i2) {
            int i3 = this.j;
            if (this.g != null) {
                i3 = dog.a().b(this.g).b(this.a);
                dog.a(new Consumer() { // from class: o.doJ
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        DateTimeFormatterBuilder.l.this.e(dog, j, i, i2, (InterfaceC8528doy) obj);
                    }
                });
            }
            int i4 = this.c;
            if (i2 - i == i4 && j >= 0) {
                long j2 = j.b[i4];
                long j3 = i3;
                long j4 = j3 - (j3 % j2);
                j = i3 > 0 ? j4 + j : j4 - j;
                if (j < j3) {
                    j += j2;
                }
            }
            return dog.e(this.a, j, i, i2);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.j
        long d(doL dol, long j) {
            long abs = Math.abs(j);
            int i = this.j;
            if (this.g != null) {
                i = InterfaceC8528doy.d(dol.c()).b(this.g).b(this.a);
            }
            long j2 = i;
            if (j >= j2) {
                long j3 = j.b[this.c];
                if (j < j2 + j3) {
                    return abs % j3;
                }
            }
            return abs % j.b[this.d];
        }

        public /* synthetic */ void e(doG dog, long j, int i, int i2, InterfaceC8528doy interfaceC8528doy) {
            d(dog, j, i, i2);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.j
        public String toString() {
            InterfaceC8535dpe interfaceC8535dpe = this.a;
            int i = this.c;
            int i2 = this.d;
            Object d = AbstractC8524dou.d(this.g, Integer.valueOf(this.j));
            return "ReducedValue(" + interfaceC8535dpe + "," + i + "," + i2 + "," + d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class m implements c {
        private final TextStyle b;
        private final doM c;
        private volatile j d;
        private final InterfaceC8535dpe e;

        m(InterfaceC8535dpe interfaceC8535dpe, TextStyle textStyle, doM dom) {
            this.e = interfaceC8535dpe;
            this.b = textStyle;
            this.c = dom;
        }

        private j c() {
            if (this.d == null) {
                this.d = new j(this.e, 1, 19, SignStyle.NORMAL);
            }
            return this.d;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public int c(doG dog, CharSequence charSequence, int i) {
            int length = charSequence.length();
            if (i < 0 || i > length) {
                throw new IndexOutOfBoundsException();
            }
            TextStyle textStyle = dog.i() ? this.b : null;
            InterfaceC8528doy a = dog.a();
            Iterator a2 = (a == null || a == IsoChronology.d) ? this.c.a(this.e, textStyle, dog.e()) : this.c.d(a, this.e, textStyle, dog.e());
            if (a2 != null) {
                while (a2.hasNext()) {
                    Map.Entry entry = (Map.Entry) a2.next();
                    String str = (String) entry.getKey();
                    if (dog.d(str, 0, charSequence, i, str.length())) {
                        return dog.e(this.e, ((Long) entry.getValue()).longValue(), i, i + str.length());
                    }
                }
                if (this.e == ChronoField.m && !dog.i()) {
                    for (doC doc : a.a()) {
                        String obj = doc.toString();
                        if (dog.d(obj, 0, charSequence, i, obj.length())) {
                            return dog.e(this.e, doc.b(), i, i + obj.length());
                        }
                    }
                }
                if (dog.i()) {
                    return ~i;
                }
            }
            return c().c(dog, charSequence, i);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public boolean c(doL dol, StringBuilder sb) {
            Long a = dol.a(this.e);
            if (a == null) {
                return false;
            }
            InterfaceC8528doy interfaceC8528doy = (InterfaceC8528doy) dol.c().b(AbstractC8538dph.c());
            String b = (interfaceC8528doy == null || interfaceC8528doy == IsoChronology.d) ? this.c.b(this.e, a.longValue(), this.b, dol.d()) : this.c.c(interfaceC8528doy, this.e, a.longValue(), this.b, dol.d());
            if (b == null) {
                return c().c(dol, sb);
            }
            sb.append(b);
            return true;
        }

        public String toString() {
            TextStyle textStyle = this.b;
            if (textStyle == TextStyle.FULL) {
                InterfaceC8535dpe interfaceC8535dpe = this.e;
                return "Text(" + interfaceC8535dpe + ")";
            }
            InterfaceC8535dpe interfaceC8535dpe2 = this.e;
            return "Text(" + interfaceC8535dpe2 + "," + textStyle + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class n implements c {
        private final String a;

        n(String str) {
            this.a = str;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public int c(doG dog, CharSequence charSequence, int i) {
            if (i > charSequence.length() || i < 0) {
                throw new IndexOutOfBoundsException();
            }
            String str = this.a;
            return !dog.d(charSequence, i, str, 0, str.length()) ? ~i : i + this.a.length();
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.c
        public boolean c(doL dol, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public String toString() {
            String replace = this.a.replace("'", "''");
            return "'" + replace + "'";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class o extends j {
        private int g;
        private char j;

        o(char c, int i, int i2, int i3) {
            this(c, i, i2, i3, 0);
        }

        o(char c, int i, int i2, int i3, int i4) {
            super(null, i2, i3, SignStyle.NOT_NEGATIVE, i4);
            this.j = c;
            this.g = i;
        }

        private c a(Locale locale) {
            InterfaceC8535dpe d;
            WeekFields a = WeekFields.a(locale);
            char c = this.j;
            if (c == 'W') {
                d = a.d();
            } else if (c == 'Y') {
                InterfaceC8535dpe b = a.b();
                int i = this.g;
                if (i == 2) {
                    return new l(b, 2, 2, 0, l.f, this.e);
                }
                return new j(b, i, 19, i < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD, this.e);
            } else if (c == 'c' || c == 'e') {
                d = a.c();
            } else if (c != 'w') {
                throw new IllegalStateException("unreachable");
            } else {
                d = a.j();
            }
            return new j(d, this.c, this.d, SignStyle.NOT_NEGATIVE, this.e);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.j, j$.time.format.DateTimeFormatterBuilder.c
        public int c(doG dog, CharSequence charSequence, int i) {
            return a(dog.e()).c(dog, charSequence, i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.j
        /* renamed from: c */
        public o e() {
            return this.e == -1 ? this : new o(this.j, this.g, this.c, this.d, -1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.j
        /* renamed from: c */
        public o e(int i) {
            return new o(this.j, this.g, this.c, this.d, this.e + i);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.j, j$.time.format.DateTimeFormatterBuilder.c
        public boolean c(doL dol, StringBuilder sb) {
            return a(dol.d()).c(dol, sb);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.j
        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder(30);
            sb.append("Localized(");
            char c = this.j;
            if (c == 'Y') {
                int i = this.g;
                if (i == 1) {
                    str2 = "WeekBasedYear";
                } else if (i == 2) {
                    str2 = "ReducedValue(WeekBasedYear,2,2,2000-01-01)";
                } else {
                    sb.append("WeekBasedYear,");
                    sb.append(this.g);
                    sb.append(",");
                    sb.append(19);
                    sb.append(",");
                    sb.append(this.g < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD);
                }
                sb.append(str2);
            } else {
                if (c == 'W') {
                    str = "WeekOfMonth";
                } else if (c == 'c' || c == 'e') {
                    str = "DayOfWeek";
                } else {
                    if (c == 'w') {
                        str = "WeekOfWeekBasedYear";
                    }
                    sb.append(",");
                    sb.append(this.g);
                }
                sb.append(str);
                sb.append(",");
                sb.append(this.g);
            }
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class r extends k {
        private static final Map d = new ConcurrentHashMap();
        private final Map a;
        private final boolean b;
        private Set c;
        private final Map e;
        private final TextStyle g;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        r(j$.time.format.TextStyle r4, java.util.Set r5, boolean r6) {
            /*
                r3 = this;
                o.dpg r0 = o.AbstractC8538dph.g()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "ZoneText("
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r3.<init>(r0, r1)
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r3.e = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r3.a = r0
                java.lang.String r0 = "textStyle"
                java.util.Objects.requireNonNull(r4, r0)
                r3.g = r4
                r3.b = r6
                if (r5 == 0) goto L5d
                int r4 = r5.size()
                if (r4 == 0) goto L5d
                java.util.HashSet r4 = new java.util.HashSet
                r4.<init>()
                r3.c = r4
                java.util.Iterator r4 = r5.iterator()
            L47:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L5d
                java.lang.Object r5 = r4.next()
                j$.time.ZoneId r5 = (j$.time.ZoneId) r5
                java.util.Set r6 = r3.c
                java.lang.String r5 = r5.d()
                r6.add(r5)
                goto L47
            L5d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.r.<init>(j$.time.format.TextStyle, java.util.Set, boolean):void");
        }

        private String a(String str, int i, Locale locale) {
            String[] strArr;
            Map map = null;
            if (this.g == TextStyle.NARROW) {
                return null;
            }
            Map map2 = d;
            SoftReference softReference = (SoftReference) map2.get(str);
            if (softReference == null || (map = (Map) softReference.get()) == null || (strArr = (String[]) map.get(locale)) == null) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                strArr = new String[]{str, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), str, str};
                if (map == null) {
                    map = new ConcurrentHashMap();
                }
                map.put(locale, strArr);
                map2.put(str, new SoftReference(map));
            }
            int b = this.g.b();
            return i != 0 ? i != 1 ? strArr[b + 5] : strArr[b + 3] : strArr[b + 1];
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
        @Override // j$.time.format.DateTimeFormatterBuilder.k, j$.time.format.DateTimeFormatterBuilder.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean c(o.doL r8, java.lang.StringBuilder r9) {
            /*
                r7 = this;
                o.dpg r0 = o.AbstractC8538dph.h()
                java.lang.Object r0 = r8.b(r0)
                j$.time.ZoneId r0 = (j$.time.ZoneId) r0
                if (r0 != 0) goto Le
                r8 = 0
                return r8
            Le:
                java.lang.String r1 = r0.d()
                boolean r2 = r0 instanceof j$.time.ZoneOffset
                if (r2 != 0) goto L7e
                o.doY r2 = r8.c()
                boolean r3 = r7.b
                if (r3 != 0) goto L72
                j$.time.temporal.ChronoField r3 = j$.time.temporal.ChronoField.l
                boolean r3 = r2.e(r3)
                if (r3 == 0) goto L33
                j$.time.zone.ZoneRules r0 = r0.c()
                j$.time.Instant r2 = j$.time.Instant.c(r2)
                boolean r0 = r0.d(r2)
                goto L73
            L33:
                j$.time.temporal.ChronoField r3 = j$.time.temporal.ChronoField.k
                boolean r4 = r2.e(r3)
                if (r4 == 0) goto L72
                j$.time.temporal.ChronoField r4 = j$.time.temporal.ChronoField.x
                boolean r5 = r2.e(r4)
                if (r5 == 0) goto L72
                long r5 = r2.a(r3)
                j$.time.LocalDate r3 = j$.time.LocalDate.b(r5)
                long r4 = r2.a(r4)
                j$.time.LocalTime r2 = j$.time.LocalTime.b(r4)
                j$.time.LocalDateTime r2 = r3.a(r2)
                j$.time.zone.ZoneRules r3 = r0.c()
                j$.time.zone.ZoneOffsetTransition r3 = r3.d(r2)
                if (r3 != 0) goto L72
                j$.time.zone.ZoneRules r3 = r0.c()
                j$.time.ZonedDateTime r0 = r2.b(r0)
                j$.time.Instant r0 = r0.o()
                boolean r0 = r3.d(r0)
                goto L73
            L72:
                r0 = 2
            L73:
                java.util.Locale r8 = r8.d()
                java.lang.String r8 = r7.a(r1, r0, r8)
                if (r8 == 0) goto L7e
                r1 = r8
            L7e:
                r9.append(r1)
                r8 = 1
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.r.c(o.doL, java.lang.StringBuilder):boolean");
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.k
        protected f d(doG dog) {
            f e;
            if (this.g == TextStyle.NARROW) {
                return super.d(dog);
            }
            Locale e2 = dog.e();
            boolean d2 = dog.d();
            Set a = AbstractC8539dpi.a();
            int size = a.size();
            Map map = d2 ? this.e : this.a;
            Map.Entry entry = (Map.Entry) map.get(e2);
            if (entry == null || ((Integer) entry.getKey()).intValue() != size || (e = (f) ((SoftReference) entry.getValue()).get()) == null) {
                e = f.e(dog);
                String[][] zoneStrings = DateFormatSymbols.getInstance(e2).getZoneStrings();
                int length = zoneStrings.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String[] strArr = zoneStrings[i];
                    String str = strArr[0];
                    if (a.contains(str)) {
                        e.b(str, str);
                        String e3 = doU.e(str, e2);
                        for (int i2 = this.g != TextStyle.FULL ? 2 : 1; i2 < strArr.length; i2 += 2) {
                            e.b(strArr[i2], e3);
                        }
                    }
                    i++;
                }
                if (this.c != null) {
                    for (String[] strArr2 : zoneStrings) {
                        String str2 = strArr2[0];
                        if (this.c.contains(str2) && a.contains(str2)) {
                            for (int i3 = this.g == TextStyle.FULL ? 1 : 2; i3 < strArr2.length; i3 += 2) {
                                e.b(strArr2[i3], str2);
                            }
                        }
                    }
                }
                map.put(e2, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(e)));
            }
            return e;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put('G', ChronoField.m);
        hashMap.put('y', ChronoField.A);
        hashMap.put('u', ChronoField.B);
        InterfaceC8535dpe interfaceC8535dpe = IsoFields.d;
        hashMap.put('Q', interfaceC8535dpe);
        hashMap.put('q', interfaceC8535dpe);
        ChronoField chronoField = ChronoField.y;
        hashMap.put('M', chronoField);
        hashMap.put('L', chronoField);
        hashMap.put('D', ChronoField.f);
        hashMap.put('d', ChronoField.h);
        hashMap.put('F', ChronoField.c);
        ChronoField chronoField2 = ChronoField.j;
        hashMap.put('E', chronoField2);
        hashMap.put('c', chronoField2);
        hashMap.put('e', chronoField2);
        hashMap.put('a', ChronoField.b);
        hashMap.put('H', ChronoField.n);
        hashMap.put('k', ChronoField.i);
        hashMap.put('K', ChronoField.f13342o);
        hashMap.put('h', ChronoField.g);
        hashMap.put('m', ChronoField.v);
        hashMap.put('s', ChronoField.D);
        ChronoField chronoField3 = ChronoField.w;
        hashMap.put('S', chronoField3);
        hashMap.put('A', ChronoField.t);
        hashMap.put('n', chronoField3);
        hashMap.put('N', ChronoField.x);
        hashMap.put('g', JulianFields.c);
        b = new Comparator() { // from class: j$.time.format.DateTimeFormatterBuilder.2
            @Override // java.util.Comparator
            /* renamed from: d */
            public int compare(String str, String str2) {
                return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
            }
        };
    }

    public DateTimeFormatterBuilder() {
        this.c = this;
        this.j = new ArrayList();
        this.i = -1;
        this.f = null;
        this.a = false;
    }

    private DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder, boolean z) {
        this.c = this;
        this.j = new ArrayList();
        this.i = -1;
        this.f = dateTimeFormatterBuilder;
        this.a = z;
    }

    public static /* synthetic */ ZoneId b(doY doy) {
        ZoneId zoneId = (ZoneId) doy.b(AbstractC8538dph.h());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }

    private DateTimeFormatterBuilder b(j jVar) {
        j e2;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.c;
        int i2 = dateTimeFormatterBuilder.i;
        if (i2 >= 0) {
            j jVar2 = (j) dateTimeFormatterBuilder.j.get(i2);
            if (jVar.c == jVar.d && jVar.f == SignStyle.NOT_NEGATIVE) {
                e2 = jVar2.e(jVar.d);
                c(jVar.e());
                this.c.i = i2;
            } else {
                e2 = jVar2.e();
                this.c.i = c(jVar);
            }
            this.c.j.set(i2, e2);
        } else {
            dateTimeFormatterBuilder.i = c(jVar);
        }
        return this;
    }

    private int c(c cVar) {
        Objects.requireNonNull(cVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.c;
        int i2 = dateTimeFormatterBuilder.h;
        if (i2 > 0) {
            g gVar = new g(cVar, i2, dateTimeFormatterBuilder.g);
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.c;
            dateTimeFormatterBuilder2.h = 0;
            dateTimeFormatterBuilder2.g = (char) 0;
            cVar = gVar;
        }
        this.c.j.add(cVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = this.c;
        dateTimeFormatterBuilder3.i = -1;
        return dateTimeFormatterBuilder3.j.size() - 1;
    }

    private doE c(Locale locale, ResolverStyle resolverStyle, InterfaceC8528doy interfaceC8528doy) {
        Objects.requireNonNull(locale, "locale");
        while (this.c.f != null) {
            d();
        }
        return new doE(new d(this.j, false), locale, doO.c, resolverStyle, null, interfaceC8528doy, null);
    }

    private void c(String str) {
        o oVar;
        String str2;
        String str3;
        TextStyle textStyle;
        TextStyle textStyle2;
        int i2;
        int i3 = 0;
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i4 = i3 + 1;
                while (i4 < str.length() && str.charAt(i4) == charAt) {
                    i4++;
                }
                int i5 = i4 - i3;
                if (charAt == 'p') {
                    if (i4 >= str.length() || (((charAt = str.charAt(i4)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                        i2 = i5;
                        i5 = 0;
                    } else {
                        int i6 = i4 + 1;
                        while (i6 < str.length() && str.charAt(i6) == charAt) {
                            i6++;
                        }
                        i2 = i6 - i4;
                        i4 = i6;
                    }
                    if (i5 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: " + str);
                    }
                    e(i5);
                    i5 = i2;
                }
                InterfaceC8535dpe interfaceC8535dpe = (InterfaceC8535dpe) d.get(Character.valueOf(charAt));
                if (interfaceC8535dpe != null) {
                    d(charAt, i5, interfaceC8535dpe);
                } else if (charAt == 'z') {
                    if (i5 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    }
                    c(i5 == 4 ? TextStyle.FULL : TextStyle.SHORT);
                } else if (charAt == 'V') {
                    if (i5 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + charAt);
                    }
                    b();
                } else if (charAt == 'v') {
                    if (i5 == 1) {
                        textStyle2 = TextStyle.SHORT;
                    } else if (i5 != 4) {
                        throw new IllegalArgumentException("Wrong number of  pattern letters: " + charAt);
                    } else {
                        textStyle2 = TextStyle.FULL;
                    }
                    e(textStyle2);
                } else {
                    String str4 = "+0000";
                    if (charAt == 'Z') {
                        if (i5 < 4) {
                            str2 = "+HHMM";
                            a(str2, str4);
                        } else {
                            if (i5 != 4) {
                                if (i5 != 5) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                }
                                str3 = "+HH:MM:ss";
                                a(str3, "Z");
                            }
                            textStyle = TextStyle.FULL;
                            d(textStyle);
                        }
                    } else if (charAt == 'O') {
                        if (i5 == 1) {
                            textStyle = TextStyle.SHORT;
                            d(textStyle);
                        } else {
                            if (i5 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + charAt);
                            }
                            textStyle = TextStyle.FULL;
                            d(textStyle);
                        }
                    } else if (charAt == 'X') {
                        if (i5 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                        str3 = i.b[i5 + (i5 == 1 ? 0 : 1)];
                        a(str3, "Z");
                    } else if (charAt != 'x') {
                        if (charAt == 'W') {
                            if (i5 > 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                            }
                            oVar = new o(charAt, i5, i5, i5);
                        } else if (charAt == 'w') {
                            if (i5 > 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                            }
                            oVar = new o(charAt, i5, i5, 2);
                        } else if (charAt != 'Y') {
                            throw new IllegalArgumentException("Unknown pattern letter: " + charAt);
                        } else {
                            oVar = i5 == 2 ? new o(charAt, i5, i5, 2) : new o(charAt, i5, i5, 19);
                        }
                        b(oVar);
                    } else if (i5 > 5) {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    } else {
                        if (i5 == 1) {
                            str4 = "+00";
                        } else if (i5 % 2 != 0) {
                            str4 = "+00:00";
                        }
                        str2 = i.b[i5 + (i5 == 1 ? 0 : 1)];
                        a(str2, str4);
                    }
                }
                i3 = i4 - 1;
            } else if (charAt == '\'') {
                int i7 = i3 + 1;
                int i8 = i7;
                while (i8 < str.length()) {
                    if (str.charAt(i8) == '\'') {
                        int i9 = i8 + 1;
                        if (i9 >= str.length() || str.charAt(i9) != '\'') {
                            break;
                        }
                        i8 = i9;
                    }
                    i8++;
                }
                if (i8 >= str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: " + str);
                }
                String substring = str.substring(i7, i8);
                if (substring.isEmpty()) {
                    c('\'');
                } else {
                    b(substring.replace("''", "'"));
                }
                i3 = i8;
            } else if (charAt == '[') {
                f();
            } else if (charAt == ']') {
                if (this.c.f == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                d();
            } else if (charAt == '{' || charAt == '}' || charAt == '#') {
                throw new IllegalArgumentException("Pattern includes reserved character: '" + charAt + "'");
            } else {
                c(charAt);
            }
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
        if (r10 == 1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(char r9, int r10, o.InterfaceC8535dpe r11) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.d(char, int, o.dpe):void");
    }

    public DateTimeFormatterBuilder a() {
        c(new k(e, "ZoneRegionId()"));
        return this;
    }

    public DateTimeFormatterBuilder a(int i2, char c2) {
        if (i2 < 1) {
            throw new IllegalArgumentException("The pad width must be at least one but was " + i2);
        }
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.c;
        dateTimeFormatterBuilder.h = i2;
        dateTimeFormatterBuilder.g = c2;
        dateTimeFormatterBuilder.i = -1;
        return this;
    }

    public DateTimeFormatterBuilder a(String str) {
        Objects.requireNonNull(str, "pattern");
        c(str);
        return this;
    }

    public DateTimeFormatterBuilder a(String str, String str2) {
        c(new i(str, str2));
        return this;
    }

    public DateTimeFormatterBuilder a(InterfaceC8535dpe interfaceC8535dpe, int i2, int i3, SignStyle signStyle) {
        if (i2 == i3 && signStyle == SignStyle.NOT_NEGATIVE) {
            return d(interfaceC8535dpe, i3);
        }
        Objects.requireNonNull(interfaceC8535dpe, "field");
        Objects.requireNonNull(signStyle, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        } else if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        } else if (i3 >= i2) {
            b(new j(interfaceC8535dpe, i2, i3, signStyle));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
        }
    }

    public DateTimeFormatterBuilder a(InterfaceC8535dpe interfaceC8535dpe, int i2, int i3, InterfaceC8526dow interfaceC8526dow) {
        Objects.requireNonNull(interfaceC8535dpe, "field");
        Objects.requireNonNull(interfaceC8526dow, "baseDate");
        b(new l(interfaceC8535dpe, i2, i3, 0, interfaceC8526dow));
        return this;
    }

    public doE a(Locale locale) {
        return c(locale, ResolverStyle.SMART, null);
    }

    public DateTimeFormatterBuilder b() {
        c(new k(AbstractC8538dph.h(), "ZoneId()"));
        return this;
    }

    public DateTimeFormatterBuilder b(String str) {
        Objects.requireNonNull(str, "literal");
        if (!str.isEmpty()) {
            c(str.length() == 1 ? new b(str.charAt(0)) : new n(str));
        }
        return this;
    }

    public DateTimeFormatterBuilder b(InterfaceC8535dpe interfaceC8535dpe, Map map) {
        Objects.requireNonNull(interfaceC8535dpe, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        final doM.e eVar = new doM.e(Collections.singletonMap(textStyle, linkedHashMap));
        c(new m(interfaceC8535dpe, textStyle, new doM() { // from class: j$.time.format.DateTimeFormatterBuilder.1
            @Override // o.doM
            public Iterator a(InterfaceC8535dpe interfaceC8535dpe2, TextStyle textStyle2, Locale locale) {
                return eVar.b(textStyle2);
            }

            @Override // o.doM
            public String b(InterfaceC8535dpe interfaceC8535dpe2, long j2, TextStyle textStyle2, Locale locale) {
                return eVar.c(j2, textStyle2);
            }

            @Override // o.doM
            public String c(InterfaceC8528doy interfaceC8528doy, InterfaceC8535dpe interfaceC8535dpe2, long j2, TextStyle textStyle2, Locale locale) {
                return eVar.c(j2, textStyle2);
            }

            @Override // o.doM
            public Iterator d(InterfaceC8528doy interfaceC8528doy, InterfaceC8535dpe interfaceC8535dpe2, TextStyle textStyle2, Locale locale) {
                return eVar.b(textStyle2);
            }
        }));
        return this;
    }

    public DateTimeFormatterBuilder c() {
        c(i.e);
        return this;
    }

    public DateTimeFormatterBuilder c(char c2) {
        c(new b(c2));
        return this;
    }

    public DateTimeFormatterBuilder c(TextStyle textStyle) {
        c(new r(textStyle, null, false));
        return this;
    }

    public DateTimeFormatterBuilder c(InterfaceC8535dpe interfaceC8535dpe, TextStyle textStyle) {
        Objects.requireNonNull(interfaceC8535dpe, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        c(new m(interfaceC8535dpe, textStyle, doM.c()));
        return this;
    }

    public doE c(ResolverStyle resolverStyle, InterfaceC8528doy interfaceC8528doy) {
        return c(Locale.getDefault(), resolverStyle, interfaceC8528doy);
    }

    public DateTimeFormatterBuilder d() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.c;
        if (dateTimeFormatterBuilder.f != null) {
            if (dateTimeFormatterBuilder.j.size() > 0) {
                DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.c;
                d dVar = new d(dateTimeFormatterBuilder2.j, dateTimeFormatterBuilder2.a);
                this.c = this.c.f;
                c(dVar);
            } else {
                this.c = this.c.f;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public DateTimeFormatterBuilder d(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, "style");
        if (textStyle == TextStyle.FULL || textStyle == TextStyle.SHORT) {
            c(new h(textStyle));
            return this;
        }
        throw new IllegalArgumentException("Style must be either full or short");
    }

    public DateTimeFormatterBuilder d(doE doe) {
        Objects.requireNonNull(doe, "formatter");
        c(doe.d(false));
        return this;
    }

    public DateTimeFormatterBuilder d(InterfaceC8535dpe interfaceC8535dpe) {
        Objects.requireNonNull(interfaceC8535dpe, "field");
        b(new j(interfaceC8535dpe, 1, 19, SignStyle.NORMAL));
        return this;
    }

    public DateTimeFormatterBuilder d(InterfaceC8535dpe interfaceC8535dpe, int i2) {
        Objects.requireNonNull(interfaceC8535dpe, "field");
        if (i2 >= 1 && i2 <= 19) {
            b(new j(interfaceC8535dpe, i2, i2, SignStyle.NOT_NEGATIVE));
            return this;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
    }

    public DateTimeFormatterBuilder e() {
        c(new a(-2));
        return this;
    }

    public DateTimeFormatterBuilder e(int i2) {
        return a(i2, ' ');
    }

    public DateTimeFormatterBuilder e(TextStyle textStyle) {
        c(new r(textStyle, null, true));
        return this;
    }

    public DateTimeFormatterBuilder e(InterfaceC8535dpe interfaceC8535dpe, int i2, int i3, boolean z) {
        if (i2 != i3 || z) {
            c(new e(interfaceC8535dpe, i2, i3, z));
        } else {
            b(new e(interfaceC8535dpe, i2, i3, z));
        }
        return this;
    }

    public DateTimeFormatterBuilder f() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.c;
        dateTimeFormatterBuilder.i = -1;
        this.c = new DateTimeFormatterBuilder(dateTimeFormatterBuilder, true);
        return this;
    }

    public DateTimeFormatterBuilder g() {
        c(SettingsParser.LENIENT);
        return this;
    }

    public DateTimeFormatterBuilder h() {
        c(SettingsParser.INSENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder i() {
        c(SettingsParser.STRICT);
        return this;
    }

    public DateTimeFormatterBuilder j() {
        c(SettingsParser.SENSITIVE);
        return this;
    }

    public doE n() {
        return a(Locale.getDefault());
    }
}

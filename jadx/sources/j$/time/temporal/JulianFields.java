package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.format.ResolverStyle;
import java.util.Map;
import o.InterfaceC8526dow;
import o.InterfaceC8528doy;
import o.InterfaceC8535dpe;
import o.InterfaceC8540dpj;
import o.doX;
import o.doY;

/* loaded from: classes5.dex */
public abstract class JulianFields {
    public static final InterfaceC8535dpe a = Field.e;
    public static final InterfaceC8535dpe c = Field.b;
    public static final InterfaceC8535dpe b = Field.a;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum e uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes5.dex */
    static final class Field implements InterfaceC8535dpe {
        public static final Field a;
        public static final Field b;
        private static final /* synthetic */ Field[] d;
        public static final Field e;
        private static final long serialVersionUID = -7501623920830201812L;
        private final transient InterfaceC8540dpj c;
        private final transient long f;
        private final transient ValueRange g;
        private final transient String i;
        private final transient InterfaceC8540dpj j;

        static {
            ChronoUnit chronoUnit = ChronoUnit.DAYS;
            ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
            Field field = new Field("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
            e = field;
            Field field2 = new Field("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
            b = field2;
            Field field3 = new Field("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
            a = field3;
            d = new Field[]{field, field2, field3};
        }

        private Field(String str, int i, String str2, InterfaceC8540dpj interfaceC8540dpj, InterfaceC8540dpj interfaceC8540dpj2, long j) {
            this.i = str2;
            this.c = interfaceC8540dpj;
            this.j = interfaceC8540dpj2;
            this.g = ValueRange.b((-365243219162L) + j, 365241780471L + j);
            this.f = j;
        }

        public static Field valueOf(String str) {
            return (Field) Enum.valueOf(Field.class, str);
        }

        public static Field[] values() {
            return (Field[]) d.clone();
        }

        @Override // o.InterfaceC8535dpe
        public ValueRange a() {
            return this.g;
        }

        @Override // o.InterfaceC8535dpe
        /* renamed from: a */
        public InterfaceC8526dow c(Map map, doY doy, ResolverStyle resolverStyle) {
            long longValue = ((Long) map.remove(this)).longValue();
            InterfaceC8528doy d2 = InterfaceC8528doy.d(doy);
            if (resolverStyle == ResolverStyle.LENIENT) {
                return d2.e(Math.subtractExact(longValue, this.f));
            }
            a().c(longValue, this);
            return d2.e(longValue - this.f);
        }

        @Override // o.InterfaceC8535dpe
        public boolean a(doY doy) {
            return doy.e(ChronoField.k);
        }

        @Override // o.InterfaceC8535dpe
        public boolean b() {
            return false;
        }

        @Override // o.InterfaceC8535dpe
        public long d(doY doy) {
            return doy.a(ChronoField.k) + this.f;
        }

        @Override // o.InterfaceC8535dpe
        public doX d(doX dox, long j) {
            if (a().d(j)) {
                return dox.d(ChronoField.k, Math.subtractExact(j, this.f));
            }
            String str = this.i;
            throw new DateTimeException("Invalid value: " + str + " " + j);
        }

        @Override // o.InterfaceC8535dpe
        public boolean d() {
            return true;
        }

        @Override // o.InterfaceC8535dpe
        public ValueRange e(doY doy) {
            if (a(doy)) {
                return a();
            }
            throw new DateTimeException("Unsupported field: " + this);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.i;
        }
    }
}

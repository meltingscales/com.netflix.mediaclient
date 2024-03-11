package j$.time.chrono;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import o.AbstractC8520doq;
import o.AbstractC8521dor;
import o.InterfaceC8529doz;
import o.doA;
import o.doC;
import o.doY;

/* loaded from: classes6.dex */
public final class MinguoChronology extends AbstractC8521dor implements Serializable {
    public static final MinguoChronology b = new MinguoChronology();
    private static final long serialVersionUID = 1039765215346859963L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.MinguoChronology$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static abstract /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ChronoField.values().length];
            e = iArr;
            try {
                iArr[ChronoField.z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[ChronoField.A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[ChronoField.B.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private MinguoChronology() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // o.InterfaceC8528doy
    public ValueRange a(ChronoField chronoField) {
        int i = AnonymousClass5.e[chronoField.ordinal()];
        if (i == 1) {
            ValueRange a = ChronoField.z.a();
            return ValueRange.b(a.d() - 22932, a.e() - 22932);
        } else if (i == 2) {
            ValueRange a2 = ChronoField.B.a();
            return ValueRange.a(1L, a2.e() - 1911, (-a2.d()) + 1912);
        } else if (i != 3) {
            return chronoField.a();
        } else {
            ValueRange a3 = ChronoField.B.a();
            return ValueRange.b(a3.d() - 1911, a3.e() - 1911);
        }
    }

    @Override // o.InterfaceC8528doy
    public List a() {
        return AbstractC8520doq.a(MinguoEra.values());
    }

    @Override // o.InterfaceC8528doy
    public doA a(doY doy) {
        return super.a(doy);
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: b */
    public MinguoDate e(long j) {
        return new MinguoDate(LocalDate.b(j));
    }

    public MinguoDate b(Clock clock) {
        return b(LocalDate.e(clock));
    }

    @Override // o.InterfaceC8528doy
    public String b() {
        return "Minguo";
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: c */
    public MinguoDate b(int i, int i2, int i3) {
        return new MinguoDate(LocalDate.a(i + 1911, i2, i3));
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: c */
    public MinguoDate b(doY doy) {
        return doy instanceof MinguoDate ? (MinguoDate) doy : new MinguoDate(LocalDate.e(doy));
    }

    @Override // o.InterfaceC8528doy
    public boolean c(long j) {
        return IsoChronology.d.c(j + 1911);
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: d */
    public MinguoDate c() {
        return b(Clock.c());
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: d */
    public MinguoDate b(int i, int i2) {
        return new MinguoDate(LocalDate.a(i + 1911, i2));
    }

    @Override // o.InterfaceC8528doy
    public int e(doC doc, int i) {
        if (doc instanceof MinguoEra) {
            return doc == MinguoEra.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: e */
    public MinguoEra c(int i) {
        return MinguoEra.a(i);
    }

    @Override // o.InterfaceC8528doy
    public String e() {
        return "roc";
    }

    @Override // o.InterfaceC8528doy
    public doA e(Instant instant, ZoneId zoneId) {
        return super.e(instant, zoneId);
    }

    @Override // o.InterfaceC8528doy
    public InterfaceC8529doz e(doY doy) {
        return super.e(doy);
    }

    @Override // o.AbstractC8521dor, o.InterfaceC8528doy
    /* renamed from: h */
    public MinguoDate c(Map map, ResolverStyle resolverStyle) {
        return (MinguoDate) super.c(map, resolverStyle);
    }

    @Override // o.AbstractC8521dor
    public Object writeReplace() {
        return super.writeReplace();
    }
}

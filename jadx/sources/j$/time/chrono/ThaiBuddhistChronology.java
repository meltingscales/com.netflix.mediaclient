package j$.time.chrono;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC8520doq;
import o.AbstractC8521dor;
import o.InterfaceC8529doz;
import o.doA;
import o.doC;
import o.doY;

/* loaded from: classes6.dex */
public final class ThaiBuddhistChronology extends AbstractC8521dor implements Serializable {
    private static final HashMap a;
    private static final HashMap b;
    private static final HashMap c;
    public static final ThaiBuddhistChronology d = new ThaiBuddhistChronology();
    private static final long serialVersionUID = 2775954514031616474L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.ThaiBuddhistChronology$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static abstract /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            a = iArr;
            try {
                iArr[ChronoField.z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ChronoField.A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ChronoField.B.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        c = hashMap2;
        HashMap hashMap3 = new HashMap();
        b = hashMap3;
        hashMap.put(SignupConstants.Language.ENGLISH_EN, new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put(SignupConstants.Language.ENGLISH_EN, new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put(SignupConstants.Language.ENGLISH_EN, new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private ThaiBuddhistChronology() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: a */
    public ThaiBuddhistDate b(int i, int i2) {
        return new ThaiBuddhistDate(LocalDate.a(i - 543, i2));
    }

    @Override // o.InterfaceC8528doy
    public ValueRange a(ChronoField chronoField) {
        int i = AnonymousClass4.a[chronoField.ordinal()];
        if (i == 1) {
            ValueRange a2 = ChronoField.z.a();
            return ValueRange.b(a2.d() + 6516, a2.e() + 6516);
        } else if (i == 2) {
            ValueRange a3 = ChronoField.B.a();
            return ValueRange.a(1L, 1 + (-(a3.d() + 543)), a3.e() + 543);
        } else if (i != 3) {
            return chronoField.a();
        } else {
            ValueRange a4 = ChronoField.B.a();
            return ValueRange.b(a4.d() + 543, a4.e() + 543);
        }
    }

    @Override // o.InterfaceC8528doy
    public List a() {
        return AbstractC8520doq.a(ThaiBuddhistEra.values());
    }

    @Override // o.InterfaceC8528doy
    public doA a(doY doy) {
        return super.a(doy);
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: b */
    public ThaiBuddhistDate e(long j) {
        return new ThaiBuddhistDate(LocalDate.b(j));
    }

    @Override // o.InterfaceC8528doy
    public String b() {
        return "ThaiBuddhist";
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: c */
    public ThaiBuddhistDate b(int i, int i2, int i3) {
        return new ThaiBuddhistDate(LocalDate.a(i - 543, i2, i3));
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: c */
    public ThaiBuddhistDate b(doY doy) {
        return doy instanceof ThaiBuddhistDate ? (ThaiBuddhistDate) doy : new ThaiBuddhistDate(LocalDate.e(doy));
    }

    @Override // o.InterfaceC8528doy
    public boolean c(long j) {
        return IsoChronology.d.c(j - 543);
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: d */
    public ThaiBuddhistDate c() {
        return e(Clock.c());
    }

    @Override // o.InterfaceC8528doy
    /* renamed from: d */
    public ThaiBuddhistEra c(int i) {
        return ThaiBuddhistEra.d(i);
    }

    @Override // o.InterfaceC8528doy
    public int e(doC doc, int i) {
        if (doc instanceof ThaiBuddhistEra) {
            return doc == ThaiBuddhistEra.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    public ThaiBuddhistDate e(Clock clock) {
        return b(LocalDate.e(clock));
    }

    @Override // o.InterfaceC8528doy
    public String e() {
        return "buddhist";
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
    public ThaiBuddhistDate c(Map map, ResolverStyle resolverStyle) {
        return (ThaiBuddhistDate) super.c(map, resolverStyle);
    }

    @Override // o.AbstractC8521dor
    public Object writeReplace() {
        return super.writeReplace();
    }
}

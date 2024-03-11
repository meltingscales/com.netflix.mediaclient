package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;
import o.InterfaceC8528doy;
import o.InterfaceC8529doz;
import o.InterfaceC8535dpe;
import o.InterfaceC8540dpj;
import o.doA;
import o.doX;

/* loaded from: classes.dex */
public final class ChronoZonedDateTimeImpl implements doA, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final transient ZoneOffset b;
    private final transient ZoneId c;
    private final transient ChronoLocalDateTimeImpl d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.ChronoZonedDateTimeImpl$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static abstract /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ChronoField.values().length];
            e = iArr;
            try {
                iArr[ChronoField.l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[ChronoField.u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private ChronoZonedDateTimeImpl(ChronoLocalDateTimeImpl chronoLocalDateTimeImpl, ZoneOffset zoneOffset, ZoneId zoneId) {
        Objects.requireNonNull(chronoLocalDateTimeImpl, "dateTime");
        this.d = chronoLocalDateTimeImpl;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.c = zoneId;
    }

    public static ChronoZonedDateTimeImpl a(InterfaceC8528doy interfaceC8528doy, Instant instant, ZoneId zoneId) {
        ZoneOffset a = zoneId.c().a(instant);
        Objects.requireNonNull(a, "offset");
        return new ChronoZonedDateTimeImpl((ChronoLocalDateTimeImpl) interfaceC8528doy.e(LocalDateTime.d(instant.d(), instant.c(), a)), a, zoneId);
    }

    public static ChronoZonedDateTimeImpl a(InterfaceC8528doy interfaceC8528doy, doX dox) {
        ChronoZonedDateTimeImpl chronoZonedDateTimeImpl = (ChronoZonedDateTimeImpl) dox;
        if (interfaceC8528doy.equals(chronoZonedDateTimeImpl.j())) {
            return chronoZonedDateTimeImpl;
        }
        String b = interfaceC8528doy.b();
        String b2 = chronoZonedDateTimeImpl.j().b();
        throw new ClassCastException("Chronology mismatch, required: " + b + ", actual: " + b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static doA b(ObjectInput objectInput) {
        return ((InterfaceC8529doz) objectInput.readObject()).b((ZoneId) ((ZoneOffset) objectInput.readObject())).d((ZoneId) objectInput.readObject());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r2.contains(r7) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.doA c(j$.time.chrono.ChronoLocalDateTimeImpl r5, j$.time.ZoneId r6, j$.time.ZoneOffset r7) {
        /*
            java.lang.String r0 = "localDateTime"
            java.util.Objects.requireNonNull(r5, r0)
            java.lang.String r0 = "zone"
            java.util.Objects.requireNonNull(r6, r0)
            boolean r0 = r6 instanceof j$.time.ZoneOffset
            if (r0 == 0) goto L17
            j$.time.chrono.ChronoZonedDateTimeImpl r7 = new j$.time.chrono.ChronoZonedDateTimeImpl
            r0 = r6
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            r7.<init>(r5, r0, r6)
            return r7
        L17:
            j$.time.zone.ZoneRules r0 = r6.c()
            j$.time.LocalDateTime r1 = j$.time.LocalDateTime.d(r5)
            java.util.List r2 = r0.b(r1)
            int r3 = r2.size()
            r4 = 1
            if (r3 != r4) goto L2b
            goto L4f
        L2b:
            int r3 = r2.size()
            if (r3 != 0) goto L46
            j$.time.zone.ZoneOffsetTransition r7 = r0.d(r1)
            j$.time.Duration r0 = r7.c()
            long r0 = r0.b()
            j$.time.chrono.ChronoLocalDateTimeImpl r5 = r5.e(r0)
            j$.time.ZoneOffset r7 = r7.e()
            goto L56
        L46:
            if (r7 == 0) goto L4f
            boolean r0 = r2.contains(r7)
            if (r0 == 0) goto L4f
            goto L56
        L4f:
            r7 = 0
            java.lang.Object r7 = r2.get(r7)
            j$.time.ZoneOffset r7 = (j$.time.ZoneOffset) r7
        L56:
            java.lang.String r0 = "offset"
            java.util.Objects.requireNonNull(r7, r0)
            j$.time.chrono.ChronoZonedDateTimeImpl r0 = new j$.time.chrono.ChronoZonedDateTimeImpl
            r0.<init>(r5, r7, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.ChronoZonedDateTimeImpl.c(j$.time.chrono.ChronoLocalDateTimeImpl, j$.time.ZoneId, j$.time.ZoneOffset):o.doA");
    }

    private ChronoZonedDateTimeImpl d(Instant instant, ZoneId zoneId) {
        return a(j(), instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 3, this);
    }

    @Override // o.doX
    public long a(doX dox, InterfaceC8540dpj interfaceC8540dpj) {
        Objects.requireNonNull(dox, "endExclusive");
        doA a = j().a(dox);
        if (interfaceC8540dpj instanceof ChronoUnit) {
            return this.d.a(a.a((ZoneId) this.b).f(), interfaceC8540dpj);
        }
        Objects.requireNonNull(interfaceC8540dpj, "unit");
        return interfaceC8540dpj.d(this, a);
    }

    @Override // o.doA
    public doA a(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : d(this.d.a(this.b), zoneId);
    }

    @Override // o.doA
    public ZoneId b() {
        return this.c;
    }

    @Override // o.doA, o.doX
    /* renamed from: b */
    public doA d(InterfaceC8535dpe interfaceC8535dpe, long j) {
        if (interfaceC8535dpe instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) interfaceC8535dpe;
            int i = AnonymousClass4.e[chronoField.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return c(this.d.d(interfaceC8535dpe, j), this.c, this.b);
                }
                return d(this.d.a(ZoneOffset.e(chronoField.b(j))), this.c);
            }
            return b(j - k(), ChronoUnit.SECONDS);
        }
        return a(j(), interfaceC8535dpe.d(this, j));
    }

    @Override // o.doA
    public ZoneOffset d() {
        return this.b;
    }

    @Override // o.doA
    public doA d(ZoneId zoneId) {
        return c(this.d, zoneId, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.d);
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.c);
    }

    @Override // o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        return (interfaceC8535dpe instanceof ChronoField) || (interfaceC8535dpe != null && interfaceC8535dpe.a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof doA) && compareTo((doA) obj) == 0;
    }

    @Override // o.doA, o.doX
    /* renamed from: f */
    public doA b(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return interfaceC8540dpj instanceof ChronoUnit ? a(this.d.f(j, interfaceC8540dpj)) : a(j(), interfaceC8540dpj.e(this, j));
    }

    @Override // o.doA
    public InterfaceC8529doz f() {
        return this.d;
    }

    public int hashCode() {
        return (f().hashCode() ^ d().hashCode()) ^ Integer.rotateLeft(b().hashCode(), 3);
    }

    public String toString() {
        String str = f().toString() + d().toString();
        if (d() != b()) {
            return str + "[" + b().toString() + "]";
        }
        return str;
    }
}

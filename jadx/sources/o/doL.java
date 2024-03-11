package o;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ValueRange;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class doL {
    private doE a;
    private int c;
    private doY d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public doL(doY doy, doE doe) {
        this.d = e(doy, doe);
        this.a = doe;
    }

    private static doY e(final doY doy, doE doe) {
        ChronoField[] values;
        InterfaceC8528doy b = doe.b();
        ZoneId d = doe.d();
        if (b == null && d == null) {
            return doy;
        }
        InterfaceC8528doy interfaceC8528doy = (InterfaceC8528doy) doy.b(AbstractC8538dph.c());
        final ZoneId zoneId = (ZoneId) doy.b(AbstractC8538dph.h());
        final InterfaceC8526dow interfaceC8526dow = null;
        if (Objects.equals(b, interfaceC8528doy)) {
            b = null;
        }
        if (Objects.equals(d, zoneId)) {
            d = null;
        }
        if (b == null && d == null) {
            return doy;
        }
        final InterfaceC8528doy interfaceC8528doy2 = b != null ? b : interfaceC8528doy;
        if (d != null) {
            if (doy.e(ChronoField.l)) {
                return ((InterfaceC8528doy) AbstractC8524dou.d(interfaceC8528doy2, IsoChronology.d)).e(Instant.c(doy), d);
            }
            if (d.b() instanceof ZoneOffset) {
                ChronoField chronoField = ChronoField.u;
                if (doy.e(chronoField) && doy.b(chronoField) != d.c().a(Instant.e).a()) {
                    throw new DateTimeException("Unable to apply override zone '" + d + "' because the temporal object being formatted has a different offset but does not represent an instant: " + doy);
                }
            }
        }
        if (d != null) {
            zoneId = d;
        }
        if (b != null) {
            if (doy.e(ChronoField.k)) {
                interfaceC8526dow = interfaceC8528doy2.b(doy);
            } else if (b != IsoChronology.d || interfaceC8528doy != null) {
                for (ChronoField chronoField2 : ChronoField.values()) {
                    if (chronoField2.d() && doy.e(chronoField2)) {
                        throw new DateTimeException("Unable to apply override chronology '" + b + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + doy);
                    }
                }
            }
        }
        return new doY() { // from class: o.doL.2
            @Override // o.doY
            public long a(InterfaceC8535dpe interfaceC8535dpe) {
                return ((InterfaceC8526dow.this == null || !interfaceC8535dpe.d()) ? doy : InterfaceC8526dow.this).a(interfaceC8535dpe);
            }

            @Override // o.doY
            public Object b(InterfaceC8537dpg interfaceC8537dpg) {
                return interfaceC8537dpg == AbstractC8538dph.c() ? interfaceC8528doy2 : interfaceC8537dpg == AbstractC8538dph.h() ? zoneId : interfaceC8537dpg == AbstractC8538dph.d() ? doy.b(interfaceC8537dpg) : interfaceC8537dpg.e(this);
            }

            @Override // o.doY
            public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
                return ((InterfaceC8526dow.this == null || !interfaceC8535dpe.d()) ? doy : InterfaceC8526dow.this).d(interfaceC8535dpe);
            }

            @Override // o.doY
            public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
                return (InterfaceC8526dow.this == null || !interfaceC8535dpe.d()) ? doy.e(interfaceC8535dpe) : InterfaceC8526dow.this.e(interfaceC8535dpe);
            }

            public String toString() {
                String str;
                doY doy2 = doy;
                InterfaceC8528doy interfaceC8528doy3 = interfaceC8528doy2;
                String str2 = "";
                if (interfaceC8528doy3 != null) {
                    str = " with chronology " + interfaceC8528doy3;
                } else {
                    str = "";
                }
                ZoneId zoneId2 = zoneId;
                if (zoneId2 != null) {
                    str2 = " with zone " + zoneId2;
                }
                return doy2 + str + str2;
            }
        };
    }

    public Long a(InterfaceC8535dpe interfaceC8535dpe) {
        if (this.c <= 0 || this.d.e(interfaceC8535dpe)) {
            return Long.valueOf(this.d.a(interfaceC8535dpe));
        }
        return null;
    }

    public void a() {
        this.c++;
    }

    public Object b(InterfaceC8537dpg interfaceC8537dpg) {
        Object b = this.d.b(interfaceC8537dpg);
        if (b == null && this.c == 0) {
            doY doy = this.d;
            throw new DateTimeException("Unable to extract " + interfaceC8537dpg + " from temporal " + doy);
        }
        return b;
    }

    public doO b() {
        return this.a.c();
    }

    public doY c() {
        return this.d;
    }

    public Locale d() {
        return this.a.e();
    }

    public void e() {
        this.c--;
    }

    public String toString() {
        return this.d.toString();
    }
}

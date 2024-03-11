package o;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;

/* renamed from: o.dph  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8538dph {
    static final InterfaceC8537dpg j = new InterfaceC8537dpg() { // from class: o.dph.1
        @Override // o.InterfaceC8537dpg
        /* renamed from: a */
        public ZoneId e(doY doy) {
            return (ZoneId) doy.b(AbstractC8538dph.j);
        }

        public String toString() {
            return "ZoneId";
        }
    };
    static final InterfaceC8537dpg c = new InterfaceC8537dpg() { // from class: o.dph.4
        @Override // o.InterfaceC8537dpg
        /* renamed from: a */
        public InterfaceC8528doy e(doY doy) {
            return (InterfaceC8528doy) doy.b(AbstractC8538dph.c);
        }

        public String toString() {
            return "Chronology";
        }
    };
    static final InterfaceC8537dpg d = new InterfaceC8537dpg() { // from class: o.dph.5
        @Override // o.InterfaceC8537dpg
        /* renamed from: b */
        public InterfaceC8540dpj e(doY doy) {
            return (InterfaceC8540dpj) doy.b(AbstractC8538dph.d);
        }

        public String toString() {
            return "Precision";
        }
    };
    static final InterfaceC8537dpg e = new InterfaceC8537dpg() { // from class: o.dph.2
        @Override // o.InterfaceC8537dpg
        /* renamed from: d */
        public ZoneOffset e(doY doy) {
            ChronoField chronoField = ChronoField.u;
            if (doy.e(chronoField)) {
                return ZoneOffset.e(doy.b(chronoField));
            }
            return null;
        }

        public String toString() {
            return "ZoneOffset";
        }
    };
    static final InterfaceC8537dpg i = new InterfaceC8537dpg() { // from class: o.dph.3
        @Override // o.InterfaceC8537dpg
        /* renamed from: c */
        public ZoneId e(doY doy) {
            ZoneId zoneId = (ZoneId) doy.b(AbstractC8538dph.j);
            return zoneId != null ? zoneId : (ZoneId) doy.b(AbstractC8538dph.e);
        }

        public String toString() {
            return "Zone";
        }
    };
    static final InterfaceC8537dpg a = new InterfaceC8537dpg() { // from class: o.dph.10
        @Override // o.InterfaceC8537dpg
        /* renamed from: b */
        public LocalDate e(doY doy) {
            ChronoField chronoField = ChronoField.k;
            if (doy.e(chronoField)) {
                return LocalDate.b(doy.a(chronoField));
            }
            return null;
        }

        public String toString() {
            return "LocalDate";
        }
    };
    static final InterfaceC8537dpg b = new InterfaceC8537dpg() { // from class: o.dph.8
        @Override // o.InterfaceC8537dpg
        /* renamed from: b */
        public LocalTime e(doY doy) {
            ChronoField chronoField = ChronoField.x;
            if (doy.e(chronoField)) {
                return LocalTime.b(doy.a(chronoField));
            }
            return null;
        }

        public String toString() {
            return "LocalTime";
        }
    };

    public static InterfaceC8537dpg a() {
        return a;
    }

    public static InterfaceC8537dpg b() {
        return e;
    }

    public static InterfaceC8537dpg c() {
        return c;
    }

    public static InterfaceC8537dpg d() {
        return d;
    }

    public static InterfaceC8537dpg e() {
        return b;
    }

    public static InterfaceC8537dpg g() {
        return i;
    }

    public static InterfaceC8537dpg h() {
        return j;
    }
}

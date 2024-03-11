package j$.time;

import j$.time.zone.ZoneRules;
import j$.time.zone.ZoneRulesException;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import o.AbstractC8522dos;
import o.AbstractC8524dou;
import o.AbstractC8525dov;
import o.AbstractC8538dph;
import o.AbstractC8544dpn;
import o.doY;

/* loaded from: classes.dex */
public abstract class ZoneId implements Serializable {
    public static final Map c = AbstractC8522dos.c(new Map.Entry[]{AbstractC8525dov.d("ACT", "Australia/Darwin"), AbstractC8525dov.d("AET", "Australia/Sydney"), AbstractC8525dov.d("AGT", "America/Argentina/Buenos_Aires"), AbstractC8525dov.d("ART", "Africa/Cairo"), AbstractC8525dov.d("AST", "America/Anchorage"), AbstractC8525dov.d("BET", "America/Sao_Paulo"), AbstractC8525dov.d("BST", "Asia/Dhaka"), AbstractC8525dov.d("CAT", "Africa/Harare"), AbstractC8525dov.d("CNT", "America/St_Johns"), AbstractC8525dov.d("CST", "America/Chicago"), AbstractC8525dov.d("CTT", "Asia/Shanghai"), AbstractC8525dov.d("EAT", "Africa/Addis_Ababa"), AbstractC8525dov.d("ECT", "Europe/Paris"), AbstractC8525dov.d("IET", "America/Indiana/Indianapolis"), AbstractC8525dov.d("IST", "Asia/Kolkata"), AbstractC8525dov.d("JST", "Asia/Tokyo"), AbstractC8525dov.d("MIT", "Pacific/Apia"), AbstractC8525dov.d("NET", "Asia/Yerevan"), AbstractC8525dov.d("NST", "Pacific/Auckland"), AbstractC8525dov.d("PLT", "Asia/Karachi"), AbstractC8525dov.d("PNT", "America/Phoenix"), AbstractC8525dov.d("PRT", "America/Puerto_Rico"), AbstractC8525dov.d("PST", "America/Los_Angeles"), AbstractC8525dov.d("SST", "Pacific/Guadalcanal"), AbstractC8525dov.d("VST", "Asia/Ho_Chi_Minh"), AbstractC8525dov.d("EST", "-05:00"), AbstractC8525dov.d("MST", "-07:00"), AbstractC8525dov.d("HST", "-10:00")});
    private static final long serialVersionUID = 8352817235686L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != ZoneRegion.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId a(doY doy) {
        ZoneId zoneId = (ZoneId) doy.b(AbstractC8538dph.g());
        if (zoneId != null) {
            return zoneId;
        }
        String name = doy.getClass().getName();
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + doy + " of type " + name);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneId b(String str, boolean z) {
        int i;
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.e(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            i = 3;
        } else if (!str.startsWith("UT")) {
            return ZoneRegion.e(str, z);
        } else {
            i = 2;
        }
        return e(str, i, z);
    }

    public static ZoneId d(String str) {
        return b(str, true);
    }

    public static ZoneId d(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (str.equals("GMT") || str.equals("UTC") || str.equals("UT")) {
            if (zoneOffset.a() != 0) {
                str = str.concat(zoneOffset.d());
            }
            return new ZoneRegion(str, zoneOffset.c());
        }
        throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: " + str);
    }

    public static ZoneId e() {
        return AbstractC8544dpn.a(TimeZone.getDefault());
    }

    private static ZoneId e(String str, int i, boolean z) {
        String substring = str.substring(0, i);
        if (str.length() == i) {
            return d(substring, ZoneOffset.e);
        }
        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            try {
                ZoneOffset e = ZoneOffset.e(str.substring(i));
                return e == ZoneOffset.e ? d(substring, e) : d(substring, e);
            } catch (DateTimeException e2) {
                throw new DateTimeException("Invalid ID for offset-based ZoneId: " + str, e2);
            }
        }
        return ZoneRegion.e(str, z);
    }

    public static ZoneId e(String str, Map map) {
        Objects.requireNonNull(str, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        return d((String) AbstractC8524dou.d((String) map.get(str), str));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 7, this);
    }

    public ZoneId b() {
        try {
            ZoneRules c2 = c();
            if (c2.d()) {
                return c2.a(Instant.e);
            }
        } catch (ZoneRulesException unused) {
        }
        return this;
    }

    public abstract ZoneRules c();

    public abstract String d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(DataOutput dataOutput);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return d().equals(((ZoneId) obj).d());
        }
        return false;
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return d();
    }
}

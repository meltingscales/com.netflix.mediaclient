package o;

import j$.time.ZoneId;
import java.util.TimeZone;

/* renamed from: o.dpm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8543dpm {
    public static TimeZone c(String str) {
        return TimeZone.getTimeZone(str);
    }

    public static ZoneId d(TimeZone timeZone) {
        return ZoneId.e(timeZone.getID(), ZoneId.c);
    }
}

package o;

import j$.time.Duration;

/* renamed from: o.dot  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8523dot {
    public static Duration b(java.time.Duration duration) {
        if (duration == null) {
            return null;
        }
        return Duration.b(duration.getSeconds(), duration.getNano());
    }

    public static java.time.Duration d(Duration duration) {
        if (duration == null) {
            return null;
        }
        return java.time.Duration.ofSeconds(duration.b(), duration.c());
    }
}

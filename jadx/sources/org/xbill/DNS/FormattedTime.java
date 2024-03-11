package org.xbill.DNS;

import j$.time.Instant;
import j$.time.ZoneOffset;
import o.doE;

/* loaded from: classes5.dex */
final class FormattedTime {
    private static final doE DEFAULT_FORMAT = doE.d("yyyyMMddHHmmss").a(ZoneOffset.e);

    public static String format(Instant instant) {
        return DEFAULT_FORMAT.b(instant);
    }
}

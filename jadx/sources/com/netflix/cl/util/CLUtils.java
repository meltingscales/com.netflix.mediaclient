package com.netflix.cl.util;

import com.netflix.cl.Logger;
import com.netflix.cl.Platform;
import com.netflix.cl.model.event.session.Session;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes.dex */
public final class CLUtils {
    private static long INCREMENTING_BITS_MASK = ((long) Math.pow(2.0d, 28)) - 1;
    private static int RANDOM_BITS_COUNT = 25;
    private static long RANDOM_BITS_SHIFT = (long) Math.pow(2.0d, RANDOM_BITS_COUNT);
    private static long sLastId;
    private static long sLastIncrementingBits;

    private CLUtils() {
    }

    public static long createContextId() {
        long j;
        synchronized (CLUtils.class) {
            long floor = (((long) Math.floor(Platform.getCurrentTimeInMs())) / 1000) & INCREMENTING_BITS_MASK;
            long floor2 = (long) Math.floor(Math.random() * RANDOM_BITS_SHIFT);
            long j2 = sLastIncrementingBits;
            if (floor <= j2) {
                floor = 1 + j2;
            }
            sLastIncrementingBits = floor;
            j = (floor * RANDOM_BITS_SHIFT) + floor2;
            sLastId = j;
        }
        return j;
    }

    public static String getStackTraceString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static boolean startNamedSession(String str, Session session) {
        Long startSession;
        if (str == null || session == null || (startSession = Logger.INSTANCE.startSession(session)) == null) {
            return false;
        }
        NamedLogSessionLookup.INSTANCE.addSession(str, startSession);
        return true;
    }

    public static void cancelNamedSession(String str) {
        if (str == null) {
            return;
        }
        Logger.INSTANCE.cancelSession(NamedLogSessionLookup.INSTANCE.removeSessionId(str));
    }
}

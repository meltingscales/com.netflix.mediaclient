package com.netflix.clcs.models;

import o.C8600drp;
import o.InterfaceC8598drn;

/* loaded from: classes2.dex */
public interface InterstitialLoggingHandler {
    void a(boolean z, String str, String str2);

    void b();

    void b(LoggingSessionType loggingSessionType, String str, String str2, String str3);

    void b(String str);

    void b(String str, String str2, String str3, Exception exc);

    void b(boolean z, String str, String str2);

    void c(String str, String str2);

    void c(boolean z);

    void d(String str);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class LoggingSessionType {
        private static final /* synthetic */ InterfaceC8598drn c;
        private static final /* synthetic */ LoggingSessionType[] j;
        public static final LoggingSessionType e = new LoggingSessionType("END_PRESENTATION", 0);
        public static final LoggingSessionType a = new LoggingSessionType("PRESENTATION", 1);
        public static final LoggingSessionType b = new LoggingSessionType("CONTEXT", 2);
        public static final LoggingSessionType d = new LoggingSessionType("END_CONTEXT", 3);

        private static final /* synthetic */ LoggingSessionType[] b() {
            return new LoggingSessionType[]{e, a, b, d};
        }

        public static LoggingSessionType valueOf(String str) {
            return (LoggingSessionType) Enum.valueOf(LoggingSessionType.class, str);
        }

        public static LoggingSessionType[] values() {
            return (LoggingSessionType[]) j.clone();
        }

        private LoggingSessionType(String str, int i) {
        }

        static {
            LoggingSessionType[] b2 = b();
            j = b2;
            c = C8600drp.e(b2);
        }
    }
}

package org.linphone.tools;

import org.linphone.core.LpConfig;
import org.linphone.mediastream.Log;

/* loaded from: classes6.dex */
public class Lpc2Xml {
    private static boolean mAvailable;
    private long internalPtr = 0;

    /* loaded from: classes6.dex */
    enum LogLevel {
        DEBUG,
        MESSAGE,
        WARNING,
        ERROR
    }

    private native void destroy();

    private native void init();

    static boolean isAvailable() {
        return mAvailable;
    }

    public native int convertFile(String str);

    public native int convertString(StringBuffer stringBuffer);

    public native int setLpc(LpConfig lpConfig);

    public Lpc2Xml() {
        init();
    }

    public void finalize() {
        destroy();
    }

    /* renamed from: org.linphone.tools.Lpc2Xml$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$linphone$tools$Lpc2Xml$LogLevel;

        static {
            int[] iArr = new int[LogLevel.values().length];
            $SwitchMap$org$linphone$tools$Lpc2Xml$LogLevel = iArr;
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$linphone$tools$Lpc2Xml$LogLevel[LogLevel.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$linphone$tools$Lpc2Xml$LogLevel[LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$linphone$tools$Lpc2Xml$LogLevel[LogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void printLog(int i, String str) {
        if (i <= 0 || i >= LogLevel.values().length) {
            return;
        }
        int i2 = AnonymousClass1.$SwitchMap$org$linphone$tools$Lpc2Xml$LogLevel[LogLevel.values()[i].ordinal()];
        if (i2 == 1) {
            Log.d(str);
        } else if (i2 == 2) {
            Log.i(str);
        } else if (i2 == 3) {
            Log.w(str);
        } else if (i2 != 4) {
        } else {
            Log.e(str);
        }
    }

    static {
        try {
            System.loadLibrary("xml2");
            mAvailable = true;
        } catch (Throwable unused) {
            mAvailable = false;
        }
    }
}

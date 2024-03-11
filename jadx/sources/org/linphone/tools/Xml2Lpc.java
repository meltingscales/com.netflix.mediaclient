package org.linphone.tools;

import org.linphone.core.LpConfig;
import org.linphone.mediastream.Log;

/* loaded from: classes6.dex */
public class Xml2Lpc {
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

    public static boolean isAvailable() {
        return mAvailable;
    }

    public native int convert(LpConfig lpConfig);

    public native int setXmlFile(String str);

    public native int setXmlString(String str);

    public native int setXsdFile(String str);

    public native int setXsdString(String str);

    public native int validate();

    public Xml2Lpc() {
        init();
    }

    public void finalize() {
        destroy();
    }

    /* renamed from: org.linphone.tools.Xml2Lpc$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$linphone$tools$Xml2Lpc$LogLevel;

        static {
            int[] iArr = new int[LogLevel.values().length];
            $SwitchMap$org$linphone$tools$Xml2Lpc$LogLevel = iArr;
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$linphone$tools$Xml2Lpc$LogLevel[LogLevel.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$linphone$tools$Xml2Lpc$LogLevel[LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$linphone$tools$Xml2Lpc$LogLevel[LogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void printLog(int i, String str) {
        if (i <= 0 || i >= LogLevel.values().length) {
            return;
        }
        int i2 = AnonymousClass1.$SwitchMap$org$linphone$tools$Xml2Lpc$LogLevel[LogLevel.values()[i].ordinal()];
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
            new Xml2Lpc();
            mAvailable = true;
        } catch (Throwable unused) {
            mAvailable = false;
        }
    }
}

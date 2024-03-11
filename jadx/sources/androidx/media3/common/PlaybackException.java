package androidx.media3.common;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.Bundleable;
import androidx.media3.common.util.Util;

/* loaded from: classes2.dex */
public class PlaybackException extends Exception implements Bundleable {
    public final int errorCode;
    public final long timestampMs;
    private static final String FIELD_INT_ERROR_CODE = Util.intToStringMaxRadix(0);
    private static final String FIELD_LONG_TIMESTAMP_MS = Util.intToStringMaxRadix(1);
    private static final String FIELD_STRING_MESSAGE = Util.intToStringMaxRadix(2);
    private static final String FIELD_STRING_CAUSE_CLASS_NAME = Util.intToStringMaxRadix(3);
    private static final String FIELD_STRING_CAUSE_MESSAGE = Util.intToStringMaxRadix(4);
    public static final Bundleable.Creator<PlaybackException> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.PlaybackException$$ExternalSyntheticLambda0
        @Override // androidx.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return new PlaybackException(bundle);
        }
    };

    public PlaybackException(Bundle bundle) {
        this(bundle.getString(FIELD_STRING_MESSAGE), getCauseFromBundle(bundle), bundle.getInt(FIELD_INT_ERROR_CODE, 1000), bundle.getLong(FIELD_LONG_TIMESTAMP_MS, SystemClock.elapsedRealtime()));
    }

    public PlaybackException(String str, Throwable th, int i, long j) {
        super(str, th);
        this.errorCode = i;
        this.timestampMs = j;
    }

    @Override // androidx.media3.common.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_INT_ERROR_CODE, this.errorCode);
        bundle.putLong(FIELD_LONG_TIMESTAMP_MS, this.timestampMs);
        bundle.putString(FIELD_STRING_MESSAGE, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(FIELD_STRING_CAUSE_CLASS_NAME, cause.getClass().getName());
            bundle.putString(FIELD_STRING_CAUSE_MESSAGE, cause.getMessage());
        }
        return bundle;
    }

    private static Throwable createThrowable(Class<?> cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    private static RemoteException createRemoteException(String str) {
        return new RemoteException(str);
    }

    private static Throwable getCauseFromBundle(Bundle bundle) {
        String string = bundle.getString(FIELD_STRING_CAUSE_CLASS_NAME);
        String string2 = bundle.getString(FIELD_STRING_CAUSE_MESSAGE);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, PlaybackException.class.getClassLoader());
            Throwable createThrowable = Throwable.class.isAssignableFrom(cls) ? createThrowable(cls, string2) : null;
            if (createThrowable != null) {
                return createThrowable;
            }
        } catch (Throwable unused) {
        }
        return createRemoteException(string2);
    }
}

package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;

/* loaded from: classes2.dex */
public final class DrmUtil {
    public static int getErrorCodeForMediaDrmException(Exception exc, int i) {
        int i2 = Util.SDK_INT;
        if (i2 >= 21 && Api21.isMediaDrmStateException(exc)) {
            return Api21.mediaDrmStateExceptionToErrorCode(exc);
        }
        if (i2 < 23 || !Api23.isMediaDrmResetException(exc)) {
            if (i2 < 18 || !Api18.isNotProvisionedException(exc)) {
                if (i2 < 18 || !Api18.isDeniedByServerException(exc)) {
                    if (exc instanceof UnsupportedDrmException) {
                        return 6001;
                    }
                    if (i2 < 18 || !Api18.isMissingSchemeDataException(exc)) {
                        if (exc instanceof KeysExpiredException) {
                            return 6008;
                        }
                        if (i == 1) {
                            return 6006;
                        }
                        if (i == 2) {
                            return 6004;
                        }
                        if (i == 3) {
                            return 6002;
                        }
                        throw new IllegalArgumentException();
                    }
                    return 6003;
                }
                return 6007;
            }
            return 6002;
        }
        return 6006;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Api18 {
        public static boolean isNotProvisionedException(Throwable th) {
            return th instanceof NotProvisionedException;
        }

        public static boolean isDeniedByServerException(Throwable th) {
            return th instanceof DeniedByServerException;
        }

        public static boolean isMissingSchemeDataException(Throwable th) {
            return th instanceof DefaultDrmSessionManager.MissingSchemeDataException;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Api21 {
        public static boolean isMediaDrmStateException(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int mediaDrmStateExceptionToErrorCode(Throwable th) {
            return Util.getErrorCodeForMediaDrmErrorCode(Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Api23 {
        public static boolean isMediaDrmResetException(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }
}

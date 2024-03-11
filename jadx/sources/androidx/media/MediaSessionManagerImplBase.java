package androidx.media;

import android.text.TextUtils;
import androidx.core.util.ObjectsCompat;
import androidx.media.MediaSessionManager;

/* loaded from: classes2.dex */
class MediaSessionManagerImplBase {
    private static final boolean DEBUG = MediaSessionManager.DEBUG;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class RemoteUserInfoImplBase implements MediaSessionManager.RemoteUserInfoImpl {
        private String mPackageName;
        private int mPid;
        private int mUid;

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public String getPackageName() {
            return this.mPackageName;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public RemoteUserInfoImplBase(String str, int i, int i2) {
            this.mPackageName = str;
            this.mPid = i;
            this.mUid = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RemoteUserInfoImplBase) {
                RemoteUserInfoImplBase remoteUserInfoImplBase = (RemoteUserInfoImplBase) obj;
                return (this.mPid < 0 || remoteUserInfoImplBase.mPid < 0) ? TextUtils.equals(this.mPackageName, remoteUserInfoImplBase.mPackageName) && this.mUid == remoteUserInfoImplBase.mUid : TextUtils.equals(this.mPackageName, remoteUserInfoImplBase.mPackageName) && this.mPid == remoteUserInfoImplBase.mPid && this.mUid == remoteUserInfoImplBase.mUid;
            }
            return false;
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.mPackageName, Integer.valueOf(this.mUid));
        }
    }
}

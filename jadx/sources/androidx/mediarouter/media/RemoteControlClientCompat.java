package androidx.mediarouter.media;

import android.content.Context;
import androidx.mediarouter.media.MediaRouterJellybean;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
abstract class RemoteControlClientCompat {
    protected final Context mContext;
    protected final Object mRcc;
    protected VolumeCallback mVolumeCallback;

    /* loaded from: classes2.dex */
    public static final class PlaybackInfo {
        public int volume;
        public String volumeControlId;
        public int volumeMax;
        public int volumeHandling = 0;
        public int playbackStream = 3;
        public int playbackType = 1;
    }

    /* loaded from: classes2.dex */
    public interface VolumeCallback {
        void onVolumeSetRequest(int i);

        void onVolumeUpdateRequest(int i);
    }

    public Object getRemoteControlClient() {
        return this.mRcc;
    }

    public void setPlaybackInfo(PlaybackInfo playbackInfo) {
    }

    public void setVolumeCallback(VolumeCallback volumeCallback) {
        this.mVolumeCallback = volumeCallback;
    }

    protected RemoteControlClientCompat(Context context, Object obj) {
        this.mContext = context;
        this.mRcc = obj;
    }

    public static RemoteControlClientCompat obtain(Context context, Object obj) {
        return new JellybeanImpl(context, obj);
    }

    /* loaded from: classes2.dex */
    static class JellybeanImpl extends RemoteControlClientCompat {
        private boolean mRegistered;
        private final Object mRouterObj;
        private final Object mUserRouteCategoryObj;
        private final Object mUserRouteObj;

        public JellybeanImpl(Context context, Object obj) {
            super(context, obj);
            Object mediaRouter = MediaRouterJellybean.getMediaRouter(context);
            this.mRouterObj = mediaRouter;
            Object createRouteCategory = MediaRouterJellybean.createRouteCategory(mediaRouter, "", false);
            this.mUserRouteCategoryObj = createRouteCategory;
            this.mUserRouteObj = MediaRouterJellybean.createUserRoute(mediaRouter, createRouteCategory);
        }

        @Override // androidx.mediarouter.media.RemoteControlClientCompat
        public void setPlaybackInfo(PlaybackInfo playbackInfo) {
            MediaRouterJellybean.UserRouteInfo.setVolume(this.mUserRouteObj, playbackInfo.volume);
            MediaRouterJellybean.UserRouteInfo.setVolumeMax(this.mUserRouteObj, playbackInfo.volumeMax);
            MediaRouterJellybean.UserRouteInfo.setVolumeHandling(this.mUserRouteObj, playbackInfo.volumeHandling);
            MediaRouterJellybean.UserRouteInfo.setPlaybackStream(this.mUserRouteObj, playbackInfo.playbackStream);
            MediaRouterJellybean.UserRouteInfo.setPlaybackType(this.mUserRouteObj, playbackInfo.playbackType);
            if (this.mRegistered) {
                return;
            }
            this.mRegistered = true;
            MediaRouterJellybean.UserRouteInfo.setVolumeCallback(this.mUserRouteObj, MediaRouterJellybean.createVolumeCallback(new VolumeCallbackWrapper(this)));
            MediaRouterJellybean.UserRouteInfo.setRemoteControlClient(this.mUserRouteObj, this.mRcc);
        }

        /* loaded from: classes2.dex */
        static final class VolumeCallbackWrapper implements MediaRouterJellybean.VolumeCallback {
            private final WeakReference<JellybeanImpl> mImplWeak;

            public VolumeCallbackWrapper(JellybeanImpl jellybeanImpl) {
                this.mImplWeak = new WeakReference<>(jellybeanImpl);
            }

            @Override // androidx.mediarouter.media.MediaRouterJellybean.VolumeCallback
            public void onVolumeUpdateRequest(Object obj, int i) {
                VolumeCallback volumeCallback;
                JellybeanImpl jellybeanImpl = this.mImplWeak.get();
                if (jellybeanImpl == null || (volumeCallback = jellybeanImpl.mVolumeCallback) == null) {
                    return;
                }
                volumeCallback.onVolumeUpdateRequest(i);
            }

            @Override // androidx.mediarouter.media.MediaRouterJellybean.VolumeCallback
            public void onVolumeSetRequest(Object obj, int i) {
                VolumeCallback volumeCallback;
                JellybeanImpl jellybeanImpl = this.mImplWeak.get();
                if (jellybeanImpl == null || (volumeCallback = jellybeanImpl.mVolumeCallback) == null) {
                    return;
                }
                volumeCallback.onVolumeSetRequest(i);
            }
        }
    }
}

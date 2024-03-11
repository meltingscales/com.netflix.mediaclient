package androidx.mediarouter.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.core.util.ObjectsCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class MediaRouteProvider {
    private Callback mCallback;
    private final Context mContext;
    private MediaRouteProviderDescriptor mDescriptor;
    private MediaRouteDiscoveryRequest mDiscoveryRequest;
    private final ProviderHandler mHandler;
    private final ProviderMetadata mMetadata;
    private boolean mPendingDescriptorChange;
    private boolean mPendingDiscoveryRequestChange;

    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public void onDescriptorChanged(MediaRouteProvider mediaRouteProvider, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        }
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final MediaRouteProviderDescriptor getDescriptor() {
        return this.mDescriptor;
    }

    public final MediaRouteDiscoveryRequest getDiscoveryRequest() {
        return this.mDiscoveryRequest;
    }

    public final Handler getHandler() {
        return this.mHandler;
    }

    public final ProviderMetadata getMetadata() {
        return this.mMetadata;
    }

    public void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
    }

    public MediaRouteProvider(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaRouteProvider(Context context, ProviderMetadata providerMetadata) {
        this.mHandler = new ProviderHandler();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.mContext = context;
        this.mMetadata = providerMetadata == null ? new ProviderMetadata(new ComponentName(context, getClass())) : providerMetadata;
    }

    public final void setCallback(Callback callback) {
        MediaRouter.checkCallingThread();
        this.mCallback = callback;
    }

    public final void setDiscoveryRequest(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
        MediaRouter.checkCallingThread();
        if (ObjectsCompat.equals(this.mDiscoveryRequest, mediaRouteDiscoveryRequest)) {
            return;
        }
        setDiscoveryRequestInternal(mediaRouteDiscoveryRequest);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setDiscoveryRequestInternal(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
        this.mDiscoveryRequest = mediaRouteDiscoveryRequest;
        if (this.mPendingDiscoveryRequestChange) {
            return;
        }
        this.mPendingDiscoveryRequestChange = true;
        this.mHandler.sendEmptyMessage(2);
    }

    void deliverDiscoveryRequestChanged() {
        this.mPendingDiscoveryRequestChange = false;
        onDiscoveryRequestChanged(this.mDiscoveryRequest);
    }

    public final void setDescriptor(MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        MediaRouter.checkCallingThread();
        if (this.mDescriptor != mediaRouteProviderDescriptor) {
            this.mDescriptor = mediaRouteProviderDescriptor;
            if (this.mPendingDescriptorChange) {
                return;
            }
            this.mPendingDescriptorChange = true;
            this.mHandler.sendEmptyMessage(1);
        }
    }

    void deliverDescriptorChanged() {
        this.mPendingDescriptorChange = false;
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onDescriptorChanged(this, this.mDescriptor);
        }
    }

    public RouteController onCreateRouteController(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public RouteController onCreateRouteController(String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                throw new IllegalArgumentException("routeGroupId cannot be null");
            }
            return onCreateRouteController(str);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public DynamicGroupRouteController onCreateDynamicGroupRouteController(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    /* loaded from: classes2.dex */
    public static final class ProviderMetadata {
        private final ComponentName mComponentName;

        public ComponentName getComponentName() {
            return this.mComponentName;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ProviderMetadata(ComponentName componentName) {
            if (componentName == null) {
                throw new IllegalArgumentException("componentName must not be null");
            }
            this.mComponentName = componentName;
        }

        public String getPackageName() {
            return this.mComponentName.getPackageName();
        }

        public String toString() {
            return "ProviderMetadata{ componentName=" + this.mComponentName.flattenToShortString() + " }";
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class RouteController {
        public void onRelease() {
        }

        public void onSelect() {
        }

        public void onSetVolume(int i) {
        }

        @Deprecated
        public void onUnselect() {
        }

        public void onUpdateVolume(int i) {
        }

        public void onUnselect(int i) {
            onUnselect();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class DynamicGroupRouteController extends RouteController {
        Executor mExecutor;
        OnDynamicRoutesChangedListener mListener;
        private final Object mLock = new Object();
        MediaRouteDescriptor mPendingGroupRoute;
        Collection<DynamicRouteDescriptor> mPendingRoutes;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public interface OnDynamicRoutesChangedListener {
            void onRoutesChanged(DynamicGroupRouteController dynamicGroupRouteController, MediaRouteDescriptor mediaRouteDescriptor, Collection<DynamicRouteDescriptor> collection);
        }

        public String getGroupableSelectionTitle() {
            return null;
        }

        public String getTransferableSectionTitle() {
            return null;
        }

        public abstract void onAddMemberRoute(String str);

        public abstract void onRemoveMemberRoute(String str);

        public abstract void onUpdateMemberRoutes(List<String> list);

        /* JADX INFO: Access modifiers changed from: package-private */
        public void setOnDynamicRoutesChangedListener(Executor executor, final OnDynamicRoutesChangedListener onDynamicRoutesChangedListener) {
            synchronized (this.mLock) {
                if (executor == null) {
                    throw new NullPointerException("Executor shouldn't be null");
                }
                if (onDynamicRoutesChangedListener == null) {
                    throw new NullPointerException("Listener shouldn't be null");
                }
                this.mExecutor = executor;
                this.mListener = onDynamicRoutesChangedListener;
                Collection<DynamicRouteDescriptor> collection = this.mPendingRoutes;
                if (collection != null && !collection.isEmpty()) {
                    final MediaRouteDescriptor mediaRouteDescriptor = this.mPendingGroupRoute;
                    final Collection<DynamicRouteDescriptor> collection2 = this.mPendingRoutes;
                    this.mPendingGroupRoute = null;
                    this.mPendingRoutes = null;
                    this.mExecutor.execute(new Runnable() { // from class: androidx.mediarouter.media.MediaRouteProvider.DynamicGroupRouteController.1
                        @Override // java.lang.Runnable
                        public void run() {
                            onDynamicRoutesChangedListener.onRoutesChanged(DynamicGroupRouteController.this, mediaRouteDescriptor, collection2);
                        }
                    });
                }
            }
        }

        public final void notifyDynamicRoutesChanged(final MediaRouteDescriptor mediaRouteDescriptor, final Collection<DynamicRouteDescriptor> collection) {
            if (mediaRouteDescriptor == null) {
                throw new NullPointerException("groupRoute must not be null");
            }
            if (collection == null) {
                throw new NullPointerException("dynamicRoutes must not be null");
            }
            synchronized (this.mLock) {
                Executor executor = this.mExecutor;
                if (executor != null) {
                    final OnDynamicRoutesChangedListener onDynamicRoutesChangedListener = this.mListener;
                    executor.execute(new Runnable() { // from class: androidx.mediarouter.media.MediaRouteProvider.DynamicGroupRouteController.3
                        @Override // java.lang.Runnable
                        public void run() {
                            onDynamicRoutesChangedListener.onRoutesChanged(DynamicGroupRouteController.this, mediaRouteDescriptor, collection);
                        }
                    });
                } else {
                    this.mPendingGroupRoute = mediaRouteDescriptor;
                    this.mPendingRoutes = new ArrayList(collection);
                }
            }
        }

        /* loaded from: classes2.dex */
        public static final class DynamicRouteDescriptor {
            final boolean mIsGroupable;
            final boolean mIsTransferable;
            final boolean mIsUnselectable;
            final MediaRouteDescriptor mMediaRouteDescriptor;
            final int mSelectionState;

            public MediaRouteDescriptor getRouteDescriptor() {
                return this.mMediaRouteDescriptor;
            }

            public int getSelectionState() {
                return this.mSelectionState;
            }

            public boolean isGroupable() {
                return this.mIsGroupable;
            }

            public boolean isTransferable() {
                return this.mIsTransferable;
            }

            public boolean isUnselectable() {
                return this.mIsUnselectable;
            }

            DynamicRouteDescriptor(MediaRouteDescriptor mediaRouteDescriptor, int i, boolean z, boolean z2, boolean z3) {
                this.mMediaRouteDescriptor = mediaRouteDescriptor;
                this.mSelectionState = i;
                this.mIsUnselectable = z;
                this.mIsGroupable = z2;
                this.mIsTransferable = z3;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public static DynamicRouteDescriptor fromBundle(Bundle bundle) {
                if (bundle == null) {
                    return null;
                }
                return new DynamicRouteDescriptor(MediaRouteDescriptor.fromBundle(bundle.getBundle("mrDescriptor")), bundle.getInt("selectionState", 1), bundle.getBoolean("isUnselectable", false), bundle.getBoolean("isGroupable", false), bundle.getBoolean("isTransferable", false));
            }

            /* loaded from: classes2.dex */
            public static final class Builder {
                private final MediaRouteDescriptor mRouteDescriptor;
                private int mSelectionState = 1;
                private boolean mIsUnselectable = false;
                private boolean mIsGroupable = false;
                private boolean mIsTransferable = false;

                public Builder setIsGroupable(boolean z) {
                    this.mIsGroupable = z;
                    return this;
                }

                public Builder setIsTransferable(boolean z) {
                    this.mIsTransferable = z;
                    return this;
                }

                public Builder setIsUnselectable(boolean z) {
                    this.mIsUnselectable = z;
                    return this;
                }

                public Builder setSelectionState(int i) {
                    this.mSelectionState = i;
                    return this;
                }

                public Builder(MediaRouteDescriptor mediaRouteDescriptor) {
                    this.mRouteDescriptor = mediaRouteDescriptor;
                }

                public DynamicRouteDescriptor build() {
                    return new DynamicRouteDescriptor(this.mRouteDescriptor, this.mSelectionState, this.mIsUnselectable, this.mIsGroupable, this.mIsTransferable);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class ProviderHandler extends Handler {
        ProviderHandler() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                MediaRouteProvider.this.deliverDescriptorChanged();
            } else if (i != 2) {
            } else {
                MediaRouteProvider.this.deliverDiscoveryRequestChanged();
            }
        }
    }
}

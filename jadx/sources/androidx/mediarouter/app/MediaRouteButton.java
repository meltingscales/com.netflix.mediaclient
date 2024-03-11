package androidx.mediarouter.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.mediarouter.R;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouterParams;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class MediaRouteButton extends View {
    private static final int[] CHECKABLE_STATE_SET;
    private static final int[] CHECKED_STATE_SET;
    private static int b = 1;
    private static int c;
    private static byte e$ss2$3020;
    private static ConnectivityReceiver sConnectivityReceiver;
    static final SparseArray<Drawable.ConstantState> sRemoteIndicatorCache;
    private boolean mAlwaysVisible;
    private boolean mAttachedToWindow;
    private ColorStateList mButtonTint;
    private final MediaRouterCallback mCallback;
    private boolean mCheatSheetEnabled;
    private int mConnectionState;
    private MediaRouteDialogFactory mDialogFactory;
    private int mMinHeight;
    private int mMinWidth;
    private Drawable mRemoteIndicator;
    RemoteIndicatorLoader mRemoteIndicatorLoader;
    private int mRemoteIndicatorResIdToLoad;
    private final MediaRouter mRouter;
    private MediaRouteSelector mSelector;
    private int mVisibility;

    static void c() {
        e$ss2$3020 = (byte) 24;
    }

    static {
        c();
        sRemoteIndicatorCache = new SparseArray<>(2);
        CHECKED_STATE_SET = new int[]{16842912};
        CHECKABLE_STATE_SET = new int[]{16842911};
    }

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.mediaRouteButtonStyle);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet, int i) {
        super(MediaRouterThemeHelper.createThemedButtonContext(context), attributeSet, i);
        Drawable.ConstantState constantState;
        this.mSelector = MediaRouteSelector.EMPTY;
        this.mDialogFactory = MediaRouteDialogFactory.getDefault();
        this.mVisibility = 0;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.MediaRouteButton, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context2, R.styleable.MediaRouteButton, attributeSet, obtainStyledAttributes, i, 0);
        if (isInEditMode()) {
            this.mRouter = null;
            this.mCallback = null;
            this.mRemoteIndicator = getResources().getDrawable(obtainStyledAttributes.getResourceId(R.styleable.MediaRouteButton_externalRouteEnabledDrawableStatic, 0));
            return;
        }
        this.mRouter = MediaRouter.getInstance(context2);
        this.mCallback = new MediaRouterCallback();
        if (sConnectivityReceiver == null) {
            sConnectivityReceiver = new ConnectivityReceiver(context2.getApplicationContext());
        }
        this.mButtonTint = obtainStyledAttributes.getColorStateList(R.styleable.MediaRouteButton_mediaRouteButtonTint);
        this.mMinWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MediaRouteButton_android_minWidth, 0);
        this.mMinHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MediaRouteButton_android_minHeight, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.MediaRouteButton_externalRouteEnabledDrawableStatic, 0);
        this.mRemoteIndicatorResIdToLoad = obtainStyledAttributes.getResourceId(R.styleable.MediaRouteButton_externalRouteEnabledDrawable, 0);
        obtainStyledAttributes.recycle();
        int i2 = this.mRemoteIndicatorResIdToLoad;
        if (i2 != 0 && (constantState = sRemoteIndicatorCache.get(i2)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.mRemoteIndicator == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = sRemoteIndicatorCache.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    RemoteIndicatorLoader remoteIndicatorLoader = new RemoteIndicatorLoader(resourceId, getContext());
                    this.mRemoteIndicatorLoader = remoteIndicatorLoader;
                    remoteIndicatorLoader.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                loadRemoteIndicatorIfNeeded();
            }
        }
        updateContentDescription();
        setClickable(true);
    }

    public void setRouteSelector(MediaRouteSelector mediaRouteSelector) {
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.mSelector.equals(mediaRouteSelector)) {
            return;
        }
        if (this.mAttachedToWindow) {
            if (!this.mSelector.isEmpty()) {
                this.mRouter.removeCallback(this.mCallback);
            }
            if (!mediaRouteSelector.isEmpty()) {
                this.mRouter.addCallback(mediaRouteSelector, this.mCallback);
            }
        }
        this.mSelector = mediaRouteSelector;
        refreshRoute();
    }

    public void setDialogFactory(MediaRouteDialogFactory mediaRouteDialogFactory) {
        if (mediaRouteDialogFactory == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.mDialogFactory = mediaRouteDialogFactory;
    }

    public boolean showDialog() {
        if (this.mAttachedToWindow) {
            MediaRouterParams routerParams = this.mRouter.getRouterParams();
            if (routerParams != null) {
                if (routerParams.isOutputSwitcherEnabled() && MediaRouter.isMediaTransferEnabled() && showOutputSwitcher()) {
                    return true;
                }
                return showDialogForType(routerParams.getDialogType());
            }
            return showDialogForType(1);
        }
        return false;
    }

    private boolean showDialogForType(int i) {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        MediaRouter.RouteInfo selectedRoute = this.mRouter.getSelectedRoute();
        if (selectedRoute.isDefaultOrBluetooth() || !selectedRoute.matchesSelector(this.mSelector)) {
            if (fragmentManager.findFragmentByTag("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            MediaRouteChooserDialogFragment onCreateChooserDialogFragment = this.mDialogFactory.onCreateChooserDialogFragment();
            onCreateChooserDialogFragment.setRouteSelector(this.mSelector);
            if (i == 2) {
                onCreateChooserDialogFragment.setUseDynamicGroup(true);
            }
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.add(onCreateChooserDialogFragment, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
            beginTransaction.commitAllowingStateLoss();
        } else if (fragmentManager.findFragmentByTag("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
            Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
            return false;
        } else {
            MediaRouteControllerDialogFragment onCreateControllerDialogFragment = this.mDialogFactory.onCreateControllerDialogFragment();
            onCreateControllerDialogFragment.setRouteSelector(this.mSelector);
            if (i == 2) {
                onCreateControllerDialogFragment.setUseDynamicGroup(true);
            }
            FragmentTransaction beginTransaction2 = fragmentManager.beginTransaction();
            beginTransaction2.add(onCreateControllerDialogFragment, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
            beginTransaction2.commitAllowingStateLoss();
        }
        return true;
    }

    private boolean showOutputSwitcher() {
        ApplicationInfo applicationInfo;
        Context context = getContext();
        Intent putExtra = new Intent().setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName()).putExtra("key_media_session_token", this.mRouter.getMediaSessionToken());
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(putExtra, 0)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                context.startActivity(putExtra);
                return true;
            }
        }
        return false;
    }

    private FragmentManager getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof FragmentActivity) {
            return ((FragmentActivity) activity).getSupportFragmentManager();
        }
        return null;
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCheatSheetEnabled(boolean z) {
        if (z != this.mCheatSheetEnabled) {
            this.mCheatSheetEnabled = z;
            updateContentDescription();
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        loadRemoteIndicatorIfNeeded();
        return showDialog() || performClick;
    }

    @Override // android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        MediaRouter mediaRouter = this.mRouter;
        if (mediaRouter == null) {
            return onCreateDrawableState;
        }
        MediaRouterParams routerParams = mediaRouter.getRouterParams();
        if (routerParams == null || !routerParams.getExtras().getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON")) {
            int i2 = this.mConnectionState;
            if (i2 == 1) {
                View.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
            } else if (i2 == 2) {
                View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
            }
            return onCreateDrawableState;
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mRemoteIndicator != null) {
            this.mRemoteIndicator.setState(getDrawableState());
            invalidate();
        }
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.mRemoteIndicatorResIdToLoad = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setAlwaysVisible(boolean z) {
        if (z != this.mAlwaysVisible) {
            this.mAlwaysVisible = z;
            refreshVisibility();
            refreshRoute();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mRemoteIndicator;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mRemoteIndicator;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.mVisibility = i;
        refreshVisibility();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.mAttachedToWindow = true;
        if (!this.mSelector.isEmpty()) {
            this.mRouter.addCallback(this.mSelector, this.mCallback);
        }
        refreshRoute();
        sConnectivityReceiver.registerReceiver(this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.mAttachedToWindow = false;
            if (!this.mSelector.isEmpty()) {
                this.mRouter.removeCallback(this.mCallback);
            }
            sConnectivityReceiver.unregisterReceiver(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i3 = this.mMinWidth;
        Drawable drawable = this.mRemoteIndicator;
        int max = Math.max(i3, drawable != null ? drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i4 = this.mMinHeight;
        Drawable drawable2 = this.mRemoteIndicator;
        int max2 = Math.max(i4, drawable2 != null ? drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom() : 0);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mRemoteIndicator != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            int intrinsicWidth = this.mRemoteIndicator.getIntrinsicWidth();
            int intrinsicHeight = this.mRemoteIndicator.getIntrinsicHeight();
            int i = paddingLeft + ((((width - paddingRight) - paddingLeft) - intrinsicWidth) / 2);
            int i2 = paddingTop + ((((height - paddingBottom) - paddingTop) - intrinsicHeight) / 2);
            this.mRemoteIndicator.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.mRemoteIndicator.draw(canvas);
        }
    }

    private void loadRemoteIndicatorIfNeeded() {
        if (this.mRemoteIndicatorResIdToLoad > 0) {
            RemoteIndicatorLoader remoteIndicatorLoader = this.mRemoteIndicatorLoader;
            if (remoteIndicatorLoader != null) {
                remoteIndicatorLoader.cancel(false);
            }
            RemoteIndicatorLoader remoteIndicatorLoader2 = new RemoteIndicatorLoader(this.mRemoteIndicatorResIdToLoad, getContext());
            this.mRemoteIndicatorLoader = remoteIndicatorLoader2;
            this.mRemoteIndicatorResIdToLoad = 0;
            remoteIndicatorLoader2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        Drawable drawable2;
        RemoteIndicatorLoader remoteIndicatorLoader = this.mRemoteIndicatorLoader;
        if (remoteIndicatorLoader != null) {
            remoteIndicatorLoader.cancel(false);
        }
        Drawable drawable3 = this.mRemoteIndicator;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.mRemoteIndicator);
        }
        if (drawable != null) {
            if (this.mButtonTint != null) {
                drawable = DrawableCompat.wrap(drawable.mutate());
                DrawableCompat.setTintList(drawable, this.mButtonTint);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.mRemoteIndicator = drawable;
        refreshDrawableState();
        if (this.mAttachedToWindow && (drawable2 = this.mRemoteIndicator) != null && (drawable2.getCurrent() instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.mRemoteIndicator.getCurrent();
            int i = this.mConnectionState;
            if (i == 1) {
                if (animationDrawable.isRunning()) {
                    return;
                }
                animationDrawable.start();
            } else if (i == 2) {
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
            }
        }
    }

    void refreshVisibility() {
        super.setVisibility((this.mVisibility != 0 || this.mAlwaysVisible || sConnectivityReceiver.isConnected()) ? this.mVisibility : 4);
        Drawable drawable = this.mRemoteIndicator;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    void refreshRoute() {
        boolean z;
        MediaRouter.RouteInfo selectedRoute = this.mRouter.getSelectedRoute();
        boolean z2 = false;
        int connectionState = (selectedRoute.isDefaultOrBluetooth() || !selectedRoute.matchesSelector(this.mSelector)) ? 0 : selectedRoute.getConnectionState();
        if (this.mConnectionState != connectionState) {
            this.mConnectionState = connectionState;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            updateContentDescription();
            refreshDrawableState();
        }
        if (connectionState == 1) {
            loadRemoteIndicatorIfNeeded();
        }
        if (this.mAttachedToWindow) {
            if (this.mAlwaysVisible || this.mRouter.isRouteAvailable(this.mSelector, 1)) {
                z2 = true;
            }
            setEnabled(z2);
        }
        Drawable drawable = this.mRemoteIndicator;
        if (drawable == null || !(drawable.getCurrent() instanceof AnimationDrawable)) {
            return;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) this.mRemoteIndicator.getCurrent();
        if (this.mAttachedToWindow) {
            if ((z || connectionState == 1) && !animationDrawable.isRunning()) {
                animationDrawable.start();
            }
        } else if (connectionState == 2) {
            if (animationDrawable.isRunning()) {
                animationDrawable.stop();
            }
            animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
        }
    }

    private void updateContentDescription() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = c;
        int i5 = i4 + 111;
        b = i5 % 128;
        if (i5 % 2 != 0 ? (i = this.mConnectionState) == 1 : (i = this.mConnectionState) == 0) {
            i2 = R.string.mr_cast_button_connecting;
        } else if (i != 2) {
            int i6 = i4 + 55;
            b = i6 % 128;
            int i7 = i6 % 2;
            i2 = R.string.mr_cast_button_disconnected;
        } else {
            i2 = R.string.mr_cast_button_connected;
        }
        String string = getContext().getString(i2);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            d(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i8 = c + 33;
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        setContentDescription(string);
        TooltipCompat.setTooltipText(this, (!this.mCheatSheetEnabled || TextUtils.isEmpty(string)) ? null : null);
    }

    /* loaded from: classes5.dex */
    final class MediaRouterCallback extends MediaRouter.Callback {
        MediaRouterCallback() {
        }

        @Override // androidx.mediarouter.media.MediaRouter.Callback
        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // androidx.mediarouter.media.MediaRouter.Callback
        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // androidx.mediarouter.media.MediaRouter.Callback
        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // androidx.mediarouter.media.MediaRouter.Callback
        public void onRouteSelected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // androidx.mediarouter.media.MediaRouter.Callback
        public void onRouteUnselected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // androidx.mediarouter.media.MediaRouter.Callback
        public void onProviderAdded(MediaRouter mediaRouter, MediaRouter.ProviderInfo providerInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // androidx.mediarouter.media.MediaRouter.Callback
        public void onProviderRemoved(MediaRouter mediaRouter, MediaRouter.ProviderInfo providerInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // androidx.mediarouter.media.MediaRouter.Callback
        public void onProviderChanged(MediaRouter mediaRouter, MediaRouter.ProviderInfo providerInfo) {
            MediaRouteButton.this.refreshRoute();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class RemoteIndicatorLoader extends AsyncTask<Void, Void, Drawable> {
        private final Context mContext;
        private final int mResId;

        RemoteIndicatorLoader(int i, Context context) {
            this.mResId = i;
            this.mContext = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Drawable doInBackground(Void... voidArr) {
            if (MediaRouteButton.sRemoteIndicatorCache.get(this.mResId) == null) {
                return this.mContext.getResources().getDrawable(this.mResId);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Drawable drawable) {
            if (drawable != null) {
                cacheAndReset(drawable);
            } else {
                Drawable.ConstantState constantState = MediaRouteButton.sRemoteIndicatorCache.get(this.mResId);
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                MediaRouteButton.this.mRemoteIndicatorLoader = null;
            }
            MediaRouteButton.this.setRemoteIndicatorDrawableInternal(drawable);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onCancelled(Drawable drawable) {
            cacheAndReset(drawable);
        }

        private void cacheAndReset(Drawable drawable) {
            if (drawable != null) {
                MediaRouteButton.sRemoteIndicatorCache.put(this.mResId, drawable.getConstantState());
            }
            MediaRouteButton.this.mRemoteIndicatorLoader = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class ConnectivityReceiver extends BroadcastReceiver {
        private final Context mContext;
        private boolean mIsConnected = true;
        private List<MediaRouteButton> mButtons = new ArrayList();

        public boolean isConnected() {
            return this.mIsConnected;
        }

        ConnectivityReceiver(Context context) {
            this.mContext = context;
        }

        public void registerReceiver(MediaRouteButton mediaRouteButton) {
            if (this.mButtons.size() == 0) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                this.mContext.registerReceiver(this, intentFilter);
            }
            this.mButtons.add(mediaRouteButton);
        }

        public void unregisterReceiver(MediaRouteButton mediaRouteButton) {
            this.mButtons.remove(mediaRouteButton);
            if (this.mButtons.size() == 0) {
                this.mContext.unregisterReceiver(this);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z;
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || this.mIsConnected == (!intent.getBooleanExtra("noConnectivity", false))) {
                return;
            }
            this.mIsConnected = z;
            for (MediaRouteButton mediaRouteButton : this.mButtons) {
                mediaRouteButton.refreshVisibility();
            }
        }
    }

    private void d(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$3020);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}

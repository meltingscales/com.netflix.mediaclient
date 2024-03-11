package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.util.ObjectsCompat;
import androidx.mediarouter.R;
import androidx.mediarouter.app.OverlayListView;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
public class MediaRouteControllerDialog extends AlertDialog {
    static final int CONNECTION_TIMEOUT_MILLIS;
    static final boolean DEBUG;
    private static int c = 1;
    private static int e;
    private static byte e$ss2$4367;
    private Interpolator mAccelerateDecelerateInterpolator;
    final AccessibilityManager mAccessibilityManager;
    int mArtIconBackgroundColor;
    Bitmap mArtIconBitmap;
    boolean mArtIconIsLoaded;
    Bitmap mArtIconLoadedBitmap;
    Uri mArtIconUri;
    private ImageView mArtView;
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private ImageButton mCloseButton;
    Context mContext;
    MediaControllerCallback mControllerCallback;
    private boolean mCreated;
    private FrameLayout mCustomControlLayout;
    private View mCustomControlView;
    FrameLayout mDefaultControlLayout;
    MediaDescriptionCompat mDescription;
    private LinearLayout mDialogAreaLayout;
    private int mDialogContentWidth;
    private Button mDisconnectButton;
    private View mDividerView;
    private FrameLayout mExpandableAreaLayout;
    private Interpolator mFastOutSlowInInterpolator;
    FetchArtTask mFetchArtTask;
    private MediaRouteExpandCollapseButton mGroupExpandCollapseButton;
    int mGroupListAnimationDurationMs;
    Runnable mGroupListFadeInAnimation;
    private int mGroupListFadeInDurationMs;
    private int mGroupListFadeOutDurationMs;
    private List<MediaRouter.RouteInfo> mGroupMemberRoutes;
    Set<MediaRouter.RouteInfo> mGroupMemberRoutesAdded;
    Set<MediaRouter.RouteInfo> mGroupMemberRoutesAnimatingWithBitmap;
    private Set<MediaRouter.RouteInfo> mGroupMemberRoutesRemoved;
    boolean mHasPendingUpdate;
    private Interpolator mInterpolator;
    boolean mIsGroupExpanded;
    boolean mIsGroupListAnimating;
    boolean mIsGroupListAnimationPending;
    private Interpolator mLinearOutSlowInInterpolator;
    MediaControllerCompat mMediaController;
    private LinearLayout mMediaMainControlLayout;
    boolean mPendingUpdateAnimationNeeded;
    private ImageButton mPlaybackControlButton;
    private RelativeLayout mPlaybackControlLayout;
    final MediaRouter.RouteInfo mRoute;
    MediaRouter.RouteInfo mRouteInVolumeSliderTouched;
    private TextView mRouteNameTextView;
    final MediaRouter mRouter;
    PlaybackStateCompat mState;
    private Button mStopCastingButton;
    private TextView mSubtitleView;
    private TextView mTitleView;
    VolumeChangeListener mVolumeChangeListener;
    private boolean mVolumeControlEnabled;
    private LinearLayout mVolumeControlLayout;
    VolumeGroupAdapter mVolumeGroupAdapter;
    OverlayListView mVolumeGroupList;
    private int mVolumeGroupListItemHeight;
    private int mVolumeGroupListItemIconSize;
    private int mVolumeGroupListMaxHeight;
    private final int mVolumeGroupListPaddingTop;
    SeekBar mVolumeSlider;
    Map<MediaRouter.RouteInfo, SeekBar> mVolumeSliderMap;

    static void b() {
        e$ss2$4367 = (byte) 24;
    }

    private boolean canShowPlaybackControlLayout() {
        return this.mCustomControlView == null && !(this.mDescription == null && this.mState == null);
    }

    void clearLoadedBitmap() {
        this.mArtIconIsLoaded = false;
        this.mArtIconLoadedBitmap = null;
        this.mArtIconBackgroundColor = 0;
    }

    int getDesiredArtHeight(int i, int i2) {
        return i >= i2 ? (int) (((this.mDialogContentWidth * i2) / i) + 0.5f) : (int) (((this.mDialogContentWidth * 9.0f) / 16.0f) + 0.5f);
    }

    void loadInterpolator() {
        this.mInterpolator = this.mIsGroupExpanded ? this.mLinearOutSlowInInterpolator : this.mFastOutSlowInInterpolator;
    }

    public View onCreateMediaControlView(Bundle bundle) {
        return null;
    }

    static {
        b();
        DEBUG = Log.isLoggable("MediaRouteCtrlDialog", 3);
        CONNECTION_TIMEOUT_MILLIS = (int) TimeUnit.SECONDS.toMillis(30L);
    }

    public MediaRouteControllerDialog(Context context) {
        this(context, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MediaRouteControllerDialog(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 1
            android.content.Context r2 = androidx.mediarouter.app.MediaRouterThemeHelper.createThemedDialogContext(r2, r3, r0)
            int r3 = androidx.mediarouter.app.MediaRouterThemeHelper.createThemedDialogStyle(r2)
            r1.<init>(r2, r3)
            r1.mVolumeControlEnabled = r0
            androidx.mediarouter.app.MediaRouteControllerDialog$1 r3 = new androidx.mediarouter.app.MediaRouteControllerDialog$1
            r3.<init>()
            r1.mGroupListFadeInAnimation = r3
            android.content.Context r3 = r1.getContext()
            r1.mContext = r3
            androidx.mediarouter.app.MediaRouteControllerDialog$MediaControllerCallback r3 = new androidx.mediarouter.app.MediaRouteControllerDialog$MediaControllerCallback
            r3.<init>()
            r1.mControllerCallback = r3
            android.content.Context r3 = r1.mContext
            androidx.mediarouter.media.MediaRouter r3 = androidx.mediarouter.media.MediaRouter.getInstance(r3)
            r1.mRouter = r3
            androidx.mediarouter.app.MediaRouteControllerDialog$MediaRouterCallback r0 = new androidx.mediarouter.app.MediaRouteControllerDialog$MediaRouterCallback
            r0.<init>()
            r1.mCallback = r0
            androidx.mediarouter.media.MediaRouter$RouteInfo r0 = r3.getSelectedRoute()
            r1.mRoute = r0
            android.support.v4.media.session.MediaSessionCompat$Token r3 = r3.getMediaSessionToken()
            r1.setMediaSession(r3)
            android.content.Context r3 = r1.mContext
            android.content.res.Resources r3 = r3.getResources()
            int r0 = androidx.mediarouter.R.dimen.mr_controller_volume_group_list_padding_top
            int r3 = r3.getDimensionPixelSize(r0)
            r1.mVolumeGroupListPaddingTop = r3
            android.content.Context r3 = r1.mContext
            java.lang.String r0 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            r1.mAccessibilityManager = r3
            int r3 = androidx.mediarouter.R.interpolator.mr_linear_out_slow_in
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
            r1.mLinearOutSlowInInterpolator = r3
            int r3 = androidx.mediarouter.R.interpolator.mr_fast_out_slow_in
            android.view.animation.Interpolator r2 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
            r1.mFastOutSlowInInterpolator = r2
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r1.mAccelerateDecelerateInterpolator = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteControllerDialog.<init>(android.content.Context, int):void");
    }

    private void setMediaSession(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.mMediaController;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.mControllerCallback);
            this.mMediaController = null;
        }
        if (token != null && this.mAttachedToWindow) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.mContext, token);
            this.mMediaController = mediaControllerCompat2;
            mediaControllerCompat2.registerCallback(this.mControllerCallback);
            MediaMetadataCompat metadata = this.mMediaController.getMetadata();
            this.mDescription = metadata != null ? metadata.getDescription() : null;
            this.mState = this.mMediaController.getPlaybackState();
            updateArtIconIfNeeded();
            update(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f3, code lost:
        if ((r6 instanceof android.text.Spanned) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x010d, code lost:
        if ((r6 instanceof android.text.Spanned) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x010f, code lost:
        r7 = new android.text.SpannableString(r8);
        android.text.TextUtils.copySpansFrom((android.text.SpannedString) r6, 0, r8.length(), java.lang.Object.class, r7, 0);
        r6 = androidx.mediarouter.app.MediaRouteControllerDialog.c + 11;
        androidx.mediarouter.app.MediaRouteControllerDialog.e = r6 % 128;
        r6 = r6 % 2;
        r8 = r7;
     */
    @Override // androidx.appcompat.app.AlertDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteControllerDialog.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateLayout() {
        int dialogWidth = MediaRouteDialogHelper.getDialogWidth(this.mContext);
        getWindow().setLayout(dialogWidth, -2);
        View decorView = getWindow().getDecorView();
        this.mDialogContentWidth = (dialogWidth - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.mContext.getResources();
        this.mVolumeGroupListItemIconSize = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.mVolumeGroupListItemHeight = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.mVolumeGroupListMaxHeight = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.mArtIconBitmap = null;
        this.mArtIconUri = null;
        updateArtIconIfNeeded();
        update(false);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        this.mRouter.addCallback(MediaRouteSelector.EMPTY, this.mCallback, 2);
        setMediaSession(this.mRouter.getMediaSessionToken());
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.mRouter.removeCallback(this.mCallback);
        setMediaSession(null);
        this.mAttachedToWindow = false;
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.app.AlertDialog, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            this.mRoute.requestUpdateVolume(i == 25 ? -1 : 1);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.appcompat.app.AlertDialog, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    void update(boolean z) {
        if (this.mRouteInVolumeSliderTouched != null) {
            this.mHasPendingUpdate = true;
            this.mPendingUpdateAnimationNeeded = z | this.mPendingUpdateAnimationNeeded;
            return;
        }
        this.mHasPendingUpdate = false;
        this.mPendingUpdateAnimationNeeded = false;
        if (!this.mRoute.isSelected() || this.mRoute.isDefaultOrBluetooth()) {
            dismiss();
        } else if (this.mCreated) {
            this.mRouteNameTextView.setText(this.mRoute.getName());
            this.mDisconnectButton.setVisibility(this.mRoute.canDisconnect() ? 0 : 8);
            if (this.mCustomControlView == null && this.mArtIconIsLoaded) {
                if (isBitmapRecycled(this.mArtIconLoadedBitmap)) {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.mArtIconLoadedBitmap);
                } else {
                    this.mArtView.setImageBitmap(this.mArtIconLoadedBitmap);
                    this.mArtView.setBackgroundColor(this.mArtIconBackgroundColor);
                }
                clearLoadedBitmap();
            }
            updateVolumeControlLayout();
            updatePlaybackControlLayout();
            updateLayoutHeight(z);
        }
    }

    static boolean isBitmapRecycled(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    private int getMainControllerHeight(boolean z) {
        if (z || this.mVolumeControlLayout.getVisibility() == 0) {
            int paddingTop = this.mMediaMainControlLayout.getPaddingTop() + this.mMediaMainControlLayout.getPaddingBottom();
            if (z) {
                paddingTop += this.mPlaybackControlLayout.getMeasuredHeight();
            }
            if (this.mVolumeControlLayout.getVisibility() == 0) {
                paddingTop += this.mVolumeControlLayout.getMeasuredHeight();
            }
            return (z && this.mVolumeControlLayout.getVisibility() == 0) ? this.mDividerView.getMeasuredHeight() + paddingTop : paddingTop;
        }
        return 0;
    }

    private void updateMediaControlVisibility(boolean z) {
        int i = 8;
        this.mDividerView.setVisibility((this.mVolumeControlLayout.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.mMediaMainControlLayout;
        if (this.mVolumeControlLayout.getVisibility() != 8 || z) {
            i = 0;
        }
        linearLayout.setVisibility(i);
    }

    void updateLayoutHeight(final boolean z) {
        this.mDefaultControlLayout.requestLayout();
        this.mDefaultControlLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.6
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                MediaRouteControllerDialog.this.mDefaultControlLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
                if (mediaRouteControllerDialog.mIsGroupListAnimating) {
                    mediaRouteControllerDialog.mIsGroupListAnimationPending = true;
                } else {
                    mediaRouteControllerDialog.updateLayoutHeightInternal(z);
                }
            }
        });
    }

    void updateLayoutHeightInternal(boolean z) {
        int i;
        Bitmap bitmap;
        int layoutHeight = getLayoutHeight(this.mMediaMainControlLayout);
        setLayoutHeight(this.mMediaMainControlLayout, -1);
        updateMediaControlVisibility(canShowPlaybackControlLayout());
        View decorView = getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, 1073741824), 0);
        setLayoutHeight(this.mMediaMainControlLayout, layoutHeight);
        if (this.mCustomControlView == null && (this.mArtView.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) this.mArtView.getDrawable()).getBitmap()) != null) {
            i = getDesiredArtHeight(bitmap.getWidth(), bitmap.getHeight());
            this.mArtView.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        } else {
            i = 0;
        }
        int mainControllerHeight = getMainControllerHeight(canShowPlaybackControlLayout());
        int size = this.mGroupMemberRoutes.size();
        int size2 = this.mRoute.isGroup() ? this.mVolumeGroupListItemHeight * this.mRoute.getMemberRoutes().size() : 0;
        if (size > 0) {
            size2 += this.mVolumeGroupListPaddingTop;
        }
        int min = Math.min(size2, this.mVolumeGroupListMaxHeight);
        if (!this.mIsGroupExpanded) {
            min = 0;
        }
        int max = Math.max(i, min) + mainControllerHeight;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (this.mDialogAreaLayout.getMeasuredHeight() - this.mDefaultControlLayout.getMeasuredHeight());
        if (this.mCustomControlView == null && i > 0 && max <= height) {
            this.mArtView.setVisibility(0);
            setLayoutHeight(this.mArtView, i);
        } else {
            if (getLayoutHeight(this.mVolumeGroupList) + this.mMediaMainControlLayout.getMeasuredHeight() >= this.mDefaultControlLayout.getMeasuredHeight()) {
                this.mArtView.setVisibility(8);
            }
            max = min + mainControllerHeight;
            i = 0;
        }
        if (canShowPlaybackControlLayout() && max <= height) {
            this.mPlaybackControlLayout.setVisibility(0);
        } else {
            this.mPlaybackControlLayout.setVisibility(8);
        }
        updateMediaControlVisibility(this.mPlaybackControlLayout.getVisibility() == 0);
        int mainControllerHeight2 = getMainControllerHeight(this.mPlaybackControlLayout.getVisibility() == 0);
        int max2 = Math.max(i, min) + mainControllerHeight2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        this.mMediaMainControlLayout.clearAnimation();
        this.mVolumeGroupList.clearAnimation();
        this.mDefaultControlLayout.clearAnimation();
        if (z) {
            animateLayoutHeight(this.mMediaMainControlLayout, mainControllerHeight2);
            animateLayoutHeight(this.mVolumeGroupList, min);
            animateLayoutHeight(this.mDefaultControlLayout, height);
        } else {
            setLayoutHeight(this.mMediaMainControlLayout, mainControllerHeight2);
            setLayoutHeight(this.mVolumeGroupList, min);
            setLayoutHeight(this.mDefaultControlLayout, height);
        }
        setLayoutHeight(this.mExpandableAreaLayout, rect.height());
        rebuildVolumeGroupList(z);
    }

    void updateVolumeGroupItemHeight(View view) {
        setLayoutHeight((LinearLayout) view.findViewById(R.id.volume_item_container), this.mVolumeGroupListItemHeight);
        View findViewById = view.findViewById(R.id.mr_volume_item_icon);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        int i = this.mVolumeGroupListItemIconSize;
        layoutParams.width = i;
        layoutParams.height = i;
        findViewById.setLayoutParams(layoutParams);
    }

    private void animateLayoutHeight(final View view, final int i) {
        final int layoutHeight = getLayoutHeight(view);
        Animation animation = new Animation() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.7
            @Override // android.view.animation.Animation
            protected void applyTransformation(float f, Transformation transformation) {
                int i2 = layoutHeight;
                MediaRouteControllerDialog.setLayoutHeight(view, i2 - ((int) ((i2 - i) * f)));
            }
        };
        animation.setDuration(this.mGroupListAnimationDurationMs);
        animation.setInterpolator(this.mInterpolator);
        view.startAnimation(animation);
    }

    private void updateVolumeControlLayout() {
        if (isVolumeControlAvailable(this.mRoute)) {
            if (this.mVolumeControlLayout.getVisibility() == 8) {
                this.mVolumeControlLayout.setVisibility(0);
                this.mVolumeSlider.setMax(this.mRoute.getVolumeMax());
                this.mVolumeSlider.setProgress(this.mRoute.getVolume());
                this.mGroupExpandCollapseButton.setVisibility(this.mRoute.isGroup() ? 0 : 8);
                return;
            }
            return;
        }
        this.mVolumeControlLayout.setVisibility(8);
    }

    private void rebuildVolumeGroupList(boolean z) {
        List<MediaRouter.RouteInfo> memberRoutes = this.mRoute.getMemberRoutes();
        if (memberRoutes.isEmpty()) {
            this.mGroupMemberRoutes.clear();
            this.mVolumeGroupAdapter.notifyDataSetChanged();
        } else if (MediaRouteDialogHelper.listUnorderedEquals(this.mGroupMemberRoutes, memberRoutes)) {
            this.mVolumeGroupAdapter.notifyDataSetChanged();
        } else {
            HashMap itemBoundMap = z ? MediaRouteDialogHelper.getItemBoundMap(this.mVolumeGroupList, this.mVolumeGroupAdapter) : null;
            HashMap itemBitmapMap = z ? MediaRouteDialogHelper.getItemBitmapMap(this.mContext, this.mVolumeGroupList, this.mVolumeGroupAdapter) : null;
            this.mGroupMemberRoutesAdded = MediaRouteDialogHelper.getItemsAdded(this.mGroupMemberRoutes, memberRoutes);
            this.mGroupMemberRoutesRemoved = MediaRouteDialogHelper.getItemsRemoved(this.mGroupMemberRoutes, memberRoutes);
            this.mGroupMemberRoutes.addAll(0, this.mGroupMemberRoutesAdded);
            this.mGroupMemberRoutes.removeAll(this.mGroupMemberRoutesRemoved);
            this.mVolumeGroupAdapter.notifyDataSetChanged();
            if (z && this.mIsGroupExpanded && this.mGroupMemberRoutesAdded.size() + this.mGroupMemberRoutesRemoved.size() > 0) {
                animateGroupListItems(itemBoundMap, itemBitmapMap);
                return;
            }
            this.mGroupMemberRoutesAdded = null;
            this.mGroupMemberRoutesRemoved = null;
        }
    }

    private void animateGroupListItems(final Map<MediaRouter.RouteInfo, Rect> map, final Map<MediaRouter.RouteInfo, BitmapDrawable> map2) {
        this.mVolumeGroupList.setEnabled(false);
        this.mVolumeGroupList.requestLayout();
        this.mIsGroupListAnimating = true;
        this.mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.8
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                MediaRouteControllerDialog.this.mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                MediaRouteControllerDialog.this.animateGroupListItemsInternal(map, map2);
            }
        });
    }

    void animateGroupListItemsInternal(Map<MediaRouter.RouteInfo, Rect> map, Map<MediaRouter.RouteInfo, BitmapDrawable> map2) {
        OverlayListView.OverlayObject animationEndListener;
        Set<MediaRouter.RouteInfo> set = this.mGroupMemberRoutesAdded;
        if (set == null || this.mGroupMemberRoutesRemoved == null) {
            return;
        }
        int size = set.size() - this.mGroupMemberRoutesRemoved.size();
        Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.9
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                MediaRouteControllerDialog.this.mVolumeGroupList.startAnimationAll();
                MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
                mediaRouteControllerDialog.mVolumeGroupList.postDelayed(mediaRouteControllerDialog.mGroupListFadeInAnimation, mediaRouteControllerDialog.mGroupListAnimationDurationMs);
            }
        };
        int firstVisiblePosition = this.mVolumeGroupList.getFirstVisiblePosition();
        boolean z = false;
        for (int i = 0; i < this.mVolumeGroupList.getChildCount(); i++) {
            View childAt = this.mVolumeGroupList.getChildAt(i);
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) this.mVolumeGroupAdapter.getItem(firstVisiblePosition + i);
            Rect rect = map.get(routeInfo);
            int top = childAt.getTop();
            int i2 = rect != null ? rect.top : (this.mVolumeGroupListItemHeight * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            Set<MediaRouter.RouteInfo> set2 = this.mGroupMemberRoutesAdded;
            if (set2 != null && set2.contains(routeInfo)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(this.mGroupListFadeInDurationMs);
                animationSet.addAnimation(alphaAnimation);
                i2 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i2 - top, 0.0f);
            translateAnimation.setDuration(this.mGroupListAnimationDurationMs);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(this.mInterpolator);
            if (!z) {
                animationSet.setAnimationListener(animationListener);
                z = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            map.remove(routeInfo);
            map2.remove(routeInfo);
        }
        for (Map.Entry<MediaRouter.RouteInfo, BitmapDrawable> entry : map2.entrySet()) {
            final MediaRouter.RouteInfo key = entry.getKey();
            BitmapDrawable value = entry.getValue();
            Rect rect2 = map.get(key);
            if (this.mGroupMemberRoutesRemoved.contains(key)) {
                animationEndListener = new OverlayListView.OverlayObject(value, rect2).setAlphaAnimation(1.0f, 0.0f).setDuration(this.mGroupListFadeOutDurationMs).setInterpolator(this.mInterpolator);
            } else {
                animationEndListener = new OverlayListView.OverlayObject(value, rect2).setTranslateYAnimation(this.mVolumeGroupListItemHeight * size).setDuration(this.mGroupListAnimationDurationMs).setInterpolator(this.mInterpolator).setAnimationEndListener(new OverlayListView.OverlayObject.OnAnimationEndListener() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.10
                    @Override // androidx.mediarouter.app.OverlayListView.OverlayObject.OnAnimationEndListener
                    public void onAnimationEnd() {
                        MediaRouteControllerDialog.this.mGroupMemberRoutesAnimatingWithBitmap.remove(key);
                        MediaRouteControllerDialog.this.mVolumeGroupAdapter.notifyDataSetChanged();
                    }
                });
                this.mGroupMemberRoutesAnimatingWithBitmap.add(key);
            }
            this.mVolumeGroupList.addOverlayObject(animationEndListener);
        }
    }

    void startGroupListFadeInAnimation() {
        clearGroupListAnimation(true);
        this.mVolumeGroupList.requestLayout();
        this.mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.11
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                MediaRouteControllerDialog.this.mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                MediaRouteControllerDialog.this.startGroupListFadeInAnimationInternal();
            }
        });
    }

    void startGroupListFadeInAnimationInternal() {
        Set<MediaRouter.RouteInfo> set = this.mGroupMemberRoutesAdded;
        if (set != null && set.size() != 0) {
            fadeInAddedRoutes();
        } else {
            finishAnimation(true);
        }
    }

    void finishAnimation(boolean z) {
        this.mGroupMemberRoutesAdded = null;
        this.mGroupMemberRoutesRemoved = null;
        this.mIsGroupListAnimating = false;
        if (this.mIsGroupListAnimationPending) {
            this.mIsGroupListAnimationPending = false;
            updateLayoutHeight(z);
        }
        this.mVolumeGroupList.setEnabled(true);
    }

    private void fadeInAddedRoutes() {
        Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.12
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MediaRouteControllerDialog.this.finishAnimation(true);
            }
        };
        int firstVisiblePosition = this.mVolumeGroupList.getFirstVisiblePosition();
        boolean z = false;
        for (int i = 0; i < this.mVolumeGroupList.getChildCount(); i++) {
            View childAt = this.mVolumeGroupList.getChildAt(i);
            if (this.mGroupMemberRoutesAdded.contains((MediaRouter.RouteInfo) this.mVolumeGroupAdapter.getItem(firstVisiblePosition + i))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(this.mGroupListFadeInDurationMs);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z) {
                    alphaAnimation.setAnimationListener(animationListener);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearGroupListAnimation(boolean z) {
        Set<MediaRouter.RouteInfo> set;
        int firstVisiblePosition = this.mVolumeGroupList.getFirstVisiblePosition();
        for (int i = 0; i < this.mVolumeGroupList.getChildCount(); i++) {
            View childAt = this.mVolumeGroupList.getChildAt(i);
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) this.mVolumeGroupAdapter.getItem(firstVisiblePosition + i);
            if (!z || (set = this.mGroupMemberRoutesAdded) == null || !set.contains(routeInfo)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        this.mVolumeGroupList.stopAnimationAll();
        if (z) {
            return;
        }
        finishAnimation(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updatePlaybackControlLayout() {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteControllerDialog.updatePlaybackControlLayout():void");
    }

    boolean isPlayActionSupported() {
        return (this.mState.getActions() & 516) != 0;
    }

    boolean isPauseActionSupported() {
        return (this.mState.getActions() & 514) != 0;
    }

    boolean isStopActionSupported() {
        return (this.mState.getActions() & 1) != 0;
    }

    boolean isVolumeControlAvailable(MediaRouter.RouteInfo routeInfo) {
        return this.mVolumeControlEnabled && routeInfo.getVolumeHandling() == 1;
    }

    private static int getLayoutHeight(View view) {
        return view.getLayoutParams().height;
    }

    static void setLayoutHeight(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    private static boolean uriEquals(Uri uri, Uri uri2) {
        if (uri == null || !uri.equals(uri2)) {
            return uri == null && uri2 == null;
        }
        return true;
    }

    void updateArtIconIfNeeded() {
        if (this.mCustomControlView == null && isIconChanged()) {
            FetchArtTask fetchArtTask = this.mFetchArtTask;
            if (fetchArtTask != null) {
                fetchArtTask.cancel(true);
            }
            FetchArtTask fetchArtTask2 = new FetchArtTask();
            this.mFetchArtTask = fetchArtTask2;
            fetchArtTask2.execute(new Void[0]);
        }
    }

    private boolean isIconChanged() {
        MediaDescriptionCompat mediaDescriptionCompat = this.mDescription;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.mDescription;
        Uri iconUri = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        FetchArtTask fetchArtTask = this.mFetchArtTask;
        Bitmap iconBitmap2 = fetchArtTask == null ? this.mArtIconBitmap : fetchArtTask.getIconBitmap();
        FetchArtTask fetchArtTask2 = this.mFetchArtTask;
        Uri iconUri2 = fetchArtTask2 == null ? this.mArtIconUri : fetchArtTask2.getIconUri();
        if (iconBitmap2 != iconBitmap) {
            return true;
        }
        return iconBitmap2 == null && !uriEquals(iconUri2, iconUri);
    }

    /* loaded from: classes5.dex */
    final class MediaRouterCallback extends MediaRouter.Callback {
        MediaRouterCallback() {
        }

        @Override // androidx.mediarouter.media.MediaRouter.Callback
        public void onRouteUnselected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteControllerDialog.this.update(false);
        }

        @Override // androidx.mediarouter.media.MediaRouter.Callback
        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteControllerDialog.this.update(true);
        }

        @Override // androidx.mediarouter.media.MediaRouter.Callback
        public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            SeekBar seekBar = MediaRouteControllerDialog.this.mVolumeSliderMap.get(routeInfo);
            int volume = routeInfo.getVolume();
            if (MediaRouteControllerDialog.DEBUG) {
                Log.d("MediaRouteCtrlDialog", "onRouteVolumeChanged(), route.getVolume:" + volume);
            }
            if (seekBar == null || MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched == routeInfo) {
                return;
            }
            seekBar.setProgress(volume);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class MediaControllerCallback extends MediaControllerCompat.Callback {
        MediaControllerCallback() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionDestroyed() {
            MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
            MediaControllerCompat mediaControllerCompat = mediaRouteControllerDialog.mMediaController;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.unregisterCallback(mediaRouteControllerDialog.mControllerCallback);
                MediaRouteControllerDialog.this.mMediaController = null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
            mediaRouteControllerDialog.mState = playbackStateCompat;
            mediaRouteControllerDialog.update(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            MediaRouteControllerDialog.this.mDescription = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
            MediaRouteControllerDialog.this.updateArtIconIfNeeded();
            MediaRouteControllerDialog.this.update(false);
        }
    }

    /* loaded from: classes5.dex */
    final class ClickListener implements View.OnClickListener {
        private static int b = 1;
        private static int c = 0;
        private static byte e$ss2$32 = 24;

        ClickListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z;
            int i;
            int i2 = 2;
            int i3 = 2 % 2;
            int id = view.getId();
            if (id == 16908313 || id == 16908314) {
                if (MediaRouteControllerDialog.this.mRoute.isSelected()) {
                    MediaRouter mediaRouter = MediaRouteControllerDialog.this.mRouter;
                    if (id == 16908313) {
                        int i4 = b + 37;
                        c = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        i2 = 1;
                    }
                    mediaRouter.unselect(i2);
                }
                MediaRouteControllerDialog.this.dismiss();
            } else if (id != R.id.mr_control_playback_ctrl) {
                if (id == R.id.mr_close) {
                    MediaRouteControllerDialog.this.dismiss();
                }
            } else {
                int i6 = c + 11;
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    MediaControllerCompat mediaControllerCompat = MediaRouteControllerDialog.this.mMediaController;
                    throw null;
                }
                MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
                if (mediaRouteControllerDialog.mMediaController != null) {
                    int i7 = c + 111;
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    PlaybackStateCompat playbackStateCompat = mediaRouteControllerDialog.mState;
                    if (playbackStateCompat != null) {
                        if (playbackStateCompat.getState() == 3) {
                            z = true;
                        } else {
                            int i9 = c + 37;
                            b = i9 % 128;
                            int i10 = i9 % 2;
                            z = false;
                        }
                        if (z && MediaRouteControllerDialog.this.isPauseActionSupported()) {
                            MediaRouteControllerDialog.this.mMediaController.getTransportControls().pause();
                            i = R.string.mr_controller_pause;
                        } else if (z && MediaRouteControllerDialog.this.isStopActionSupported()) {
                            MediaRouteControllerDialog.this.mMediaController.getTransportControls().stop();
                            i = R.string.mr_controller_stop;
                        } else {
                            if (!z) {
                                int i11 = b + 97;
                                c = i11 % 128;
                                int i12 = i11 % 2;
                                if (MediaRouteControllerDialog.this.isPlayActionSupported()) {
                                    MediaRouteControllerDialog.this.mMediaController.getTransportControls().play();
                                    i = R.string.mr_controller_play;
                                }
                            }
                            i = 0;
                        }
                        AccessibilityManager accessibilityManager = MediaRouteControllerDialog.this.mAccessibilityManager;
                        if (accessibilityManager != null) {
                            int i13 = b + 39;
                            c = i13 % 128;
                            int i14 = i13 % 2;
                            if (!accessibilityManager.isEnabled() || i == 0) {
                                return;
                            }
                            int i15 = b + 41;
                            c = i15 % 128;
                            int i16 = i15 % 2;
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                            obtain.setPackageName(MediaRouteControllerDialog.this.mContext.getPackageName());
                            obtain.setClassName(ClickListener.class.getName());
                            List<CharSequence> text = obtain.getText();
                            String string = MediaRouteControllerDialog.this.mContext.getString(i);
                            if (string.startsWith("'!#+")) {
                                int i17 = c + 109;
                                b = i17 % 128;
                                if (i17 % 2 == 0) {
                                    Object[] objArr = new Object[1];
                                    d(string.substring(4), objArr);
                                    ((String) objArr[0]).intern();
                                    throw null;
                                }
                                Object[] objArr2 = new Object[1];
                                d(string.substring(4), objArr2);
                                string = ((String) objArr2[0]).intern();
                            }
                            text.add(string);
                            MediaRouteControllerDialog.this.mAccessibilityManager.sendAccessibilityEvent(obtain);
                        }
                    }
                }
            }
        }

        private void d(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i = 0; i < decode.length; i++) {
                bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$32);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }

    /* loaded from: classes5.dex */
    class VolumeChangeListener implements SeekBar.OnSeekBarChangeListener {
        private final Runnable mStopTrackingTouch = new Runnable() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.VolumeChangeListener.1
            @Override // java.lang.Runnable
            public void run() {
                MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
                if (mediaRouteControllerDialog.mRouteInVolumeSliderTouched != null) {
                    mediaRouteControllerDialog.mRouteInVolumeSliderTouched = null;
                    if (mediaRouteControllerDialog.mHasPendingUpdate) {
                        mediaRouteControllerDialog.update(mediaRouteControllerDialog.mPendingUpdateAnimationNeeded);
                    }
                }
            }
        };

        VolumeChangeListener() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
            if (mediaRouteControllerDialog.mRouteInVolumeSliderTouched != null) {
                mediaRouteControllerDialog.mVolumeSlider.removeCallbacks(this.mStopTrackingTouch);
            }
            MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched = (MediaRouter.RouteInfo) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            MediaRouteControllerDialog.this.mVolumeSlider.postDelayed(this.mStopTrackingTouch, 500L);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) seekBar.getTag();
                if (MediaRouteControllerDialog.DEBUG) {
                    Log.d("MediaRouteCtrlDialog", "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(" + i + ")");
                }
                routeInfo.requestSetVolume(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class VolumeGroupAdapter extends ArrayAdapter<MediaRouter.RouteInfo> {
        final float mDisabledAlpha;

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return false;
        }

        public VolumeGroupAdapter(Context context, List<MediaRouter.RouteInfo> list) {
            super(context, 0, list);
            this.mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(context);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
            } else {
                MediaRouteControllerDialog.this.updateVolumeGroupItemHeight(view);
            }
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) getItem(i);
            if (routeInfo != null) {
                boolean isEnabled = routeInfo.isEnabled();
                TextView textView = (TextView) view.findViewById(R.id.mr_name);
                textView.setEnabled(isEnabled);
                textView.setText(routeInfo.getName());
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
                MediaRouterThemeHelper.setVolumeSliderColor(viewGroup.getContext(), mediaRouteVolumeSlider, MediaRouteControllerDialog.this.mVolumeGroupList);
                mediaRouteVolumeSlider.setTag(routeInfo);
                MediaRouteControllerDialog.this.mVolumeSliderMap.put(routeInfo, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.setHideThumb(!isEnabled);
                mediaRouteVolumeSlider.setEnabled(isEnabled);
                if (isEnabled) {
                    if (MediaRouteControllerDialog.this.isVolumeControlAvailable(routeInfo)) {
                        mediaRouteVolumeSlider.setMax(routeInfo.getVolumeMax());
                        mediaRouteVolumeSlider.setProgress(routeInfo.getVolume());
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(MediaRouteControllerDialog.this.mVolumeChangeListener);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ((ImageView) view.findViewById(R.id.mr_volume_item_icon)).setAlpha(isEnabled ? PrivateKeyType.INVALID : (int) (this.mDisabledAlpha * 255.0f));
                ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(MediaRouteControllerDialog.this.mGroupMemberRoutesAnimatingWithBitmap.contains(routeInfo) ? 4 : 0);
                Set<MediaRouter.RouteInfo> set = MediaRouteControllerDialog.this.mGroupMemberRoutesAdded;
                if (set != null && set.contains(routeInfo)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0L);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class FetchArtTask extends AsyncTask<Void, Void, Bitmap> {
        private int mBackgroundColor;
        private final Bitmap mIconBitmap;
        private final Uri mIconUri;
        private long mStartTimeMillis;

        public Bitmap getIconBitmap() {
            return this.mIconBitmap;
        }

        public Uri getIconUri() {
            return this.mIconUri;
        }

        FetchArtTask() {
            MediaDescriptionCompat mediaDescriptionCompat = MediaRouteControllerDialog.this.mDescription;
            Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
            if (MediaRouteControllerDialog.isBitmapRecycled(iconBitmap)) {
                Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
                iconBitmap = null;
            }
            this.mIconBitmap = iconBitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = MediaRouteControllerDialog.this.mDescription;
            this.mIconUri = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            this.mStartTimeMillis = SystemClock.uptimeMillis();
            MediaRouteControllerDialog.this.clearLoadedBitmap();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.io.InputStream] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.graphics.Bitmap doInBackground(java.lang.Void... r10) {
            /*
                Method dump skipped, instructions count: 279
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteControllerDialog.FetchArtTask.doInBackground(java.lang.Void[]):android.graphics.Bitmap");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
            mediaRouteControllerDialog.mFetchArtTask = null;
            if (ObjectsCompat.equals(mediaRouteControllerDialog.mArtIconBitmap, this.mIconBitmap) && ObjectsCompat.equals(MediaRouteControllerDialog.this.mArtIconUri, this.mIconUri)) {
                return;
            }
            MediaRouteControllerDialog mediaRouteControllerDialog2 = MediaRouteControllerDialog.this;
            mediaRouteControllerDialog2.mArtIconBitmap = this.mIconBitmap;
            mediaRouteControllerDialog2.mArtIconLoadedBitmap = bitmap;
            mediaRouteControllerDialog2.mArtIconUri = this.mIconUri;
            mediaRouteControllerDialog2.mArtIconBackgroundColor = this.mBackgroundColor;
            mediaRouteControllerDialog2.mArtIconIsLoaded = true;
            MediaRouteControllerDialog.this.update(SystemClock.uptimeMillis() - this.mStartTimeMillis > 120);
        }

        private InputStream openInputStreamByScheme(Uri uri) {
            InputStream openInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                openInputStream = MediaRouteControllerDialog.this.mContext.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                int i = MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS;
                openConnection.setConnectTimeout(i);
                openConnection.setReadTimeout(i);
                openInputStream = openConnection.getInputStream();
            }
            if (openInputStream == null) {
                return null;
            }
            return new BufferedInputStream(openInputStream);
        }
    }

    private void d(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$4367);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}

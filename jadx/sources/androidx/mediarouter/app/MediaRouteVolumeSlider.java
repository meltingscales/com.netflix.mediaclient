package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.R;
import androidx.appcompat.widget.AppCompatSeekBar;
import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class MediaRouteVolumeSlider extends AppCompatSeekBar {
    private int mBackgroundColor;
    private final float mDisabledAlpha;
    private boolean mHideThumb;
    private int mProgressAndThumbColor;
    private Drawable mThumb;

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(context);
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? PrivateKeyType.INVALID : (int) (this.mDisabledAlpha * 255.0f);
        Drawable drawable = this.mThumb;
        int i2 = this.mProgressAndThumbColor;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i2, mode);
        this.mThumb.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(this.mBackgroundColor, mode);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.mProgressAndThumbColor, mode);
        progressDrawable.setAlpha(i);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        this.mThumb = drawable;
        if (this.mHideThumb) {
            drawable = null;
        }
        super.setThumb(drawable);
    }

    public void setHideThumb(boolean z) {
        if (this.mHideThumb == z) {
            return;
        }
        this.mHideThumb = z;
        super.setThumb(z ? null : this.mThumb);
    }

    public void setColor(int i) {
        setColor(i, i);
    }

    public void setColor(int i, int i2) {
        if (this.mProgressAndThumbColor != i) {
            if (Color.alpha(i) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(i));
            }
            this.mProgressAndThumbColor = i;
        }
        if (this.mBackgroundColor != i2) {
            if (Color.alpha(i2) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #" + Integer.toHexString(i2));
            }
            this.mBackgroundColor = i2;
        }
    }
}
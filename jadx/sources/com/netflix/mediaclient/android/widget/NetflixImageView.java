package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import com.netflix.android.imageloader.api.ImageDataSource;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import o.C1045Mp;
import o.C1170Rj;
import o.C1216Td;
import o.C1332Xp;
import o.C1337Xu;
import o.C8627dsp;
import o.C8632dsu;
import o.C9702vQ;
import o.C9737vz;
import o.C9834xU;
import o.InterfaceC9637uE;
import o.InterfaceC9639uG;
import o.RB;
import o.RF;
import o.RJ;
import o.SF;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public class NetflixImageView extends RB implements ImageLoader.a {
    public static final int DEFAULT_LAYER_GRAVITY = 119;
    private static final boolean enableDebugOverlay;
    private Float aspectRatio;
    private int assetFetchLatencyInMs;
    @Inject
    public Lazy<InterfaceC9637uE> forImageViewsOnlyImageLoaderRepository;
    private ImageDataSource imageDataSource;
    @Inject
    public Lazy<InterfaceC9639uG> imageLoaderThemeProvider;
    private RJ info;
    private final C1170Rj.a measureSpec;
    private List<C1216Td> overlayLayers;
    private boolean roundAsCircle;
    private SF roundedColorDrawable;
    private float roundedCornerRadius;
    private boolean roundedCornerRadiusTopOnly;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetflixImageView(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetflixImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final Float getAspectRatio() {
        return this.aspectRatio;
    }

    public final int getAssetFetchLatencyInMs() {
        return this.assetFetchLatencyInMs;
    }

    public final ImageDataSource getImageDataSource() {
        return this.imageDataSource;
    }

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader.a
    public RJ getImageLoaderInfo() {
        return this.info;
    }

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader.a
    public NetflixImageView getImageView() {
        return this;
    }

    public final RJ getInfo() {
        return this.info;
    }

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader.a
    public void setAssetFetchLatency(int i) {
        this.assetFetchLatencyInMs = i;
    }

    public final void setAssetFetchLatencyInMs(int i) {
        this.assetFetchLatencyInMs = i;
    }

    public final void setForImageViewsOnlyImageLoaderRepository(Lazy<InterfaceC9637uE> lazy) {
        C8632dsu.c((Object) lazy, "");
        this.forImageViewsOnlyImageLoaderRepository = lazy;
    }

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader.a
    public void setImageDataSource(ImageDataSource imageDataSource) {
        this.imageDataSource = imageDataSource;
    }

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader.a
    public void setImageLoaderInfo(RJ rj) {
        this.info = rj;
    }

    public final void setImageLoaderThemeProvider(Lazy<InterfaceC9639uG> lazy) {
        C8632dsu.c((Object) lazy, "");
        this.imageLoaderThemeProvider = lazy;
    }

    public final void setInfo(RJ rj) {
        this.info = rj;
    }

    public /* synthetic */ NetflixImageView(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetflixImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1216Td c1216Td;
        Drawable drawable;
        C1216Td c1216Td2;
        Drawable drawable2;
        C8632dsu.c((Object) context, "");
        this.measureSpec = new C1170Rj.a();
        this.overlayLayers = new ArrayList();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9834xU.n.P);
            setAspectRatio(obtainStyledAttributes.hasValue(C9834xU.n.aa) ? Float.valueOf(obtainStyledAttributes.getFloat(C9834xU.n.aa, 0.0f)) : null);
            this.roundAsCircle = obtainStyledAttributes.getBoolean(C9834xU.n.W, this.roundAsCircle);
            this.roundedCornerRadius = obtainStyledAttributes.getDimension(C9834xU.n.U, 0.0f);
            this.roundedCornerRadiusTopOnly = obtainStyledAttributes.getBoolean(C9834xU.n.ab, this.roundedCornerRadiusTopOnly);
            if (!obtainStyledAttributes.hasValue(C9834xU.n.V) || (drawable2 = obtainStyledAttributes.getDrawable(C9834xU.n.V)) == null) {
                c1216Td = null;
            } else {
                C8632dsu.d(drawable2);
                addOverlay$default(this, drawable2, 0, 2, null);
                c1216Td = this.overlayLayers.get(0);
            }
            if (obtainStyledAttributes.hasValue(C9834xU.n.X) && (c1216Td2 = c1216Td) != null) {
                c1216Td2.a(obtainStyledAttributes.getInt(C9834xU.n.X, DEFAULT_LAYER_GRAVITY));
            }
            if (obtainStyledAttributes.hasValue(C9834xU.n.O) && (drawable = obtainStyledAttributes.getDrawable(C9834xU.n.O)) != null) {
                setForeground(drawable.mutate());
            }
            if (obtainStyledAttributes.hasValue(C9834xU.n.S)) {
                setForegroundGravity(obtainStyledAttributes.getInt(C9834xU.n.S, DEFAULT_LAYER_GRAVITY));
            }
            if (obtainStyledAttributes.hasValue(C9834xU.n.T)) {
                setForegroundTintList(obtainStyledAttributes.getColorStateList(C9834xU.n.T));
            }
            if (obtainStyledAttributes.hasValue(C9834xU.n.ac)) {
                float dimension = obtainStyledAttributes.getDimension(C9834xU.n.ac, 0.0f);
                int color = obtainStyledAttributes.getColor(C9834xU.n.Y, 0);
                SF sf = new SF(this.roundedCornerRadius, 0);
                sf.a(color, dimension);
                addOverlay$default(this, sf, 0, 2, null);
                this.roundedColorDrawable = sf;
            }
            obtainStyledAttributes.recycle();
        }
        if (this.roundAsCircle) {
            C9702vQ.a(this);
        } else {
            float f = this.roundedCornerRadius;
            if (f > 0.0f) {
                C9702vQ.d(this, (int) f, false, this.roundedCornerRadiusTopOnly, 2, null);
            }
        }
        if (enableDebugOverlay) {
            addOverlay(new RF(this), 0);
        }
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("NetflixImageView");
        }
    }

    static {
        C1332Xp c1332Xp = C1332Xp.b;
        enableDebugOverlay = C1337Xu.e((Context) C1332Xp.b(Context.class), C9834xU.g.y);
    }

    public final Lazy<InterfaceC9639uG> getImageLoaderThemeProvider() {
        Lazy<InterfaceC9639uG> lazy = this.imageLoaderThemeProvider;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<InterfaceC9637uE> getForImageViewsOnlyImageLoaderRepository() {
        Lazy<InterfaceC9637uE> lazy = this.forImageViewsOnlyImageLoaderRepository;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final void setAspectRatio(Float f) {
        if (C8632dsu.c(this.aspectRatio, f)) {
            return;
        }
        this.aspectRatio = f;
        requestLayout();
    }

    public static /* synthetic */ void updateRoundedCornerParams$default(NetflixImageView netflixImageView, boolean z, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateRoundedCornerParams");
        }
        if ((i & 1) != 0) {
            z = netflixImageView.roundAsCircle;
        }
        if ((i & 2) != 0) {
            f = netflixImageView.roundedCornerRadius;
        }
        netflixImageView.updateRoundedCornerParams(z, f);
    }

    public final void updateRoundedCornerParams(boolean z, float f) {
        this.roundAsCircle = z;
        this.roundedCornerRadius = f;
        SF sf = this.roundedColorDrawable;
        if (sf != null) {
            sf.e(f);
        }
        if (z) {
            C9702vQ.a(this);
        } else if (f > 0.0f) {
            C9702vQ.d(this, (int) f, false, this.roundedCornerRadiusTopOnly, 2, null);
        }
        invalidate();
    }

    public final void setBorder(int i, float f) {
        if (f <= 0.0f) {
            return;
        }
        if (this.roundedColorDrawable == null) {
            SF sf = new SF(this.roundedCornerRadius, 0);
            addOverlay$default(this, sf, 0, 2, null);
            this.roundedColorDrawable = sf;
        }
        SF sf2 = this.roundedColorDrawable;
        if (sf2 != null && sf2.b() == i) {
            SF sf3 = this.roundedColorDrawable;
            if (C8632dsu.b(sf3 != null ? Float.valueOf(sf3.e()) : null, f)) {
                return;
            }
        }
        SF sf4 = this.roundedColorDrawable;
        if (sf4 != null) {
            sf4.e(this.roundedCornerRadius);
            sf4.a(i, f);
        }
    }

    public final void removeBorder() {
        SF sf = this.roundedColorDrawable;
        if (sf != null) {
            removeOverlay(sf);
        }
        this.roundedColorDrawable = null;
    }

    public final void setRoundAsCircle(boolean z) {
        updateRoundedCornerParams$default(this, z, 0.0f, 2, null);
    }

    public final void setRoundedCornerRadius(float f) {
        updateRoundedCornerParams$default(this, false, f, 1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        for (C1216Td c1216Td : this.overlayLayers) {
            c1216Td.e(f, f2);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        for (C1216Td c1216Td : this.overlayLayers) {
            c1216Td.c(i);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        this.measureSpec.c(i);
        this.measureSpec.e(i2);
        C1170Rj.e.c(this.measureSpec, this.roundAsCircle ? Float.valueOf(1.0f) : this.aspectRatio, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingBottom() + getPaddingTop());
        super.onMeasure(this.measureSpec.d(), this.measureSpec.c());
        for (C1216Td c1216Td : this.overlayLayers) {
            c1216Td.b(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        for (C1216Td c1216Td : this.overlayLayers) {
            c1216Td.c();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        for (C1216Td c1216Td : this.overlayLayers) {
            c1216Td.e();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        C8632dsu.c((Object) drawable, "");
        return super.verifyDrawable(drawable) || verifyDrawable(this.overlayLayers, drawable);
    }

    public float getAspectRatioForImageLoader() {
        Float f = this.aspectRatio;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public void setAspectRatioForImageLoader(float f) {
        setAspectRatio(Float.valueOf(f));
    }

    public static /* synthetic */ void addOverlay$default(NetflixImageView netflixImageView, Drawable drawable, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOverlay");
        }
        if ((i2 & 2) != 0) {
            i = DEFAULT_LAYER_GRAVITY;
        }
        netflixImageView.addOverlay(drawable, i);
    }

    public final void addOverlay(Drawable drawable, int i) {
        C8632dsu.c((Object) drawable, "");
        List<C1216Td> list = this.overlayLayers;
        C1216Td c1216Td = new C1216Td(this, false);
        c1216Td.b(drawable);
        c1216Td.a(i);
        list.add(c1216Td);
        invalidate();
    }

    public final void removeOverlay(Drawable drawable) {
        C8632dsu.c((Object) drawable, "");
        Iterator<C1216Td> it = this.overlayLayers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1216Td next = it.next();
            if (next.a() == drawable) {
                next.b(null);
                this.overlayLayers.remove(next);
                break;
            }
        }
        invalidate();
    }

    public final void removeAllOverlays() {
        this.overlayLayers.clear();
        invalidate();
    }

    public void onViewRecycled() {
        clearImage();
    }

    public void refreshImageIfNecessary() {
        RJ rj = this.info;
        if (rj != null) {
            C1332Xp c1332Xp = C1332Xp.b;
            ((ImageLoader) C1332Xp.b(ImageLoader.class)).d(this, rj.b);
        }
    }

    public boolean isImageLoaded() {
        RJ rj = this.info;
        if (rj != null) {
            return rj.a;
        }
        return false;
    }

    public final boolean isImageContentMissingForPresentationTracking() {
        RJ rj;
        if (getVisibility() == 0 && (rj = this.info) != null) {
            return !rj.a;
        }
        return false;
    }

    public final String getImageUrl() {
        RJ rj = this.info;
        if (rj != null) {
            return rj.e;
        }
        return null;
    }

    public final void showImage(String str) {
        showImage(new ShowImageRequest().a(str));
    }

    public final void showImage(ShowImageRequest showImageRequest) {
        C8632dsu.c((Object) showImageRequest, "");
        if (showImageRequest.c() == null && showImageRequest.e() == null) {
            Context context = getContext();
            C8632dsu.a(context, "");
            showImageRequest.d((FragmentActivity) C9737vz.e(context, FragmentActivity.class));
        }
        getForImageViewsOnlyImageLoaderRepository().get().d(this, showImageRequest.b());
    }

    public final void clearImage() {
        getForImageViewsOnlyImageLoaderRepository().get().b(this);
    }

    @Override // android.view.View
    public void onDrawForeground(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        for (C1216Td c1216Td : this.overlayLayers) {
            c1216Td.d(canvas);
        }
        super.onDrawForeground(canvas);
    }

    @Override // android.view.View
    public void dispatchDrawableHotspotChanged(float f, float f2) {
        for (C1216Td c1216Td : this.overlayLayers) {
            c1216Td.e(f, f2);
        }
        super.dispatchDrawableHotspotChanged(f, f2);
    }

    private final boolean verifyDrawable(List<C1216Td> list, Drawable drawable) {
        boolean z;
        while (true) {
            for (C1216Td c1216Td : list) {
                z = z || c1216Td.a(drawable);
            }
            return z;
        }
    }
}

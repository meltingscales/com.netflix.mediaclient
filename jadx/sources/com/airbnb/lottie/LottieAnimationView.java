package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import o.C3550bC;
import o.C3658bG;
import o.C3743bJ;
import o.C5242bv;
import o.C6796ck;
import o.C6849cl;
import o.C7008co;
import o.C7165cr;
import o.C7218cs;
import o.C8368dj;
import o.C8909fc;
import o.C8912ff;
import o.C8914fh;
import o.InterfaceC5348bx;
import o.InterfaceC6531cf;
import o.InterfaceC6637ch;
import o.InterfaceC6690ci;

/* loaded from: classes2.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final String a = "LottieAnimationView";
    private static final InterfaceC6690ci<Throwable> b = new InterfaceC6690ci() { // from class: o.bE
        @Override // o.InterfaceC6690ci
        public final void a(Object obj) {
            LottieAnimationView.a((Throwable) obj);
        }
    };
    private int c;
    private String d;
    private boolean e;
    private int f;
    private boolean g;
    private InterfaceC6690ci<Throwable> h;
    private C3658bG i;
    private C6796ck<C3658bG> j;
    private final Set<UserActionTaken> k;
    private final Set<InterfaceC6531cf> l;
    private final LottieDrawable m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC6690ci<C3658bG> f13089o;
    private final InterfaceC6690ci<Throwable> t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum UserActionTaken {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public void setCacheComposition(boolean z) {
        this.g = z;
    }

    public void setFailureListener(InterfaceC6690ci<Throwable> interfaceC6690ci) {
        this.h = interfaceC6690ci;
    }

    public void setFallbackResource(int i) {
        this.f = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        if (C8914fh.a(th)) {
            C8909fc.a("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f13089o = new InterfaceC6690ci() { // from class: o.bB
            @Override // o.InterfaceC6690ci
            public final void a(Object obj) {
                LottieAnimationView.this.setComposition((C3658bG) obj);
            }
        };
        this.t = new InterfaceC6690ci<Throwable>() { // from class: com.airbnb.lottie.LottieAnimationView.1
            @Override // o.InterfaceC6690ci
            public void a(Throwable th) {
                if (LottieAnimationView.this.f != 0) {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    lottieAnimationView.setImageResource(lottieAnimationView.f);
                }
                (LottieAnimationView.this.h == null ? LottieAnimationView.b : LottieAnimationView.this.h).a(th);
            }
        };
        this.f = 0;
        this.m = new LottieDrawable();
        this.n = false;
        this.e = false;
        this.g = true;
        this.k = new HashSet();
        this.l = new HashSet();
        a((AttributeSet) null, C7008co.a.e);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13089o = new InterfaceC6690ci() { // from class: o.bB
            @Override // o.InterfaceC6690ci
            public final void a(Object obj) {
                LottieAnimationView.this.setComposition((C3658bG) obj);
            }
        };
        this.t = new InterfaceC6690ci<Throwable>() { // from class: com.airbnb.lottie.LottieAnimationView.1
            @Override // o.InterfaceC6690ci
            public void a(Throwable th) {
                if (LottieAnimationView.this.f != 0) {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    lottieAnimationView.setImageResource(lottieAnimationView.f);
                }
                (LottieAnimationView.this.h == null ? LottieAnimationView.b : LottieAnimationView.this.h).a(th);
            }
        };
        this.f = 0;
        this.m = new LottieDrawable();
        this.n = false;
        this.e = false;
        this.g = true;
        this.k = new HashSet();
        this.l = new HashSet();
        a(attributeSet, C7008co.a.e);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13089o = new InterfaceC6690ci() { // from class: o.bB
            @Override // o.InterfaceC6690ci
            public final void a(Object obj) {
                LottieAnimationView.this.setComposition((C3658bG) obj);
            }
        };
        this.t = new InterfaceC6690ci<Throwable>() { // from class: com.airbnb.lottie.LottieAnimationView.1
            @Override // o.InterfaceC6690ci
            public void a(Throwable th) {
                if (LottieAnimationView.this.f != 0) {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    lottieAnimationView.setImageResource(lottieAnimationView.f);
                }
                (LottieAnimationView.this.h == null ? LottieAnimationView.b : LottieAnimationView.this.h).a(th);
            }
        };
        this.f = 0;
        this.m = new LottieDrawable();
        this.n = false;
        this.e = false;
        this.g = true;
        this.k = new HashSet();
        this.l = new HashSet();
        a(attributeSet, i);
    }

    private void a(AttributeSet attributeSet, int i) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C7008co.c.B, i, 0);
        this.g = obtainStyledAttributes.getBoolean(C7008co.c.E, true);
        boolean hasValue = obtainStyledAttributes.hasValue(C7008co.c.S);
        boolean hasValue2 = obtainStyledAttributes.hasValue(C7008co.c.f13756J);
        boolean hasValue3 = obtainStyledAttributes.hasValue(C7008co.c.W);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(C7008co.c.S, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(C7008co.c.f13756J);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(C7008co.c.W)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(C7008co.c.L, 0));
        if (obtainStyledAttributes.getBoolean(C7008co.c.A, false)) {
            this.e = true;
        }
        if (obtainStyledAttributes.getBoolean(C7008co.c.K, false)) {
            this.m.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(C7008co.c.O)) {
            setRepeatMode(obtainStyledAttributes.getInt(C7008co.c.O, 1));
        }
        if (obtainStyledAttributes.hasValue(C7008co.c.R)) {
            setRepeatCount(obtainStyledAttributes.getInt(C7008co.c.R, -1));
        }
        if (obtainStyledAttributes.hasValue(C7008co.c.U)) {
            setSpeed(obtainStyledAttributes.getFloat(C7008co.c.U, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(C7008co.c.H)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(C7008co.c.H, true));
        }
        if (obtainStyledAttributes.hasValue(C7008co.c.I)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(C7008co.c.I));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(C7008co.c.N));
        e(obtainStyledAttributes.getFloat(C7008co.c.P, 0.0f), obtainStyledAttributes.hasValue(C7008co.c.P));
        b(obtainStyledAttributes.getBoolean(C7008co.c.G, false));
        if (obtainStyledAttributes.hasValue(C7008co.c.F)) {
            b(new C8368dj("**"), InterfaceC6637ch.b, new C8912ff(new C7165cr(AppCompatResources.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(C7008co.c.F, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(C7008co.c.Q)) {
            int i2 = C7008co.c.Q;
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int i3 = obtainStyledAttributes.getInt(i2, renderMode.ordinal());
            if (i3 >= RenderMode.values().length) {
                i3 = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[i3]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(C7008co.c.M, false));
        if (obtainStyledAttributes.hasValue(C7008co.c.V)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(C7008co.c.V, false));
        }
        obtainStyledAttributes.recycle();
        this.m.setSystemAnimationsAreEnabled(Boolean.valueOf(C8914fh.b(getContext()) != 0.0f));
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        h();
        super.setImageResource(i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        h();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        h();
        super.setImageBitmap(bitmap);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.n && drawable == (lottieDrawable = this.m) && lottieDrawable.isAnimating()) {
            i();
        } else if (!this.n && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.isAnimating()) {
                lottieDrawable2.pauseAnimation();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof LottieDrawable) && ((LottieDrawable) drawable).getRenderMode() == RenderMode.SOFTWARE) {
            this.m.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.m;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.d;
        savedState.b = this.c;
        savedState.d = this.m.getProgress();
        savedState.c = this.m.isAnimatingOrWillAnimateOnVisible();
        savedState.e = this.m.getImageAssetsFolder();
        savedState.j = this.m.getRepeatMode();
        savedState.f = this.m.getRepeatCount();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.d = savedState.a;
        Set<UserActionTaken> set = this.k;
        UserActionTaken userActionTaken = UserActionTaken.SET_ANIMATION;
        if (!set.contains(userActionTaken) && !TextUtils.isEmpty(this.d)) {
            setAnimation(this.d);
        }
        this.c = savedState.b;
        if (!this.k.contains(userActionTaken) && (i = this.c) != 0) {
            setAnimation(i);
        }
        if (!this.k.contains(UserActionTaken.SET_PROGRESS)) {
            e(savedState.d, false);
        }
        if (!this.k.contains(UserActionTaken.PLAY_OPTION) && savedState.c) {
            g();
        }
        if (!this.k.contains(UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.e);
        }
        if (!this.k.contains(UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.j);
        }
        if (this.k.contains(UserActionTaken.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.f);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.e) {
            return;
        }
        this.m.playAnimation();
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.m.setIgnoreDisabledSystemAnimations(z);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.m.setUseCompositionFrameRate(z);
    }

    public void b(boolean z) {
        this.m.enableMergePathsForKitKatAndAbove(z);
    }

    public void setClipToCompositionBounds(boolean z) {
        this.m.setClipToCompositionBounds(z);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.m.setOutlineMasksAndMattes(z);
    }

    public void setAnimation(int i) {
        this.c = i;
        this.d = null;
        e(e(i));
    }

    private C6796ck<C3658bG> e(final int i) {
        if (isInEditMode()) {
            return new C6796ck<>(new Callable() { // from class: o.bA
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C6849cl a2;
                    a2 = LottieAnimationView.this.a(i);
                    return a2;
                }
            }, true);
        }
        return this.g ? C3743bJ.a(getContext(), i) : C3743bJ.e(getContext(), i, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C6849cl a(int i) {
        return this.g ? C3743bJ.d(getContext(), i) : C3743bJ.d(getContext(), i, (String) null);
    }

    public void setAnimation(String str) {
        this.d = str;
        this.c = 0;
        e(b(str));
    }

    private C6796ck<C3658bG> b(final String str) {
        if (isInEditMode()) {
            return new C6796ck<>(new Callable() { // from class: o.bD
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C6849cl d;
                    d = LottieAnimationView.this.d(str);
                    return d;
                }
            }, true);
        }
        return this.g ? C3743bJ.c(getContext(), str) : C3743bJ.c(getContext(), str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C6849cl d(String str) {
        return this.g ? C3743bJ.a(getContext(), str) : C3743bJ.e(getContext(), str, (String) null);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimation(InputStream inputStream, String str) {
        e(C3743bJ.e(inputStream, str));
    }

    public void setAnimationFromUrl(String str) {
        e(this.g ? C3743bJ.b(getContext(), str) : C3743bJ.a(getContext(), str, (String) null));
    }

    public void setAnimationFromUrl(String str, String str2) {
        e(C3743bJ.a(getContext(), str, str2));
    }

    private void e(C6796ck<C3658bG> c6796ck) {
        this.k.add(UserActionTaken.SET_ANIMATION);
        f();
        h();
        this.j = c6796ck.c(this.f13089o).d(this.t);
    }

    private void h() {
        C6796ck<C3658bG> c6796ck = this.j;
        if (c6796ck != null) {
            c6796ck.e(this.f13089o);
            this.j.b(this.t);
        }
    }

    public void setComposition(C3658bG c3658bG) {
        if (C3550bC.a) {
            String str = a;
            Log.v(str, "Set Composition \n" + c3658bG);
        }
        this.m.setCallback(this);
        this.i = c3658bG;
        this.n = true;
        boolean composition = this.m.setComposition(c3658bG);
        this.n = false;
        if (getDrawable() != this.m || composition) {
            if (!composition) {
                l();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (InterfaceC6531cf interfaceC6531cf : this.l) {
                interfaceC6531cf.a(c3658bG);
            }
        }
    }

    public void g() {
        this.k.add(UserActionTaken.PLAY_OPTION);
        this.m.playAnimation();
    }

    public void setMinFrame(int i) {
        this.m.setMinFrame(i);
    }

    public void setMinProgress(float f) {
        this.m.setMinProgress(f);
    }

    public void setMaxFrame(int i) {
        this.m.setMaxFrame(i);
    }

    public void setMaxProgress(float f) {
        this.m.setMaxProgress(f);
    }

    public void setMinFrame(String str) {
        this.m.setMinFrame(str);
    }

    public void setMaxFrame(String str) {
        this.m.setMaxFrame(str);
    }

    public void setMinAndMaxFrame(String str) {
        this.m.setMinAndMaxFrame(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.m.setMinAndMaxFrame(str, str2, z);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.m.setMinAndMaxFrame(i, i2);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.m.setMinAndMaxProgress(f, f2);
    }

    public void j() {
        this.m.reverseAnimationSpeed();
    }

    public void setSpeed(float f) {
        this.m.setSpeed(f);
    }

    public float c() {
        return this.m.getSpeed();
    }

    public void c(Animator.AnimatorListener animatorListener) {
        this.m.addAnimatorListener(animatorListener);
    }

    public void d(Animator.AnimatorListener animatorListener) {
        this.m.removeAnimatorListener(animatorListener);
    }

    public void setRepeatMode(int i) {
        this.k.add(UserActionTaken.SET_REPEAT_MODE);
        this.m.setRepeatMode(i);
    }

    public void setRepeatCount(int i) {
        this.k.add(UserActionTaken.SET_REPEAT_COUNT);
        this.m.setRepeatCount(i);
    }

    public boolean d() {
        return this.m.isAnimating();
    }

    public void setImageAssetsFolder(String str) {
        this.m.setImagesAssetsFolder(str);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.m.setMaintainOriginalImageBounds(z);
    }

    public void setImageAssetDelegate(InterfaceC5348bx interfaceC5348bx) {
        this.m.setImageAssetDelegate(interfaceC5348bx);
    }

    public void setDefaultFontFileExtension(String str) {
        this.m.setDefaultFontFileExtension(str);
    }

    public void setFontAssetDelegate(C5242bv c5242bv) {
        this.m.setFontAssetDelegate(c5242bv);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.m.setFontMap(map);
    }

    public void setTextDelegate(C7218cs c7218cs) {
        this.m.setTextDelegate(c7218cs);
    }

    public <T> void b(C8368dj c8368dj, T t, C8912ff<T> c8912ff) {
        this.m.addValueCallback(c8368dj, (C8368dj) t, (C8912ff<C8368dj>) c8912ff);
    }

    public void b() {
        this.k.add(UserActionTaken.PLAY_OPTION);
        this.m.cancelAnimation();
    }

    public void i() {
        this.e = false;
        this.m.pauseAnimation();
    }

    public void setFrame(int i) {
        this.m.setFrame(i);
    }

    public int a() {
        return this.m.getFrame();
    }

    public void setProgress(float f) {
        e(f, true);
    }

    private void e(float f, boolean z) {
        if (z) {
            this.k.add(UserActionTaken.SET_PROGRESS);
        }
        this.m.setProgress(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.m.setPerformanceTrackingEnabled(z);
    }

    private void f() {
        this.i = null;
        this.m.clearComposition();
    }

    public void setSafeMode(boolean z) {
        this.m.setSafeMode(z);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.m.setRenderMode(renderMode);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.m.setApplyingOpacityToLayersEnabled(z);
    }

    private void l() {
        boolean d = d();
        setImageDrawable(null);
        setImageDrawable(this.m);
        if (d) {
            this.m.resumeAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.airbnb.lottie.LottieAnimationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: d */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        String a;
        int b;
        boolean c;
        float d;
        String e;
        int f;
        int j;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
            this.d = parcel.readFloat();
            this.c = parcel.readInt() == 1;
            this.e = parcel.readString();
            this.j = parcel.readInt();
            this.f = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeFloat(this.d);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.j);
            parcel.writeInt(this.f);
        }
    }
}

package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.airbnb.lottie.LottieDrawable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.BehaviorSubject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C1097Oo;
import o.C8632dsu;
import o.InterfaceC1107Oy;
import o.InterfaceC1107Oy.c;
import o.OG;
import o.dpR;

@SuppressLint({"CheckResult"})
/* loaded from: classes3.dex */
public abstract class OG<T extends InterfaceC1107Oy.c> extends LottieDrawable {
    public static final int NO_TINT_COLOR = -1;
    private float absoluteSpeed;
    private boolean animationLoaded;
    private Drawable currentStaticDrawable;
    private InterfaceC1107Oy<T> currentTransition;
    private final d innerTransitionListener;
    private Drawable lastStaticDrawable;
    private final BehaviorSubject<Boolean> loadSubject;
    private AnimatorListenerAdapter lottieAnimatorListenerAdapter;
    private C1097Oo netflixLottieComposition;
    private T pendingAnimateToState;
    private boolean pullSizeFromLottie;
    private T state;
    private Map<T, WeakReference<Drawable>> stateToDrawableMap;
    private final List<InterfaceC1107Oy<T>> stateTransitions;
    private int targetFps;
    private C8912ff<ColorFilter> tintCallback;
    private int tintColor;
    private int totalNumFrames;
    private InterfaceC1101Os<T> transitionListener;
    private Map<T, Map<T, InterfaceC1107Oy<T>>> transitionsMapFromTo;
    private Map<T, List<InterfaceC1107Oy<T>>> transitionsMapToList;
    public static final c Companion = new c(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationLoaded(boolean z) {
        this.animationLoaded = z;
    }

    public final boolean getAnimationLoaded() {
        return this.animationLoaded;
    }

    public final BehaviorSubject<Boolean> getLoadSubject() {
        return this.loadSubject;
    }

    @Override // android.graphics.drawable.Drawable
    public final T getState() {
        return this.state;
    }

    public final List<InterfaceC1107Oy<T>> getStateTransitions() {
        return this.stateTransitions;
    }

    public final InterfaceC1101Os<T> getTransitionListener() {
        return this.transitionListener;
    }

    public final void setTransitionListener(InterfaceC1101Os<T> interfaceC1101Os) {
        this.transitionListener = interfaceC1101Os;
    }

    public /* synthetic */ OG(String str, List list, InterfaceC1107Oy.c cVar, boolean z, int i, boolean z2, int i2, C8627dsp c8627dsp) {
        this(str, list, cVar, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? true : z2);
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("StatefulLottieDrawable");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OG(final String str, List<? extends InterfaceC1107Oy<T>> list, T t, boolean z, int i, boolean z2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) t, "");
        this.stateTransitions = list;
        this.tintColor = i;
        this.pullSizeFromLottie = z2;
        BehaviorSubject<Boolean> create = BehaviorSubject.create();
        C8632dsu.a(create, "");
        this.loadSubject = create;
        this.absoluteSpeed = 1.0f;
        this.transitionsMapFromTo = new LinkedHashMap();
        this.transitionsMapToList = new LinkedHashMap();
        this.stateToDrawableMap = new LinkedHashMap();
        this.innerTransitionListener = new d(this);
        this.state = t;
        updateStaticDrawableForState(t);
        if (!z || !C8120deQ.a()) {
            Single<C1097Oo> observeOn = C1098Op.a.b(str, false).observeOn(AndroidSchedulers.mainThread());
            C8632dsu.a(observeOn, "");
            SubscribersKt.subscribeBy(observeOn, new drM<Throwable, dpR>(this) { // from class: com.netflix.mediaclient.android.lottie.drawables.StatefulLottieDrawable$1
                final /* synthetic */ OG<T> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.b = this;
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    c(th);
                    return dpR.c;
                }

                public final void c(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    OG.c cVar = OG.Companion;
                    this.b.getLoadSubject().onError(th);
                }
            }, new drM<C1097Oo, dpR>(this) { // from class: com.netflix.mediaclient.android.lottie.drawables.StatefulLottieDrawable$2
                final /* synthetic */ OG<T> d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.d = this;
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C1097Oo c1097Oo) {
                    c(c1097Oo);
                    return dpR.c;
                }

                public final void c(C1097Oo c1097Oo) {
                    InterfaceC1107Oy.c cVar;
                    int i2;
                    int i3;
                    this.d.setAnimationLoaded(true);
                    OG<T> og = this.d;
                    og.updateStaticDrawableForState(og.getState());
                    OG<T> og2 = this.d;
                    C8632dsu.d(c1097Oo);
                    og2.setNetflixComposition(c1097Oo);
                    LottieDrawable lottieDrawable = this.d;
                    Integer e = lottieDrawable.getState().e();
                    lottieDrawable.setFrame(e != null ? e.intValue() : 0);
                    this.d.getLoadSubject().onNext(Boolean.TRUE);
                    OG.Companion.getLogTag();
                    cVar = ((OG) this.d).pendingAnimateToState;
                    if (cVar != null) {
                        this.d.animateToState(cVar);
                    }
                    i2 = ((OG) this.d).tintColor;
                    if (i2 != -1) {
                        OG<T> og3 = this.d;
                        i3 = ((OG) og3).tintColor;
                        og3.setTintCallback(i3);
                    }
                }
            });
        }
        fillTransitionsMaps(list);
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC1101Os<T> {
        private InterfaceC1107Oy<T> d;
        final /* synthetic */ OG<T> e;

        d(OG<T> og) {
            this.e = og;
        }

        @Override // o.InterfaceC1101Os
        public void e(InterfaceC1107Oy<T> interfaceC1107Oy) {
            C8632dsu.c((Object) interfaceC1107Oy, "");
            OG.Companion.getLogTag();
            if (C8632dsu.c(((OG) this.e).currentTransition, interfaceC1107Oy)) {
                this.d = interfaceC1107Oy;
                InterfaceC1101Os<T> transitionListener = this.e.getTransitionListener();
                if (transitionListener != null) {
                    transitionListener.e(interfaceC1107Oy);
                }
            }
        }

        @Override // o.InterfaceC1101Os
        public void d(InterfaceC1107Oy<T> interfaceC1107Oy) {
            C8632dsu.c((Object) interfaceC1107Oy, "");
            c cVar = OG.Companion;
            cVar.getLogTag();
            if (C8632dsu.c(((OG) this.e).currentTransition, interfaceC1107Oy) && C8632dsu.c(interfaceC1107Oy, this.d)) {
                cVar.getLogTag();
                ((OG) this.e).currentTransition = null;
                this.e.setState((OG<T>) interfaceC1107Oy.e());
                InterfaceC1101Os<T> transitionListener = this.e.getTransitionListener();
                if (transitionListener != null) {
                    transitionListener.d(interfaceC1107Oy);
                }
                if (!this.e.isVisible() || !interfaceC1107Oy.h()) {
                    InterfaceC1107Oy<T> f = interfaceC1107Oy.f();
                    if (f != null) {
                        OG<T> og = this.e;
                        cVar.getLogTag();
                        og.setState((OG<T>) interfaceC1107Oy.e());
                        OG.startTransition$default(og, f, null, 2, null);
                    }
                } else {
                    cVar.getLogTag();
                    this.e.setState((OG<T>) interfaceC1107Oy.a());
                    this.e.animateToState(interfaceC1107Oy.e());
                }
            }
            if (((OG) this.e).currentTransition == null) {
                this.d = null;
            }
        }
    }

    public final void setState(T t) {
        T t2;
        C8632dsu.c((Object) t, "");
        InterfaceC1107Oy<T> interfaceC1107Oy = this.currentTransition;
        if (interfaceC1107Oy == null || (t2 = interfaceC1107Oy.e()) == null) {
            t2 = this.state;
        }
        if (C8632dsu.c(t2, t)) {
            return;
        }
        Companion.getLogTag();
        this.currentTransition = null;
        if (isAnimating()) {
            cancelAnimation();
        }
        this.state = t;
        Integer e = t.e();
        int intValue = e != null ? e.intValue() : 0;
        if (getFrame() != intValue) {
            setFrame(intValue);
        }
        updateStaticDrawableForState(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTintCallback(int i) {
        dpR dpr;
        C7165cr c7165cr = new C7165cr(i);
        C8912ff<ColorFilter> c8912ff = this.tintCallback;
        if (c8912ff != null) {
            c8912ff.c((C8912ff<ColorFilter>) c7165cr);
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            C8912ff c8912ff2 = new C8912ff(c7165cr);
            this.tintCallback = c8912ff2;
            addValueCallback(new C8368dj("**"), (C8368dj) InterfaceC6637ch.b, (C8912ff<C8368dj>) c8912ff2);
        }
    }

    public final void setTintColor(int i) {
        this.tintColor = i;
        this.stateToDrawableMap.clear();
        updateStaticDrawableForState(this.state);
        if (i != -1) {
            setTintCallback(i);
        }
    }

    private final Drawable getDrawableForState(T t) {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.stateToDrawableMap.get(t);
        if (weakReference == null || (drawable = weakReference.get()) == null) {
            C1332Xp c1332Xp = C1332Xp.b;
            Drawable b = t.b((Context) C1332Xp.b(Context.class));
            if (b != null) {
                int i = this.tintColor;
                if (i != -1) {
                    b.setTint(i);
                }
                this.stateToDrawableMap.put(t, new WeakReference<>(b));
                return b;
            }
            return null;
        }
        return drawable;
    }

    @Override // com.airbnb.lottie.LottieDrawable, android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.currentStaticDrawable != null) {
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
                return;
            }
            return;
        }
        super.invalidateSelf();
    }

    @SuppressLint({"RestrictedApi"})
    public final void setNetflixComposition(C1097Oo c1097Oo) {
        C8632dsu.c((Object) c1097Oo, "");
        setComposition(c1097Oo.d());
        this.targetFps = (int) ((c1097Oo.d().b() * 1000.0f) / c1097Oo.d().e());
        this.totalNumFrames = (int) ((c1097Oo.d().d() - c1097Oo.d().m()) + 1);
        Companion.getLogTag();
        this.netflixLottieComposition = c1097Oo;
    }

    @Override // com.airbnb.lottie.LottieDrawable
    public void setSpeed(float f) {
        super.setSpeed(f);
        this.absoluteSpeed = Math.abs(f);
    }

    @Override // com.airbnb.lottie.LottieDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        if (shouldDraw(this.state)) {
            Drawable drawable = this.currentStaticDrawable;
            if (drawable != null) {
                if (drawable != null) {
                    drawable.draw(canvas);
                    return;
                }
                return;
            }
            if (!getBounds().isEmpty() && (getBounds().left > 0 || getBounds().top > 0)) {
                canvas.translate(getBounds().left / 2.0f, getBounds().top);
            }
            super.draw(canvas);
            canvas.translate(0.0f, 0.0f);
        }
    }

    @Override // com.airbnb.lottie.LottieDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.currentStaticDrawable;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        if (this.pullSizeFromLottie) {
            return super.getIntrinsicWidth();
        }
        Drawable drawable2 = this.lastStaticDrawable;
        return drawable2 != null ? drawable2.getIntrinsicWidth() : super.getIntrinsicWidth();
    }

    @Override // com.airbnb.lottie.LottieDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.currentStaticDrawable;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        if (this.pullSizeFromLottie) {
            return super.getIntrinsicHeight();
        }
        Drawable drawable2 = this.lastStaticDrawable;
        return drawable2 != null ? drawable2.getIntrinsicHeight() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        C8632dsu.c((Object) rect, "");
        super.setBounds(rect);
        Drawable drawable = this.currentStaticDrawable;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.currentStaticDrawable;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, i4);
        }
    }

    @Override // com.airbnb.lottie.LottieDrawable, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (!z && isAnimating()) {
            cancelAnimation();
        }
        return super.setVisible(z, z2);
    }

    private final boolean shouldDraw(T t) {
        return t.e() != null;
    }

    private final void playAnimationBetweenFrames(int i, int i2) {
        if (getSpeed() > 0.0f) {
            Companion.getLogTag();
        } else {
            Companion.getLogTag();
        }
        setMinAndMaxFrame(i, i2);
        playAnimation();
    }

    public static /* synthetic */ void startTransition$default(OG og, InterfaceC1107Oy interfaceC1107Oy, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTransition");
        }
        if ((i & 2) != 0) {
            num = interfaceC1107Oy.a().e();
        }
        og.startTransition(interfaceC1107Oy, num);
    }

    /* loaded from: classes3.dex */
    public static final class a extends AnimatorListenerAdapter {
        private boolean a;
        final /* synthetic */ InterfaceC1107Oy<T> b;
        final /* synthetic */ OG<T> c;

        a(OG<T> og, InterfaceC1107Oy<T> interfaceC1107Oy) {
            this.c = og;
            this.b = interfaceC1107Oy;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            if (this.a) {
                return;
            }
            OG.Companion.getLogTag();
            ((OG) this.c).innerTransitionListener.d(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8632dsu.c((Object) animator, "");
            ((OG) this.c).currentTransition = null;
            this.a = true;
        }
    }

    @Override // com.airbnb.lottie.LottieDrawable
    public void setFrame(int i) {
        Companion.getLogTag();
        setMinAndMaxFrame(i, i);
        super.setFrame(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStaticDrawableForState(T t) {
        Drawable drawable;
        Companion.getLogTag();
        Drawable drawableForState = this.animationLoaded ? null : getDrawableForState(t);
        if (!C8632dsu.c(this.currentStaticDrawable, drawableForState)) {
            Rect bounds = getBounds();
            C8632dsu.a(bounds, "");
            this.lastStaticDrawable = this.currentStaticDrawable;
            this.currentStaticDrawable = drawableForState;
            if (!bounds.isEmpty() && (drawable = this.currentStaticDrawable) != null) {
                drawable.setBounds(bounds);
            }
            invalidateSelf();
        }
        resetDrawableOnViewToRecalculateIntrinsicSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void fillTransitionsMaps(List<? extends InterfaceC1107Oy<T>> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC1107Oy interfaceC1107Oy = (InterfaceC1107Oy) it.next();
            Map<T, InterfaceC1107Oy<T>> map = this.transitionsMapFromTo.get(interfaceC1107Oy.a());
            if (map == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.transitionsMapFromTo.put(interfaceC1107Oy.a(), linkedHashMap);
                map = linkedHashMap.put(interfaceC1107Oy.e(), interfaceC1107Oy);
            }
            if (map != null) {
                throw new IllegalStateException(("Duplicate from and to transition pair " + map + " and " + interfaceC1107Oy).toString());
            }
            if (this.transitionsMapToList.get(interfaceC1107Oy.e()) == null) {
                ArrayList arrayList = new ArrayList();
                this.transitionsMapToList.put(interfaceC1107Oy.e(), arrayList);
                arrayList.add(interfaceC1107Oy);
            }
            InterfaceC1107Oy<T> f = interfaceC1107Oy.f();
            while (true) {
                if ((f != null ? f.f() : null) == null) {
                    break;
                }
                f = f.f();
            }
            if (f != null && this.transitionsMapToList.get(f.e()) == null) {
                ArrayList arrayList2 = new ArrayList();
                this.transitionsMapToList.put(f.e(), arrayList2);
                arrayList2.add(interfaceC1107Oy);
            }
            if (interfaceC1107Oy.d() && this.transitionsMapToList.get(interfaceC1107Oy.a()) == null) {
                ArrayList arrayList3 = new ArrayList();
                this.transitionsMapToList.put(interfaceC1107Oy.a(), arrayList3);
                arrayList3.add(interfaceC1107Oy.b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    public final void animateToState(T t) {
        InterfaceC1107Oy<T> interfaceC1107Oy;
        ?? r1;
        C8632dsu.c((Object) t, "");
        c cVar = Companion;
        cVar.getLogTag();
        if (!this.animationLoaded && !C8141del.a()) {
            this.pendingAnimateToState = t;
            return;
        }
        InterfaceC1107Oy<T> interfaceC1107Oy2 = this.currentTransition;
        InterfaceC1107Oy<T> interfaceC1107Oy3 = null;
        if (interfaceC1107Oy2 == null) {
            if (C8632dsu.c(t, this.state)) {
                return;
            }
            Map<T, InterfaceC1107Oy<T>> map = this.transitionsMapFromTo.get(this.state);
            if (map == null) {
                interfaceC1107Oy = null;
            } else if (map.containsKey(t)) {
                interfaceC1107Oy = map.get(t);
            } else {
                Iterator it = map.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        r1 = 0;
                        break;
                    }
                    r1 = it.next();
                    if (C8632dsu.c(((InterfaceC1107Oy) r1).c(), t)) {
                        break;
                    }
                }
                interfaceC1107Oy = r1;
            }
            if (interfaceC1107Oy != null) {
                startTransition$default(this, interfaceC1107Oy, null, 2, null);
                return;
            } else {
                setState((OG<T>) t);
                return;
            }
        }
        cVar.getLogTag();
        if (C8632dsu.c(interfaceC1107Oy2.e(), t)) {
            return;
        }
        cVar.getLogTag();
        int frame = getFrame();
        cVar.getLogTag();
        List<InterfaceC1107Oy<T>> list = this.transitionsMapToList.get(t);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ?? next = it2.next();
                if (((InterfaceC1107Oy) next).a(frame)) {
                    interfaceC1107Oy3 = next;
                    break;
                }
            }
            interfaceC1107Oy3 = interfaceC1107Oy3;
        }
        if (interfaceC1107Oy3 != null) {
            Companion.getLogTag();
            startTransition(interfaceC1107Oy3, Integer.valueOf(frame));
            return;
        }
        Companion.getLogTag();
        setState((OG<T>) t);
    }

    private final void resetDrawableOnViewToRecalculateIntrinsicSize() {
        Companion.getLogTag();
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            while (callback instanceof Drawable) {
                callback = ((Drawable) callback).getCallback();
            }
            if (callback instanceof TextView) {
                TextView textView = (TextView) callback;
                Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
                C8632dsu.a(compoundDrawablesRelative, "");
                Drawable drawable = compoundDrawablesRelative[0];
                if (drawable != null || compoundDrawablesRelative[3] != null) {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    return;
                }
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                C8632dsu.a(compoundDrawables, "");
                textView.setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
            }
        }
    }

    protected final void startTransition(InterfaceC1107Oy<T> interfaceC1107Oy, Integer num) {
        InterfaceC1101Os<T> interfaceC1101Os;
        C8632dsu.c((Object) interfaceC1107Oy, "");
        c cVar = Companion;
        cVar.getLogTag();
        removeAnimatorListener(this.lottieAnimatorListenerAdapter);
        Integer e = interfaceC1107Oy.e().e();
        if (e == null) {
            setFrame(0);
            this.currentTransition = interfaceC1107Oy;
            this.innerTransitionListener.e(interfaceC1107Oy);
            this.innerTransitionListener.d(interfaceC1107Oy);
            this.currentTransition = null;
        } else if (this.animationLoaded && isVisible() && num != null && !C8632dsu.c(num, e)) {
            InterfaceC1107Oy<T> interfaceC1107Oy2 = this.currentTransition;
            if (interfaceC1107Oy2 != null && (interfaceC1101Os = this.transitionListener) != null) {
                interfaceC1101Os.d(interfaceC1107Oy2);
            }
            this.currentTransition = interfaceC1107Oy;
            a aVar = new a(this, interfaceC1107Oy);
            this.lottieAnimatorListenerAdapter = aVar;
            addAnimatorListener(aVar);
            if (num.intValue() > e.intValue()) {
                setSpeed(0 - this.absoluteSpeed);
                playAnimationBetweenFrames(e.intValue(), num.intValue());
            } else {
                setSpeed(this.absoluteSpeed);
                playAnimationBetweenFrames(num.intValue(), e.intValue());
            }
            this.innerTransitionListener.e(interfaceC1107Oy);
        } else {
            cVar.getLogTag();
            setState((OG<T>) interfaceC1107Oy.e());
            this.currentTransition = interfaceC1107Oy;
            this.innerTransitionListener.e(interfaceC1107Oy);
            this.innerTransitionListener.d(interfaceC1107Oy);
        }
    }
}

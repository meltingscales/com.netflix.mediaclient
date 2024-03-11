package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import com.netflix.mediaclient.service.webclient.model.leafs.TextJustification;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaBackgroundStyle;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaButtonStyle;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaCta;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaCtaInputGroup;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaDimensions;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaImageDetails;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaImagePosition;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaModalAttributes;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaPadding;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaStyle;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaTimer;
import com.netflix.mediaclient.ui.ums.UserMessageAreaFlexibleView$addDismissTimer$1$1;
import com.netflix.mediaclient.ui.ums.UserMessageAreaView;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C6201cXp;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.cQQ;
import o.dpR;
import o.dxD;

@SuppressLint({"ViewConstructor"})
/* renamed from: o.cXp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6201cXp extends UserMessageAreaView implements dwU {
    private final TextView a;
    private final NetflixImageView c;
    private final dwG e;
    private final ImageResolutionClass k;
    private Disposable l;
    private final Guideline s;
    public static final e d = new e(null);
    public static final int b = 8;

    /* renamed from: o.cXp$d */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ImageResolutionClass.values().length];
            try {
                iArr[ImageResolutionClass.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageResolutionClass.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageResolutionClass.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            c = iArr;
            int[] iArr2 = new int[UmaImagePosition.HorizontalPositions.values().length];
            try {
                iArr2[UmaImagePosition.HorizontalPositions.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[UmaImagePosition.HorizontalPositions.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[UmaImagePosition.HorizontalPositions.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[UmaImagePosition.HorizontalPositions.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr2;
            int[] iArr3 = new int[TextJustification.values().length];
            try {
                iArr3[TextJustification.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[TextJustification.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[TextJustification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr3;
        }
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public int j() {
        return com.netflix.mediaclient.ui.R.i.bG;
    }

    @Override // o.dwU
    /* renamed from: m */
    public dwG getCoroutineContext() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6201cXp(Context context, ImageResolutionClass imageResolutionClass) {
        super(context, UserMessageAreaView.MessageType.DIALOG);
        C8632dsu.c((Object) context, "");
        this.k = imageResolutionClass;
        View findViewById = findViewById(com.netflix.mediaclient.ui.R.g.ct);
        C8632dsu.a(findViewById, "");
        this.a = (TextView) findViewById;
        View findViewById2 = findViewById(com.netflix.mediaclient.ui.R.g.gB);
        C8632dsu.a(findViewById2, "");
        this.c = (NetflixImageView) findViewById2;
        View findViewById3 = findViewById(com.netflix.mediaclient.ui.R.g.cm);
        C8632dsu.a(findViewById3, "");
        this.s = (Guideline) findViewById3;
        this.e = dxZ.d(null, 1, null);
    }

    /* renamed from: o.cXp$e */
    /* loaded from: classes5.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public void e(boolean z) {
        dxD.b.b(getCoroutineContext(), null, 1, null);
        Disposable disposable = this.l;
        if (disposable != null) {
            disposable.dispose();
        }
        super.e(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        dxD.b.b(getCoroutineContext(), null, 1, null);
        Disposable disposable = this.l;
        if (disposable != null) {
            disposable.dispose();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public void i() {
        UmaTimer timer;
        boolean a2;
        UmaAlert umaAlert = this.m;
        if (umaAlert == null || (timer = umaAlert.timer()) == null) {
            return;
        }
        a2 = C8691duz.a("DISMISS", timer.action(), true);
        if (!a2 || timer.value() <= 0) {
            return;
        }
        C8737dwr.c(this, null, null, new UserMessageAreaFlexibleView$addDismissTimer$1$1(timer.value(), this, null), 3, null);
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public void f() {
        UmaModalAttributes modalAttributes;
        UmaPadding dialogPadding;
        UmaModalAttributes modalAttributes2;
        UmaBackgroundStyle background;
        Integer asARGB;
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel().toBuilder();
        C1332Xp c1332Xp = C1332Xp.b;
        ShapeAppearanceModel build = builder.setAllCorners(0, (int) TypedValue.applyDimension(1, 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())).build();
        C8632dsu.a(build, "");
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(build);
        UmaAlert umaAlert = this.m;
        materialShapeDrawable.setFillColor(ColorStateList.valueOf((umaAlert == null || (modalAttributes2 = umaAlert.modalAttributes()) == null || (background = modalAttributes2.background()) == null || (asARGB = background.getAsARGB()) == null) ? -1 : asARGB.intValue()));
        setBackground(materialShapeDrawable);
        UmaAlert umaAlert2 = this.m;
        if (umaAlert2 == null || (modalAttributes = umaAlert2.modalAttributes()) == null || (dialogPadding = modalAttributes.dialogPadding()) == null) {
            return;
        }
        Integer paddingStartAsInteger = dialogPadding.getPaddingStartAsInteger();
        if (paddingStartAsInteger != null) {
            C9870yD.b((View) this, 0, (int) TypedValue.applyDimension(1, paddingStartAsInteger.intValue(), ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        }
        Integer paddingTopAsInteger = dialogPadding.getPaddingTopAsInteger();
        if (paddingTopAsInteger != null) {
            C9870yD.b((View) this, 1, (int) TypedValue.applyDimension(1, paddingTopAsInteger.intValue(), ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        }
        Integer paddingEndAsInteger = dialogPadding.getPaddingEndAsInteger();
        if (paddingEndAsInteger != null) {
            C9870yD.b((View) this, 2, (int) TypedValue.applyDimension(1, paddingEndAsInteger.intValue(), ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        }
        Integer paddingBottomAsInteger = dialogPadding.getPaddingBottomAsInteger();
        if (paddingBottomAsInteger != null) {
            C9870yD.b((View) this, 3, (int) TypedValue.applyDimension(1, paddingBottomAsInteger.intValue(), ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        }
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public boolean g() {
        UmaModalAttributes modalAttributes;
        UmaImageDetails foreground;
        String imageUrlLow;
        UmaImagePosition.HorizontalPositions horizontal;
        Integer num;
        int i;
        UmaAlert umaAlert = this.m;
        if (umaAlert != null && (modalAttributes = umaAlert.modalAttributes()) != null && (foreground = modalAttributes.foreground()) != null) {
            ImageResolutionClass imageResolutionClass = this.k;
            int i2 = imageResolutionClass == null ? -1 : d.c[imageResolutionClass.ordinal()];
            if (i2 == 1) {
                imageUrlLow = foreground.imageUrlLow();
            } else if (i2 == 2) {
                imageUrlLow = foreground.imageUrlMedium();
            } else if (i2 == 3) {
                imageUrlLow = foreground.imageUrlHigh();
            } else {
                imageUrlLow = C8120deQ.a() ? foreground.imageUrlLow() : foreground.imageUrlHigh();
            }
            if (imageUrlLow == null || imageUrlLow.length() == 0) {
                NetflixImageView netflixImageView = this.h;
                C8632dsu.a(netflixImageView, "");
                netflixImageView.setVisibility(8);
            } else {
                NetflixImageView netflixImageView2 = this.h;
                C8632dsu.a(netflixImageView2, "");
                netflixImageView2.setVisibility(0);
                this.h.showImage(new ShowImageRequest().a(imageUrlLow).c(ShowImageRequest.Priority.a).d(true));
                UmaDimensions dimensions = foreground.dimensions();
                if (dimensions != null) {
                    ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
                    Float width = dimensions.width();
                    int i3 = -2;
                    if (width != null) {
                        C8632dsu.d(width);
                        float floatValue = width.floatValue();
                        C1332Xp c1332Xp = C1332Xp.b;
                        i = (int) TypedValue.applyDimension(1, floatValue, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
                    } else {
                        i = -2;
                    }
                    layoutParams.width = i;
                    Float height = dimensions.height();
                    if (height != null) {
                        C8632dsu.d(height);
                        float floatValue2 = height.floatValue();
                        C1332Xp c1332Xp2 = C1332Xp.b;
                        i3 = (int) TypedValue.applyDimension(1, floatValue2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
                    }
                    layoutParams.height = i3;
                    this.h.setLayoutParams(layoutParams);
                }
                UmaImagePosition position = foreground.position();
                if (position != null && (horizontal = position.horizontal()) != null) {
                    int i4 = d.a[horizontal.ordinal()];
                    if (i4 == 1 || i4 == 2) {
                        num = 7;
                    } else {
                        num = (i4 == 3 || i4 == 4) ? 6 : null;
                    }
                    if (num != null) {
                        View findViewById = findViewById(com.netflix.mediaclient.ui.R.g.f13247o);
                        if (findViewById instanceof ConstraintLayout) {
                            ConstraintSet constraintSet = new ConstraintSet();
                            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
                            constraintSet.clone(constraintLayout);
                            constraintSet.clear(com.netflix.mediaclient.ui.R.g.cv, num.intValue());
                            constraintSet.applyTo(constraintLayout);
                        }
                    }
                }
            }
        }
        NetflixImageView netflixImageView3 = this.h;
        C8632dsu.a(netflixImageView3, "");
        return netflixImageView3.getVisibility() == 0;
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public void c(UmaCta umaCta, int i, boolean z) {
        ColorStateList valueOf;
        ColorStateList colorStateList;
        List<UmaCtaInputGroup> inputGroup;
        C8632dsu.c((Object) umaCta, "");
        if (umaCta.ctaType() == UmaCta.CtaType.COPY_BUTTON && (inputGroup = umaCta.inputGroup()) != null && !inputGroup.isEmpty()) {
            e(umaCta, i, z);
            return;
        }
        UmaButtonStyle style = umaCta.style();
        if (style == null) {
            super.c(umaCta, i, z);
            return;
        }
        C1203Sq c1203Sq = new C1203Sq(new ContextThemeWrapper(getContext(), umaCta.selected() ? a() : h()), null, 0, 6, null);
        String textColor = style.textColor();
        String buttonColor = style.buttonColor();
        if (textColor != null || buttonColor != null) {
            C1189Sc b2 = c1203Sq.b();
            Integer colorInt = UmaButtonStyle.toColorInt(textColor);
            Integer colorInt2 = UmaButtonStyle.toColorInt(buttonColor);
            if (colorInt == null) {
                valueOf = b2.m();
            } else {
                valueOf = ColorStateList.valueOf(colorInt.intValue());
                C8632dsu.a(valueOf, "");
            }
            ColorStateList colorStateList2 = valueOf;
            if (colorInt2 == null) {
                colorStateList = b2.c();
            } else {
                ColorStateList valueOf2 = ColorStateList.valueOf(colorInt2.intValue());
                C8632dsu.a(valueOf2, "");
                colorStateList = valueOf2;
            }
            C1203Sq.a(c1203Sq, null, colorStateList, colorStateList2, null, false, colorInt != null ? colorInt.intValue() : b2.i(), 0, colorInt2 == null ? b2.l() : 0, 0, false, false, 1369, null);
        }
        c1203Sq.setText(umaCta.text());
        c1203Sq.setId(i);
        if (this.f13325o == UserMessageAreaView.MessageType.BANNER) {
            this.g.addView(c1203Sq, new ViewGroup.LayoutParams(-2, -2));
        } else {
            b(c1203Sq);
        }
        this.g.setVisibility(0);
        this.g.requestLayout();
        c1203Sq.setOnClickListener(e(umaCta));
        if (z) {
            c((View) c1203Sq);
        }
    }

    private final void c(View view) {
        int o2 = o();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C8632dsu.d(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, 0, 0, o2);
        view.setLayoutParams(layoutParams2);
    }

    private final void e(final UmaCta umaCta, int i, boolean z) {
        UmaCta umaCta2;
        UmaCtaInputGroup umaCtaInputGroup;
        UmaCtaInputGroup umaCtaInputGroup2;
        Object obj;
        Object obj2;
        List<UmaCta> ctas;
        Object x;
        UmaAlert umaAlert = this.m;
        if (umaAlert == null || (ctas = umaAlert.ctas()) == null) {
            umaCta2 = null;
        } else {
            x = C8576dqs.x(ctas);
            umaCta2 = (UmaCta) x;
        }
        if (C8632dsu.c(umaCta2, umaCta)) {
            C9870yD.b((View) this.g, 1, 0);
        }
        Context context = getContext();
        C8632dsu.a(context, "");
        C1177Rq c1177Rq = new C1177Rq(context, null, 0, 6, null);
        c1177Rq.a().setId(i);
        List<UmaCtaInputGroup> inputGroup = umaCta.inputGroup();
        if (inputGroup != null) {
            Iterator<T> it = inputGroup.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((UmaCtaInputGroup) obj2).inputType() == UmaCtaInputGroup.InputType.TEXT) {
                    break;
                }
            }
            umaCtaInputGroup = (UmaCtaInputGroup) obj2;
        } else {
            umaCtaInputGroup = null;
        }
        c1177Rq.setLinkToCopy(umaCtaInputGroup != null ? umaCtaInputGroup.copy() : null);
        C1177Rq.setLinkText$default(c1177Rq, umaCtaInputGroup != null ? umaCtaInputGroup.copy() : null, null, 2, null);
        String copy = umaCtaInputGroup != null ? umaCtaInputGroup.copy() : null;
        if (umaCta.autoLogin() && copy != null && copy.length() != 0) {
            d(copy, c1177Rq);
        }
        List<UmaCtaInputGroup> inputGroup2 = umaCta.inputGroup();
        if (inputGroup2 != null) {
            Iterator<T> it2 = inputGroup2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((UmaCtaInputGroup) obj).inputType() == UmaCtaInputGroup.InputType.BUTTON) {
                    break;
                }
            }
            umaCtaInputGroup2 = (UmaCtaInputGroup) obj;
        } else {
            umaCtaInputGroup2 = null;
        }
        c1177Rq.setLabel(umaCtaInputGroup2 != null ? umaCtaInputGroup2.copy() : null);
        c1177Rq.setOnCopyLinkClicked(new drX<View, CharSequence, dpR>() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaFlexibleView$addCopyToClipboardCta$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(View view, CharSequence charSequence) {
                c(view, charSequence);
                return dpR.c;
            }

            public final void c(View view, CharSequence charSequence) {
                C8632dsu.c((Object) view, "");
                C8632dsu.c((Object) charSequence, "");
                View.OnClickListener e2 = C6201cXp.this.e(umaCta);
                if (e2 != null) {
                    e2.onClick(view);
                }
            }
        });
        b(c1177Rq);
        if (z) {
            c((View) c1177Rq);
        }
    }

    private final void d(String str, C1177Rq c1177Rq) {
        new cQQ().c(3600000L).takeUntil(C9618tM.d(this)).subscribe(new b(c1177Rq, str));
    }

    /* renamed from: o.cXp$b */
    /* loaded from: classes5.dex */
    public static final class b extends bDM<cQQ.d> {
        final /* synthetic */ C1177Rq b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1177Rq c1177Rq, String str) {
            super("UMA createAutoLoginToken");
            this.b = c1177Rq;
            this.c = str;
        }

        @Override // io.reactivex.Observer
        /* renamed from: c */
        public void onNext(cQQ.d dVar) {
            C8632dsu.c((Object) dVar, "");
            String b = dVar.b();
            if (b != null) {
                this.b.setLinkToCopy(C8051ddA.c(this.c, b));
            }
        }
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public void b() {
        super.b();
        UmaAlert umaAlert = this.m;
        String headline = umaAlert != null ? umaAlert.headline() : null;
        if (headline != null && headline.length() != 0) {
            this.a.setText(C8168dfL.c(headline));
        } else {
            this.a.setVisibility(8);
        }
        p();
        TextView textView = this.a;
        UmaAlert umaAlert2 = this.m;
        a(textView, umaAlert2 != null ? umaAlert2.headlineTextStyle() : null);
        TextView textView2 = this.n;
        UmaAlert umaAlert3 = this.m;
        a(textView2, umaAlert3 != null ? umaAlert3.titleTextStyle() : null);
        TextView textView3 = this.i;
        UmaAlert umaAlert4 = this.m;
        a(textView3, umaAlert4 != null ? umaAlert4.bodyTextStyle() : null);
        C6193cXh.a.c(this, this.m);
    }

    private final void a(TextView textView, UmaStyle umaStyle) {
        if (textView == null || umaStyle == null) {
            return;
        }
        TextJustification justification = umaStyle.justification();
        if (justification != null) {
            int i = d.b[justification.ordinal()];
            int i2 = 3;
            if (i != 1 && i != 2) {
                i2 = i != 3 ? 2 : 4;
            }
            textView.setTextAlignment(i2);
        }
        Float fontSize = umaStyle.fontSize();
        if (fontSize != null) {
            textView.setTextSize(fontSize.floatValue());
        }
    }

    private final void p() {
        UmaModalAttributes modalAttributes;
        UmaBackgroundStyle background;
        UmaImageDetails image;
        String imageUrlLow;
        UmaModalAttributes modalAttributes2;
        UmaBackgroundStyle background2;
        UmaImageDetails image2;
        UmaModalAttributes modalAttributes3;
        UmaBackgroundStyle background3;
        UmaImageDetails image3;
        ImageResolutionClass imageResolutionClass = this.k;
        int i = imageResolutionClass == null ? -1 : d.c[imageResolutionClass.ordinal()];
        if (i == 1) {
            UmaAlert umaAlert = this.m;
            if (umaAlert != null && (modalAttributes = umaAlert.modalAttributes()) != null && (background = modalAttributes.background()) != null && (image = background.image()) != null) {
                imageUrlLow = image.imageUrlLow();
            }
            imageUrlLow = null;
        } else if (i == 2) {
            UmaAlert umaAlert2 = this.m;
            if (umaAlert2 != null && (modalAttributes2 = umaAlert2.modalAttributes()) != null && (background2 = modalAttributes2.background()) != null && (image2 = background2.image()) != null) {
                imageUrlLow = image2.imageUrlMedium();
            }
            imageUrlLow = null;
        } else if (i == 3) {
            UmaAlert umaAlert3 = this.m;
            if (umaAlert3 != null && (modalAttributes3 = umaAlert3.modalAttributes()) != null && (background3 = modalAttributes3.background()) != null && (image3 = background3.image()) != null) {
                imageUrlLow = image3.imageUrlHigh();
            }
            imageUrlLow = null;
        } else if (C8120deQ.a()) {
            UmaAlert umaAlert4 = this.m;
            if (umaAlert4 != null) {
                imageUrlLow = umaAlert4.backgroundImageUrlLow();
            }
            imageUrlLow = null;
        } else {
            UmaAlert umaAlert5 = this.m;
            if (umaAlert5 != null) {
                imageUrlLow = umaAlert5.backgroundImageUrlHigh();
            }
            imageUrlLow = null;
        }
        if (imageUrlLow != null && imageUrlLow.length() != 0) {
            this.c.showImage(new ShowImageRequest().a(imageUrlLow).a(true).a(new a(System.currentTimeMillis(), this)));
            return;
        }
        this.c.setVisibility(8);
        n();
    }

    /* renamed from: o.cXp$a */
    /* loaded from: classes5.dex */
    public static final class a implements SingleObserver<ShowImageRequest.a> {
        final /* synthetic */ long b;
        final /* synthetic */ C6201cXp d;

        a(long j, C6201cXp c6201cXp) {
            this.b = j;
            this.d = c6201cXp;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void onSuccess(ShowImageRequest.a aVar) {
            C8632dsu.c((Object) aVar, "");
            if (System.currentTimeMillis() - this.b > 250 && !C9737vz.a(this.d.getContext()) && !C8120deQ.a()) {
                this.d.c.setAlpha(1.0f);
            } else {
                this.d.c.animate().alpha(1.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator());
            }
            this.d.l = null;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            C8632dsu.c((Object) disposable, "");
            this.d.l = disposable;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            Map d;
            Map k;
            Throwable th2;
            C8632dsu.c((Object) th, "");
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("Could not load image for collections UMA", th, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th2 = new Throwable(c1596aHd.b());
            } else {
                th2 = c1596aHd.i;
                if (th2 == null) {
                    th2 = new Throwable("Handled exception with no message");
                } else if (th2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th2);
            } else {
                dVar.e().b(c1596aHd, th2);
            }
            this.d.l = null;
            this.d.c.setVisibility(8);
            this.d.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        ViewGroup.LayoutParams layoutParams = this.s.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.guidePercent = 0.0f;
        }
        this.s.setLayoutParams(layoutParams2);
    }
}

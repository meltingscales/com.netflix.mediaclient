package com.netflix.mediaclient.ui.offline;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import androidx.core.content.ContextCompat;
import com.google.android.material.snackbar.Snackbar;
import com.netflix.android.widgetry.widget.tabs.BadgeView;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.AddCachedVideoCommand;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.util.PlayContext;
import dagger.hilt.android.AndroidEntryPoint;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.AbstractApplicationC1040Mh;
import o.AbstractC7244csZ;
import o.C1026Lt;
import o.C1030Lx;
import o.C1044Mm;
import o.C1204Sr;
import o.C7350cuZ;
import o.C9834xU;
import o.InterfaceC5107bsX;
import o.InterfaceC5176btn;
import o.InterfaceC5206buQ;
import o.InterfaceC7281ctJ;
import o.InterfaceC7303ctf;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public class DownloadButton extends AbstractC7244csZ {
    public static List<String> c = null;
    private static byte e$ss2$4315 = 0;
    private static int m = 1;

    /* renamed from: o  reason: collision with root package name */
    private static int f13296o;
    public ButtonState a;
    private PlayContext b;
    @Inject
    public a clickListenerFactory;
    public C1204Sr d;
    protected BadgeView e;
    private String f;
    private InterfaceC5176btn g;
    private int h;
    private e i;
    private int j;
    private final boolean k;
    private final boolean n;
    @Inject
    public InterfaceC7303ctf offlineApi;

    /* loaded from: classes4.dex */
    public enum ButtonState {
        AVAILABLE,
        NOT_AVAILABLE,
        SAVED,
        DOWNLOADING,
        PAUSED,
        QUEUED,
        PRE_QUEUED,
        ERROR,
        WAITING_FOR_WIFI
    }

    /* loaded from: classes4.dex */
    public interface a {
        e a(String str, VideoType videoType, Activity activity, boolean z, boolean z2);
    }

    /* loaded from: classes4.dex */
    public interface e {
        void d(DownloadButton downloadButton, PlayContext playContext);

        void e(DownloadButton downloadButton, PlayContext playContext);
    }

    static void l() {
        e$ss2$4315 = (byte) 24;
    }

    protected int a() {
        return C7350cuZ.d.a;
    }

    public String b() {
        return this.f;
    }

    public ButtonState c() {
        return this.a;
    }

    public void setPlayContext(PlayContext playContext) {
        this.b = playContext;
    }

    public void f() {
        e eVar = this.i;
        if (eVar != null) {
            eVar.d(this, this.b);
        }
    }

    public static ButtonState b(InterfaceC5206buQ interfaceC5206buQ, InterfaceC5176btn interfaceC5176btn) {
        Context d = AbstractApplicationC1040Mh.d();
        if (interfaceC5206buQ != null) {
            if (InterfaceC7303ctf.c(d).a(interfaceC5206buQ)) {
                return ButtonState.ERROR;
            }
            int i = AnonymousClass4.e[interfaceC5206buQ.au_().ordinal()];
            if (i == 1) {
                if (interfaceC5206buQ.C().c()) {
                    return ButtonState.ERROR;
                }
                return ButtonState.SAVED;
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return ButtonState.ERROR;
                        }
                        if (c.contains(interfaceC5176btn.aH_())) {
                            return ButtonState.QUEUED;
                        }
                        return interfaceC5176btn.d() ? ButtonState.AVAILABLE : ButtonState.NOT_AVAILABLE;
                    }
                    StopReason aM_ = interfaceC5206buQ.aM_();
                    int aD_ = interfaceC5206buQ.aD_();
                    if (aM_.a()) {
                        return ButtonState.ERROR;
                    }
                    if (aD_ > 0) {
                        return ButtonState.PAUSED;
                    }
                    return ButtonState.QUEUED;
                }
                return ButtonState.DOWNLOADING;
            } else {
                return ButtonState.QUEUED;
            }
        } else if (c.contains(interfaceC5176btn.aH_())) {
            return ButtonState.QUEUED;
        } else {
            return interfaceC5176btn.d() ? ButtonState.AVAILABLE : ButtonState.NOT_AVAILABLE;
        }
    }

    public DownloadButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = ButtonState.NOT_AVAILABLE;
        this.h = C7350cuZ.a.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7350cuZ.c.e);
        this.k = obtainStyledAttributes.getBoolean(C7350cuZ.c.d, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C7350cuZ.c.c, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C7350cuZ.c.b, C7350cuZ.e.d);
        this.n = obtainStyledAttributes.getBoolean(C7350cuZ.c.a, false);
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(getContext()).inflate(resourceId, this);
        this.e = (BadgeView) inflate.findViewById(C7350cuZ.b.d);
        this.d = (C1204Sr) inflate.findViewById(C7350cuZ.b.a);
        a(dimensionPixelSize);
        p();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    private void a(int i) {
        View findViewById;
        b(a(), false);
        setContentDescription(getResources().getString(C7350cuZ.a.a));
        if (i <= 0 || (findViewById = findViewById(C7350cuZ.b.e)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        findViewById.setLayoutParams(layoutParams);
    }

    public void e(int i) {
        this.e.setDisplayType(BadgeView.DisplayType.PROGRESS);
        this.e.setBackgroundColor(getContext().getResources().getColor(C9834xU.c.I));
        this.e.setBackgroundShadowColor(getContext().getResources().getColor(C9834xU.c.F));
        this.e.setProgress(i);
        this.e.setPaused(this.a == ButtonState.PAUSED);
    }

    private void b(int i, boolean z) {
        this.e.setDisplayType(BadgeView.DisplayType.DRAWABLE);
        Drawable c2 = c(i);
        if (c2 != null && z) {
            c2.setTint(ContextCompat.getColor(getContext(), C1030Lx.d.f));
        }
        this.e.setDrawable(c2);
    }

    protected Drawable c(int i) {
        return getContext().getDrawable(i);
    }

    private void p() {
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.netflix.mediaclient.ui.offline.DownloadButton.5
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                String string;
                switch (AnonymousClass4.c[((DownloadButton) view).c().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        string = DownloadButton.this.getResources().getString(C7350cuZ.a.f13776o);
                        break;
                    case 4:
                        string = DownloadButton.this.getResources().getString(C7350cuZ.a.p);
                        break;
                    case 5:
                        string = DownloadButton.this.getResources().getString(C7350cuZ.a.r);
                        break;
                    case 6:
                        string = DownloadButton.this.getResources().getString(C7350cuZ.a.c);
                        break;
                    default:
                        string = null;
                        break;
                }
                if (TextUtils.isEmpty(string)) {
                    return true;
                }
                Snackbar.make(view, string, -1).show();
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.offline.DownloadButton$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] c;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ButtonState.values().length];
            c = iArr;
            try {
                iArr[ButtonState.PRE_QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[ButtonState.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[ButtonState.DOWNLOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[ButtonState.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[ButtonState.AVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[ButtonState.SAVED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[ButtonState.ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[ButtonState.NOT_AVAILABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[ButtonState.WAITING_FOR_WIFI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[DownloadState.values().length];
            e = iArr2;
            try {
                iArr2[DownloadState.Complete.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                e[DownloadState.Creating.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                e[DownloadState.InProgress.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                e[DownloadState.Stopped.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                e[DownloadState.CreateFailed.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public void setStateAndProgress(String str, ButtonState buttonState, int i) {
        e(buttonState, str);
        if (buttonState == ButtonState.DOWNLOADING || buttonState == ButtonState.PAUSED) {
            setProgress(i);
        }
    }

    public void setProgress(int i) {
        this.j = i;
        e(i);
    }

    public void setStateFromPlayable(InterfaceC5176btn interfaceC5176btn, Activity activity) {
        ServiceManager serviceManager = ((InterfaceC5107bsX) activity).getServiceManager();
        C1044Mm.a("download_button", "setStateFromPlayable, playable: " + interfaceC5176btn + ", manager isReady: " + serviceManager.c());
        if (interfaceC5176btn == null || !serviceManager.c()) {
            return;
        }
        this.g = interfaceC5176btn;
        setupClickHandling(interfaceC5176btn, activity);
        InterfaceC7281ctJ a2 = this.offlineApi.a();
        InterfaceC5206buQ c2 = a2 != null ? a2.c(interfaceC5176btn.aH_()) : null;
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(c2 != null);
        C1044Mm.c("download_button", "setStateFromPlayable hasOfflinePlayableData=%b", objArr);
        ButtonState b = b(c2, interfaceC5176btn);
        e(b, interfaceC5176btn.aH_());
        if (c2 != null) {
            int i = AnonymousClass4.c[b.ordinal()];
            if (i == 3 || i == 4) {
                setProgress(c2.aD_());
            }
        }
    }

    public void setupClickHandling(InterfaceC5176btn interfaceC5176btn, Activity activity) {
        String aH_ = interfaceC5176btn.aH_();
        if (aH_ != null) {
            setupClickHandling(aH_, interfaceC5176btn.aY_() ? VideoType.EPISODE : VideoType.MOVIE, activity, interfaceC5176btn.isPlayable());
        }
    }

    public void setupClickHandling(String str, VideoType videoType, Activity activity, boolean z) {
        this.i = this.clickListenerFactory.a(str, videoType, activity, this.k, z);
        setOnClickListener(new View.OnClickListener() { // from class: o.crL
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadButton.this.e(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        this.i.e(this, this.b);
    }

    public void e(ButtonState buttonState, String str) {
        ButtonState buttonState2 = this.a;
        this.a = buttonState;
        this.f = str;
        if (buttonState != ButtonState.QUEUED) {
            c(str);
        }
        ButtonState buttonState3 = ButtonState.NOT_AVAILABLE;
        setImportantForAccessibility(buttonState == buttonState3 ? 4 : 1);
        i();
        j();
        if (buttonState2 != buttonState && buttonState2 == buttonState3) {
            setVisibility(0);
        }
        d(str);
    }

    protected void d(String str) {
        setTag("download_btn" + str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i() {
        switch (AnonymousClass4.c[this.a.ordinal()]) {
            case 1:
                e(0);
                b(C7350cuZ.d.b, false);
                s();
                return;
            case 2:
                e(0);
                d(C7350cuZ.d.g);
                return;
            case 3:
                this.e.clearAnimation();
                d(C7350cuZ.d.e);
                return;
            case 4:
                e(this.j);
                return;
            case 5:
                e(0);
                b(a(), false);
                return;
            case 6:
                e(0);
                d(C7350cuZ.d.d);
                return;
            case 7:
                e(0);
                c(C1026Lt.a.hb, true);
                return;
            case 8:
                setVisibility(4);
                return;
            case 9:
                e(0);
                d(C7350cuZ.d.i);
                return;
            default:
                return;
        }
    }

    protected void j() {
        if (this.n) {
            n();
        }
    }

    private void s() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 90.0f, this.e.getMeasuredWidth() / 2, this.e.getMeasuredHeight() / 2);
        rotateAnimation.setDuration(400L);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.netflix.mediaclient.ui.offline.DownloadButton.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                C1044Mm.a("download_button", "onAnimationEnd");
                if (DownloadButton.this.c() != ButtonState.ERROR) {
                    DownloadButton downloadButton = DownloadButton.this;
                    downloadButton.e(downloadButton.m(), DownloadButton.this.f);
                }
                DownloadButton.this.e.clearAnimation();
            }
        });
        this.e.startAnimation(rotateAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ButtonState m() {
        return ButtonState.QUEUED;
    }

    protected void c(int i, boolean z) {
        this.e.clearAnimation();
        this.e.animate().alpha(1.0f).setDuration(500L);
        b(i, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(int i) {
        this.e.clearAnimation();
        this.e.animate().alpha(1.0f).setDuration(500L);
        b(i, false);
    }

    public Long g() {
        Logger logger = Logger.INSTANCE;
        Long startSession = logger.startSession(new Focus(e(), null));
        logger.startSession(new AddCachedVideoCommand());
        return startSession;
    }

    public void c(Long l) {
        ExtLogger.INSTANCE.endCommand("AddCachedVideoCommand");
        Logger.INSTANCE.endSession(l);
    }

    public AppView e() {
        return AppView.addCachedVideoButton;
    }

    static {
        l();
        c = new ArrayList();
    }

    public static void e(List<String> list) {
        for (String str : list) {
            c.remove(str);
        }
    }

    public static void c(String str) {
        c.remove(str);
    }

    public static void d() {
        c.clear();
    }

    public void b(String str, Activity activity) {
        if (str == null || !str.equals(this.f)) {
            return;
        }
        setStateFromPlayable(this.g, activity);
    }

    public boolean h() {
        InterfaceC5176btn interfaceC5176btn = this.g;
        return interfaceC5176btn != null && interfaceC5176btn.aY_();
    }

    public void setDefaultLabelId(int i) {
        this.h = i;
        n();
    }

    public void e(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    protected void n() {
        int i;
        int i2 = 2 % 2;
        if (this.d == null) {
            int i3 = f13296o + 53;
            m = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        if (this.n) {
            ButtonState c2 = c();
            if (c2 == ButtonState.SAVED) {
                i = C7350cuZ.a.q;
            } else if (c2 == ButtonState.PAUSED) {
                int i5 = f13296o + 77;
                m = i5 % 128;
                int i6 = i5 % 2;
                i = C7350cuZ.a.t;
                if (i6 == 0) {
                    throw null;
                }
            } else if (c2 == ButtonState.DOWNLOADING) {
                i = C7350cuZ.a.s;
            } else {
                int i7 = this.h;
                int i8 = f13296o + 67;
                m = i8 % 128;
                int i9 = i8 % 2;
                i = i7;
            }
        } else {
            i = this.h;
        }
        C1204Sr c1204Sr = this.d;
        String string = getResources().getString(i);
        if (!(!string.startsWith("'!#+"))) {
            Object[] objArr = new Object[1];
            t(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        c1204Sr.setText(string);
    }

    private void t(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$4315);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}

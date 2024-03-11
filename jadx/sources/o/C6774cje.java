package o;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.webkit.JavascriptInterface;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import o.AbstractC6710ciT;

/* renamed from: o.cje  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6774cje {
    public static final d b = new d(null);
    private final C6716ciZ a;
    private final C9935zP d;
    private final InterfaceC6782cjm e;

    public C6774cje(C6716ciZ c6716ciZ, C9935zP c9935zP, InterfaceC6782cjm interfaceC6782cjm) {
        C8632dsu.c((Object) c6716ciZ, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) interfaceC6782cjm, "");
        this.a = c6716ciZ;
        this.d = c9935zP;
        this.e = interfaceC6782cjm;
    }

    /* renamed from: o.cje$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("GameControllerJsBridge");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C6774cje c6774cje) {
        C8632dsu.c((Object) c6774cje, "");
        c6774cje.d.b(AbstractC6710ciT.class, AbstractC6710ciT.a.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C6774cje c6774cje, List list) {
        C8632dsu.c((Object) c6774cje, "");
        C8632dsu.c((Object) list, "");
        c6774cje.d.b(AbstractC6710ciT.class, new AbstractC6710ciT.e(list));
    }

    @JavascriptInterface
    public final void allowSleep(final boolean z) {
        C8187dfe.c(new Runnable() { // from class: o.cjh
            @Override // java.lang.Runnable
            public final void run() {
                C6774cje.e(z, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(boolean z, C6774cje c6774cje) {
        C9941zV c9941zV;
        C8632dsu.c((Object) c6774cje, "");
        if (z) {
            c9941zV = AbstractC6710ciT.b.d;
        } else if (!z) {
            c9941zV = AbstractC6710ciT.d.d;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        c6774cje.d.b(AbstractC6710ciT.class, c9941zV);
    }

    @JavascriptInterface
    public final void copyTextToClipboard(String str) {
        C8632dsu.c((Object) str, "");
        Context requireContext = this.a.requireContext();
        C8632dsu.a(requireContext, "");
        ClipboardManager clipboardManager = (ClipboardManager) ContextCompat.getSystemService(requireContext, ClipboardManager.class);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("gameControllerJsBridge", str));
        }
    }

    @JavascriptInterface
    public final float getFontScale() {
        float f = this.a.requireContext().getResources().getConfiguration().fontScale;
        b.getLogTag();
        return f;
    }

    @JavascriptInterface
    public final float getZoomScale() {
        float f = this.a.requireContext().getResources().getDisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEVICE_STABLE;
        b.getLogTag();
        return f;
    }

    @JavascriptInterface
    public final void closeController() {
        b.getLogTag();
        C8187dfe.c(new Runnable() { // from class: o.cjf
            @Override // java.lang.Runnable
            public final void run() {
                C6774cje.e(C6774cje.this);
            }
        });
    }

    @JavascriptInterface
    public final void loadingCompleted() {
        b.getLogTag();
        this.e.h();
    }

    @JavascriptInterface
    public final void loadingError(String str) {
        b.getLogTag();
        InterfaceC6782cjm interfaceC6782cjm = this.e;
        if (str == null) {
            str = "err";
        }
        interfaceC6782cjm.e(str);
    }

    @JavascriptInterface
    public final void openUrl(String str) {
        b.getLogTag();
        if (str != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            FragmentActivity activity = this.a.getActivity();
            if (activity != null) {
                activity.startActivity(intent);
            }
        }
    }

    @JavascriptInterface
    public final void openUrl(String str, boolean z) {
        b.getLogTag();
        if (str != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            FragmentActivity activity = this.a.getActivity();
            if (activity != null) {
                activity.startActivity(intent);
            }
        }
    }

    @JavascriptInterface
    public final void console(String str) {
        b.getLogTag();
    }

    @JavascriptInterface
    public final void lockOrientation(String[] strArr) {
        C8632dsu.c((Object) strArr, "");
        b.getLogTag();
        final ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(NGPBeaconControllerOrientation.a.c(str));
        }
        C8187dfe.c(new Runnable() { // from class: o.cjk
            @Override // java.lang.Runnable
            public final void run() {
                C6774cje.d(C6774cje.this, arrayList);
            }
        });
    }

    @JavascriptInterface
    public final void experimental_performHapticFeedback(int i) {
        b.getLogTag();
        this.a.requireView().performHapticFeedback(i);
    }

    @JavascriptInterface
    public final void experimental_vibrate_effect(int i) {
        VibrationEffect createPredefined;
        b.getLogTag();
        createPredefined = VibrationEffect.createPredefined(i);
        ((Vibrator) this.a.requireView().getContext().getSystemService(Vibrator.class)).vibrate(createPredefined);
    }

    @JavascriptInterface
    public final void experimental_vibrate_pattern_effect(Long[] lArr, Integer[] numArr, int i) {
        long[] c;
        int[] a;
        VibrationEffect createWaveform;
        C8632dsu.c((Object) lArr, "");
        C8632dsu.c((Object) numArr, "");
        b.getLogTag();
        c = C8563dqf.c(lArr);
        a = C8563dqf.a(numArr);
        createWaveform = VibrationEffect.createWaveform(c, a, i);
        ((Vibrator) this.a.requireView().getContext().getSystemService(Vibrator.class)).vibrate(createWaveform);
    }

    @JavascriptInterface
    public final void experimental_vibrate_raw_pattern(Long[] lArr, int i) {
        long[] c;
        C8632dsu.c((Object) lArr, "");
        b.getLogTag();
        c = C8563dqf.c(lArr);
        ((Vibrator) this.a.requireView().getContext().getSystemService(Vibrator.class)).vibrate(c, i);
    }

    @JavascriptInterface
    public final void experimental_vibrate_time(long j) {
        b.getLogTag();
        ((Vibrator) this.a.requireView().getContext().getSystemService(Vibrator.class)).vibrate(j);
    }

    @JavascriptInterface
    public final void experimental_vibrate_cancel() {
        b.getLogTag();
        ((Vibrator) this.a.requireView().getContext().getSystemService(Vibrator.class)).cancel();
    }
}

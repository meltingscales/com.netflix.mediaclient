package com.bugsnag.android;

import com.bugsnag.android.NdkPlugin;
import com.bugsnag.android.ndk.NativeBridge;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C8608drx;
import o.C8627dsp;
import o.C9170kY;
import o.C9191kt;
import o.C9199lA;
import o.C9229le;
import o.C9246lv;
import o.InterfaceC9217lS;
import o.InterfaceC9218lT;
import o.dpR;
import o.dqE;

/* loaded from: classes5.dex */
public final class NdkPlugin implements InterfaceC9217lS {
    private static final d Companion = new d(null);
    @Deprecated
    private static final String LOAD_ERR_MSG = "Native library could not be linked. Bugsnag will not report NDK errors. See https://docs.bugsnag.com/platforms/android/ndk-link-errors";
    private C9191kt client;
    private NativeBridge nativeBridge;
    private final C9199lA libraryLoader = new C9199lA();
    private final AtomicBoolean oneTimeSetupPerformed = new AtomicBoolean(false);

    private final native void disableCrashReporting();

    private final native void enableCrashReporting();

    private final native String getBinaryArch();

    public final NativeBridge getNativeBridge() {
        return this.nativeBridge;
    }

    /* loaded from: classes5.dex */
    static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    private final NativeBridge initNativeBridge(C9191kt c9191kt) {
        NativeBridge nativeBridge = new NativeBridge(c9191kt.d);
        c9191kt.d(nativeBridge);
        c9191kt.u();
        return nativeBridge;
    }

    @Override // o.InterfaceC9217lS
    public void load(C9191kt c9191kt) {
        this.client = c9191kt;
        if (!this.oneTimeSetupPerformed.getAndSet(true)) {
            performOneTimeSetup(c9191kt);
        }
        if (this.libraryLoader.a()) {
            enableCrashReporting();
            c9191kt.m.a("Initialised NDK Plugin");
        }
    }

    private final void performOneTimeSetup(C9191kt c9191kt) {
        this.libraryLoader.d("bugsnag-ndk", c9191kt, new InterfaceC9218lT() { // from class: o.lJ
            @Override // o.InterfaceC9218lT
            public final boolean c(C9229le c9229le) {
                boolean m2762performOneTimeSetup$lambda0;
                m2762performOneTimeSetup$lambda0 = NdkPlugin.m2762performOneTimeSetup$lambda0(c9229le);
                return m2762performOneTimeSetup$lambda0;
            }
        });
        if (this.libraryLoader.a()) {
            c9191kt.c(getBinaryArch());
            this.nativeBridge = initNativeBridge(c9191kt);
            return;
        }
        c9191kt.m.c(LOAD_ERR_MSG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performOneTimeSetup$lambda-0  reason: not valid java name */
    public static final boolean m2762performOneTimeSetup$lambda0(C9229le c9229le) {
        C9170kY c9170kY = c9229le.c().get(0);
        c9170kY.e("NdkLinkError");
        c9170kY.d(LOAD_ERR_MSG);
        return true;
    }

    @Override // o.InterfaceC9217lS
    public void unload() {
        C9191kt c9191kt;
        if (this.libraryLoader.a()) {
            disableCrashReporting();
            NativeBridge nativeBridge = this.nativeBridge;
            if (nativeBridge == null || (c9191kt = this.client) == null) {
                return;
            }
            c9191kt.a(nativeBridge);
        }
    }

    public final void setInternalMetricsEnabled(boolean z) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge == null) {
            return;
        }
        nativeBridge.setInternalMetricsEnabled(z);
    }

    public final long getSignalUnwindStackFunction() {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge == null) {
            return 0L;
        }
        return nativeBridge.getSignalUnwindStackFunction();
    }

    public final Map<String, Integer> getCurrentCallbackSetCounts() {
        Map<String, Integer> d2;
        NativeBridge nativeBridge = this.nativeBridge;
        Map<String, Integer> currentCallbackSetCounts = nativeBridge == null ? null : nativeBridge.getCurrentCallbackSetCounts();
        if (currentCallbackSetCounts == null) {
            d2 = dqE.d();
            return d2;
        }
        return currentCallbackSetCounts;
    }

    public final Map<String, Boolean> getCurrentNativeApiCallUsage() {
        Map<String, Boolean> d2;
        NativeBridge nativeBridge = this.nativeBridge;
        Map<String, Boolean> currentNativeApiCallUsage = nativeBridge == null ? null : nativeBridge.getCurrentNativeApiCallUsage();
        if (currentNativeApiCallUsage == null) {
            d2 = dqE.d();
            return d2;
        }
        return currentNativeApiCallUsage;
    }

    public final void initCallbackCounts(Map<String, Integer> map) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge == null) {
            return;
        }
        nativeBridge.initCallbackCounts(map);
    }

    public final void notifyAddCallback(String str) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge == null) {
            return;
        }
        nativeBridge.notifyAddCallback(str);
    }

    public final void notifyRemoveCallback(String str) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge == null) {
            return;
        }
        nativeBridge.notifyRemoveCallback(str);
    }

    public final void setStaticData(Map<String, ? extends Object> map) {
        StringWriter stringWriter = new StringWriter();
        try {
            C9246lv c9246lv = new C9246lv(stringWriter);
            c9246lv.c(map);
            dpR dpr = dpR.c;
            C8608drx.a(c9246lv, null);
            C8608drx.a(stringWriter, null);
            String stringWriter2 = stringWriter.toString();
            NativeBridge nativeBridge = this.nativeBridge;
            if (nativeBridge == null) {
                return;
            }
            nativeBridge.setStaticJsonData(stringWriter2);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C8608drx.a(stringWriter, th);
                throw th2;
            }
        }
    }
}

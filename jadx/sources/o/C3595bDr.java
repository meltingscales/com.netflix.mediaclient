package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import o.bBM;

/* renamed from: o.bDr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3595bDr {

    /* renamed from: o.bDr$e */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ConnectionState.values().length];
            try {
                iArr[ConnectionState.i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnectionState.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConnectionState.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConnectionState.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ConnectionState.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ConnectionState.c.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ConnectionState.g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ConnectionState.b.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            c = iArr;
        }
    }

    public static final boolean b(ConnectionState connectionState) {
        C8632dsu.c((Object) connectionState, "");
        return connectionState == ConnectionState.i || connectionState == ConnectionState.a || connectionState == ConnectionState.f;
    }

    public static final List<VY> d(DeviceSheetScreen.a aVar) {
        C8632dsu.c((Object) aVar, "");
        if ((aVar instanceof DeviceSheetScreen.a.b) || (aVar instanceof DeviceSheetScreen.a.c)) {
            return null;
        }
        if (aVar instanceof DeviceSheetScreen.a.C0059a) {
            return ((DeviceSheetScreen.a.C0059a) aVar).f();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean d(ConnectionState connectionState, String str) {
        C8632dsu.c((Object) connectionState, "");
        return (connectionState == ConnectionState.g || connectionState == ConnectionState.e || connectionState == ConnectionState.d) && str != null;
    }

    public static final boolean d(ConnectionState connectionState) {
        C8632dsu.c((Object) connectionState, "");
        return connectionState == ConnectionState.g || connectionState == ConnectionState.b;
    }

    public static final DeviceSheetScreen.e e(ConnectionState connectionState) {
        C8632dsu.c((Object) connectionState, "");
        switch (e.c[connectionState.ordinal()]) {
            case 1:
                return DeviceSheetScreen.e.c.d;
            case 2:
            case 3:
                return DeviceSheetScreen.e.h.d;
            case 4:
                return DeviceSheetScreen.e.c.d;
            case 5:
                return DeviceSheetScreen.e.C0060e.d;
            case 6:
                return DeviceSheetScreen.e.b.d;
            case 7:
                return DeviceSheetScreen.e.d.e;
            case 8:
                return DeviceSheetScreen.e.a.d;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String a(String str, Composer composer, int i) {
        composer.startReplaceableGroup(1698510215);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1698510215, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.util.getFriendlyName (DeviceSheetScreenUtil.kt:73)");
        }
        if (str == null || str.length() == 0) {
            str = StringResources_androidKt.stringResource(bBM.c.g, composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return str;
    }
}

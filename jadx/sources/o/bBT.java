package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import o.bBM;

/* loaded from: classes4.dex */
public final class bBT {

    /* loaded from: classes4.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ConnectionState.values().length];
            try {
                iArr[ConnectionState.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnectionState.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConnectionState.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConnectionState.c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            e = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a r19, androidx.compose.ui.Modifier r20, o.drM<? super com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.e, o.dpR> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bBT.a(com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$a, androidx.compose.ui.Modifier, o.drM, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final String b(ConnectionState connectionState, boolean z, Composer composer, int i) {
        String stringResource;
        composer.startReplaceableGroup(153236335);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(153236335, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.headerText (DeviceSheet.kt:102)");
        }
        int i2 = c.e[connectionState.ordinal()];
        if (i2 == 1 || i2 == 2) {
            composer.startReplaceableGroup(-1660495482);
            stringResource = StringResources_androidKt.stringResource(bBM.c.ar, composer, 0);
            composer.endReplaceableGroup();
        } else if (i2 == 3) {
            composer.startReplaceableGroup(-1660495353);
            stringResource = StringResources_androidKt.stringResource(bBM.c.ab, composer, 0);
            composer.endReplaceableGroup();
        } else if (i2 == 4) {
            composer.startReplaceableGroup(-1660495207);
            if (z) {
                composer.startReplaceableGroup(-1660495158);
                stringResource = StringResources_androidKt.stringResource(bBM.c.W, composer, 0);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-1660495068);
                stringResource = StringResources_androidKt.stringResource(bBM.c.w, composer, 0);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1660494948);
            stringResource = StringResources_androidKt.stringResource(bBM.c.U, composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stringResource;
    }
}

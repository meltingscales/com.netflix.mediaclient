package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.ImageBitmap;
import com.netflix.hawkins.consumer.component.image.HawkinsImageKt$loadImage$1;
import kotlin.NotImplementedError;
import kotlin.Result;

/* loaded from: classes3.dex */
public final class KM {
    private static final d e = new d();

    private static final State<Result<ImageBitmap>> e(String str, InterfaceC1571aGf interfaceC1571aGf, Composer composer, int i) {
        composer.startReplaceableGroup(16635350);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(16635350, i, -1, "com.netflix.hawkins.consumer.component.image.loadImage (HawkinsImage.kt:36)");
        }
        State<Result<ImageBitmap>> produceState = SnapshotStateKt.produceState(null, str, new HawkinsImageKt$loadImage$1(interfaceC1571aGf, str, null), composer, ((i << 3) & 112) | 518);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return produceState;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final java.lang.String r27, final java.lang.String r28, androidx.compose.ui.Modifier r29, o.InterfaceC1571aGf r30, o.InterfaceC8612dsa<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r31, o.InterfaceC8613dsb<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Throwable, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r32, androidx.compose.ui.Alignment r33, androidx.compose.ui.layout.ContentScale r34, float r35, androidx.compose.ui.graphics.ColorFilter r36, int r37, androidx.compose.runtime.Composer r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KM.d(java.lang.String, java.lang.String, androidx.compose.ui.Modifier, o.aGf, o.dsa, o.dsb, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, float, androidx.compose.ui.graphics.ColorFilter, int, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC1571aGf {
        d() {
        }

        @Override // o.InterfaceC1571aGf
        public Object c(String str, InterfaceC8585dra<? super ImageBitmap> interfaceC8585dra) {
            throw new NotImplementedError("An operation is not implemented: Not supported in inspection mode");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.Modifier r25, java.lang.String r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KM.b(androidx.compose.ui.Modifier, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Result<ImageBitmap> d(State<? extends Result<? extends ImageBitmap>> state) {
        return (Result) state.getValue();
    }
}

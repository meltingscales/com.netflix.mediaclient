package o;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.netflix.hawkins.consumer.component.icon.HawkinsIconSize;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Token;
import o.C8632dsu;
import o.KK;
import o.dpR;

/* loaded from: classes4.dex */
public final class cLL {
    public static final cLL b = new cLL();
    public static InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR> a = ComposableLambdaKt.composableLambdaInstance(559063401, false, new InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ComposableSingletons$ProfileAvatarKt$lambda-1$1
        @Override // o.InterfaceC8613dsb
        public /* synthetic */ dpR invoke(BoxScope boxScope, Throwable th, Composer composer, Integer num) {
            b(boxScope, th, composer, num.intValue());
            return dpR.c;
        }

        public final void b(BoxScope boxScope, Throwable th, Composer composer, int i) {
            C8632dsu.c((Object) boxScope, "");
            C8632dsu.c((Object) th, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(559063401, i, -1, "com.netflix.mediaclient.ui.profiles.ComposableSingletons$ProfileAvatarKt.lambda-1.<anonymous> (ProfileAvatar.kt:79)");
            }
            KK.c(HawkinsIcon.jG.d, null, boxScope.align(Modifier.Companion, Alignment.Companion.getCenter()), null, HawkinsIconSize.c, Token.Color.C0655jb.c, composer, 221238, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR> d() {
        return a;
    }
}

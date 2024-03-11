package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.InterfaceC8612dsa;
import o.dpR;

/* loaded from: classes.dex */
public final class MovableContentKt {
    public static final <P> InterfaceC8612dsa<P, Composer, Integer, dpR> movableContentOf(InterfaceC8612dsa<? super P, ? super Composer, ? super Integer, dpR> interfaceC8612dsa) {
        final MovableContent movableContent = new MovableContent(interfaceC8612dsa);
        return ComposableLambdaKt.composableLambdaInstance(-434707029, true, new InterfaceC8612dsa<P, Composer, Integer, dpR>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(Object obj, Composer composer, Integer num) {
                invoke((MovableContentKt$movableContentOf$2<P>) obj, composer, num.intValue());
                return dpR.c;
            }

            public final void invoke(P p, Composer composer, int i) {
                if ((i & 14) == 0) {
                    i |= composer.changed(p) ? 4 : 2;
                }
                if ((i & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-434707029, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:64)");
                }
                composer.insertMovableContent(movableContent, p);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }
}

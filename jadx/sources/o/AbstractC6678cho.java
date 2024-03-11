package o;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import dagger.hilt.android.EntryPointAccessors;
import o.AbstractC6678cho;
import o.C1572aGg;
import o.C9737vz;
import o.InterfaceC1571aGf;
import o.InterfaceC6679chp;
import o.dpR;
import o.drX;

/* renamed from: o.cho  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6678cho extends AbstractC6677chn {
    public abstract drX<Composer, Integer, dpR> b();

    @Override // o.bJF
    /* renamed from: b */
    public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dpr, "");
        String c = c();
        C2437ag.b(interfaceC2023aX, "messaging-compose-" + c, new Object[0], ComposableLambdaKt.composableLambdaInstance(-1834963010, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.messaging.api.MessagingComposeScreen$models$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return dpR.c;
            }

            public final void a(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1834963010, i, -1, "com.netflix.mediaclient.ui.messaging.api.MessagingComposeScreen.models.<anonymous> (MessagingComposeScreen.kt:23)");
                    }
                    InterfaceC1571aGf a = ((InterfaceC6679chp) EntryPointAccessors.fromActivity((Activity) C9737vz.e((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), Activity.class), InterfaceC6679chp.class)).f().a();
                    final AbstractC6678cho abstractC6678cho = AbstractC6678cho.this;
                    C1572aGg.b(a, ComposableLambdaKt.composableLambda(composer, -2071488499, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.messaging.api.MessagingComposeScreen$models$1.1
                        {
                            super(2);
                        }

                        @Override // o.drX
                        public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                            b(composer2, num.intValue());
                            return dpR.c;
                        }

                        public final void b(Composer composer2, int i2) {
                            if ((i2 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2071488499, i2, -1, "com.netflix.mediaclient.ui.messaging.api.MessagingComposeScreen.models.<anonymous>.<anonymous> (MessagingComposeScreen.kt:27)");
                            }
                            AbstractC6678cho.this.b().invoke(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
    }
}

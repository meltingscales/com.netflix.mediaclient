package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.C6645chH;
import o.C6646chI;
import o.dpR;
import o.drO;

/* renamed from: o.chI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6646chI extends AbstractC6678cho {
    public static final e e = new e(null);
    private final String a;
    private final drO<dpR> b;

    public C6646chI() {
        this(null, 1, null);
    }

    @Override // o.AbstractC6677chn
    public String c() {
        return this.a;
    }

    public /* synthetic */ C6646chI(drO dro, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new drO<dpR>() { // from class: com.netflix.mediaclient.ui.messaging.impl.example.ExampleMessagingComposeScreen$1
            public final void c() {
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }
        } : dro);
    }

    public C6646chI(drO<dpR> dro) {
        C8632dsu.c((Object) dro, "");
        this.b = dro;
        this.a = "ExampleComposeUma";
    }

    /* renamed from: o.chI$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    @Override // o.AbstractC6678cho
    public drX<Composer, Integer, dpR> b() {
        return ComposableLambdaKt.composableLambdaInstance(-1600360250, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.messaging.impl.example.ExampleMessagingComposeScreen$getContent$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                c(composer, num.intValue());
                return dpR.c;
            }

            public final void c(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1600360250, i, -1, "com.netflix.mediaclient.ui.messaging.impl.example.ExampleMessagingComposeScreen.getContent.<anonymous> (ExampleMessagingComposeScreen.kt:32)");
                    }
                    composer.startReplaceableGroup(1636460742);
                    boolean changed = composer.changed(C6646chI.this);
                    final C6646chI c6646chI = C6646chI.this;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.messaging.impl.example.ExampleMessagingComposeScreen$getContent$1$1$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                super(0);
                            }

                            @Override // o.drO
                            public /* synthetic */ dpR invoke() {
                                e();
                                return dpR.c;
                            }

                            public final void e() {
                                drO dro;
                                dro = C6646chI.this.b;
                                dro.invoke();
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    C6645chH.e("Hello from Compose", "The moon danced in a bathtub full of grape jelly while singing a lullaby to a banana.\n\nMy pencil always wears a hat on Thursdays and refuses to write anything in blue ink.\n\nThe toaster decided to go on strike until it received a proper vacation in the Bahamas.", (drO) rememberedValue, composer, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        });
    }
}

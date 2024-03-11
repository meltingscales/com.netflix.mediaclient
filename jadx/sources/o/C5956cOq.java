package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.profiles.SwitchProfileSheet$2;
import o.AbstractC5897cMk;
import o.C1180Rt;
import o.C5855cKw;
import o.C5956cOq;
import o.C5957cOr;
import o.C6705ciO;
import o.C8632dsu;
import o.C9834xU;
import o.C9935zP;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

@SuppressLint({"ViewConstructor"})
/* renamed from: o.cOq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5956cOq extends TH {
    public static final d a = new d(null);
    public static final int d = 8;
    private final Activity b;
    private final C9935zP c;
    private final RG e;
    private final LifecycleOwner f;
    private final C6705ciO j;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5956cOq(C6705ciO c6705ciO, C9935zP c9935zP, LifecycleOwner lifecycleOwner, Activity activity, final drM<? super View, dpR> drm) {
        super(activity, C5855cKw.c.u, new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.SwitchProfileSheet$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(View view) {
                b(view);
                return dpR.c;
            }

            public final void b(View view) {
                C8632dsu.c((Object) view, "");
                drm.invoke(view);
            }
        }, null, 0, 0, 0, 0, activity.getResources().getDimensionPixelOffset(C9834xU.a.f13911o), true, false, false, false, false, 15608, null);
        C8632dsu.c((Object) c6705ciO, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) drm, "");
        this.j = c6705ciO;
        this.c = c9935zP;
        this.f = lifecycleOwner;
        this.b = activity;
        RG rg = new RG(this, new C1180Rt.d() { // from class: o.cOp
            @Override // o.C1180Rt.d
            public final void e() {
                C5956cOq.b();
            }
        });
        this.e = rg;
        rg.b(false);
        C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new SwitchProfileSheet$2(this, drm, null), 3, null);
    }

    /* renamed from: o.cOq$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    public final void c() {
        C1645aIz.a(this.b, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.SwitchProfileSheet$show$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                e(serviceManager);
                return dpR.c;
            }

            public final void e(ServiceManager serviceManager) {
                C6705ciO c6705ciO;
                C8632dsu.c((Object) serviceManager, "");
                c6705ciO = C5956cOq.this.j;
                c6705ciO.d();
                C5956cOq.this.d();
            }
        });
        open();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        ComposeView composeView = (ComposeView) findViewById(C5855cKw.d.Z);
        composeView.setBackgroundColor(ColorKt.m1317toArgb8_81llA(LA.e(Token.Color.C0509dq.c)));
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-242110886, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.SwitchProfileSheet$showSheetContents$1$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return dpR.c;
            }

            public final void b(Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-242110886, i, -1, "com.netflix.mediaclient.ui.profiles.SwitchProfileSheet.showSheetContents.<anonymous>.<anonymous> (SwitchProfileSheet.kt:101)");
                }
                boolean a2 = BrowseExperience.a();
                final C5956cOq c5956cOq = C5956cOq.this;
                drO<dpR> dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profiles.SwitchProfileSheet$showSheetContents$1$1.1
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        c();
                        return dpR.c;
                    }

                    public final void c() {
                        C5956cOq.this.close();
                    }
                };
                final C5956cOq c5956cOq2 = C5956cOq.this;
                drO<dpR> dro2 = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profiles.SwitchProfileSheet$showSheetContents$1$1.2
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        b();
                        return dpR.c;
                    }

                    public final void b() {
                        C9935zP c9935zP;
                        c9935zP = C5956cOq.this.c;
                        c9935zP.b(AbstractC5897cMk.class, AbstractC5897cMk.c.e);
                    }
                };
                final C5956cOq c5956cOq3 = C5956cOq.this;
                C5957cOr.d(a2, dro, dro2, ComposableLambdaKt.composableLambda(composer, 1027297317, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.SwitchProfileSheet$showSheetContents$1$1.3
                    {
                        super(2);
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                        b(composer2, num.intValue());
                        return dpR.c;
                    }

                    public final void b(Composer composer2, int i2) {
                        if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1027297317, i2, -1, "com.netflix.mediaclient.ui.profiles.SwitchProfileSheet.showSheetContents.<anonymous>.<anonymous>.<anonymous> (SwitchProfileSheet.kt:106)");
                            }
                            final C5956cOq c5956cOq4 = C5956cOq.this;
                            AndroidView_androidKt.AndroidView(new drM<Context, View>() { // from class: com.netflix.mediaclient.ui.profiles.SwitchProfileSheet.showSheetContents.1.1.3.1
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                /* renamed from: a */
                                public final View invoke(Context context) {
                                    C6705ciO c6705ciO;
                                    C8632dsu.c((Object) context, "");
                                    c6705ciO = C5956cOq.this.j;
                                    return c6705ciO.e();
                                }
                            }, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, composer2, 48, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composer, 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }
}

package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.storage.db.UserMarksDatabase;
import com.netflix.mediaclient.ui.usermarks.impl.UserMarksImpl$showCreateUserMarkUI$1$1;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC1017Lk;
import o.C5251bvI;
import o.C7969dbY;
import o.C8029dcf;
import o.C8048dcy;
import o.C8556dpz;
import o.C8586drb;
import o.C8737dwr;
import o.InterfaceC6675chl;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwQ;
import o.dwU;

/* renamed from: o.dcy  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8048dcy implements InterfaceC7967dbW {
    private final NetflixActivity a;
    private final dwQ c;
    private final String e;
    private final SharedPreferences f;
    private final C5251bvI g;
    private final UserMarksDatabase j;
    public static final c d = new c(null);
    public static final int b = 8;

    @Inject
    public C8048dcy(Activity activity, @ApplicationContext Context context, dwQ dwq) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dwq, "");
        this.c = dwq;
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(activity, NetflixActivity.class);
        this.a = netflixActivity;
        this.f = netflixActivity.getSharedPreferences("userMarksPrefs", 0);
        UserMarksDatabase c2 = UserMarksDatabase.d.c(context);
        this.j = c2;
        this.g = C5251bvI.c.e(c2);
        InterfaceC5283bvo b2 = C8126deW.b();
        this.e = b2 != null ? b2.getProfileGuid() : null;
    }

    /* renamed from: o.dcy$c */
    /* loaded from: classes5.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("UserMarksImpl");
        }
    }

    @Override // o.InterfaceC7967dbW
    public Intent e() {
        return ActivityC8030dcg.b.e(this.a);
    }

    @Override // o.InterfaceC7967dbW
    public void b(final C7969dbY c7969dbY, drM<? super Boolean, dpR> drm) {
        C8632dsu.c((Object) c7969dbY, "");
        C8632dsu.c((Object) drm, "");
        String str = this.e;
        if (str != null) {
            String c2 = C1333Xq.d(this.f.getBoolean("userMarksPrefIsFirstTimeCreating", true) ? C8029dcf.j.m : C8029dcf.j.k).d("markTimestamp", C7969dbY.e.b(c7969dbY.g())).c();
            C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(this.a), this.c, null, new UserMarksImpl$showCreateUserMarkUI$1$1(this, str, c7969dbY, null), 2, null);
            C9872yF c9872yF = this.a.composeViewOverlayManager;
            C8632dsu.a(c9872yF, "");
            C8632dsu.d((Object) c2);
            HawkinsIcon.C0132ad c0132ad = HawkinsIcon.C0132ad.c;
            String string = this.a.getResources().getString(C8029dcf.j.e);
            String string2 = this.a.getResources().getString(C8029dcf.j.f13831o);
            C8632dsu.a(string2, "");
            C9878yL.d(c9872yF, (r22 & 1) != 0 ? Modifier.Companion : null, c2, (r22 & 4) != 0 ? null : c0132ad, (r22 & 8) != 0 ? null : string, (r22 & 16) != 0 ? new AbstractC1017Lk.d(null, 1, null) : new AbstractC1017Lk.a(string2, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksImpl$showCreateUserMarkUI$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    d();
                    return dpR.c;
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.netflix.mediaclient.ui.usermarks.impl.UserMarksImpl$showCreateUserMarkUI$1$2$1  reason: invalid class name */
                /* loaded from: classes5.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                    int b;
                    final /* synthetic */ C7969dbY c;
                    final /* synthetic */ C8048dcy d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(C8048dcy c8048dcy, C7969dbY c7969dbY, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                        super(2, interfaceC8585dra);
                        this.d = c8048dcy;
                        this.c = c7969dbY;
                    }

                    @Override // o.drX
                    /* renamed from: a */
                    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                        return new AnonymousClass1(this.d, this.c, interfaceC8585dra);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        C5251bvI c5251bvI;
                        C8586drb.e();
                        if (this.b == 0) {
                            C8556dpz.d(obj);
                            c5251bvI = this.d.g;
                            c5251bvI.b(this.c.e());
                            return dpR.c;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                public final void d() {
                    NetflixActivity netflixActivity;
                    dwQ dwq;
                    netflixActivity = C8048dcy.this.a;
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(netflixActivity);
                    dwq = C8048dcy.this.c;
                    C8737dwr.c(lifecycleScope, dwq, null, new AnonymousClass1(C8048dcy.this, c7969dbY, null), 2, null);
                }
            }), (r22 & 32) != 0 ? Theme.b : null, (r22 & 64) != 0 ? 3000 : 0, (r22 & 128) != 0, (r22 & JSONzip.end) != 0 ? null : drm);
            this.f.edit().putBoolean("userMarksPrefIsFirstTimeCreating", false).apply();
        }
    }

    @Override // o.InterfaceC7967dbW
    public void d(InterfaceC6675chl interfaceC6675chl, Integer num, drO<dpR> dro) {
        C8632dsu.c((Object) interfaceC6675chl, "");
        InterfaceC6675chl.a.d(interfaceC6675chl, new C8028dce(dro), num, false, 4, null);
    }
}

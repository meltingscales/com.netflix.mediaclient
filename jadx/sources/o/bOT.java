package o;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.games.impl.games.GamesLolomoActivity;
import io.reactivex.Observable;
import io.reactivex.Single;
import javax.inject.Inject;
import kotlin.LazyThreadSafetyMode;
import o.C3895bOq;
import o.C9936zQ;
import o.InterfaceC9934zO;
import o.bNR;
import o.bOT;

/* loaded from: classes6.dex */
public final class bOT implements InterfaceC9934zO {
    private final AppView a;
    private final bNR b;
    private final CommandValue c;
    private final Class<GamesLolomoActivity> d;
    private final Application e;
    private final InterfaceC9934zO.b.d i;
    private final InterfaceC8554dpx j;

    @Override // o.InterfaceC9934zO
    public CommandValue a() {
        return this.c;
    }

    @Override // o.InterfaceC9934zO
    public Class<GamesLolomoActivity> c() {
        return this.d;
    }

    @Override // o.InterfaceC9934zO
    public AppView d() {
        return this.a;
    }

    @Override // o.InterfaceC9934zO
    /* renamed from: i */
    public InterfaceC9934zO.b.d e() {
        return this.i;
    }

    @Inject
    public bOT(Application application, bNR bnr) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) application, "");
        C8632dsu.c((Object) bnr, "");
        this.e = application;
        this.b = bnr;
        this.d = GamesLolomoActivity.class;
        this.a = AppView.gamesTab;
        this.c = CommandValue.ViewGamesCommand;
        this.i = InterfaceC9934zO.b.d.c;
        b = dpB.b(LazyThreadSafetyMode.e, new drO<C9936zQ>() { // from class: com.netflix.mediaclient.ui.games.impl.games.GamesBottomTab$tab$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final C9936zQ invoke() {
                bNR bnr2;
                int i = R.g.ci;
                bnr2 = bOT.this.b;
                return new C9936zQ(i, bnr2.a(), C3895bOq.a.c, null, 8, null);
            }
        });
        this.j = b;
    }

    @Override // o.InterfaceC9934zO
    public Single<Boolean> a(Activity activity) {
        return InterfaceC9934zO.a.c(this, activity);
    }

    @Override // o.InterfaceC9934zO
    public Observable<AbstractC9927zH> b(Activity activity) {
        return InterfaceC9934zO.a.d(this, activity);
    }

    @Override // o.InterfaceC9934zO
    public boolean c(Activity activity) {
        return InterfaceC9934zO.a.a(this, activity);
    }

    @Override // o.InterfaceC9934zO
    public boolean d(Activity activity) {
        return InterfaceC9934zO.a.b(this, activity);
    }

    @Override // o.InterfaceC9934zO
    public Observable<String> f() {
        return InterfaceC9934zO.a.c(this);
    }

    @Override // o.InterfaceC9934zO
    public Observable<Boolean> g() {
        return InterfaceC9934zO.a.d(this);
    }

    @Override // o.InterfaceC9934zO
    public C9936zQ b() {
        return (C9936zQ) this.j.getValue();
    }

    @Override // o.InterfaceC9934zO
    public Intent b(AppView appView) {
        return GamesLolomoActivity.a.d(this.e);
    }

    @Override // o.InterfaceC9934zO
    public boolean e(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return C8153dex.u() && C8153dex.q();
    }
}

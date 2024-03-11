package o;

import android.os.Handler;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.NetworkPriority;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.List;
import o.C8143den;

/* renamed from: o.Ke  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0985Ke<T> implements InterfaceC0989Ki<T> {
    private InterfaceC1240Ub<?> a;
    private final boolean b;
    private final String c;
    private final TaskMode e;

    @Override // o.InterfaceC0986Kf
    public List<C8143den.d> c() {
        return null;
    }

    @Override // o.InterfaceC0989Ki
    public void c(HZ hz) {
        C8632dsu.c((Object) hz, "");
    }

    public boolean c(InterfaceC1240Ub<?> interfaceC1240Ub) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        return true;
    }

    @Override // o.InterfaceC0986Kf
    public final void d(InterfaceC1240Ub<?> interfaceC1240Ub) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        this.a = interfaceC1240Ub;
    }

    @Override // o.InterfaceC0986Kf
    public boolean d() {
        return false;
    }

    public abstract T e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf);

    @Override // o.InterfaceC0986Kf
    public boolean e() {
        return false;
    }

    @Override // o.InterfaceC0986Kf
    public void f() {
    }

    @Override // o.InterfaceC0986Kf
    public boolean g() {
        return true;
    }

    @Override // o.InterfaceC0986Kf
    public final String h() {
        return this.c;
    }

    @Override // o.InterfaceC0986Kf
    public NetworkPriority i() {
        return null;
    }

    @Override // o.InterfaceC0986Kf
    public boolean j() {
        return this.b;
    }

    public AbstractC0985Ke(String str, TaskMode taskMode, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) taskMode, "");
        this.c = str;
        this.e = taskMode;
        this.b = z;
    }

    public /* synthetic */ AbstractC0985Ke(String str, TaskMode taskMode, boolean z, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? TaskMode.FROM_CACHE_OR_NETWORK : taskMode, (i & 4) != 0 ? false : z);
    }

    @Override // o.InterfaceC0989Ki
    public final void e(Handler handler, final InterfaceC1755aNa<T> interfaceC1755aNa, C1244Uf c1244Uf) {
        C8632dsu.c((Object) handler, "");
        C8632dsu.c((Object) interfaceC1755aNa, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC1240Ub<?> interfaceC1240Ub = this.a;
        InterfaceC1240Ub<?> interfaceC1240Ub2 = null;
        if (interfaceC1240Ub == null) {
            C8632dsu.d("");
            interfaceC1240Ub = null;
        }
        if (c(interfaceC1240Ub)) {
            InterfaceC1240Ub<?> interfaceC1240Ub3 = this.a;
            if (interfaceC1240Ub3 == null) {
                C8632dsu.d("");
            } else {
                interfaceC1240Ub2 = interfaceC1240Ub3;
            }
            final T e = e(interfaceC1240Ub2, c1244Uf);
            handler.post(new Runnable() { // from class: o.Kb
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0985Ke.a(InterfaceC1755aNa.this, e);
                }
            });
            return;
        }
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aC;
        C8632dsu.a(netflixImmutableStatus, "");
        e(handler, interfaceC1755aNa, netflixImmutableStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC1755aNa interfaceC1755aNa, Object obj) {
        C8632dsu.c((Object) interfaceC1755aNa, "");
        interfaceC1755aNa.c((InterfaceC1755aNa) obj, (Status) InterfaceC1078Nw.aJ);
    }

    @Override // o.InterfaceC0986Kf
    public void e(Handler handler, final InterfaceC1755aNa<T> interfaceC1755aNa, final Status status) {
        C8632dsu.c((Object) handler, "");
        C8632dsu.c((Object) interfaceC1755aNa, "");
        C8632dsu.c((Object) status, "");
        handler.post(new Runnable() { // from class: o.Kd
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0985Ke.d(InterfaceC1755aNa.this, status);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC1755aNa interfaceC1755aNa, Status status) {
        C8632dsu.c((Object) interfaceC1755aNa, "");
        C8632dsu.c((Object) status, "");
        interfaceC1755aNa.c((InterfaceC1755aNa) null, status);
    }

    public final InterfaceC1240Ub<?> k() {
        C8166dfJ.b(null, false, 3, null);
        InterfaceC1240Ub<?> interfaceC1240Ub = this.a;
        if (interfaceC1240Ub == null) {
            C8632dsu.d("");
            return null;
        }
        return interfaceC1240Ub;
    }

    @Override // o.InterfaceC0986Kf
    public boolean a(List<? extends InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        return list.size() > 20;
    }

    @Override // o.InterfaceC0986Kf
    public boolean a() {
        return this.e == TaskMode.FROM_CACHE_ONLY;
    }

    @Override // o.InterfaceC0986Kf
    public boolean b() {
        return this.e == TaskMode.FROM_NETWORK;
    }
}

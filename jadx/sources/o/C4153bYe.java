package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.List;
import o.AbstractC8918fl;
import o.C0991Kk;
import o.C4153bYe;
import o.C4156bYh;
import o.C8632dsu;
import o.C8927fu;
import o.C8932fz;
import o.C8971gl;
import o.InterfaceC5223buh;
import o.InterfaceC5230buo;
import o.InterfaceC8966gg;
import o.aLP;
import o.dpR;
import o.drX;

/* renamed from: o.bYe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4153bYe extends C9943zX<C4156bYh> {
    public static final c a = new c(null);
    public static final int d = 8;
    private final aLP c;
    private final d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4153bYe(C4156bYh c4156bYh) {
        super(c4156bYh);
        C8632dsu.c((Object) c4156bYh, "");
        this.c = aLN.a.a(g());
        d dVar = new d();
        this.e = dVar;
        C1332Xp c1332Xp = C1332Xp.b;
        LocalBroadcastManager.getInstance((Context) C1332Xp.b(Context.class)).registerReceiver(dVar, new IntentFilter("com.netflix.mediaclient.intent.action.DETAIL_PAGE_REFRESH"));
        b(this, false, 1, null);
    }

    /* renamed from: o.bYe$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC8966gg<C4153bYe, C4156bYh> {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public C4153bYe create(AbstractC8979gt abstractC8979gt, C4156bYh c4156bYh) {
            return (C4153bYe) InterfaceC8966gg.c.a(this, abstractC8979gt, c4156bYh);
        }

        /* renamed from: initialState */
        public C4156bYh m3168initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            Object b = abstractC8979gt.b();
            C8632dsu.d(b);
            String string = ((Bundle) b).getString("CharacterId");
            if (string == null) {
                throw new IllegalArgumentException("CharacterId extra not set!".toString());
            }
            return new C4156bYh(string, null, null, null, 14, null);
        }
    }

    /* renamed from: o.bYe$d */
    /* loaded from: classes4.dex */
    public static final class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            final C4153bYe c4153bYe = C4153bYe.this;
            c4153bYe.e(new drM<C4156bYh, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.CharacterViewModel$reloadBroadcastReceiver$1$onReceive$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C4156bYh c4156bYh) {
                    c(c4156bYh);
                    return dpR.c;
                }

                public final void c(C4156bYh c4156bYh) {
                    InterfaceC5230buo c;
                    List<InterfaceC5223buh> f;
                    C8632dsu.c((Object) c4156bYh, "");
                    InterfaceC5223buh c2 = c4156bYh.c();
                    if ((c2 != null ? c2.getType() : null) != VideoType.SHOW || (c = c4156bYh.d().c()) == null || (f = c.f()) == null || f.size() != 1) {
                        return;
                    }
                    C4153bYe.this.c(true);
                }
            });
        }
    }

    @Override // o.C9943zX, o.AbstractC8919fm, o.AbstractC8899fS
    public void d() {
        super.d();
        C1332Xp c1332Xp = C1332Xp.b;
        LocalBroadcastManager.getInstance((Context) C1332Xp.b(Context.class)).unregisterReceiver(this.e);
    }

    public static /* synthetic */ void b(C4153bYe c4153bYe, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c4153bYe.c(z);
    }

    public final void c(final boolean z) {
        e(new drM<C4156bYh, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.CharacterViewModel$fetchCharacterDetails$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4156bYh c4156bYh) {
                a(c4156bYh);
                return dpR.c;
            }

            public final void a(C4156bYh c4156bYh) {
                aLP alp;
                C8632dsu.c((Object) c4156bYh, "");
                if (c4156bYh.d() instanceof C8932fz) {
                    return;
                }
                C4153bYe c4153bYe = C4153bYe.this;
                alp = c4153bYe.c;
                c4153bYe.e(alp.e(new C0991Kk(c4156bYh.b(), z ? TaskMode.FROM_NETWORK : TaskMode.FROM_CACHE_OR_NETWORK)), new drX<C4156bYh, AbstractC8918fl<? extends InterfaceC5230buo>, C4156bYh>() { // from class: com.netflix.mediaclient.ui.kids.character_details.CharacterViewModel$fetchCharacterDetails$1.1
                    @Override // o.drX
                    /* renamed from: a */
                    public final C4156bYh invoke(C4156bYh c4156bYh2, AbstractC8918fl<? extends InterfaceC5230buo> abstractC8918fl) {
                        C8632dsu.c((Object) c4156bYh2, "");
                        C8632dsu.c((Object) abstractC8918fl, "");
                        if (abstractC8918fl instanceof C8932fz) {
                            return C4156bYh.copy$default(c4156bYh2, null, new C8932fz(c4156bYh2.d().c()), null, null, 13, null);
                        }
                        if (abstractC8918fl instanceof C8971gl) {
                            InterfaceC5230buo interfaceC5230buo = (InterfaceC5230buo) ((C8971gl) abstractC8918fl).c();
                            if (interfaceC5230buo.f().isEmpty()) {
                                return C4156bYh.copy$default(c4156bYh2, null, new C8927fu(new Throwable("Gallery was empty"), null, 2, null), null, null, 13, null);
                            }
                            return C4156bYh.copy$default(c4156bYh2, null, abstractC8918fl, interfaceC5230buo.L(), interfaceC5230buo.f(), 1, null);
                        } else if (abstractC8918fl instanceof C8927fu) {
                            return C4156bYh.copy$default(c4156bYh2, null, new C8927fu(((C8927fu) abstractC8918fl).b(), c4156bYh2.d().c()), null, null, 13, null);
                        } else {
                            return C4156bYh.copy$default(c4156bYh2, null, abstractC8918fl, null, null, 13, null);
                        }
                    }
                });
            }
        });
    }
}

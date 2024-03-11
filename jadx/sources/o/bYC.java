package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import o.AbstractC8918fl;
import o.C0956Jb;
import o.C0969Jo;
import o.C4174bYz;
import o.C8632dsu;
import o.C8927fu;
import o.C8932fz;
import o.C8971gl;
import o.C9726vo;
import o.IE;
import o.InterfaceC1242Ud;
import o.InterfaceC8366diy;
import o.InterfaceC8966gg;
import o.aLP;
import o.bYC;
import o.dpR;
import o.drX;

/* loaded from: classes4.dex */
public final class bYC extends C9943zX<C4174bYz> {
    public static final e c = new e(null);
    public static final int d = 8;
    private final b a;
    private String b;
    private final aLP e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bYC(C4174bYz c4174bYz) {
        super(c4174bYz);
        C8632dsu.c((Object) c4174bYz, "");
        this.e = aLN.a.a(g());
        b bVar = new b();
        this.a = bVar;
        C1332Xp c1332Xp = C1332Xp.b;
        LocalBroadcastManager.getInstance((Context) C1332Xp.b(Context.class)).registerReceiver(bVar, new IntentFilter("com.netflix.mediaclient.intent.action.DETAIL_PAGE_REFRESH"));
        a(this, false, 1, (Object) null);
    }

    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC8966gg<bYC, C4174bYz> {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        /* renamed from: initialState */
        public C4174bYz m3167initialState(AbstractC8979gt abstractC8979gt) {
            return (C4174bYz) InterfaceC8966gg.c.e(this, abstractC8979gt);
        }

        public bYC create(AbstractC8979gt abstractC8979gt, C4174bYz c4174bYz) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c4174bYz, "");
            return new bYC(c4174bYz);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            bYC.this.c(true);
        }
    }

    @Override // o.C9943zX, o.AbstractC8919fm, o.AbstractC8899fS
    public void d() {
        super.d();
        C1332Xp c1332Xp = C1332Xp.b;
        LocalBroadcastManager.getInstance((Context) C1332Xp.b(Context.class)).unregisterReceiver(this.a);
    }

    public final void a(final String str, final VideoType videoType) {
        b(new drM<C4174bYz, C4174bYz>() { // from class: com.netflix.mediaclient.ui.kids.character_details.VideoViewModel$setVideoIdAndType$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final C4174bYz invoke(C4174bYz c4174bYz) {
                C8632dsu.c((Object) c4174bYz, "");
                if (C8632dsu.c((Object) str, (Object) c4174bYz.a()) && (c4174bYz.c() instanceof C8971gl)) {
                    return c4174bYz;
                }
                C4174bYz c4174bYz2 = new C4174bYz(str, videoType, null, 4, null);
                bYC.a(this, false, 1, (Object) null);
                return c4174bYz2;
            }
        });
    }

    public static /* synthetic */ void a(bYC byc, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        byc.c(z);
    }

    public final void c(final boolean z) {
        e(new drM<C4174bYz, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.VideoViewModel$fetchVideoDetails$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4174bYz c4174bYz) {
                c(c4174bYz);
                return dpR.c;
            }

            public final void c(final C4174bYz c4174bYz) {
                String str;
                C8632dsu.c((Object) c4174bYz, "");
                if (c4174bYz.c() instanceof C8932fz) {
                    String a = c4174bYz.a();
                    str = bYC.this.b;
                    if (C8632dsu.c((Object) a, (Object) str)) {
                        return;
                    }
                }
                String a2 = c4174bYz.a();
                VideoType d2 = c4174bYz.d();
                final bYC byc = bYC.this;
                final boolean z2 = z;
                C9726vo.d(a2, d2, new drX<String, VideoType, Disposable>() { // from class: com.netflix.mediaclient.ui.kids.character_details.VideoViewModel$fetchVideoDetails$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // o.drX
                    /* renamed from: a */
                    public final Disposable invoke(String str2, VideoType videoType) {
                        aLP alp;
                        C8632dsu.c((Object) str2, "");
                        C8632dsu.c((Object) videoType, "");
                        bYC.this.b = c4174bYz.a();
                        ArrayList arrayList = new ArrayList();
                        if (videoType == VideoType.SHOW) {
                            InterfaceC1242Ud b2 = IE.b(C0956Jb.f());
                            C8632dsu.a(b2, "");
                            arrayList.add(b2);
                            InterfaceC1242Ud d3 = C0956Jb.d();
                            C8632dsu.a(d3, "");
                            arrayList.add(d3);
                        } else {
                            InterfaceC1242Ud b3 = IE.b(C0956Jb.b());
                            C8632dsu.a(b3, "");
                            arrayList.add(b3);
                        }
                        bYC byc2 = bYC.this;
                        alp = byc2.e;
                        Observable e2 = alp.e(new C0969Jo(str2, arrayList, z2 ? TaskMode.FROM_NETWORK : TaskMode.FROM_CACHE_OR_NETWORK, false, null, "MovieCharacterDp", 24, null));
                        final bYC byc3 = bYC.this;
                        return byc2.e(e2, new drX<C4174bYz, AbstractC8918fl<? extends InterfaceC8366diy>, C4174bYz>() { // from class: com.netflix.mediaclient.ui.kids.character_details.VideoViewModel.fetchVideoDetails.1.1.1
                            {
                                super(2);
                            }

                            @Override // o.drX
                            /* renamed from: b */
                            public final C4174bYz invoke(C4174bYz c4174bYz2, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl) {
                                String str3;
                                C8632dsu.c((Object) c4174bYz2, "");
                                C8632dsu.c((Object) abstractC8918fl, "");
                                if (abstractC8918fl instanceof C8932fz) {
                                    return C4174bYz.copy$default(c4174bYz2, null, null, new C8932fz(c4174bYz2.c().c()), 3, null);
                                }
                                if (abstractC8918fl instanceof C8971gl) {
                                    String id = ((InterfaceC8366diy) ((C8971gl) abstractC8918fl).c()).getId();
                                    str3 = bYC.this.b;
                                    return C8632dsu.c((Object) id, (Object) str3) ? C4174bYz.copy$default(c4174bYz2, null, null, abstractC8918fl, 3, null) : c4174bYz2;
                                } else if (abstractC8918fl instanceof C8927fu) {
                                    return C4174bYz.copy$default(c4174bYz2, null, null, new C8927fu(((C8927fu) abstractC8918fl).b(), c4174bYz2.c().c()), 3, null);
                                } else {
                                    return C4174bYz.copy$default(c4174bYz2, null, null, abstractC8918fl, 3, null);
                                }
                            }
                        });
                    }
                });
            }
        });
    }
}

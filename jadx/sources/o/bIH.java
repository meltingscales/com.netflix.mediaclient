package o;

import android.os.Bundle;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import io.reactivex.Observable;
import java.util.List;
import o.AbstractC8918fl;
import o.C0956Jb;
import o.C0969Jo;
import o.C8566dqi;
import o.C8632dsu;
import o.C8927fu;
import o.C8932fz;
import o.C8971gl;
import o.IE;
import o.InterfaceC8366diy;
import o.InterfaceC8966gg;
import o.aLP;
import o.bIH;
import o.bIJ;
import o.dpR;
import o.drX;

/* loaded from: classes4.dex */
public final class bIH extends C9943zX<bIJ> {
    public static final c c = new c(null);
    public static final int e = 8;
    private final aLP a;
    private String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bIH(bIJ bij) {
        super(bij);
        C8632dsu.c((Object) bij, "");
        this.a = aLN.a.a(g());
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp implements InterfaceC8966gg<bIH, bIJ> {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("DpCreditsViewModel");
        }

        public bIH create(AbstractC8979gt abstractC8979gt, bIJ bij) {
            return (bIH) InterfaceC8966gg.c.a(this, abstractC8979gt, bij);
        }

        /* renamed from: initialState */
        public bIJ m3159initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            getLogTag();
            Object b = abstractC8979gt.b();
            C8632dsu.d(b);
            Bundle bundle = (Bundle) b;
            String string = bundle.getString(NetflixActivity.EXTRA_VIDEO_ID);
            if (string == null) {
                throw new IllegalArgumentException("videoId extra not set!".toString());
            }
            VideoType create = VideoType.create(bundle.getString("video_type_string"));
            if (create == VideoType.SHOW || create == VideoType.MOVIE) {
                C8632dsu.d(create);
                return new bIJ(string, create, null, 4, null);
            }
            throw new IllegalStateException("Invalid VideoType found".toString());
        }
    }

    public final void j() {
        e(new drM<bIJ, dpR>() { // from class: com.netflix.mediaclient.ui.dpcredits.DpCreditsViewModel$fetchDpCreditsDetails$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(bIJ bij) {
                b(bij);
                return dpR.c;
            }

            public final void b(bIJ bij) {
                aLP alp;
                List e2;
                String str;
                C8632dsu.c((Object) bij, "");
                String a = bij.a();
                if (bij.d() instanceof C8932fz) {
                    str = bIH.this.b;
                    if (C8632dsu.c((Object) a, (Object) str)) {
                        return;
                    }
                }
                bIH.this.b = a;
                bIH bih = bIH.this;
                alp = bih.a;
                e2 = C8566dqi.e(IE.b(C0956Jb.c()));
                Observable e3 = alp.e(new C0969Jo(a, e2, TaskMode.FROM_CACHE_OR_NETWORK, false, null, "DpCredits", 24, null));
                final bIH bih2 = bIH.this;
                bih.e(e3, new drX<bIJ, AbstractC8918fl<? extends InterfaceC8366diy>, bIJ>() { // from class: com.netflix.mediaclient.ui.dpcredits.DpCreditsViewModel$fetchDpCreditsDetails$1.1
                    {
                        super(2);
                    }

                    @Override // o.drX
                    /* renamed from: b */
                    public final bIJ invoke(bIJ bij2, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl) {
                        String str2;
                        C8632dsu.c((Object) bij2, "");
                        C8632dsu.c((Object) abstractC8918fl, "");
                        if (abstractC8918fl instanceof C8932fz) {
                            return bIJ.copy$default(bij2, null, null, new C8932fz(bij2.d().c()), 3, null);
                        }
                        if (abstractC8918fl instanceof C8971gl) {
                            String id = ((InterfaceC8366diy) ((C8971gl) abstractC8918fl).c()).getId();
                            str2 = bIH.this.b;
                            return C8632dsu.c((Object) id, (Object) str2) ? bIJ.copy$default(bij2, null, null, abstractC8918fl, 3, null) : bij2;
                        } else if (abstractC8918fl instanceof C8927fu) {
                            bIH.c.getLogTag();
                            return bIJ.copy$default(bij2, null, null, new C8927fu(((C8927fu) abstractC8918fl).b(), bij2.d().c()), 3, null);
                        } else {
                            bIH.c.getLogTag();
                            return bIJ.copy$default(bij2, null, null, abstractC8918fl, 3, null);
                        }
                    }
                });
            }
        });
    }
}

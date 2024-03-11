package o;

import android.annotation.SuppressLint;
import android.content.Context;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C5438byk;
import o.C8632dsu;
import o.C9646uN;
import o.InterfaceC9638uF;
import o.dpR;

/* renamed from: o.byk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5438byk implements InterfaceC5367bxS {
    public static final b c = new b(null);
    private final String a;
    private final InterfaceC5182btt b;
    private final int e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5438byk) {
            C5438byk c5438byk = (C5438byk) obj;
            return this.e == c5438byk.e && C8632dsu.c((Object) this.a, (Object) c5438byk.a) && C8632dsu.c(this.b, c5438byk.b);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        int i = this.e;
        String str = this.a;
        InterfaceC5182btt interfaceC5182btt = this.b;
        return "VideoTitleToRate(position=" + i + ", videoId=" + str + ", images=" + interfaceC5182btt + ")";
    }

    public C5438byk(int i, String str, InterfaceC5182btt interfaceC5182btt) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC5182btt, "");
        this.e = i;
        this.a = str;
        this.b = interfaceC5182btt;
    }

    /* renamed from: o.byk$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("TitleToRate");
        }
    }

    @Override // o.InterfaceC5367bxS
    public int d() {
        return Integer.parseInt(this.a);
    }

    @Override // o.InterfaceC5367bxS
    public String b() {
        return this.b.getBackgroundTallUrl();
    }

    @Override // o.InterfaceC5367bxS
    public String a() {
        return this.b.getBackgroundUrl();
    }

    @Override // o.InterfaceC5367bxS
    public String e() {
        return this.b.getTitleLogoUrl();
    }

    public final void c() {
        if (this.e == 0) {
            String backgroundTallUrl = this.b.getBackgroundTallUrl();
            if (backgroundTallUrl == null) {
                backgroundTallUrl = this.b.getBackgroundUrl();
            }
            e(backgroundTallUrl);
        } else {
            e(this.b.getBackgroundUrl());
        }
        e(this.b.getTitleLogoUrl());
    }

    @SuppressLint({"CheckResult"})
    private final void e(final String str) {
        if (str != null) {
            C9646uN.b b2 = C9646uN.d.a().e(str).c(false).b();
            InterfaceC9638uF.e eVar = InterfaceC9638uF.a;
            Context d = AbstractApplicationC1040Mh.d();
            C8632dsu.a(d, "");
            SubscribersKt.subscribeBy(eVar.d(d).d(b2), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.VideoTitleToRate$prefetchImage$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    d(th);
                    return dpR.c;
                }

                public final void d(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    C5438byk.b bVar = C5438byk.c;
                }
            }, new drM<C9646uN.e, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.VideoTitleToRate$prefetchImage$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C9646uN.e eVar2) {
                    e(eVar2);
                    return dpR.c;
                }

                public final void e(C9646uN.e eVar2) {
                    C8632dsu.c((Object) eVar2, "");
                    C5438byk.b bVar = C5438byk.c;
                }
            });
        }
    }
}

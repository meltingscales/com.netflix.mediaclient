package com.netflix.falkor.task;

import android.content.Context;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import o.AbstractC0985Ke;
import o.C0954Iz;
import o.C0987Kg;
import o.C1045Mp;
import o.C1244Uf;
import o.C1332Xp;
import o.C8143den;
import o.C8153dex;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.IE;
import o.InterfaceC1078Nw;
import o.InterfaceC1240Ub;
import o.InterfaceC1242Ud;
import o.InterfaceC4004bSr;
import o.InterfaceC8322diG;
import o.InterfaceC8366diy;
import o.InterfaceC8598drn;
import o.dGJ;

/* loaded from: classes3.dex */
public final class MutateMyListQueueTask extends AbstractC0985Ke<Pair<? extends Boolean, ? extends Status>> {
    public static final d a = new d(null);
    private final boolean b;
    private final String c;
    private boolean d;
    private String e;
    private String f;
    private final String g;
    private final Mutation h;
    private final int i;
    private String j;
    private final String m;
    private final VideoType n;

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public boolean e() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutateMyListQueueTask(Mutation mutation, String str, VideoType videoType, String str2, String str3, int i) {
        super("MutateQueue", null, false, 6, null);
        C8632dsu.c((Object) mutation, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        this.h = mutation;
        this.m = str;
        this.n = videoType;
        this.g = str3;
        this.i = i;
        this.e = str2;
        boolean z = videoType == VideoType.GAMES;
        this.b = z;
        this.c = z ? "games" : SignupConstants.Field.VIDEOS;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MutateInQueueTask");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class Mutation {
        public static final Mutation a = new Mutation("ADD", 0, "add", "addToQueue");
        public static final Mutation b = new Mutation(dGJ.f13798o, 1, "remove", "removeFromQueue");
        private static final /* synthetic */ InterfaceC8598drn c;
        private static final /* synthetic */ Mutation[] d;
        private final String e;
        private final String h;

        private static final /* synthetic */ Mutation[] e() {
            return new Mutation[]{a, b};
        }

        public static Mutation valueOf(String str) {
            return (Mutation) Enum.valueOf(Mutation.class, str);
        }

        public static Mutation[] values() {
            return (Mutation[]) d.clone();
        }

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.h;
        }

        private Mutation(String str, int i, String str2, String str3) {
            this.e = str2;
            this.h = str3;
        }

        static {
            Mutation[] e = e();
            d = e;
            c = C8600drp.e(e);
        }
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public void f() {
        boolean z;
        boolean g;
        String str;
        boolean g2;
        C0954Iz<?> l = l();
        String str2 = this.e;
        if (str2 == null || str2.length() == 0) {
            this.e = l.j();
        }
        android.util.Pair<String, String> c = l.c(LoMoType.INSTANT_QUEUE, this.e);
        C8632dsu.a(c, "");
        String str3 = (String) c.first;
        this.f = str3;
        this.j = (String) c.second;
        if (str3 != null) {
            g = C8691duz.g(str3);
            if (!g && (str = this.e) != null) {
                g2 = C8691duz.g(str);
                if (!g2) {
                    z = true;
                    this.d = z;
                }
            }
        }
        z = false;
        this.d = z;
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        if (this.d) {
            InterfaceC1242Ud b = IE.b("lolomos", this.e, this.h.b());
            C8632dsu.a(b, "");
            list.add(b);
            return;
        }
        InterfaceC1242Ud b2 = IE.b(this.c, this.m, this.h.c());
        C8632dsu.a(b2, "");
        list.add(b2);
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public List<C8143den.d> c() {
        boolean g;
        ArrayList arrayList = new ArrayList();
        if (this.d) {
            if (this.h == Mutation.a) {
                String str = this.f;
                arrayList.add(new C8143den.d("param", "\"" + str + "\""));
                arrayList.add(new C8143den.d("param", this.j));
                arrayList.add(new C8143den.d("param", this.m));
                arrayList.add(new C8143den.d("param", String.valueOf(this.i)));
            } else {
                arrayList.add(new C8143den.d("param", this.j));
                arrayList.add(new C8143den.d("param", this.m));
            }
        } else {
            arrayList.add(new C8143den.d("param", String.valueOf(this.i)));
        }
        String str2 = this.g;
        if (str2 != null) {
            g = C8691duz.g(str2);
            if (!g) {
                arrayList.add(new C8143den.d("signature", this.g));
            }
        }
        arrayList.add(new C8143den.d("videoType", this.n.getValue()));
        return arrayList;
    }

    private final C0954Iz<?> l() {
        InterfaceC1240Ub<?> k = k();
        C8632dsu.d(k);
        return (C0954Iz) k;
    }

    private final void o() {
        C0954Iz<?> l = l();
        if (this.d) {
            l.c(IE.b("lists", this.f));
        }
        InterfaceC4004bSr.a aVar = InterfaceC4004bSr.c;
        C1332Xp c1332Xp = C1332Xp.b;
        Context context = (Context) C1332Xp.b(Context.class);
        String a2 = LoMoType.INSTANT_QUEUE.a();
        C8632dsu.a(a2, "");
        aVar.c(context, a2, this.e, null, null);
        if (C8153dex.ab()) {
            return;
        }
        C0987Kg.e.d().d(this.m, this.n);
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: a */
    public Pair<Boolean, Status> e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        Boolean valueOf;
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        a.getLogTag();
        if (this.b) {
            InterfaceC8322diG b = interfaceC1240Ub.b(IE.b(this.c, this.m, "inQueue"));
            GameDetails gameDetails = b instanceof GameDetails ? (GameDetails) b : null;
            if (gameDetails != null) {
                valueOf = Boolean.valueOf(gameDetails.m());
            }
            valueOf = null;
        } else {
            InterfaceC8322diG b2 = interfaceC1240Ub.b(IE.b(this.c, this.m, "summary"));
            InterfaceC8366diy interfaceC8366diy = b2 instanceof InterfaceC8366diy ? (InterfaceC8366diy) b2 : null;
            if (interfaceC8366diy != null) {
                valueOf = Boolean.valueOf(interfaceC8366diy.ap());
            }
            valueOf = null;
        }
        if (valueOf != null) {
            boolean booleanValue = valueOf.booleanValue();
            o();
            return new Pair<>(Boolean.valueOf(booleanValue), InterfaceC1078Nw.aJ);
        }
        return new Pair<>(null, InterfaceC1078Nw.ai);
    }
}

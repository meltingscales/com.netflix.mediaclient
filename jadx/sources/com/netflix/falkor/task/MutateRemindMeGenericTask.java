package com.netflix.falkor.task;

import android.content.Context;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.List;
import kotlin.Pair;
import o.AbstractC0985Ke;
import o.C0987Kg;
import o.C1045Mp;
import o.C1244Uf;
import o.C1332Xp;
import o.C8143den;
import o.C8153dex;
import o.C8569dql;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
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
public final class MutateRemindMeGenericTask extends AbstractC0985Ke<Pair<? extends Boolean, ? extends Status>> {
    public static final c e = new c(null);
    private final int a;
    private final InterfaceC1242Ud b;
    private final Mutation c;
    private final InterfaceC1242Ud d;
    private final String f;
    private final VideoType h;

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public boolean e() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutateRemindMeGenericTask(Mutation mutation, String str, VideoType videoType, int i) {
        super("MutateRemindMeQueue", null, false, 6, null);
        C8632dsu.c((Object) mutation, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        this.c = mutation;
        this.f = str;
        this.h = videoType;
        this.a = i;
        InterfaceC1242Ud b = IE.b(SignupConstants.Field.VIDEOS, str, mutation.a());
        C8632dsu.a(b, "");
        this.d = b;
        InterfaceC1242Ud b2 = IE.b(SignupConstants.Field.VIDEOS, str, "inRemindMeQueue");
        C8632dsu.a(b2, "");
        this.b = b2;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("MutateRemindMeGenericTask");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class Mutation {
        private static final /* synthetic */ Mutation[] a;
        private static final /* synthetic */ InterfaceC8598drn b;
        public static final Mutation d = new Mutation("ADD", 0, "addToRemindMeQueue", false);
        public static final Mutation e = new Mutation(dGJ.f13798o, 1, "removeFromRemindMeQueue", true);
        private final boolean c;
        private final String i;

        private static final /* synthetic */ Mutation[] d() {
            return new Mutation[]{d, e};
        }

        public static Mutation valueOf(String str) {
            return (Mutation) Enum.valueOf(Mutation.class, str);
        }

        public static Mutation[] values() {
            return (Mutation[]) a.clone();
        }

        public final String a() {
            return this.i;
        }

        public final boolean c() {
            return this.c;
        }

        private Mutation(String str, int i, String str2, boolean z) {
            this.i = str2;
            this.c = z;
        }

        static {
            Mutation[] d2 = d();
            a = d2;
            b = C8600drp.e(d2);
        }
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(this.d);
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public List<C8143den.d> c() {
        List<C8143den.d> f;
        f = C8569dql.f(new C8143den.d("trackId", String.valueOf(this.a)));
        return f;
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: c */
    public Pair<Boolean, Status> e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        NetflixImmutableStatus netflixImmutableStatus;
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        e.getLogTag();
        InterfaceC8322diG b = interfaceC1240Ub.b(this.b);
        InterfaceC8366diy interfaceC8366diy = b instanceof InterfaceC8366diy ? (InterfaceC8366diy) b : null;
        if ((interfaceC8366diy != null ? Boolean.valueOf(interfaceC8366diy.aq()) : null) == null) {
            netflixImmutableStatus = InterfaceC1078Nw.ai;
        } else {
            netflixImmutableStatus = InterfaceC1078Nw.aJ;
        }
        if (C8632dsu.c(netflixImmutableStatus, InterfaceC1078Nw.aJ)) {
            InterfaceC4004bSr.a aVar = InterfaceC4004bSr.c;
            C1332Xp c1332Xp = C1332Xp.b;
            Context context = (Context) C1332Xp.b(Context.class);
            String a = LoMoType.REMINDERS.a();
            C8632dsu.a(a, "");
            aVar.c(context, a, null, null, null);
        }
        if (!C8153dex.ab()) {
            C0987Kg.e.d().d(this.f, this.h);
        }
        return new Pair<>(Boolean.valueOf(interfaceC8366diy != null ? interfaceC8366diy.aq() : this.c.c()), netflixImmutableStatus);
    }
}

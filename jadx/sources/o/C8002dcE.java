package o;

import android.content.Context;
import com.netflix.mediaclient.storage.db.UserMarksDatabase;
import com.netflix.mediaclient.ui.usermarks.api.UserMarksFlexEventType;
import com.netflix.mediaclient.ui.usermarks.impl.UserMarksViewModel$loadUserMarks$1$1;
import com.netflix.mediaclient.ui.usermarks.impl.UserMarksViewModel$removeUserMark$1;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C5251bvI;
import o.C7969dbY;
import o.C7999dcB;
import o.C8002dcE;
import o.C8049dcz;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;
import o.dpR;
import o.dqE;
import o.drM;

/* renamed from: o.dcE  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8002dcE extends AbstractC8899fS<C8049dcz> {
    private final dwQ a;
    private C5251bvI b;
    private final String c;
    private UserMarksDatabase j;
    public static final d e = new d(null);
    public static final int d = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public C8002dcE(@Assisted C8049dcz c8049dcz, dwQ dwq) {
        super(c8049dcz, null, 2, null);
        C8632dsu.c((Object) c8049dcz, "");
        C8632dsu.c((Object) dwq, "");
        this.a = dwq;
        InterfaceC5283bvo b = C8126deW.b();
        this.c = b != null ? b.getProfileGuid() : null;
    }

    /* renamed from: o.dcE$d */
    /* loaded from: classes5.dex */
    public static final class d implements InterfaceC8906fZ<C8002dcE, C8049dcz> {
        private final /* synthetic */ C1644aIy<C8002dcE, C8049dcz> c;

        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        public C8002dcE create(AbstractC8979gt abstractC8979gt, C8049dcz c8049dcz) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c8049dcz, "");
            return this.c.create(abstractC8979gt, c8049dcz);
        }

        /* renamed from: initialState */
        public C8049dcz m3185initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            return this.c.initialState(abstractC8979gt);
        }

        private d() {
            this.c = new C1644aIy<>(C8002dcE.class);
        }
    }

    public final void b(Context context) {
        C8632dsu.c((Object) context, "");
        UserMarksDatabase c = UserMarksDatabase.d.c(context);
        this.j = c;
        C5251bvI.e eVar = C5251bvI.c;
        if (c == null) {
            C8632dsu.d("");
            c = null;
        }
        this.b = eVar.e(c);
    }

    public final void j() {
        String str = this.c;
        if (str != null) {
            C8738dws.e(e(), this.a, null, new UserMarksViewModel$loadUserMarks$1$1(this, str, null), 2, null);
        }
    }

    public final void f() {
        UserMarksFlexEventType.e.e(UserMarksFlexEventType.b, dqF.c(), dqF.c());
        String str = this.c;
        if (str != null) {
            C5251bvI c5251bvI = this.b;
            if (c5251bvI == null) {
                C8632dsu.d("");
                c5251bvI = null;
            }
            c5251bvI.e(str);
            b(new drM<C8049dcz, C8049dcz>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksViewModel$clearUserMarks$1$1
                @Override // o.drM
                /* renamed from: d */
                public final C8049dcz invoke(C8049dcz c8049dcz) {
                    List i;
                    C8632dsu.c((Object) c8049dcz, "");
                    i = C8569dql.i();
                    return C8049dcz.copy$default(c8049dcz, i, null, false, null, 14, null);
                }
            });
        }
    }

    public final void d(String str) {
        C8632dsu.c((Object) str, "");
        e(new UserMarksViewModel$removeUserMark$1(this, str));
    }

    public final void c(final int i, final int i2) {
        e(new drM<C8049dcz, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksViewModel$moveUserMarks$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C8049dcz c8049dcz) {
                c(c8049dcz);
                return dpR.c;
            }

            public final void c(C8049dcz c8049dcz) {
                final List n;
                C8632dsu.c((Object) c8049dcz, "");
                n = C8576dqs.n(c8049dcz.a());
                Collections.swap(n, i, i2);
                this.b(new drM<C8049dcz, C8049dcz>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksViewModel$moveUserMarks$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: c */
                    public final C8049dcz invoke(C8049dcz c8049dcz2) {
                        List U;
                        C8632dsu.c((Object) c8049dcz2, "");
                        U = C8576dqs.U(n);
                        return C8049dcz.copy$default(c8049dcz2, U, null, false, null, 14, null);
                    }
                });
            }
        });
    }

    public final void i() {
        e(new drM<C8049dcz, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksViewModel$dragAndDropEnded$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C8049dcz c8049dcz) {
                b(c8049dcz);
                return dpR.c;
            }

            public final void b(C8049dcz c8049dcz) {
                String str;
                C5251bvI c5251bvI;
                C8632dsu.c((Object) c8049dcz, "");
                str = C8002dcE.this.c;
                if (str != null) {
                    c5251bvI = C8002dcE.this.b;
                    if (c5251bvI == null) {
                        C8632dsu.d("");
                        c5251bvI = null;
                    }
                    c5251bvI.d(C7999dcB.c.c(str, c8049dcz.a()));
                }
            }
        });
    }

    public final void a(final C7969dbY c7969dbY) {
        C8632dsu.c((Object) c7969dbY, "");
        b(new drM<C8049dcz, C8049dcz>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksViewModel$setSelectedUserMark$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final C8049dcz invoke(C8049dcz c8049dcz) {
                C8632dsu.c((Object) c8049dcz, "");
                return C8049dcz.copy$default(c8049dcz, null, C7969dbY.this, false, null, 13, null);
            }
        });
    }

    public final void c(final boolean z) {
        e(new drM<C8049dcz, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksViewModel$setEditMode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C8049dcz c8049dcz) {
                b(c8049dcz);
                return dpR.c;
            }

            public final void b(C8049dcz c8049dcz) {
                Map<String, Integer> d2;
                C8632dsu.c((Object) c8049dcz, "");
                if (z != c8049dcz.c()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("enabled", String.valueOf(z));
                    UserMarksFlexEventType.a aVar = UserMarksFlexEventType.e;
                    UserMarksFlexEventType userMarksFlexEventType = UserMarksFlexEventType.n;
                    d2 = dqE.d();
                    aVar.e(userMarksFlexEventType, d2, hashMap);
                    C8002dcE c8002dcE = this;
                    final boolean z2 = z;
                    c8002dcE.b(new drM<C8049dcz, C8049dcz>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksViewModel$setEditMode$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        /* renamed from: b */
                        public final C8049dcz invoke(C8049dcz c8049dcz2) {
                            C8632dsu.c((Object) c8049dcz2, "");
                            return C8049dcz.copy$default(c8049dcz2, null, null, z2, null, 11, null);
                        }
                    });
                }
            }
        });
    }
}

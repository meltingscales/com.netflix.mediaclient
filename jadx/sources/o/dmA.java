package o;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.slack.circuit.runtime.screen.Screen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C8566dqi;
import o.C8572dqo;
import o.C8632dsu;
import o.InterfaceC8466dmq;
import o.dmA;

/* loaded from: classes5.dex */
public final class dmA implements InterfaceC8466dmq<a> {
    public static final d a = new d(null);
    private static final Saver<dmA, List<Object>> e = SaverKt.Saver(new drX<SaverScope, dmA, List<? extends Object>>() { // from class: com.slack.circuit.backstack.SaveableBackStack$Companion$Saver$1
        @Override // o.drX
        /* renamed from: c */
        public final List<Object> invoke(SaverScope saverScope, dmA dma) {
            SnapshotStateList<dmA.a> snapshotStateList;
            int d2;
            C8632dsu.c((Object) saverScope, "");
            C8632dsu.c((Object) dma, "");
            snapshotStateList = dma.b;
            d2 = C8572dqo.d(snapshotStateList, 10);
            ArrayList arrayList = new ArrayList(d2);
            for (dmA.a aVar : snapshotStateList) {
                List<Object> save = dmA.a.c.e().save(saverScope, aVar);
                C8632dsu.d(save);
                arrayList.add(save);
            }
            return arrayList;
        }
    }, new drM<List<? extends Object>, dmA>() { // from class: com.slack.circuit.backstack.SaveableBackStack$Companion$Saver$2
        @Override // o.drM
        /* renamed from: b */
        public final dmA invoke(List<? extends Object> list) {
            SnapshotStateList snapshotStateList;
            C8632dsu.c((Object) list, "");
            dmA dma = new dmA();
            snapshotStateList = dma.b;
            for (Object obj : list) {
                Saver<dmA.a, List<Object>> e2 = dmA.a.c.e();
                C8632dsu.d(obj);
                dmA.a restore = e2.restore((List) obj);
                C8632dsu.d(restore);
                snapshotStateList.add(restore);
            }
            return dma;
        }
    });
    private final SnapshotStateList<a> b = SnapshotStateKt.mutableStateListOf();

    @Override // o.InterfaceC8466dmq
    public int c() {
        return this.b.size();
    }

    @Override // java.lang.Iterable
    public Iterator<a> iterator() {
        return this.b.iterator();
    }

    @Override // o.InterfaceC8466dmq
    /* renamed from: e */
    public a a() {
        Object x;
        x = C8576dqs.x(this.b);
        return (a) x;
    }

    @Override // o.InterfaceC8466dmq
    public void a(Screen screen) {
        Map<String, ? extends Object> d2;
        C8632dsu.c((Object) screen, "");
        d2 = dqE.d();
        d(screen, d2);
    }

    public final void d(Screen screen, Map<String, ? extends Object> map) {
        C8632dsu.c((Object) screen, "");
        C8632dsu.c((Object) map, "");
        b(new a(screen, map, null, 4, null));
    }

    public void b(a aVar) {
        C8632dsu.c((Object) aVar, "");
        this.b.add(0, aVar);
    }

    @Override // o.InterfaceC8466dmq
    /* renamed from: j */
    public a d() {
        Object p;
        p = C8571dqn.p(this.b);
        return (a) p;
    }

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC8466dmq.a {
        private final Map<String, Object> a;
        private final String e;
        private final Screen h;
        public static final C0123a c = new C0123a(null);
        public static final int d = 8;
        private static final Saver<a, List<Object>> b = SaverKt.Saver(new drX<SaverScope, a, List<? extends Object>>() { // from class: com.slack.circuit.backstack.SaveableBackStack$Record$Companion$Saver$1
            @Override // o.drX
            /* renamed from: c */
            public final List<Object> invoke(SaverScope saverScope, dmA.a aVar) {
                List a;
                List<Object> o2;
                C8632dsu.c((Object) saverScope, "");
                C8632dsu.c((Object) aVar, "");
                a = C8566dqi.a();
                a.add(aVar.c());
                a.add(aVar.e());
                a.add(aVar.d());
                o2 = C8566dqi.o(a);
                return o2;
            }
        }, new drM<List<? extends Object>, a>() { // from class: com.slack.circuit.backstack.SaveableBackStack$Record$Companion$Saver$2
            @Override // o.drM
            /* renamed from: a */
            public final dmA.a invoke(List<? extends Object> list) {
                C8632dsu.c((Object) list, "");
                Object obj = list.get(0);
                C8632dsu.d(obj);
                Object obj2 = list.get(1);
                C8632dsu.d(obj2);
                Object obj3 = list.get(2);
                C8632dsu.d(obj3);
                return new dmA.a((Screen) obj, (Map) obj2, (String) obj3);
            }
        });

        @Override // o.InterfaceC8466dmq.a
        public Screen c() {
            return this.h;
        }

        @Override // o.InterfaceC8466dmq.a
        public String d() {
            return this.e;
        }

        public final Map<String, Object> e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c(this.h, aVar.h) && C8632dsu.c(this.a, aVar.a) && C8632dsu.c((Object) this.e, (Object) aVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (((this.h.hashCode() * 31) + this.a.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            Screen screen = this.h;
            Map<String, Object> map = this.a;
            String str = this.e;
            return "Record(screen=" + screen + ", args=" + map + ", key=" + str + ")";
        }

        public a(Screen screen, Map<String, ? extends Object> map, String str) {
            C8632dsu.c((Object) screen, "");
            C8632dsu.c((Object) map, "");
            C8632dsu.c((Object) str, "");
            this.h = screen;
            this.a = map;
            this.e = str;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ a(com.slack.circuit.runtime.screen.Screen r1, java.util.Map r2, java.lang.String r3, int r4, o.C8627dsp r5) {
            /*
                r0 = this;
                r5 = r4 & 2
                if (r5 == 0) goto L8
                java.util.Map r2 = o.dqF.c()
            L8:
                r4 = r4 & 4
                if (r4 == 0) goto L1c
                java.util.UUID r3 = java.util.UUID.randomUUID()
                java.lang.String r4 = ""
                o.C8632dsu.a(r3, r4)
                java.lang.String r3 = r3.toString()
                o.C8632dsu.a(r3, r4)
            L1c:
                r0.<init>(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dmA.a.<init>(com.slack.circuit.runtime.screen.Screen, java.util.Map, java.lang.String, int, o.dsp):void");
        }

        /* renamed from: o.dmA$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0123a {
            public /* synthetic */ C0123a(C8627dsp c8627dsp) {
                this();
            }

            private C0123a() {
            }

            public final Saver<a, List<Object>> e() {
                return a.b;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final Saver<dmA, List<Object>> e() {
            return dmA.e;
        }
    }
}

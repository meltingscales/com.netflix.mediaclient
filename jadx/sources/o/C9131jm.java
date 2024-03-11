package o;

import o.InterfaceC9357o;
import o.InterfaceC9569s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.jm  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9131jm extends AbstractC8933g implements InterfaceC9128jj {
    private final C9132jn c;

    @Override // o.InterfaceC9128jj
    public C9132jn d() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9131jm(InterfaceC9569s interfaceC9569s) {
        super(interfaceC9569s);
        C8632dsu.c((Object) interfaceC9569s, "");
        this.c = new C9132jn(interfaceC9569s);
    }

    /* renamed from: o.jm$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC9410p<InterfaceC9357o.d<dpR>> {
        public static final a b = new a();

        @Override // o.InterfaceC9410p
        public long c() {
            return 1L;
        }

        private a() {
        }

        @Override // o.InterfaceC9410p
        public /* synthetic */ InterfaceC9357o.d<dpR> a(InterfaceC9569s interfaceC9569s) {
            return InterfaceC9357o.d.d(b(interfaceC9569s));
        }

        @Override // o.InterfaceC9410p
        public /* synthetic */ InterfaceC9357o.d<dpR> e(InterfaceC9569s interfaceC9569s, long j, long j2, C9198l[] c9198lArr) {
            return InterfaceC9357o.d.d(a(interfaceC9569s, j, j2, c9198lArr));
        }

        public Object b(InterfaceC9569s interfaceC9569s) {
            C8632dsu.c((Object) interfaceC9569s, "");
            InterfaceC9569s.e.a(interfaceC9569s, null, "CREATE TABLE records (\n  _id INTEGER PRIMARY KEY AUTOINCREMENT,\n  key TEXT NOT NULL,\n  record TEXT NOT NULL\n)", 0, null, 8, null);
            InterfaceC9569s.e.a(interfaceC9569s, null, "CREATE INDEX idx_records_key ON records(key)", 0, null, 8, null);
            return InterfaceC9357o.e.e();
        }

        public Object a(InterfaceC9569s interfaceC9569s, long j, long j2, C9198l... c9198lArr) {
            C8632dsu.c((Object) interfaceC9569s, "");
            C8632dsu.c((Object) c9198lArr, "");
            return InterfaceC9357o.e.e();
        }
    }
}

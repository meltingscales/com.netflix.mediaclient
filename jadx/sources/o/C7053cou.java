package o;

import o.InterfaceC5222bug;

/* renamed from: o.cou  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7053cou extends aEX implements InterfaceC5222bug<C7053cou> {
    private final InterfaceC5149btM b;
    private final String c;
    private final InterfaceC5160btX d;
    private final int e;
    private final C7053cou i;

    public final InterfaceC5160btX c() {
        return this.d;
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: e */
    public C7053cou getVideo() {
        return this.i;
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: getCursor */
    public String mo3080getCursor() {
        return this.c;
    }

    @Override // o.InterfaceC5222bug
    public InterfaceC5149btM getEvidence() {
        return this.b;
    }

    @Override // o.InterfaceC5222bug
    public int getPosition() {
        return this.e;
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: d */
    public C7053cou mo3081getEntity() {
        return (C7053cou) InterfaceC5222bug.a.d(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7053cou(int i, C2630ajh c2630ajh, String str, String str2, String str3, InterfaceC5160btX interfaceC5160btX) {
        super(c2630ajh, str, str2);
        C8632dsu.c((Object) c2630ajh, "");
        C8632dsu.c((Object) str3, "");
        this.e = i;
        this.c = str3;
        this.d = interfaceC5160btX;
        this.i = this;
        this.b = new d(str, str2);
    }

    /* renamed from: o.cou$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC5149btM {
        private String a;
        private String b;
        private String e;

        @Override // o.InterfaceC5149btM
        public String getImageKey() {
            return this.b;
        }

        @Override // o.InterfaceC5149btM
        public String getImageUrl() {
            return this.a;
        }

        @Override // o.InterfaceC5149btM
        public String getTcardUrl() {
            return this.e;
        }

        d(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }
}

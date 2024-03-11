package o;

/* renamed from: o.dhX  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC8286dhX {
    public static final InterfaceC8286dhX a = new InterfaceC8286dhX() { // from class: o.dhX.5
        private long d;

        @Override // o.InterfaceC8286dhX
        public boolean a() {
            return true;
        }

        @Override // o.InterfaceC8286dhX
        public void b() {
        }

        @Override // o.InterfaceC8286dhX
        public long d() {
            this.d++;
            return 0L;
        }
    };
    public static final InterfaceC8286dhX e = new InterfaceC8286dhX() { // from class: o.dhX.4
        @Override // o.InterfaceC8286dhX
        public boolean a() {
            return false;
        }

        @Override // o.InterfaceC8286dhX
        public void b() {
        }

        @Override // o.InterfaceC8286dhX
        public long d() {
            return -1L;
        }
    };

    boolean a();

    void b();

    long d();
}

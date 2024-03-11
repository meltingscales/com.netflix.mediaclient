package o;

/* loaded from: classes5.dex */
final class dzY<T> implements InterfaceC8585dra<T>, InterfaceC8594drj {
    private final dqZ a;
    private final InterfaceC8585dra<T> d;

    @Override // o.InterfaceC8585dra
    public dqZ getContext() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dzY(InterfaceC8585dra<? super T> interfaceC8585dra, dqZ dqz) {
        this.d = interfaceC8585dra;
        this.a = dqz;
    }

    @Override // o.InterfaceC8594drj
    public InterfaceC8594drj getCallerFrame() {
        InterfaceC8585dra<T> interfaceC8585dra = this.d;
        if (interfaceC8585dra instanceof InterfaceC8594drj) {
            return (InterfaceC8594drj) interfaceC8585dra;
        }
        return null;
    }

    @Override // o.InterfaceC8585dra
    public void resumeWith(Object obj) {
        this.d.resumeWith(obj);
    }
}

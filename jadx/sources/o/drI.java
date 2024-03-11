package o;

/* loaded from: classes5.dex */
public final class drI {
    public static final <T> Class<T> e(InterfaceC8660dtv<T> interfaceC8660dtv) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        Class<T> cls = (Class<T>) ((InterfaceC8622dsk) interfaceC8660dtv).d();
        C8632dsu.d(cls);
        return cls;
    }

    public static final <T> Class<T> d(InterfaceC8660dtv<T> interfaceC8660dtv) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        Class<T> cls = (Class<T>) ((InterfaceC8622dsk) interfaceC8660dtv).d();
        if (!cls.isPrimitive()) {
            C8632dsu.d(cls);
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (Class<T>) Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    cls = (Class<T>) Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    cls = (Class<T>) Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                    break;
                }
                break;
        }
        C8632dsu.d(cls);
        return cls;
    }

    public static final <T> InterfaceC8660dtv<T> b(Class<T> cls) {
        C8632dsu.c((Object) cls, "");
        return dsA.a(cls);
    }
}

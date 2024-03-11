package o;

/* loaded from: classes5.dex */
public interface dES {
    public static final a c = a.b;

    String b(InterfaceC7707dCj interfaceC7707dCj, int i, String str);

    /* loaded from: classes5.dex */
    public static final class a {
        static final /* synthetic */ a b = new a();
        private static final dES a = new c();

        private a() {
        }

        /* loaded from: classes5.dex */
        public static final class c implements dES {
            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
            }

            c() {
            }

            @Override // o.dES
            public String b(InterfaceC7707dCj interfaceC7707dCj, int i, String str) {
                char t;
                C8632dsu.c((Object) interfaceC7707dCj, "");
                C8632dsu.c((Object) str, "");
                StringBuilder sb = new StringBuilder(str.length() * 2);
                Character ch = null;
                int i2 = 0;
                for (int i3 = 0; i3 < str.length(); i3++) {
                    char charAt = str.charAt(i3);
                    if (Character.isUpperCase(charAt)) {
                        if (i2 == 0 && sb.length() > 0) {
                            t = duB.t(sb);
                            if (t != '_') {
                                sb.append('_');
                            }
                        }
                        if (ch != null) {
                            sb.append(ch.charValue());
                        }
                        i2++;
                        ch = Character.valueOf(Character.toLowerCase(charAt));
                    } else {
                        if (ch != null) {
                            if (i2 > 1 && Character.isLetter(charAt)) {
                                sb.append('_');
                            }
                            sb.append(ch);
                            ch = null;
                            i2 = 0;
                        }
                        sb.append(charAt);
                    }
                }
                if (ch != null) {
                    sb.append(ch);
                }
                String sb2 = sb.toString();
                C8632dsu.a(sb2, "");
                return sb2;
            }
        }
    }
}

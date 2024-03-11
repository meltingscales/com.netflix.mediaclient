package o;

import com.netflix.msl.io.MslEncoderParseException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.dkg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8402dkg {
    private Map<String, Integer> a = new HashMap();
    private int b;
    private int c;
    private int d;
    private int e;

    public void c(String str) {
        Integer num = this.a.get(str);
        if (num == null) {
            this.a.put(str, 1);
        } else {
            this.a.put(str, Integer.valueOf(num.intValue() + 1));
        }
        a(str);
    }

    public void d() {
        c("(unknown)");
    }

    private void a(String str) {
        Integer num = this.a.get(str);
        if (num == null) {
            return;
        }
        if (num.intValue() <= (str == "(unknown)" ? 32 : 128)) {
            return;
        }
        MslEncoderParseException.Type type = MslEncoderParseException.Type.TOO_MANY_FIELDS;
        throw new MslEncoderParseException(type, "MSL message contains too many fields named " + str);
    }

    public void b() {
        int i = this.b + 1;
        this.b = i;
        if (i > 512) {
            throw new MslEncoderParseException(MslEncoderParseException.Type.TOO_MANY_OBJECTS, "MSL message contains too many objects");
        }
    }

    public void a() {
        int i = this.e + 1;
        this.e = i;
        if (i > 32) {
            throw new MslEncoderParseException(MslEncoderParseException.Type.TOO_MANY_ARRAYS, "MSL message contains too many arrays");
        }
    }

    public void c() {
        int i = this.d + 1;
        this.d = i;
        if (i > 1024) {
            throw new MslEncoderParseException(MslEncoderParseException.Type.TOO_MANY_PRIMITIVES, "MSL message contains too many primitives");
        }
    }

    public void c(int i) {
        if (i > this.c) {
            this.c = i;
            if (i > 8) {
                throw new MslEncoderParseException(MslEncoderParseException.Type.NESTING_TOO_DEEP, "MSL message is too deeply nested");
            }
        }
    }
}

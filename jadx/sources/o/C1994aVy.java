package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xbill.DNS.Cache;
import org.xbill.DNS.DClass;
import org.xbill.DNS.ExtendedResolver;
import org.xbill.DNS.Message;
import org.xbill.DNS.Name;
import org.xbill.DNS.NameTooLongException;
import org.xbill.DNS.RRset;
import org.xbill.DNS.Rcode;
import org.xbill.DNS.Record;
import org.xbill.DNS.Resolver;
import org.xbill.DNS.ResolverConfig;
import org.xbill.DNS.SetResponse;
import org.xbill.DNS.Type;

/* renamed from: o.aVy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1994aVy {
    private static final Name[] a = new Name[0];
    private static int b;
    private static List<Name> c;
    private static Resolver d;
    private static Map<Integer, Cache> e;
    private Resolver A;
    private int B;
    private List<Name> C;
    private boolean D;
    private int E;
    private String f;
    private Record[] g;
    private boolean h;
    private Cache i;
    private List<Name> j;
    private boolean k;
    private int l;
    private boolean m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private int f13451o;
    private int p;
    private int q;
    private boolean r;
    private String s;
    private Name t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private boolean y;
    private boolean z;

    private boolean b(Name name) {
        return false;
    }

    public void d(Resolver resolver) {
        this.A = resolver;
    }

    public static void d() {
        synchronized (C1994aVy.class) {
            d = new ExtendedResolver();
            c = ResolverConfig.getCurrentConfig().searchPath();
            e = new HashMap();
            b = ResolverConfig.getCurrentConfig().ndots();
        }
    }

    static {
        d();
    }

    public static Resolver e() {
        Resolver resolver;
        synchronized (C1994aVy.class) {
            resolver = d;
        }
        return resolver;
    }

    public static Cache e(int i) {
        Cache cache;
        synchronized (C1994aVy.class) {
            DClass.check(i);
            cache = e.get(Integer.valueOf(i));
            if (cache == null) {
                cache = new Cache(i);
                e.put(Integer.valueOf(i), cache);
            }
        }
        return cache;
    }

    public static List<Name> b() {
        List<Name> list;
        synchronized (C1994aVy.class) {
            list = c;
        }
        return list;
    }

    private void f() {
        this.p = 0;
        this.r = false;
        this.n = false;
        this.m = false;
        this.j = null;
        this.g = null;
        this.B = -1;
        this.s = null;
        this.v = false;
        this.h = false;
        this.f = null;
        this.w = false;
        this.z = false;
        this.u = false;
        this.y = false;
        if (this.D) {
            this.i.clearCache();
        }
    }

    public C1994aVy(Name name, int i, int i2) {
        this.k = true;
        Type.check(i);
        DClass.check(i2);
        if (!Type.isRR(i) && i != 255) {
            throw new IllegalArgumentException("Cannot query for meta-types other than ANY");
        }
        this.t = name;
        this.E = i;
        this.l = i2;
        synchronized (C1994aVy.class) {
            this.A = e();
            this.C = b();
            this.i = e(i2);
        }
        this.x = b;
        this.f13451o = 3;
        this.B = -1;
        this.q = 16;
    }

    public C1994aVy(String str, int i, int i2) {
        this(Name.fromString(str), i, i2);
    }

    private void b(Name name, Name name2) {
        this.r = true;
        this.h = false;
        this.w = false;
        this.z = false;
        this.v = false;
        this.y = false;
        int i = this.p + 1;
        this.p = i;
        if (i >= this.q || name.equals(name2)) {
            this.B = 1;
            this.s = "CNAME loop";
            this.n = true;
            return;
        }
        if (this.j == null) {
            this.j = new ArrayList();
        }
        this.j.add(name2);
        a(name);
    }

    private void c(Name name, SetResponse setResponse) {
        if (setResponse.isSuccessful()) {
            List<RRset> answers = setResponse.answers();
            ArrayList arrayList = new ArrayList();
            for (RRset rRset : answers) {
                arrayList.addAll(rRset.rrs(this.k));
            }
            this.B = 0;
            this.g = (Record[]) arrayList.toArray(new Record[0]);
            this.n = true;
        } else if (setResponse.isNXDOMAIN()) {
            this.v = true;
            this.m = true;
            if (this.p > 0) {
                this.B = 3;
                this.n = true;
            }
        } else if (setResponse.isNXRRSET()) {
            this.B = 4;
            this.g = null;
            this.n = true;
        } else if (setResponse.isCNAME()) {
            b(setResponse.getCNAME().getTarget(), name);
        } else if (setResponse.isDNAME()) {
            try {
                b(name.fromDNAME(setResponse.getDNAME()), name);
            } catch (NameTooLongException unused) {
                this.B = 1;
                this.s = "Invalid DNAME target";
                this.n = true;
            }
        } else if (setResponse.isDelegation()) {
            this.y = true;
        }
    }

    private void a(Name name) {
        if (b(name)) {
            return;
        }
        c(name, this.i.lookupRecords(name, this.E, this.f13451o));
        if (this.n || this.m) {
            return;
        }
        Message newQuery = Message.newQuery(Record.newRecord(name, this.E, this.l));
        try {
            Message send = this.A.send(newQuery);
            int rcode = send.getHeader().getRcode();
            if (rcode != 0 && rcode != 3) {
                this.h = true;
                this.f = Rcode.string(rcode);
            } else if (!newQuery.getQuestion().equals(send.getQuestion())) {
                this.h = true;
                this.f = "response does not match query";
            } else {
                SetResponse addMessage = this.i.addMessage(send);
                if (addMessage == null) {
                    addMessage = this.i.lookupRecords(name, this.E, this.f13451o);
                }
                c(name, addMessage);
            }
        } catch (IOException e2) {
            if (e2 instanceof InterruptedIOException) {
                this.z = true;
            } else {
                this.w = true;
            }
        }
    }

    private void d(Name name, Name name2) {
        this.m = false;
        if (name2 != null) {
            try {
                name = Name.concatenate(name, name2);
            } catch (NameTooLongException unused) {
                this.u = true;
                return;
            }
        }
        a(name);
    }

    public Record[] j() {
        String str;
        if (this.n) {
            f();
        }
        if (this.t.isAbsolute()) {
            d(this.t, null);
        } else if (this.C == null) {
            d(this.t, Name.root);
        } else {
            if (this.t.labels() > this.x) {
                d(this.t, Name.root);
            }
            if (this.n) {
                return this.g;
            }
            for (Name name : this.C) {
                d(this.t, name);
                if (this.n) {
                    return this.g;
                }
                if (this.r) {
                    break;
                }
            }
            d(this.t, Name.root);
        }
        if (!this.n) {
            if (this.h) {
                this.B = 2;
                str = this.f;
            } else if (this.z) {
                this.B = 2;
                str = "timed out";
            } else if (this.w) {
                this.B = 2;
                str = "network error";
            } else if (this.v) {
                this.B = 3;
                this.n = true;
            } else if (this.y) {
                this.B = 1;
                str = "referral";
            } else if (this.u) {
                this.B = 1;
                str = "name too long";
            }
            this.s = str;
            this.n = true;
        }
        return this.g;
    }

    private void i() {
        if (!this.n || this.B == -1) {
            StringBuilder sb = new StringBuilder("Lookup of " + this.t + " ");
            int i = this.l;
            if (i != 1) {
                sb.append(DClass.string(i));
                sb.append(" ");
            }
            sb.append(Type.string(this.E));
            sb.append(" isn't done");
            throw new IllegalStateException(sb.toString());
        }
    }

    public Record[] a() {
        i();
        return this.g;
    }

    public Name[] c() {
        i();
        List<Name> list = this.j;
        return list == null ? a : (Name[]) list.toArray(new Name[0]);
    }

    public int h() {
        i();
        return this.B;
    }

    public String g() {
        i();
        String str = this.s;
        if (str != null) {
            return str;
        }
        int i = this.B;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "type not found";
                        }
                        throw new IllegalStateException("unknown result");
                    }
                    return "host not found";
                }
                return "try again";
            }
            return "unrecoverable error";
        }
        return "successful";
    }
}

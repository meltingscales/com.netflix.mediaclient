package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase;
import o.C8632dsu;
import o.C8691duz;

/* loaded from: classes.dex */
public final class Room {
    public static final Room INSTANCE = new Room();

    private Room() {
    }

    public static final <T, C> T getGeneratedImplementation(Class<C> cls, String str) {
        String b;
        String str2;
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) str, "");
        Package r1 = cls.getPackage();
        C8632dsu.d(r1);
        String name = r1.getName();
        String canonicalName = cls.getCanonicalName();
        C8632dsu.d((Object) canonicalName);
        C8632dsu.a(name, "");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            C8632dsu.a(canonicalName, "");
        }
        String str3 = canonicalName;
        StringBuilder sb = new StringBuilder();
        b = C8691duz.b(str3, '.', '_', false, 4, (Object) null);
        sb.append(b);
        sb.append(str);
        String sb2 = sb.toString();
        try {
            if (name.length() == 0) {
                str2 = sb2;
            } else {
                str2 = name + '.' + sb2;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            C8632dsu.d(cls2);
            return (T) cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + sb2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(Context context, Class<T> cls) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) cls, "");
        return new RoomDatabase.Builder<>(context, cls, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> databaseBuilder(android.content.Context r2, java.lang.Class<T> r3, java.lang.String r4) {
        /*
            java.lang.String r0 = ""
            o.C8632dsu.c(r2, r0)
            o.C8632dsu.c(r3, r0)
            r0 = 1
            if (r4 == 0) goto L14
            boolean r1 = o.C8684dus.a(r4)
            if (r1 == 0) goto L12
            goto L14
        L12:
            r1 = 0
            goto L15
        L14:
            r1 = r0
        L15:
            r0 = r0 ^ r1
            if (r0 == 0) goto L1e
            androidx.room.RoomDatabase$Builder r0 = new androidx.room.RoomDatabase$Builder
            r0.<init>(r2, r3, r4)
            return r0
        L1e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.Room.databaseBuilder(android.content.Context, java.lang.Class, java.lang.String):androidx.room.RoomDatabase$Builder");
    }
}

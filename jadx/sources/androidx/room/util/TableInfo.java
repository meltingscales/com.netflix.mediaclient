package androidx.room.util;

import android.annotation.SuppressLint;
import androidx.room.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.duD;

/* loaded from: classes5.dex */
public final class TableInfo {
    public static final Companion Companion = new Companion(null);
    public final Map<String, Column> columns;
    public final Set<ForeignKey> foreignKeys;
    public final Set<Index> indices;
    public final String name;

    public static final TableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public TableInfo(String str, Map<String, Column> map, Set<ForeignKey> set, Set<Index> set2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) set, "");
        this.name = str;
        this.columns = map;
        this.foreignKeys = set;
        this.indices = set2;
    }

    public boolean equals(Object obj) {
        Set<Index> set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof TableInfo) {
            TableInfo tableInfo = (TableInfo) obj;
            if (C8632dsu.c((Object) this.name, (Object) tableInfo.name) && C8632dsu.c(this.columns, tableInfo.columns) && C8632dsu.c(this.foreignKeys, tableInfo.foreignKeys)) {
                Set<Index> set2 = this.indices;
                if (set2 == null || (set = tableInfo.indices) == null) {
                    return true;
                }
                return C8632dsu.c(set2, set);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode();
        return (((hashCode * 31) + this.columns.hashCode()) * 31) + this.foreignKeys.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.name + "', columns=" + this.columns + ", foreignKeys=" + this.foreignKeys + ", indices=" + this.indices + '}';
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final TableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            C8632dsu.c((Object) str, "");
            return TableInfoKt.readTableInfo(supportSQLiteDatabase, str);
        }
    }

    /* loaded from: classes5.dex */
    public static final class Column {
        public static final Companion Companion = new Companion(null);
        public final int affinity;
        public final int createdFrom;
        public final String defaultValue;
        public final String name;
        public final boolean notNull;
        public final int primaryKeyPosition;
        public final String type;

        public Column(String str, String str2, boolean z, int i, String str3, int i2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.name = str;
            this.type = str2;
            this.notNull = z;
            this.primaryKeyPosition = i;
            this.defaultValue = str3;
            this.createdFrom = i2;
            this.affinity = findAffinity(str2);
        }

        private final int findAffinity(String str) {
            boolean d;
            boolean d2;
            boolean d3;
            boolean d4;
            boolean d5;
            boolean d6;
            boolean d7;
            boolean d8;
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            C8632dsu.a(locale, "");
            String upperCase = str.toUpperCase(locale);
            C8632dsu.a(upperCase, "");
            d = duD.d((CharSequence) upperCase, (CharSequence) "INT", false, 2, (Object) null);
            if (d) {
                return 3;
            }
            d2 = duD.d((CharSequence) upperCase, (CharSequence) "CHAR", false, 2, (Object) null);
            if (!d2) {
                d3 = duD.d((CharSequence) upperCase, (CharSequence) "CLOB", false, 2, (Object) null);
                if (!d3) {
                    d4 = duD.d((CharSequence) upperCase, (CharSequence) "TEXT", false, 2, (Object) null);
                    if (!d4) {
                        d5 = duD.d((CharSequence) upperCase, (CharSequence) "BLOB", false, 2, (Object) null);
                        if (d5) {
                            return 5;
                        }
                        d6 = duD.d((CharSequence) upperCase, (CharSequence) "REAL", false, 2, (Object) null);
                        if (d6) {
                            return 4;
                        }
                        d7 = duD.d((CharSequence) upperCase, (CharSequence) "FLOA", false, 2, (Object) null);
                        if (d7) {
                            return 4;
                        }
                        d8 = duD.d((CharSequence) upperCase, (CharSequence) "DOUB", false, 2, (Object) null);
                        return d8 ? 4 : 1;
                    }
                }
            }
            return 2;
        }

        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            @SuppressLint({"SyntheticAccessor"})
            public final boolean defaultValueEquals(String str, String str2) {
                CharSequence n;
                C8632dsu.c((Object) str, "");
                if (C8632dsu.c((Object) str, (Object) str2)) {
                    return true;
                }
                if (containsSurroundingParenthesis(str)) {
                    String substring = str.substring(1, str.length() - 1);
                    C8632dsu.a(substring, "");
                    n = duD.n((CharSequence) substring);
                    return C8632dsu.c((Object) n.toString(), (Object) str2);
                }
                return false;
            }

            private final boolean containsSurroundingParenthesis(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i < str.length()) {
                    char charAt = str.charAt(i);
                    if (i3 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        return false;
                    }
                    i++;
                    i3++;
                }
                return i2 == 0;
            }
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj instanceof Column) {
                Column column = (Column) obj;
                if (this.primaryKeyPosition == column.primaryKeyPosition && C8632dsu.c((Object) this.name, (Object) column.name) && this.notNull == column.notNull) {
                    if (this.createdFrom != 1 || column.createdFrom != 2 || (str3 = this.defaultValue) == null || Companion.defaultValueEquals(str3, column.defaultValue)) {
                        if (this.createdFrom != 2 || column.createdFrom != 1 || (str2 = column.defaultValue) == null || Companion.defaultValueEquals(str2, this.defaultValue)) {
                            int i = this.createdFrom;
                            return (i == 0 || i != column.createdFrom || ((str = this.defaultValue) == null ? column.defaultValue == null : Companion.defaultValueEquals(str, column.defaultValue))) && this.affinity == column.affinity;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode();
            return (((((hashCode * 31) + this.affinity) * 31) + (this.notNull ? 1231 : 1237)) * 31) + this.primaryKeyPosition;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.name);
            sb.append("', type='");
            sb.append(this.type);
            sb.append("', affinity='");
            sb.append(this.affinity);
            sb.append("', notNull=");
            sb.append(this.notNull);
            sb.append(", primaryKeyPosition=");
            sb.append(this.primaryKeyPosition);
            sb.append(", defaultValue='");
            String str = this.defaultValue;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }
    }

    /* loaded from: classes5.dex */
    public static final class ForeignKey {
        public final List<String> columnNames;
        public final String onDelete;
        public final String onUpdate;
        public final List<String> referenceColumnNames;
        public final String referenceTable;

        public ForeignKey(String str, String str2, String str3, List<String> list, List<String> list2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str3, "");
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) list2, "");
            this.referenceTable = str;
            this.onDelete = str2;
            this.onUpdate = str3;
            this.columnNames = list;
            this.referenceColumnNames = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ForeignKey) {
                ForeignKey foreignKey = (ForeignKey) obj;
                if (C8632dsu.c((Object) this.referenceTable, (Object) foreignKey.referenceTable) && C8632dsu.c((Object) this.onDelete, (Object) foreignKey.onDelete) && C8632dsu.c((Object) this.onUpdate, (Object) foreignKey.onUpdate) && C8632dsu.c(this.columnNames, foreignKey.columnNames)) {
                    return C8632dsu.c(this.referenceColumnNames, foreignKey.referenceColumnNames);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.referenceTable.hashCode();
            int hashCode2 = this.onDelete.hashCode();
            int hashCode3 = this.onUpdate.hashCode();
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + this.columnNames.hashCode()) * 31) + this.referenceColumnNames.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.referenceTable + "', onDelete='" + this.onDelete + " +', onUpdate='" + this.onUpdate + "', columnNames=" + this.columnNames + ", referenceColumnNames=" + this.referenceColumnNames + '}';
        }
    }

    /* loaded from: classes5.dex */
    public static final class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {
        private final String from;
        private final int id;
        private final int sequence;
        private final String to;

        public final String getFrom() {
            return this.from;
        }

        public final int getId() {
            return this.id;
        }

        public final String getTo() {
            return this.to;
        }

        public ForeignKeyWithSequence(int i, int i2, String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.id = i;
            this.sequence = i2;
            this.from = str;
            this.to = str2;
        }

        @Override // java.lang.Comparable
        public int compareTo(ForeignKeyWithSequence foreignKeyWithSequence) {
            C8632dsu.c((Object) foreignKeyWithSequence, "");
            int i = this.id - foreignKeyWithSequence.id;
            return i == 0 ? this.sequence - foreignKeyWithSequence.sequence : i;
        }
    }

    /* loaded from: classes5.dex */
    public static final class Index {
        public static final Companion Companion = new Companion(null);
        public final List<String> columns;
        public final String name;
        public List<String> orders;
        public final boolean unique;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Collection, java.lang.Object, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public Index(String str, boolean z, List<String> list, List<String> list2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) list2, "");
            this.name = str;
            this.unique = z;
            this.columns = list;
            this.orders = list2;
            if (list2.isEmpty()) {
                int size = list.size();
                list2 = new ArrayList<>(size);
                for (int i = 0; i < size; i++) {
                    list2.add(Index.Order.ASC.name());
                }
            }
            this.orders = list2;
        }

        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Index(java.lang.String r5, boolean r6, java.util.List<java.lang.String> r7) {
            /*
                r4 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r5, r0)
                o.C8632dsu.c(r7, r0)
                int r0 = r7.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
            L12:
                if (r2 >= r0) goto L20
                androidx.room.Index$Order r3 = androidx.room.Index.Order.ASC
                java.lang.String r3 = r3.name()
                r1.add(r3)
                int r2 = r2 + 1
                goto L12
            L20:
                r4.<init>(r5, r6, r7, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.TableInfo.Index.<init>(java.lang.String, boolean, java.util.List):void");
        }

        public boolean equals(Object obj) {
            boolean i;
            boolean i2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof Index) {
                Index index = (Index) obj;
                if (this.unique == index.unique && C8632dsu.c(this.columns, index.columns) && C8632dsu.c(this.orders, index.orders)) {
                    i = C8691duz.i(this.name, "index_", false, 2, null);
                    if (i) {
                        i2 = C8691duz.i(index.name, "index_", false, 2, null);
                        return i2;
                    }
                    return C8632dsu.c((Object) this.name, (Object) index.name);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            boolean i;
            i = C8691duz.i(this.name, "index_", false, 2, null);
            return ((((((i ? -1184239155 : this.name.hashCode()) * 31) + (this.unique ? 1 : 0)) * 31) + this.columns.hashCode()) * 31) + this.orders.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.name + "', unique=" + this.unique + ", columns=" + this.columns + ", orders=" + this.orders + "'}";
        }
    }
}

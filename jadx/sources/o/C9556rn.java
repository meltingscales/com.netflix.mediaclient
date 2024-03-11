package o;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.rn  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9556rn {
    private static final C9556rn c;
    protected static final Set<String> d;
    protected Set<String> b = d;

    public static C9556rn b() {
        return c;
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("org.apache.commons.collections.functors.InvokerTransformer");
        hashSet.add("org.apache.commons.collections.functors.InstantiateTransformer");
        hashSet.add("org.apache.commons.collections4.functors.InvokerTransformer");
        hashSet.add("org.apache.commons.collections4.functors.InstantiateTransformer");
        hashSet.add("org.codehaus.groovy.runtime.ConvertedClosure");
        hashSet.add("org.codehaus.groovy.runtime.MethodClosure");
        hashSet.add("org.springframework.beans.factory.ObjectFactory");
        hashSet.add("com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl");
        hashSet.add("org.apache.xalan.xsltc.trax.TemplatesImpl");
        hashSet.add("com.sun.rowset.JdbcRowSetImpl");
        hashSet.add("java.util.logging.FileHandler");
        hashSet.add("java.rmi.server.UnicastRemoteObject");
        hashSet.add("org.springframework.beans.factory.config.PropertyPathFactoryBean");
        hashSet.add("org.apache.tomcat.dbcp.dbcp2.BasicDataSource");
        hashSet.add("com.sun.org.apache.bcel.internal.util.ClassLoader");
        hashSet.add("org.hibernate.jmx.StatisticsService");
        hashSet.add("org.apache.ibatis.datasource.jndi.JndiDataSourceFactory");
        hashSet.add("org.apache.ibatis.parsing.XPathParser");
        hashSet.add("jodd.db.connection.DataSourceConnectionProvider");
        hashSet.add("oracle.jdbc.connector.OracleManagedConnectionFactory");
        hashSet.add("oracle.jdbc.rowset.OracleJDBCRowSet");
        hashSet.add("org.slf4j.ext.EventData");
        hashSet.add("flex.messaging.util.concurrent.AsynchBeansWorkManagerExecutor");
        hashSet.add("com.sun.deploy.security.ruleset.DRSHelper");
        hashSet.add("org.apache.axis2.jaxws.spi.handler.HandlerResolverImpl");
        hashSet.add("org.jboss.util.propertyeditor.DocumentEditor");
        hashSet.add("org.apache.openjpa.ee.RegistryManagedRuntime");
        hashSet.add("org.apache.openjpa.ee.JNDIManagedRuntime");
        hashSet.add("org.apache.axis2.transport.jms.JMSOutTransportInfo");
        hashSet.add("com.mysql.cj.jdbc.admin.MiniAdmin");
        hashSet.add("ch.qos.logback.core.db.DriverManagerConnectionSource");
        hashSet.add("org.jdom.transform.XSLTransformer");
        hashSet.add("org.jdom2.transform.XSLTransformer");
        hashSet.add("net.sf.ehcache.transaction.manager.DefaultTransactionManagerLookup");
        hashSet.add("net.sf.ehcache.hibernate.EhcacheJtaTransactionManagerLookup");
        hashSet.add("ch.qos.logback.core.db.JNDIConnectionSource");
        hashSet.add("com.zaxxer.hikari.HikariConfig");
        hashSet.add("com.zaxxer.hikari.HikariDataSource");
        hashSet.add("org.apache.cxf.jaxrs.provider.XSLTJaxbProvider");
        hashSet.add("org.apache.commons.configuration.JNDIConfiguration");
        hashSet.add("org.apache.commons.configuration2.JNDIConfiguration");
        hashSet.add("org.apache.xalan.lib.sql.JNDIConnectionPool");
        hashSet.add("org.apache.commons.dbcp.datasources.PerUserPoolDataSource");
        hashSet.add("org.apache.commons.dbcp.datasources.SharedPoolDataSource");
        hashSet.add("com.p6spy.engine.spy.P6DataSource");
        hashSet.add("org.apache.log4j.receivers.db.DriverManagerConnectionSource");
        hashSet.add("org.apache.log4j.receivers.db.JNDIConnectionSource");
        hashSet.add("net.sf.ehcache.transaction.manager.selector.GenericJndiSelector");
        hashSet.add("net.sf.ehcache.transaction.manager.selector.GlassfishSelector");
        d = Collections.unmodifiableSet(hashSet);
        c = new C9556rn();
    }

    protected C9556rn() {
    }

    public void b(DeserializationContext deserializationContext, JavaType javaType, AbstractC9445pi abstractC9445pi) {
        Class<?> h = javaType.h();
        String name = h.getName();
        if (!this.b.contains(name)) {
            if (h.isInterface()) {
                return;
            }
            if (name.startsWith("org.springframework.")) {
                while (h != null && h != Object.class) {
                    String simpleName = h.getSimpleName();
                    if (!"AbstractPointcutAdvisor".equals(simpleName) && !"AbstractApplicationContext".equals(simpleName)) {
                        h = h.getSuperclass();
                    }
                }
                return;
            } else if (!name.startsWith("com.mchange.v2.c3p0.") || !name.endsWith("DataSource")) {
                return;
            }
        }
        deserializationContext.b(abstractC9445pi, "Illegal type (%s) to deserialize: prevented for security reasons", name);
    }
}

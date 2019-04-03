package cn.binge.config;

import com.alibaba.druid.filter.logging.Log4jFilter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.jfinal.config.*;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.CaseInsensitiveContainerFactory;
import com.jfinal.plugin.activerecord.dialect.OracleDialect;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;
import com.jfinal.weixin.sdk.api.ApiConfig;
import com.jfinal.weixin.sdk.api.ApiConfigKit;

public class MainConfig extends JFinalConfig {

    @Override
    public void configConstant(Constants me) {
        //loadPropertyFile("jdbc.properties");//加载配置文件
        me.setDevMode(getPropertyToBoolean("config.devModel",false));
        me.setEncoding("UTF-8");
        me.setViewType(ViewType.JSP);
    }

    @Override
    public void configRoute(Routes me) {
        //me.add(new SysRoutes());
        //me.add(new WxRoutes());
    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins me) {
        /*String driver=getProperty("oracle.driver").trim();
        String url=getProperty("oracle.url").trim();
        String username=getProperty("oracle.username").trim();
        String password=getProperty("oracle.password").trim();
        DruidPlugin druidPlugin = new DruidPlugin(url, username, password,driver);
        druidPlugin.set(20,5,50);
        Log4jFilter filter = new Log4jFilter();
        filter.setStatementLogEnabled(false);
        filter.setResultSetLogEnabled(false);
        filter.setStatementLogErrorEnabled(true);
        filter.setStatementExecutableSqlLogEnable(true);
        druidPlugin.addFilter(new StatFilter());
        druidPlugin.addFilter(filter);
        me.add(druidPlugin);

        ActiveRecordPlugin arp=new ActiveRecordPlugin(druidPlugin);
        arp.setTransactionLevel(2);
        //设置数据库方言
        arp.setDialect(new OracleDialect());
        // 配置属性名(字段名)大小写不敏感容器工厂
        arp.setContainerFactory(new CaseInsensitiveContainerFactory(true));//忽略大小写
        System.out.println("加载数据库成功！");
        me.add(arp);*/
    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }

    public void afterJFinalStart() {

    }
}

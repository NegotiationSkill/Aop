事务声明：
       事务就是数据库中的事务，具有隔离性。原子性，要么全执行要么全不执行。
       
    <1>配置事务管理器，让spring支持事务
        <bean id="txManager" class="DataSourceTransationManager">
         <!--注入dataSource-->
         <property name="dataSource" ref="dataSource"
            
         ></property>
         </bean>
    <2>通知的配置
        <tx:advice>
            <tx:attributes>
            <tx:method name="*" />
            </tx:attributes>
        </tx:advice>
    <3>配置aop  配置切入点  配置事务和通知的关系
        <aop:config>
             <aop:pointcut expression="execution(* com..*.*(..)) " id="pt1"></aop:pointcut>
             <aop:advisor advice-ref="txAdvice" pointcut-ref="pt1"></aop:advisor>
        </aop:config>
        
        
使用注解声明事务：

    <1>配置事务管理器类
        <bean id="txManager" class="DataSourceTransationManager">
            <property name="dataSource" ref="dataSource"><property/>
        </bean>
    <2>使spring支持事物的注解
        <tx:anntation-diven transation-manager="txManager" >
    <3>在要被注为事务的类前面加上@Transational注解
    
 完全使用注解声明事务
 <1>新建一个SpringConfiguration类
 <2>将xml文件中不能用注解实现的内容用方法实现。
 <3>配置扫面文件，配置spring让其支持注解
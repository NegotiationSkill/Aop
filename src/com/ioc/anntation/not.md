依赖注入：
   
    构造函数注入：    
        <bean id="customerServer" class="com.ioc.anntation.CustomerServerImpl">
            <constructor-arg name="customerDao" ref="dao" ></constructor-arg>
            <constructor-arg name="name" value="0101我是name" type="java.lang.String" index="1"></constructor-arg>
        </bean>
        @param   name 注入参数的名字
        @param   type 注入的数据类型
        @param   index 注入参数的下标
        @param   value 基础类型和String 类型使用value赋值
        @param   ref 引用类型使用ref赋值
    set方法注入：必须要有set方法
        <bean id="customerServer" class="com.ioc.anntation.CustomerServerImpl">
                <property name="customerDao" ref="dao"></property>
        </bean>
注解：
    bean的注解
        @Service            业务逻辑层
        @Component
        @Controller          表示层
        @Resposity          数据库层
    数据注入注解：
        @Autowired  按类型注入，有唯一类型时，直接注入。当类型不唯一时先按类型注入，在看变量名是否和bean的id相同者优先注入。否则出错  
        
        @Autowired
        @Qualifier("customerDao")  这两个注解一起使用时，先按类型注入，再按id注入
          
        @Resource(name = "customerDao")直接按id注入,name为注入bean 的id值
         
        以上三种方式，用于注入引用类型，@Value(value="")用于注入基本类型和String类型
         @Value(value = "服务层")
            private  String name;
            
不使用xml文件实现，文件配置的步骤
    
    <1>使用@ComponentScan告诉spring从哪里开始扫描，由于将此注释放在已有任何类的前面都不太合理，所以新建一个SpeingConfig类，让spring从这离开时扫描
[TOC]



### Spring 注解笔记

#### 一、组件注册

1. ​	@Configuration：配置类注解，表示被该注解修饰的类为一个配置类，等同于配置文件（demo见lab-1）

2. ​    @Bean：注册一个Bean,id默认为方法名，也可以使用@Bean("id名")自定义bean的id。（demo见lab-1）

3. ​    @ComponentScan：包扫描注解，指定扫描指定包及其子包的@Controller/@Service/@Repository注解。有三种使用方式（demo见lab-2）：

   1）@ComponentScan(value = "com.itxiaobai"),扫描com.itxiaobai包下全部           											@Controller/@Service/@Repository注解

   2）@ComponentScan(value = "com.itxiaobai",excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})})只扫描包下除@Controller注解之外的注解

   3）只扫描包除@Controller注解

   ```
   @ComponentScan(value = "com.itxiaobai",includeFilters = {
         @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
          @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {UserService.class}),
           @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyFilterType.class})
   ```

   ```
   FilterType包含五种方式：
   FilterType.ANNOTATION 按照注解类型
   FilterType.ASSIGNABLE_TYPE 按照给定的类型
   FilterType.ASPECTJ 按照aspectj表达式
   FilterType.REGEX 按照正则表达式
   FilterType.CUSTOM 自定义规则
   ```

4. @scope：设置组件的作用域，包含四种作用域，默认为单例模式（singleton），

   还包含：多实例（prototype）、web环境下的request域、web环境下的session域（后两种不常用）

   单实例模式时，在容器启动时创建实例，以后每次使用时直接从容器中获取

   多实例模式时，在容器启动时不会创建实例，以后每次使用时都会创建一个实例

   demo:lab-3

   @Lazy ：设置Bean的懒加载方式，在创建容器时不会创建bean实例，让其在调用时创建

5. @Conditional：按条件注册Bean,需要自己实现Condition接口，实现matches方法，返回true时创建Bean,fakse时不创建，demo:lab-4

6. ​    @Import:快速导入的方式将实例添加到容器中，只能作用在类上，@Import有三种使用方式：

   1）直接填class数组方式-------------------------------------------------------->lab-5:Myconfig

   2）ImportSelector方式，【重点理解】----------------------------------->lab-5:Myconfig1

   3）ImportBeanDefinitionRegistrar方式---------------------------------->lab-5:Myconfig2

   需要注意，在使用方式2时，实现selectImports方法可以返回空数组但是不能返回null，否则会报空指针异常！

7. 

​	
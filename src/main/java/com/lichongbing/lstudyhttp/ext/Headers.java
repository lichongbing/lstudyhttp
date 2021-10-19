package com.lichongbing.lstudyhttp.ext;

import com.lichongbing.retrofit.spring.boot.annotation.InterceptMark;
import com.lichongbing.retrofit.spring.boot.interceptor.BasePathMatchInterceptor;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@InterceptMark
public @interface Headers {
    /**
     * 密钥key
     * 支持占位符形式配置。
     *
     * @return
     */
    String accept();

    /**
     * 密钥
     * 支持占位符形式配置。
     *
     * @return
     */
    String contentType();

    /**
     * 拦截器匹配路径
     *
     * @return
     */
    String[] include() default {"/**"};

    /**
     * 拦截器排除匹配，排除指定路径拦截
     *
     * @return
     */
    String[] exclude() default {};

    /**
     * 处理该注解的拦截器类
     * 优先从spring容器获取对应的Bean，如果获取不到，则使用反射创建一个！
     *
     * @return
     */
    Class<? extends BasePathMatchInterceptor> handler() default HeaderInterceptor.class;
}

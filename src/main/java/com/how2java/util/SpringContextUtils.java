/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: SpringContextUtils
 * Author:   苏晨宇
 * Date:     2020/12/7 19:59
 * Description: 工具类 帮助管理URLPathMatchingFilter
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.how2java.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈工具类 帮助管理URLPathMatchingFilter〉
 *
 * @author 苏晨宇
 * @create 2020/12/7
 * @since 1.0.0
 */
@Component
public class SpringContextUtils implements ApplicationContextAware {
    private static ApplicationContext context;

    public void setApplicationContext(ApplicationContext context){
        SpringContextUtils.context=context;
    }

    public static ApplicationContext getContext(){
        return context;
    }
}
 

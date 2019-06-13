package com.sls.core;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // 用于描述类、接口(包括注解类型) 或enum声明
@Retention(RetentionPolicy.RUNTIME) // 在运行时有效（即运行时保留）
@Import(AjSelector.class)
public @interface EnableAj {
}

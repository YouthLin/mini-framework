package com.youthlin.mvc.json;

import com.youthlin.mvc.annotation.ResponseBody;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 创建： youthlin.chen
 * 时间： 2017-08-14 17:11.
 */
@SuppressWarnings("WeakerAccess")
@ResponseBody
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonBody {
}

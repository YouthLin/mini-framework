package com.youthlin.mvc.view;

import com.youthlin.mvc.listener.ControllerAndMethod;
import com.youthlin.mvc.support.Ordered;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 创建： youthlin.chen
 * 时间： 2017-08-17 20:32.
 */
public interface View extends Ordered {
    /**
     * @return true if has complete and success render the view. return false to try next view
     */
    boolean render(HttpServletRequest request, HttpServletResponse response,
            Map<String, Object> model, Object result, ControllerAndMethod controllerAndMethod) throws Exception;
}

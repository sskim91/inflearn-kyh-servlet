package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

/**
 * Created by sskim on 2021/03/21
 * Github : http://github.com/sskim91
 */
public interface ControllerV4 {

    /**
     * @param paramMap
     * @param model
     * @return viewName
     */
    String process(Map<String, String> paramMap, Map<String, Object> model);
}

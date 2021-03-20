package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

/**
 * Created by sskim on 2021/03/20
 * Github : http://github.com/sskim91
 */
public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}

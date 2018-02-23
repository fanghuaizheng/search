package cn.com.component.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by woni on 18/2/23.
 */
@ApiIgnore
@Controller
/**
 * 页面跳转配置
 */
public class Page2GoController {

    @RequestMapping(value = {"/","info","api"})
    public void go2Index(HttpServletResponse response){

        try {
            response.sendRedirect("swagger-ui.html");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}

package io.github.rajpratik71.infra_controller.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientForwardController {

    @GetMapping(value = "/")
    public String forwardRoot() {
        return "forward:/quasar/index.html";
    }

    /**
     * Forwards any unmapped paths (except those containing a period) to the client {@code index.html}.
     * @return forward to client {@code index.html}.
     */
    @GetMapping(value = { "/{path:[^\\.]*}", "/{path:^(?!websocket).*}/**/{path:[^\\.]*}" })
    public String forward() {
        return "forward:/";
    }
}
